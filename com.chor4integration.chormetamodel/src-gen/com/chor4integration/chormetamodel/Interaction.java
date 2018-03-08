/**
 */
package com.chor4integration.chormetamodel;

import com.chor4integration.servicesmetamodel.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.chor4integration.chormetamodel.Interaction#getSender <em>Sender</em>}</li>
 *   <li>{@link com.chor4integration.chormetamodel.Interaction#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @see com.chor4integration.chormetamodel.ChormetamodelPackage#getInteraction()
 * @model abstract="true"
 * @generated
 */
public interface Interaction extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(Role)
	 * @see com.chor4integration.chormetamodel.ChormetamodelPackage#getInteraction_Sender()
	 * @model required="true"
	 * @generated
	 */
	Role getSender();

	/**
	 * Sets the value of the '{@link com.chor4integration.chormetamodel.Interaction#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Role value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(Role)
	 * @see com.chor4integration.chormetamodel.ChormetamodelPackage#getInteraction_Receiver()
	 * @model required="true"
	 * @generated
	 */
	Role getReceiver();

	/**
	 * Sets the value of the '{@link com.chor4integration.chormetamodel.Interaction#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Role value);

} // Interaction
