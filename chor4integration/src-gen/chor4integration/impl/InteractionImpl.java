/**
 */
package chor4integration.impl;

import chor4integration.Chor4integrationPackage;
import chor4integration.Interaction;

import integration.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chor4integration.impl.InteractionImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link chor4integration.impl.InteractionImpl#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InteractionImpl extends FlowNodeImpl implements Interaction {
	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Role sender;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected Role receiver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Chor4integrationPackage.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject) sender;
			sender = (Role) eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Chor4integrationPackage.INTERACTION__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(Role newSender) {
		Role oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Chor4integrationPackage.INTERACTION__SENDER,
					oldSender, sender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject) receiver;
			receiver = (Role) eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Chor4integrationPackage.INTERACTION__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(Role newReceiver) {
		Role oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Chor4integrationPackage.INTERACTION__RECEIVER,
					oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Chor4integrationPackage.INTERACTION__SENDER:
			if (resolve)
				return getSender();
			return basicGetSender();
		case Chor4integrationPackage.INTERACTION__RECEIVER:
			if (resolve)
				return getReceiver();
			return basicGetReceiver();
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
		case Chor4integrationPackage.INTERACTION__SENDER:
			setSender((Role) newValue);
			return;
		case Chor4integrationPackage.INTERACTION__RECEIVER:
			setReceiver((Role) newValue);
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
		case Chor4integrationPackage.INTERACTION__SENDER:
			setSender((Role) null);
			return;
		case Chor4integrationPackage.INTERACTION__RECEIVER:
			setReceiver((Role) null);
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
		case Chor4integrationPackage.INTERACTION__SENDER:
			return sender != null;
		case Chor4integrationPackage.INTERACTION__RECEIVER:
			return receiver != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionImpl
