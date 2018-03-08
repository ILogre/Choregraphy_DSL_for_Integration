/**
 */
package com.chor4integration.chormetamodel.impl;

import com.chor4integration.chormetamodel.ChormetamodelPackage;
import com.chor4integration.chormetamodel.FlowNode;
import com.chor4integration.chormetamodel.SequenceFlow;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.chor4integration.chormetamodel.impl.FlowNodeImpl#getIncomings <em>Incomings</em>}</li>
 *   <li>{@link com.chor4integration.chormetamodel.impl.FlowNodeImpl#getOutgoings <em>Outgoings</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FlowNodeImpl extends FlowElementImpl implements FlowNode {
	/**
	 * The cached value of the '{@link #getIncomings() <em>Incomings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomings()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceFlow> incomings;

	/**
	 * The cached value of the '{@link #getOutgoings() <em>Outgoings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoings()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceFlow> outgoings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChormetamodelPackage.Literals.FLOW_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceFlow> getIncomings() {
		if (incomings == null) {
			incomings = new EObjectWithInverseResolvingEList<SequenceFlow>(SequenceFlow.class, this,
					ChormetamodelPackage.FLOW_NODE__INCOMINGS, ChormetamodelPackage.SEQUENCE_FLOW__TARGET);
		}
		return incomings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceFlow> getOutgoings() {
		if (outgoings == null) {
			outgoings = new EObjectWithInverseResolvingEList<SequenceFlow>(SequenceFlow.class, this,
					ChormetamodelPackage.FLOW_NODE__OUTGOINGS, ChormetamodelPackage.SEQUENCE_FLOW__SOURCE);
		}
		return outgoings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChormetamodelPackage.FLOW_NODE__INCOMINGS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomings()).basicAdd(otherEnd, msgs);
		case ChormetamodelPackage.FLOW_NODE__OUTGOINGS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoings()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChormetamodelPackage.FLOW_NODE__INCOMINGS:
			return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd, msgs);
		case ChormetamodelPackage.FLOW_NODE__OUTGOINGS:
			return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChormetamodelPackage.FLOW_NODE__INCOMINGS:
			return getIncomings();
		case ChormetamodelPackage.FLOW_NODE__OUTGOINGS:
			return getOutgoings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ChormetamodelPackage.FLOW_NODE__INCOMINGS:
			getIncomings().clear();
			getIncomings().addAll((Collection<? extends SequenceFlow>) newValue);
			return;
		case ChormetamodelPackage.FLOW_NODE__OUTGOINGS:
			getOutgoings().clear();
			getOutgoings().addAll((Collection<? extends SequenceFlow>) newValue);
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
		case ChormetamodelPackage.FLOW_NODE__INCOMINGS:
			getIncomings().clear();
			return;
		case ChormetamodelPackage.FLOW_NODE__OUTGOINGS:
			getOutgoings().clear();
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
		case ChormetamodelPackage.FLOW_NODE__INCOMINGS:
			return incomings != null && !incomings.isEmpty();
		case ChormetamodelPackage.FLOW_NODE__OUTGOINGS:
			return outgoings != null && !outgoings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowNodeImpl