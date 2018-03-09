/**
 */
package com.chor4integration.servicesmetamodel;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link com.chor4integration.servicesmetamodel.Message#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link com.chor4integration.servicesmetamodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getMessage_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // Message
