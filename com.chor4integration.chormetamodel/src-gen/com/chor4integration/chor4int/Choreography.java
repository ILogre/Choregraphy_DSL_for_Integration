/**
 */
package com.chor4integration.chor4int;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.chor4integration.chor4int.Choreography#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link com.chor4integration.chor4int.Choreography#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see com.chor4integration.chor4int.Chor4intPackage#getChoreography()
 * @model
 * @generated
 */
public interface Choreography extends EObject {
	/**
	 * Returns the value of the '<em><b>Flow Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.chor4integration.chor4int.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Elements</em>' containment reference list.
	 * @see com.chor4integration.chor4int.Chor4intPackage#getChoreography_FlowElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowElement> getFlowElements();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link com.chor4integration.chor4int.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see com.chor4integration.chor4int.Chor4intPackage#getChoreography_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // Choreography
