/**
 */
package com.chor4integration.chormetamodel.impl;

import com.chor4integration.chormetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChormetamodelFactoryImpl extends EFactoryImpl implements ChormetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChormetamodelFactory init() {
		try {
			ChormetamodelFactory theChormetamodelFactory = (ChormetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(ChormetamodelPackage.eNS_URI);
			if (theChormetamodelFactory != null) {
				return theChormetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChormetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChormetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ChormetamodelPackage.CHOREOGRAPHY:
			return createChoreography();
		case ChormetamodelPackage.SEQUENCE_FLOW:
			return createSequenceFlow();
		case ChormetamodelPackage.EXCLUSIVE_GATEWAY:
			return createExclusiveGateway();
		case ChormetamodelPackage.PARALLEL_GATEWAY:
			return createParallelGateway();
		case ChormetamodelPackage.START_EVENT:
			return createStartEvent();
		case ChormetamodelPackage.END_EVENT:
			return createEndEvent();
		case ChormetamodelPackage.ATOMIC_INTERACTION:
			return createAtomicInteraction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choreography createChoreography() {
		ChoreographyImpl choreography = new ChoreographyImpl();
		return choreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow createSequenceFlow() {
		SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
		return sequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveGateway createExclusiveGateway() {
		ExclusiveGatewayImpl exclusiveGateway = new ExclusiveGatewayImpl();
		return exclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelGateway createParallelGateway() {
		ParallelGatewayImpl parallelGateway = new ParallelGatewayImpl();
		return parallelGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicInteraction createAtomicInteraction() {
		AtomicInteractionImpl atomicInteraction = new AtomicInteractionImpl();
		return atomicInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChormetamodelPackage getChormetamodelPackage() {
		return (ChormetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChormetamodelPackage getPackage() {
		return ChormetamodelPackage.eINSTANCE;
	}

} //ChormetamodelFactoryImpl
