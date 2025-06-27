package transformation;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petrinet.*;
import simplepdl.*;
import simplepdl.Process;

public class ProcessToPetriNetTransformer {
    
    private final PetrinetFactory factory = PetrinetFactory.eINSTANCE;
    private final Map<WorkDefinition, Place> wdToStartedPlace = new HashMap<>();
    private final Map<WorkDefinition, Place> wdToFinishedPlace = new HashMap<>();
    private final Map<WorkDefinition, Transition> wdToStartTransition = new HashMap<>();
    private final Map<WorkDefinition, Transition> wdToFinishTransition = new HashMap<>();
    
    public PetriNet transform(Process process) {
        System.out.println("=== DÉBUT TRANSFORMATION ===");
        
        // Créer le réseau de Petri
        PetriNet petriNet = factory.createPetriNet();
        petriNet.setName(process.getName() + "_PetriNet");
        
        System.out.println("Réseau créé : " + petriNet.getName());
        
        // Transformer chaque WorkDefinition
        for (ProcessElement pe : process.getProcessElements()) {
            if (pe instanceof WorkDefinition) {
                System.out.println("Transformation de : " + ((WorkDefinition) pe).getName());
                transformWorkDefinition((WorkDefinition) pe, petriNet);
            }
        }
        
        // Transformer chaque WorkSequence
        for (ProcessElement pe : process.getProcessElements()) {
            if (pe instanceof WorkSequence) {
                WorkSequence ws = (WorkSequence) pe;
                System.out.println("Transformation dépendance : " + 
                    ws.getPredecessor().getName() + " -> " + ws.getSuccessor().getName());
                transformWorkSequence(ws, petriNet);
            }
        }
        
        System.out.println("=== FIN TRANSFORMATION ===");
        return petriNet;
    }
    
    private void transformWorkDefinition(WorkDefinition wd, PetriNet petriNet) {
        String nom = wd.getName();
        
        // 4 places pour chaque activité
        Place notStarted = factory.createPlace();
        notStarted.setName(nom + "_notStarted");
        notStarted.setMarking(1); // Jeton initial
        petriNet.getPetriElements().add(notStarted);
        
        Place started = factory.createPlace();
        started.setName(nom + "_started");
        started.setMarking(0);
        petriNet.getPetriElements().add(started);
        wdToStartedPlace.put(wd, started);
        
        Place running = factory.createPlace();
        running.setName(nom + "_running");
        running.setMarking(0);
        petriNet.getPetriElements().add(running);
        
        Place finished = factory.createPlace();
        finished.setName(nom + "_finished");
        finished.setMarking(0);
        petriNet.getPetriElements().add(finished);
        wdToFinishedPlace.put(wd, finished);
        
        // 2 transitions pour chaque activité
        Transition startT = factory.createTransition();
        startT.setName(nom + "_start");
        petriNet.getPetriElements().add(startT);
        wdToStartTransition.put(wd, startT);
        
        Transition finishT = factory.createTransition();
        finishT.setName(nom + "_finish");
        petriNet.getPetriElements().add(finishT);
        wdToFinishTransition.put(wd, finishT);
        
        // Arcs pour le comportement normal
        createArc(notStarted, startT, 1, false, petriNet);
        createArc(startT, started, 1, false, petriNet);
        createArc(startT, running, 1, false, petriNet);
        createArc(running, finishT, 1, false, petriNet);
        createArc(finishT, finished, 1, false, petriNet);
        
        System.out.println("  -> Créé 4 places et 2 transitions pour " + nom);
    }
    
    private void transformWorkSequence(WorkSequence ws, PetriNet petriNet) {
        WorkDefinition pred = ws.getPredecessor();
        WorkDefinition succ = ws.getSuccessor();
        
        Place sourcePlace = null;
        Transition targetTransition = null;
        
        switch (ws.getLinkType()) {
            case START_TO_START:
                sourcePlace = wdToStartedPlace.get(pred);
                targetTransition = wdToStartTransition.get(succ);
                break;
            case START_TO_FINISH:
                sourcePlace = wdToStartedPlace.get(pred);
                targetTransition = wdToFinishTransition.get(succ);
                break;
            case FINISH_TO_START:
                sourcePlace = wdToFinishedPlace.get(pred);
                targetTransition = wdToStartTransition.get(succ);
                break;
            case FINISH_TO_FINISH:
                sourcePlace = wdToFinishedPlace.get(pred);
                targetTransition = wdToFinishTransition.get(succ);
                break;
        }
        
        if (sourcePlace != null && targetTransition != null) {
            // Arc de lecture (read arc)
            createArc(sourcePlace, targetTransition, 1, true, petriNet);
            System.out.println("  -> Arc de lecture créé");
        }
    }
    
    private void createArc(Node source, Node target, int weight, boolean isReadArc, PetriNet petriNet) {
        Arc arc = factory.createArc();
        
        arc.setName("arc_" + source.getName() + "_to_" + target.getName());
        
        arc.setSource(source);
        arc.setTarget(target);
        arc.setWeight(weight);
        arc.setIsReadArc(isReadArc);
        petriNet.getPetriElements().add(arc);
    }

    
    public void savePetriNet(PetriNet petriNet, String filePath) {
        System.out.println("Sauvegarde dans : " + filePath);
        
        PetrinetPackage.eINSTANCE.eClass();
        
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("xmi", new XMIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("petrinet", new XMIResourceFactoryImpl());
        
        URI fileURI = URI.createFileURI(filePath);
        Resource resource = resourceSet.createResource(fileURI);
        resource.getContents().add(petriNet);
        
        try {
            resource.save(null);
            System.out.println("SUCCÈS : Fichier sauvegardé !");
        } catch (Exception e) {
            System.err.println("ERREUR sauvegarde : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
