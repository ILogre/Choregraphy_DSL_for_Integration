/**
 */
package integration.impl;

import integration.IntegrationPackage;
import integration.Message;
import integration.Operation;

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
 *   <li>{@link integration.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link integration.impl.OperationImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link integration.impl.OperationImpl#isSideEffect <em>Side Effect</em>}</li>
 *   <li>{@link integration.impl.OperationImpl#getInvokingMsg <em>Invoking Msg</em>}</li>
 *   <li>{@link integration.impl.OperationImpl#getAnsweringMsg <em>Answering Msg</em>}</li>
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
	 * The default value of the '{@link #getArgs() <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected static final Object ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected Object args = ARGS_EDEFAULT;

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
		return IntegrationPackage.Literals.OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrationPackage.OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getArgs() {
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgs(Object newArgs) {
		Object oldArgs = args;
		args = newArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrationPackage.OPERATION__ARGS, oldArgs, args));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrationPackage.OPERATION__SIDE_EFFECT,
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
							IntegrationPackage.OPERATION__INVOKING_MSG, oldInvokingMsg, invokingMsg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrationPackage.OPERATION__INVOKING_MSG,
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
							IntegrationPackage.OPERATION__ANSWERING_MSG, oldAnsweringMsg, answeringMsg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrationPackage.OPERATION__ANSWERING_MSG,
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
		case IntegrationPackage.OPERATION__NAME:
			return getName();
		case IntegrationPackage.OPERATION__ARGS:
			return getArgs();
		case IntegrationPackage.OPERATION__SIDE_EFFECT:
			return isSideEffect();
		case IntegrationPackage.OPERATION__INVOKING_MSG:
			if (resolve)
				return getInvokingMsg();
			return basicGetInvokingMsg();
		case IntegrationPackage.OPERATION__ANSWERING_MSG:
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
		case IntegrationPackage.OPERATION__NAME:
			setName((String) newValue);
			return;
		case IntegrationPackage.OPERATION__ARGS:
			setArgs(newValue);
			return;
		case IntegrationPackage.OPERATION__SIDE_EFFECT:
			setSideEffect((Boolean) newValue);
			return;
		case IntegrationPackage.OPERATION__INVOKING_MSG:
			setInvokingMsg((Message) newValue);
			return;
		case IntegrationPackage.OPERATION__ANSWERING_MSG:
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
		case IntegrationPackage.OPERATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case IntegrationPackage.OPERATION__ARGS:
			setArgs(ARGS_EDEFAULT);
			return;
		case IntegrationPackage.OPERATION__SIDE_EFFECT:
			setSideEffect(SIDE_EFFECT_EDEFAULT);
			return;
		case IntegrationPackage.OPERATION__INVOKING_MSG:
			setInvokingMsg((Message) null);
			return;
		case IntegrationPackage.OPERATION__ANSWERING_MSG:
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
		case IntegrationPackage.OPERATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case IntegrationPackage.OPERATION__ARGS:
			return ARGS_EDEFAULT == null ? args != null : !ARGS_EDEFAULT.equals(args);
		case IntegrationPackage.OPERATION__SIDE_EFFECT:
			return sideEffect != SIDE_EFFECT_EDEFAULT;
		case IntegrationPackage.OPERATION__INVOKING_MSG:
			return invokingMsg != null;
		case IntegrationPackage.OPERATION__ANSWERING_MSG:
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
		result.append(", args: ");
		result.append(args);
		result.append(", sideEffect: ");
		result.append(sideEffect);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
