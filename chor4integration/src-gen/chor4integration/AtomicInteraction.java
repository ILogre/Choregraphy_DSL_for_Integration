/**
 */
package chor4integration;

import integration.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chor4integration.AtomicInteraction#getTargetOperation <em>Target Operation</em>}</li>
 * </ul>
 *
 * @see chor4integration.Chor4integrationPackage#getAtomicInteraction()
 * @model
 * @generated
 */
public interface AtomicInteraction extends Interaction {
	/**
	 * Returns the value of the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Operation</em>' reference.
	 * @see #setTargetOperation(Operation)
	 * @see chor4integration.Chor4integrationPackage#getAtomicInteraction_TargetOperation()
	 * @model
	 * @generated
	 */
	Operation getTargetOperation();

	/**
	 * Sets the value of the '{@link chor4integration.AtomicInteraction#getTargetOperation <em>Target Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Operation</em>' reference.
	 * @see #getTargetOperation()
	 * @generated
	 */
	void setTargetOperation(Operation value);

} // AtomicInteraction
