/**
 */
package com.chor4integration.chor4int;

import com.chor4integration.servicesmetamodel.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.chor4integration.chor4int.AtomicInteraction#getTargetOperation <em>Target Operation</em>}</li>
 * </ul>
 *
 * @see com.chor4integration.chor4int.Chor4intPackage#getAtomicInteraction()
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
	 * @see com.chor4integration.chor4int.Chor4intPackage#getAtomicInteraction_TargetOperation()
	 * @model
	 * @generated
	 */
	Operation getTargetOperation();

	/**
	 * Sets the value of the '{@link com.chor4integration.chor4int.AtomicInteraction#getTargetOperation <em>Target Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Operation</em>' reference.
	 * @see #getTargetOperation()
	 * @generated
	 */
	void setTargetOperation(Operation value);

} // AtomicInteraction
