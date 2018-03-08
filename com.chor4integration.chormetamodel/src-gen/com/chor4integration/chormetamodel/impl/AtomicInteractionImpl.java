/**
 */
package com.chor4integration.chormetamodel.impl;

import com.chor4integration.chormetamodel.AtomicInteraction;
import com.chor4integration.chormetamodel.ChormetamodelPackage;

import com.chor4integration.servicesmetamodel.Operation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.chor4integration.chormetamodel.impl.AtomicInteractionImpl#getTargetOperation <em>Target Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicInteractionImpl extends InteractionImpl implements AtomicInteraction {
	/**
	 * The cached value of the '{@link #getTargetOperation() <em>Target Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation targetOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChormetamodelPackage.Literals.ATOMIC_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getTargetOperation() {
		if (targetOperation != null && targetOperation.eIsProxy()) {
			InternalEObject oldTargetOperation = (InternalEObject) targetOperation;
			targetOperation = (Operation) eResolveProxy(oldTargetOperation);
			if (targetOperation != oldTargetOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ChormetamodelPackage.ATOMIC_INTERACTION__TARGET_OPERATION, oldTargetOperation,
							targetOperation));
			}
		}
		return targetOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetTargetOperation() {
		return targetOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetOperation(Operation newTargetOperation) {
		Operation oldTargetOperation = targetOperation;
		targetOperation = newTargetOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ChormetamodelPackage.ATOMIC_INTERACTION__TARGET_OPERATION, oldTargetOperation, targetOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChormetamodelPackage.ATOMIC_INTERACTION__TARGET_OPERATION:
			if (resolve)
				return getTargetOperation();
			return basicGetTargetOperation();
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
		case ChormetamodelPackage.ATOMIC_INTERACTION__TARGET_OPERATION:
			setTargetOperation((Operation) newValue);
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
		case ChormetamodelPackage.ATOMIC_INTERACTION__TARGET_OPERATION:
			setTargetOperation((Operation) null);
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
		case ChormetamodelPackage.ATOMIC_INTERACTION__TARGET_OPERATION:
			return targetOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //AtomicInteractionImpl
