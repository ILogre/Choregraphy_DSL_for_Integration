/**
 */
package com.chor4integration.servicesmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.chor4integration.servicesmetamodel.StructuralView#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getStructuralView()
 * @model
 * @generated
 */
public interface StructuralView extends EObject {
	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link com.chor4integration.servicesmetamodel.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getStructuralView_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

} // StructuralView
