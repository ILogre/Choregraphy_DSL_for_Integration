/**
 */
package chor4integration.impl;

import chor4integration.*;

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
public class Chor4integrationFactoryImpl extends EFactoryImpl implements Chor4integrationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Chor4integrationFactory init() {
		try {
			Chor4integrationFactory theChor4integrationFactory = (Chor4integrationFactory) EPackage.Registry.INSTANCE
					.getEFactory(Chor4integrationPackage.eNS_URI);
			if (theChor4integrationFactory != null) {
				return theChor4integrationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Chor4integrationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chor4integrationFactoryImpl() {
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
		case Chor4integrationPackage.SCENARIO_FLOW:
			return createScenarioFlow();
		case Chor4integrationPackage.SEQUENCE_FLOW:
			return createSequenceFlow();
		case Chor4integrationPackage.EXCLUSIVE_GATEWAY:
			return createExclusiveGateway();
		case Chor4integrationPackage.PARALLEL_GATEWAY:
			return createParallelGateway();
		case Chor4integrationPackage.START_EVENT:
			return createStartEvent();
		case Chor4integrationPackage.END_EVENT:
			return createEndEvent();
		case Chor4integrationPackage.ATOMIC_INTERACTION:
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
	public ScenarioFlow createScenarioFlow() {
		ScenarioFlowImpl scenarioFlow = new ScenarioFlowImpl();
		return scenarioFlow;
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
	public Chor4integrationPackage getChor4integrationPackage() {
		return (Chor4integrationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Chor4integrationPackage getPackage() {
		return Chor4integrationPackage.eINSTANCE;
	}

} //Chor4integrationFactoryImpl
