/**
 */
package com.chor4integration.chormetamodel.impl;

import com.chor4integration.chormetamodel.AtomicInteraction;
import com.chor4integration.chormetamodel.Choreography;
import com.chor4integration.chormetamodel.ChormetamodelFactory;
import com.chor4integration.chormetamodel.ChormetamodelPackage;
import com.chor4integration.chormetamodel.EndEvent;
import com.chor4integration.chormetamodel.Event;
import com.chor4integration.chormetamodel.ExclusiveGateway;
import com.chor4integration.chormetamodel.FlowElement;
import com.chor4integration.chormetamodel.FlowNode;
import com.chor4integration.chormetamodel.Gateway;
import com.chor4integration.chormetamodel.Interaction;
import com.chor4integration.chormetamodel.ParallelGateway;
import com.chor4integration.chormetamodel.SequenceFlow;
import com.chor4integration.chormetamodel.StartEvent;

import com.chor4integration.servicesmetamodel.ServicesmetamodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChormetamodelPackageImpl extends EPackageImpl implements ChormetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choreographyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicInteractionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.chor4integration.chormetamodel.ChormetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChormetamodelPackageImpl() {
		super(eNS_URI, ChormetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ChormetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ChormetamodelPackage init() {
		if (isInited)
			return (ChormetamodelPackage) EPackage.Registry.INSTANCE.getEPackage(ChormetamodelPackage.eNS_URI);

		// Obtain or create and register package
		ChormetamodelPackageImpl theChormetamodelPackage = (ChormetamodelPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ChormetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ChormetamodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ServicesmetamodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theChormetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theChormetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChormetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChormetamodelPackage.eNS_URI, theChormetamodelPackage);
		return theChormetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoreography() {
		return choreographyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreography_FlowElements() {
		return (EReference) choreographyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowElement() {
		return flowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowElement_Name() {
		return (EAttribute) flowElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowNode() {
		return flowNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_Incomings() {
		return (EReference) flowNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_Outgoings() {
		return (EReference) flowNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceFlow() {
		return sequenceFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFlow_Target() {
		return (EReference) sequenceFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFlow_Source() {
		return (EReference) sequenceFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveGateway() {
		return exclusiveGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelGateway() {
		return parallelGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartEvent() {
		return startEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEvent() {
		return endEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Sender() {
		return (EReference) interactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Receiver() {
		return (EReference) interactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicInteraction() {
		return atomicInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicInteraction_TargetOperation() {
		return (EReference) atomicInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChormetamodelFactory getChormetamodelFactory() {
		return (ChormetamodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		choreographyEClass = createEClass(CHOREOGRAPHY);
		createEReference(choreographyEClass, CHOREOGRAPHY__FLOW_ELEMENTS);

		flowElementEClass = createEClass(FLOW_ELEMENT);
		createEAttribute(flowElementEClass, FLOW_ELEMENT__NAME);

		flowNodeEClass = createEClass(FLOW_NODE);
		createEReference(flowNodeEClass, FLOW_NODE__INCOMINGS);
		createEReference(flowNodeEClass, FLOW_NODE__OUTGOINGS);

		sequenceFlowEClass = createEClass(SEQUENCE_FLOW);
		createEReference(sequenceFlowEClass, SEQUENCE_FLOW__TARGET);
		createEReference(sequenceFlowEClass, SEQUENCE_FLOW__SOURCE);

		gatewayEClass = createEClass(GATEWAY);

		exclusiveGatewayEClass = createEClass(EXCLUSIVE_GATEWAY);

		parallelGatewayEClass = createEClass(PARALLEL_GATEWAY);

		eventEClass = createEClass(EVENT);

		startEventEClass = createEClass(START_EVENT);

		endEventEClass = createEClass(END_EVENT);

		interactionEClass = createEClass(INTERACTION);
		createEReference(interactionEClass, INTERACTION__SENDER);
		createEReference(interactionEClass, INTERACTION__RECEIVER);

		atomicInteractionEClass = createEClass(ATOMIC_INTERACTION);
		createEReference(atomicInteractionEClass, ATOMIC_INTERACTION__TARGET_OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ServicesmetamodelPackage theServicesmetamodelPackage = (ServicesmetamodelPackage) EPackage.Registry.INSTANCE
				.getEPackage(ServicesmetamodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		flowNodeEClass.getESuperTypes().add(this.getFlowElement());
		sequenceFlowEClass.getESuperTypes().add(this.getFlowElement());
		gatewayEClass.getESuperTypes().add(this.getFlowNode());
		exclusiveGatewayEClass.getESuperTypes().add(this.getGateway());
		parallelGatewayEClass.getESuperTypes().add(this.getGateway());
		eventEClass.getESuperTypes().add(this.getFlowNode());
		startEventEClass.getESuperTypes().add(this.getEvent());
		endEventEClass.getESuperTypes().add(this.getEvent());
		interactionEClass.getESuperTypes().add(this.getFlowNode());
		atomicInteractionEClass.getESuperTypes().add(this.getInteraction());

		// Initialize classes, features, and operations; add parameters
		initEClass(choreographyEClass, Choreography.class, "Choreography", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoreography_FlowElements(), this.getFlowElement(), null, "flowElements", null, 0, -1,
				Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowElementEClass, FlowElement.class, "FlowElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, FlowElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowNodeEClass, FlowNode.class, "FlowNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowNode_Incomings(), this.getSequenceFlow(), this.getSequenceFlow_Target(), "incomings",
				null, 0, -1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNode_Outgoings(), this.getSequenceFlow(), this.getSequenceFlow_Source(), "outgoings",
				null, 0, -1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceFlowEClass, SequenceFlow.class, "SequenceFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceFlow_Target(), this.getFlowNode(), this.getFlowNode_Incomings(), "target", null, 1, 1,
				SequenceFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceFlow_Source(), this.getFlowNode(), this.getFlowNode_Outgoings(), "source", null, 1, 1,
				SequenceFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatewayEClass, Gateway.class, "Gateway", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exclusiveGatewayEClass, ExclusiveGateway.class, "ExclusiveGateway", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelGatewayEClass, ParallelGateway.class, "ParallelGateway", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startEventEClass, StartEvent.class, "StartEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(endEventEClass, EndEvent.class, "EndEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionEClass, Interaction.class, "Interaction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction_Sender(), theServicesmetamodelPackage.getRole(), null, "sender", null, 1, 1,
				Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_Receiver(), theServicesmetamodelPackage.getRole(), null, "receiver", null, 1, 1,
				Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicInteractionEClass, AtomicInteraction.class, "AtomicInteraction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicInteraction_TargetOperation(), theServicesmetamodelPackage.getOperation(), null,
				"targetOperation", null, 0, 1, AtomicInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ChormetamodelPackageImpl
