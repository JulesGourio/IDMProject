package petrinet.validation;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import petrinet.PetrinetPackage;

/**
 * Réalise la validation de modèles conformes à PetriNet à l'aide du validateur et
 * affiche le résultat.
 * 
 * Les modèles sont donnés dans les arguments de la ligne de commande, et le résultat
 * est affiché dans le terminal.
 * 
 * Origine : Adapté du code fourni pour SimplePDL (TP 4 - Exercice 1)
 * Projet : R2.6 - Validation des contraintes des réseaux de Petri
 * 
 * @author Adapté pour PetriNet
 * @version 0.1
 */
public class ValidatePetriNet {
	
	/**
	 * Afficher une liste d'erreur avec un préfixe.
	 * Le préfixe est affiché avec juste "OK" à la suite si la liste est vide, et sinon
	 * la liste est affichée avec une erreur par ligne, la source de l'erreur et le message
	 * associé.
	 * @param prefix préfixe à afficher avant la liste (potentielle) d'erreurs
	 * @param errors erreurs à afficher
	 */
	private static void afficherErreurs(String prefix, List<ValidationResult.ValidationError> errors) {
		System.out.print(prefix + ":");
		if (errors.isEmpty()) {
			System.out.println(" OK");
		} else {
			System.out.println(" " + errors.size() + " erreurs trouvées");
			for (ValidationResult.ValidationError error : errors) {
				System.out.println("=> " + error.toString());
			}
		}
	}
	
	/**
	 * Affiche les erreurs pour les divers éléments du méta-modèle PetriNet : 
	 * réseau, places, transitions, arcs.
	 * @param resultat résultat de la validation calculé auparavant
	 */
	private static void afficherResultat(ValidationResult resultat) {
		afficherErreurs("- PetriNet", resultat.getRecordedErrorsFor(PetrinetPackage.PETRI_NET));
		afficherErreurs("- Place", resultat.getRecordedErrorsFor(PetrinetPackage.PLACE));
		afficherErreurs("- Transition", resultat.getRecordedErrorsFor(PetrinetPackage.TRANSITION));
		afficherErreurs("- Arc", resultat.getRecordedErrorsFor(PetrinetPackage.ARC));
		afficherErreurs("- PetriElement", resultat.getRecordedErrorsFor(PetrinetPackage.PETRI_ELEMENT));
		afficherErreurs("- Node", resultat.getRecordedErrorsFor(PetrinetPackage.NODE));
	}

	/**
	 * Fonction principale. Charge le méta-modèle et les modèles passés en paramètre sur
	 * la ligne de commande, lance la validation pour chaque modèle et affiche le résultat.
	 * @param args arguments de la ligne de commande (fichiers .petrinet ou .xmi)
	 */
	public static void main(String... args) {
		// On a besoin de récupérer l'eINSTANCE pour qu'elle soit correctement instanciée.
		// C'est cette étape qui "charge le méta-modèle".
		// Bien sûr, on n'utilise pas directement packageInstance, d'où le warning "unused" qui
		// est supprimé avec l'annotation.
		@SuppressWarnings("unused")
		PetrinetPackage packageInstance = PetrinetPackage.eINSTANCE;
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		m.put("petrinet", new XMIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		PetriNetValidator validator = new PetriNetValidator();

		if (args.length == 0) {
			System.out.println(	"Usage: ValidatePetriNet <fichier1.petrinet> [fichier2.petrinet] ...");
			System.out.println("Exemple: ValidatePetriNet models/exemple.petrinet");
			return;
		}

		for (String model : args) {
			try {
				URI modelURI = URI.createURI(model);
				Resource resource = resSet.getResource(modelURI, true);
				ValidationResult resultat = validator.validate(resource);
				
				System.out.println("=== Résultat de validation pour " + model + " ===");
				afficherResultat(resultat);
				
				// Résumé global
				int totalErrors = resultat.getRecordedErrors().size();
				if (totalErrors == 0) {
					System.out.println("✓ Modèle valide : aucune erreur détectée");
				} else {
					System.out.println("✗ Modèle invalide : " + totalErrors + " erreur(s) au total");
				}
				System.out.println();
				
			} catch (Exception e) {
				System.err.println("Erreur lors du chargement de " + model + ": " + e.getMessage());
			}
		}
		
		System.out.println("Validation terminée.");
	}
}
