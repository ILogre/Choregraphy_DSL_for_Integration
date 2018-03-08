/**
 */
package com.chor4integration.chormetamodel;

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
 *   <li>{@link com.chor4integration.chormetamodel.Choreography#getFlowElements <em>Flow Elements</em>}</li>
 * </ul>
 *
 * @see com.chor4integration.chormetamodel.ChormetamodelPackage#getChoreography()
 * @model
 * @generated
 */
public interface Choreography extends EObject {
	/**
	 * Returns the value of the '<em><b>Flow Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.chor4integration.chormetamodel.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Elements</em>' containment reference list.
	 * @see com.chor4integration.chormetamodel.ChormetamodelPackage#getChoreography_FlowElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowElement> getFlowElements();

} // Choreography
