/**
 */
package com.chor4integration.servicesmetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.chor4integration.servicesmetamodel.Operation#getName <em>Name</em>}</li>
 *   <li>{@link com.chor4integration.servicesmetamodel.Operation#getArgs <em>Args</em>}</li>
 *   <li>{@link com.chor4integration.servicesmetamodel.Operation#isSideEffect <em>Side Effect</em>}</li>
 *   <li>{@link com.chor4integration.servicesmetamodel.Operation#getInvokingMsg <em>Invoking Msg</em>}</li>
 *   <li>{@link com.chor4integration.servicesmetamodel.Operation#getAnsweringMsg <em>Answering Msg</em>}</li>
 * </ul>
 *
 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
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
	 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getOperation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.chor4integration.servicesmetamodel.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute.
	 * @see #setArgs(Object)
	 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getOperation_Args()
	 * @model
	 * @generated
	 */
	Object getArgs();

	/**
	 * Sets the value of the '{@link com.chor4integration.servicesmetamodel.Operation#getArgs <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' attribute.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(Object value);

	/**
	 * Returns the value of the '<em><b>Side Effect</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Effect</em>' attribute.
	 * @see #setSideEffect(boolean)
	 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getOperation_SideEffect()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isSideEffect();

	/**
	 * Sets the value of the '{@link com.chor4integration.servicesmetamodel.Operation#isSideEffect <em>Side Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Effect</em>' attribute.
	 * @see #isSideEffect()
	 * @generated
	 */
	void setSideEffect(boolean value);

	/**
	 * Returns the value of the '<em><b>Invoking Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoking Msg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoking Msg</em>' reference.
	 * @see #setInvokingMsg(Message)
	 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getOperation_InvokingMsg()
	 * @model required="true"
	 * @generated
	 */
	Message getInvokingMsg();

	/**
	 * Sets the value of the '{@link com.chor4integration.servicesmetamodel.Operation#getInvokingMsg <em>Invoking Msg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoking Msg</em>' reference.
	 * @see #getInvokingMsg()
	 * @generated
	 */
	void setInvokingMsg(Message value);

	/**
	 * Returns the value of the '<em><b>Answering Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answering Msg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answering Msg</em>' reference.
	 * @see #setAnsweringMsg(Message)
	 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelPackage#getOperation_AnsweringMsg()
	 * @model
	 * @generated
	 */
	Message getAnsweringMsg();

	/**
	 * Sets the value of the '{@link com.chor4integration.servicesmetamodel.Operation#getAnsweringMsg <em>Answering Msg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answering Msg</em>' reference.
	 * @see #getAnsweringMsg()
	 * @generated
	 */
	void setAnsweringMsg(Message value);

} // Operation
