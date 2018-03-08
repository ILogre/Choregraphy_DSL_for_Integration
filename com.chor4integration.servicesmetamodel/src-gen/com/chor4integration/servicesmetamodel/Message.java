/**
 */
package com.chor4integration.servicesmetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.chor4integration.servicesmetamodel.Message#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(Object)
	 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getMessage_Content()
	 * @model
	 * @generated
	 */
	Object getContent();

	/**
	 * Sets the value of the '{@link com.chor4integration.servicesmetamodel.Message#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Object value);

} // Message
