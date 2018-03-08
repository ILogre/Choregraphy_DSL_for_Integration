/**
 */
package com.chor4integration.servicesmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.chor4integration.servicesmetamodel.Service#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getService()
 * @model
 * @generated
 */
public interface Service extends Actor {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link com.chor4integration.servicesmetamodel.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getService_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // Service
