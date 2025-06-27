package petrinet.validation;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.EObject;
import petrinet.*;

public class PetriNetValidator {
    
    /**
     * Méthode principale de validation d'une ressource
     * Origine : Adaptée du code fourni pour SimplePDL (TP 4)
     */
    public ValidationResult validate(Resource resource) {
        ValidationResult result = new ValidationResult();
        
        // Parcourir tous les objets de la ressource
        for (EObject eObject : resource.getContents()) {
            validateEObject(eObject, result);
        }
        
        return result;
    }
    
    /**
     * Validation récursive d'un objet EMF
     */
    private void validateEObject(EObject eObject, ValidationResult result) {
        // Valider l'objet actuel
        if (eObject instanceof PetriNet) {
            validatePetriNet((PetriNet) eObject, result);
        } else if (eObject instanceof Place) {
            validatePlace((Place) eObject, result);
        } else if (eObject instanceof Transition) {
            validateTransition((Transition) eObject, result);
        } else if (eObject instanceof Arc) {
            validateArc((Arc) eObject, result);
        }
        
        // Valider récursivement les enfants
        for (EObject child : eObject.eContents()) {
            validateEObject(child, result);
        }
    }
    
    /**
     * Validation d'un PetriNet
     */
    private void validatePetriNet(PetriNet petriNet, ValidationResult result) {
        result.recordIfFailed(validatePetriNetName(petriNet), petriNet, 
            "Le réseau de Petri doit avoir un nom non vide");
        result.recordIfFailed(validatePetriNetStructure(petriNet), petriNet, 
            "Le réseau de Petri doit avoir au moins une place et une transition");
    }
    
    /**
     * Validation d'une Place
     */
    private void validatePlace(Place place, ValidationResult result) {
        result.recordIfFailed(validatePlaceMarking(place), place, 
            "Le marquage d'une place doit être positif ou nul");
    }
    
    /**
     * Validation d'une Transition
     */
    private void validateTransition(Transition transition, ValidationResult result) {
        result.recordIfFailed(validateTransitionTimeInterval(transition), transition, 
            "L'intervalle temporel de la transition est invalide");
    }
    
    /**
     * Validation d'un Arc
     */
    private void validateArc(Arc arc, ValidationResult result) {
        result.recordIfFailed(validateArcWeight(arc), arc, 
            "Le poids d'un arc doit être positif");
        result.recordIfFailed(validateArcConnection(arc), arc, 
            "Un arc doit relier une place à une transition ou vice versa");
    }
    
    // Gardez toutes vos méthodes de validation existantes...
    public boolean validatePetriNetName(PetriNet petriNet) {
        if (petriNet == null || petriNet.getName() == null) {
            return false;
        }
        return !petriNet.getName().trim().isEmpty();
    }
    
    public boolean validatePetriNetStructure(PetriNet petriNet) {
        if (petriNet == null || petriNet.getPetriElements() == null) {
            return false;
        }
        
        boolean hasPlace = false;
        boolean hasTransition = false;
        
        for (PetriElement element : petriNet.getPetriElements()) {
            if (element instanceof Place) hasPlace = true;
            if (element instanceof Transition) hasTransition = true;
        }
        
        return hasPlace && hasTransition;
    }
    
    public boolean validateArcWeight(Arc arc) {
        if (arc == null) {
            return false;
        }
        return arc.getWeight() > 0;
    }
    
    public boolean validatePlaceMarking(Place place) {
        if (place == null) {
            return false;
        }
        return place.getMarking() >= 0;
    }
    
    public boolean validateArcConnection(Arc arc) {
        if (arc == null || arc.getSource() == null || arc.getTarget() == null) {
            return false;
        }
        
        Node source = arc.getSource();
        Node target = arc.getTarget();
        
        return (source instanceof Place && target instanceof Transition) ||
               (source instanceof Transition && target instanceof Place);
    }
    
    public boolean validateTransitionTimeInterval(Transition transition) {
        if (transition == null) {
            return false;
        }
        
        // Utiliser -1 comme valeur "non définie" pour les temps
        if (transition.getMinTime() < 0) {
            return false;
        }
        
        if (transition.getMaxTime() > 0 && transition.getMinTime() >= 0) {
            return transition.getMaxTime() >= transition.getMinTime();
        }
        
        return true;
    }
}
