package transformation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petrinet.PetriNet;
import simplepdl.Process;
import simplepdl.SimplepdlPackage;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DÉBUT PROGRAMME ===");
        
        // Chemins des fichiers
        String inputFile = "models/exemple.simplepdl";
        String outputFile = "models/exemple_transformed.petrinet";
        
        if (args.length >= 2) {
            inputFile = args[0];
            outputFile = args[1];
        }
        
        System.out.println("Fichier d'entrée : " + inputFile);
        System.out.println("Fichier de sortie : " + outputFile);
        
        try {
            // 1. Charger le modèle SimplePDL
            System.out.println("\n1. Chargement du modèle SimplePDL...");
            Process process = loadProcessModel(inputFile);
            System.out.println("Modèle chargé : " + process.getName());
            System.out.println("Nombre d'éléments : " + process.getProcessElements().size());
            
            // 2. Transformer
            System.out.println("\n2. Transformation...");
            ProcessToPetriNetTransformer transformer = new ProcessToPetriNetTransformer();
            PetriNet petriNet = transformer.transform(process);
            System.out.println("Réseau de Petri créé : " + petriNet.getName());
            System.out.println("Nombre d'éléments : " + petriNet.getPetriElements().size());
            
            // 3. Sauvegarder
            System.out.println("\n3. Sauvegarde...");
            transformer.savePetriNet(petriNet, outputFile);
            
            System.out.println("\n=== PROGRAMME TERMINÉ AVEC SUCCÈS ===");
            
        } catch (Exception e) {
            System.err.println("ERREUR : " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private static Process loadProcessModel(String filePath) {
        System.out.println("Initialisation du package SimplePDL...");
        SimplepdlPackage.eINSTANCE.eClass();
        
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("simplepdl", new XMIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("xmi", new XMIResourceFactoryImpl());
        
        System.out.println("Chargement du fichier : " + filePath);
        URI fileURI = URI.createFileURI(filePath);
        Resource resource = resourceSet.getResource(fileURI, true);
        
        if (resource.getContents().isEmpty()) {
            throw new RuntimeException("Le fichier est vide !");
        }
        
        System.out.println("Fichier chargé avec succès !");
        return (Process) resource.getContents().get(0);
    }
}
