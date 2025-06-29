/**
 * generated by Xtext 2.38.0
 */
package fr.n7.pDL2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependance Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.pDL2.DependanceStart#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fr.n7.pDL2.DependanceStart#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see fr.n7.pDL2.PDL2Package#getDependanceStart()
 * @model
 * @generated
 */
public interface DependanceStart extends EObject
{
  /**
   * Returns the value of the '<em><b>Predecessor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predecessor</em>' reference.
   * @see #setPredecessor(WorkDefinition)
   * @see fr.n7.pDL2.PDL2Package#getDependanceStart_Predecessor()
   * @model
   * @generated
   */
  WorkDefinition getPredecessor();

  /**
   * Sets the value of the '{@link fr.n7.pDL2.DependanceStart#getPredecessor <em>Predecessor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predecessor</em>' reference.
   * @see #getPredecessor()
   * @generated
   */
  void setPredecessor(WorkDefinition value);

  /**
   * Returns the value of the '<em><b>Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' containment reference.
   * @see #setLink(WorkSequenceKindStart)
   * @see fr.n7.pDL2.PDL2Package#getDependanceStart_Link()
   * @model containment="true"
   * @generated
   */
  WorkSequenceKindStart getLink();

  /**
   * Sets the value of the '{@link fr.n7.pDL2.DependanceStart#getLink <em>Link</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link</em>' containment reference.
   * @see #getLink()
   * @generated
   */
  void setLink(WorkSequenceKindStart value);

} // DependanceStart
