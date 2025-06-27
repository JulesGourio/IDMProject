package petrinet.validation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import petrinet.*;

/**
 * Classe utilitaire qui permet surtout de récupérer le nom d'un EObject pour
 * l'afficher de manière <i>user-friendly</i>.
 * adapté pour petrinet
 * 
 * @author Jules Gourio
 * @version 0.1
 */
public final class PetriNetUtils {
	/**
	 * Classe utilitaire donc constructeur inaccessible.
	 */
	private PetriNetUtils() {}
	
	/**
	 * Noms possibles pour un attribut qui représente un nom/une identification d'un
	 * EObject. Si l'EObject dont on veut le nom possède un attribut comme dans cet
	 * ensemble, alors on l'utilisera pour l'afficher (sinon on se contente de l'affichage
	 * par défaut offert par toString().
	 */
	private static final Set<String> NamingAttributes = Set.of(
			"name", "nom", "id"
		);

	/**
	 * "Devine" le nom d'un EObject en examinant ses attributs.
	 * Si l'objet a un attribut dont le nom fait partie des noms acceptés (de
	 * l'attribut static NamingAttributes) alors on utilise cette valeur, sinon on
	 * se contente de ce qui est retourné par toString().
	 * 
	 * Dans tous les cas, le nom affiché est le nom de l'object tel que deviné (ou 
	 * rien) suivi du retour de toString(), qui donne des informations intéressantes pour le
	 * débogage.
	 * 
	 * @param object objet dont on veut deviner le nom
	 * @return nom deviné de l'objet
	 */
	public static String guessName(EObject object) {
		List<EAttribute> attributes = object.eClass().getEAttributes();
		
		Iterator<EAttribute> it = attributes.iterator();
		String name = null;
		while (it.hasNext() && name == null) {
			EAttribute a = it.next();
			if (NamingAttributes.contains(a.getName())) {
				Object value = object.eGet(a);
				if (value != null) {
					name = value.toString() + " [" + object.toString() + "]";
				}
			}
		}
		
		if (name == null) {
			name = object.toString();
		}

		return name;
	}
	
	/**
	 * Vérifie si un objet a un nom valide (non null et non vide).
	 * Méthode spécifique pour les éléments PetriNet qui ont un attribut name.
	 * 
	 * @param element élément à vérifier
	 * @return true si le nom est valide, false sinon
	 */
	public static boolean hasValidName(PetriElement element) {
		return element.getName() != null && !element.getName().trim().isEmpty();
	}
	
	/**
	 * Retourne une description plus détaillée pour les éléments spécifiques aux réseaux de Petri.
	 * Cette méthode complète guessName() avec des informations contextuelles.
	 * 
	 * @param object objet dont on veut une description détaillée
	 * @return description détaillée de l'objet
	 */
	public static String getDetailedDescription(EObject object) {
		if (object instanceof PetriNet) {
			PetriNet net = (PetriNet) object;
			return "PetriNet '" + (net.getName() != null ? net.getName() : "sans nom") + 
				   "' (" + net.getPetriElements().size() + " éléments)";
		} else if (object instanceof Place) {
			Place place = (Place) object;
			return "Place '" + (place.getName() != null ? place.getName() : "sans nom") + 
				   "' (marquage: " + place.getMarking() + ")";
		} else if (object instanceof Transition) {
			Transition transition = (Transition) object;
			String timeInfo = "";
			if (transition.getMinTime() > 0 || transition.getMaxTime() > 0) {
				timeInfo = " [" + transition.getMinTime() + "," + 
						  (transition.getMaxTime() == -1 ? "w" : String.valueOf(transition.getMaxTime())) + "]";
			}
			return "Transition '" + (transition.getName() != null ? transition.getName() : "sans nom") + "'" + timeInfo;
		} else if (object instanceof Arc) {
			Arc arc = (Arc) object;
			String sourceName = arc.getSource() != null ? arc.getSource().getName() : "?";
			String targetName = arc.getTarget() != null ? arc.getTarget().getName() : "?";
			String arcType = arc.isIsReadArc() ? " (lecture)" : "";
			return "Arc '" + (arc.getName() != null ? arc.getName() : sourceName + "->" + targetName) + 
				   "' poids:" + arc.getWeight() + arcType;
		} else {
			return guessName(object);
		}
	}
}
