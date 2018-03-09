/**
 */
package com.chor4integration.chor4int;

import com.chor4integration.servicesmetamodel.Actor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.chor4integration.chor4int.Role#getActor <em>Actor</em>}</li>
 *   <li>{@link com.chor4integration.chor4int.Role#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.chor4integration.chor4int.Chor4intPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Actor)
	 * @see com.chor4integration.chor4int.Chor4intPackage#getRole_Actor()
	 * @model
	 * @generated
	 */
	Actor getActor();

	/**
	 * Sets the value of the '{@link com.chor4integration.chor4int.Role#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Actor value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.chor4integration.chor4int.Chor4intPackage#getRole_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.chor4integration.chor4int.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Role
