/**
 */
package com.chor4integration.servicesmetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.chor4integration.servicesmetamodel.Parameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link com.chor4integration.servicesmetamodel.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

} // Parameter
