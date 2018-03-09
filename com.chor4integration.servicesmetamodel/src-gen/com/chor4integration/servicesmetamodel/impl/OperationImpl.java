/**
 */
package com.chor4integration.servicesmetamodel.impl;

import com.chor4integration.servicesmetamodel.Message;
import com.chor4integration.servicesmetamodel.Operation;
import com.chor4integration.servicesmetamodel.ServicesmetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.chor4integration.servicesmetamodel.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.chor4integration.servicesmetamodel.impl.OperationImpl#isSideEffect <em>Side Effect</em>}</li>
 *   <li>{@link com.chor4integration.servicesmetamodel.impl.OperationImpl#getInvokingMsg <em>Invoking Msg</em>}</li>
 *   <li>{@link com.chor4integration.servicesmetamodel.impl.OperationImpl#getAnsweringMsg <em>Answering Msg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isSideEffect() <em>Side Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSideEffect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIDE_EFFECT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSideEffect() <em>Side Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSideEffect()
	 * @generated
	 * @ordered
	 */
	protected boolean sideEffect = SIDE_EFFECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInvokingMsg() <em>Invoking Msg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokingMsg()
	 * @generated
	 * @ordered
	 */
	protected Message invokingMsg;

	/**
	 * The cached value of the '{@link #getAnsweringMsg() <em>Answering Msg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnsweringMsg()
	 * @generated
	 * @ordered
	 */
	protected Message answeringMsg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicesmetamodelPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesmetamodelPackage.OPERATION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSideEffect() {
		return sideEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideEffect(boolean newSideEffect) {
		boolean oldSideEffect = sideEffect;
		sideEffect = newSideEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesmetamodelPackage.OPERATION__SIDE_EFFECT,
					oldSideEffect, sideEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getInvokingMsg() {
		if (invokingMsg != null && invokingMsg.eIsProxy()) {
			InternalEObject oldInvokingMsg = (InternalEObject) invokingMsg;
			invokingMsg = (Message) eResolveProxy(oldInvokingMsg);
			if (invokingMsg != oldInvokingMsg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ServicesmetamodelPackage.OPERATION__INVOKING_MSG, oldInvokingMsg, invokingMsg));
			}
		}
		return invokingMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetInvokingMsg() {
		return invokingMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokingMsg(Message newInvokingMsg) {
		Message oldInvokingMsg = invokingMsg;
		invokingMsg = newInvokingMsg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesmetamodelPackage.OPERATION__INVOKING_MSG,
					oldInvokingMsg, invokingMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getAnsweringMsg() {
		if (answeringMsg != null && answeringMsg.eIsProxy()) {
			InternalEObject oldAnsweringMsg = (InternalEObject) answeringMsg;
			answeringMsg = (Message) eResolveProxy(oldAnsweringMsg);
			if (answeringMsg != oldAnsweringMsg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ServicesmetamodelPackage.OPERATION__ANSWERING_MSG, oldAnsweringMsg, answeringMsg));
			}
		}
		return answeringMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetAnsweringMsg() {
		return answeringMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnsweringMsg(Message newAnsweringMsg) {
		Message oldAnsweringMsg = answeringMsg;
		answeringMsg = newAnsweringMsg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesmetamodelPackage.OPERATION__ANSWERING_MSG,
					oldAnsweringMsg, answeringMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ServicesmetamodelPackage.OPERATION__NAME:
			return getName();
		case ServicesmetamodelPackage.OPERATION__SIDE_EFFECT:
			return isSideEffect();
		case ServicesmetamodelPackage.OPERATION__INVOKING_MSG:
			if (resolve)
				return getInvokingMsg();
			return basicGetInvokingMsg();
		case ServicesmetamodelPackage.OPERATION__ANSWERING_MSG:
			if (resolve)
				return getAnsweringMsg();
			return basicGetAnsweringMsg();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ServicesmetamodelPackage.OPERATION__NAME:
			setName((String) newValue);
			return;
		case ServicesmetamodelPackage.OPERATION__SIDE_EFFECT:
			setSideEffect((Boolean) newValue);
			return;
		case ServicesmetamodelPackage.OPERATION__INVOKING_MSG:
			setInvokingMsg((Message) newValue);
			return;
		case ServicesmetamodelPackage.OPERATION__ANSWERING_MSG:
			setAnsweringMsg((Message) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ServicesmetamodelPackage.OPERATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ServicesmetamodelPackage.OPERATION__SIDE_EFFECT:
			setSideEffect(SIDE_EFFECT_EDEFAULT);
			return;
		case ServicesmetamodelPackage.OPERATION__INVOKING_MSG:
			setInvokingMsg((Message) null);
			return;
		case ServicesmetamodelPackage.OPERATION__ANSWERING_MSG:
			setAnsweringMsg((Message) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ServicesmetamodelPackage.OPERATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ServicesmetamodelPackage.OPERATION__SIDE_EFFECT:
			return sideEffect != SIDE_EFFECT_EDEFAULT;
		case ServicesmetamodelPackage.OPERATION__INVOKING_MSG:
			return invokingMsg != null;
		case ServicesmetamodelPackage.OPERATION__ANSWERING_MSG:
			return answeringMsg != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", sideEffect: ");
		result.append(sideEffect);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
