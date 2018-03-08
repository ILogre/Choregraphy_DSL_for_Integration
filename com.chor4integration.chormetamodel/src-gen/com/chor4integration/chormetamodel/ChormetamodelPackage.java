/**
 */
package com.chor4integration.chormetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.chor4integration.chormetamodel.ChormetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface ChormetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chormetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.chor4integration.com/chormetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chormetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChormetamodelPackage eINSTANCE = com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.chor4integration.chormetamodel.impl.ChoreographyImpl <em>Choreography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.chormetamodel.impl.ChoreographyImpl
	 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getChoreography()
	 * @generated
	 */
	int CHOREOGRAPHY = 0;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__FLOW_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.chormetamodel.impl.FlowElementImpl <em>Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.chormetamodel.impl.FlowElementImpl
	 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getFlowElement()
	 * @generated
	 */
	int FLOW_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.chormetamodel.impl.FlowNodeImpl <em>Flow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.chormetamodel.impl.FlowNodeImpl
	 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getFlowNode()
	 * @generated
	 */
	int FLOW_NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__INCOMINGS = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__OUTGOINGS = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.chormetamodel.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.chormetamodel.impl.SequenceFlowImpl
	 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getSequenceFlow()
	 * @generated
	 */
	int SEQUENCE_FLOW = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__TARGET = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__SOURCE = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.chormetamodel.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.chormetamodel.impl.GatewayImpl
	 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__INCOMINGS = FLOW_NODE__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__OUTGOINGS = FLOW_NODE__OUTGOINGS;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.chormetamodel.impl.ExclusiveGatewayImpl <em>Exclusive Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.chormetamodel.impl.ExclusiveGatewayImpl
	 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getExclusiveGateway()
	 * @generated
	 */
	int EXCLUSIVE_GATEWAY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__INCOMINGS = GATEWAY__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__OUTGOINGS = GATEWAY__OUTGOINGS;

	/**
	 * The number of structural features of the '<em>Exclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.chormetamodel.impl.ParallelGatewayImpl <em>Parallel Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.chormetamodel.impl.ParallelGatewayImpl
	 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getParallelGateway()
	 * @generated
	 */
	int PARALLEL_GATEWAY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__INCOMINGS = GATEWAY__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__OUTGOINGS = GATEWAY__OUTGOINGS;

	/**
	 * The number of structural features of the '<em>Parallel Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.chormetamodel.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.chormetamodel.impl.EventImpl
	 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INCOMINGS = FLOW_NODE__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OUTGOINGS = FLOW_NODE__OUTGOINGS;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.chormetamodel.impl.StartEventImpl <em>Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.chormetamodel.impl.StartEventImpl
	 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getStartEvent()
	 * @generated
	 */
	int START_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__INCOMINGS = EVENT__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__OUTGOINGS = EVENT__OUTGOINGS;

	/**
	 * The number of structural features of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.chormetamodel.impl.EndEventImpl <em>End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.chormetamodel.impl.EndEventImpl
	 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getEndEvent()
	 * @generated
	 */
	int END_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__INCOMINGS = EVENT__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__OUTGOINGS = EVENT__OUTGOINGS;

	/**
	 * The number of structural features of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.chormetamodel.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.chormetamodel.impl.InteractionImpl
	 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__INCOMINGS = FLOW_NODE__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OUTGOINGS = FLOW_NODE__OUTGOINGS;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__SENDER = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__RECEIVER = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.chormetamodel.impl.AtomicInteractionImpl <em>Atomic Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.chormetamodel.impl.AtomicInteractionImpl
	 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getAtomicInteraction()
	 * @generated
	 */
	int ATOMIC_INTERACTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION__NAME = INTERACTION__NAME;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION__INCOMINGS = INTERACTION__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION__OUTGOINGS = INTERACTION__OUTGOINGS;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION__SENDER = INTERACTION__SENDER;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION__RECEIVER = INTERACTION__RECEIVER;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION__TARGET_OPERATION = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Atomic Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION_OPERATION_COUNT = INTERACTION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.chor4integration.chormetamodel.Choreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography</em>'.
	 * @see com.chor4integration.chormetamodel.Choreography
	 * @generated
	 */
	EClass getChoreography();

	/**
	 * Returns the meta object for the containment reference list '{@link com.chor4integration.chormetamodel.Choreography#getFlowElements <em>Flow Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Elements</em>'.
	 * @see com.chor4integration.chormetamodel.Choreography#getFlowElements()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_FlowElements();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.chormetamodel.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Element</em>'.
	 * @see com.chor4integration.chormetamodel.FlowElement
	 * @generated
	 */
	EClass getFlowElement();

	/**
	 * Returns the meta object for the attribute '{@link com.chor4integration.chormetamodel.FlowElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.chor4integration.chormetamodel.FlowElement#getName()
	 * @see #getFlowElement()
	 * @generated
	 */
	EAttribute getFlowElement_Name();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.chormetamodel.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node</em>'.
	 * @see com.chor4integration.chormetamodel.FlowNode
	 * @generated
	 */
	EClass getFlowNode();

	/**
	 * Returns the meta object for the reference list '{@link com.chor4integration.chormetamodel.FlowNode#getIncomings <em>Incomings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incomings</em>'.
	 * @see com.chor4integration.chormetamodel.FlowNode#getIncomings()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Incomings();

	/**
	 * Returns the meta object for the reference list '{@link com.chor4integration.chormetamodel.FlowNode#getOutgoings <em>Outgoings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoings</em>'.
	 * @see com.chor4integration.chormetamodel.FlowNode#getOutgoings()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Outgoings();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.chormetamodel.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Flow</em>'.
	 * @see com.chor4integration.chormetamodel.SequenceFlow
	 * @generated
	 */
	EClass getSequenceFlow();

	/**
	 * Returns the meta object for the reference '{@link com.chor4integration.chormetamodel.SequenceFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.chor4integration.chormetamodel.SequenceFlow#getTarget()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_Target();

	/**
	 * Returns the meta object for the reference '{@link com.chor4integration.chormetamodel.SequenceFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.chor4integration.chormetamodel.SequenceFlow#getSource()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_Source();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.chormetamodel.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see com.chor4integration.chormetamodel.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.chormetamodel.ExclusiveGateway <em>Exclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Gateway</em>'.
	 * @see com.chor4integration.chormetamodel.ExclusiveGateway
	 * @generated
	 */
	EClass getExclusiveGateway();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.chormetamodel.ParallelGateway <em>Parallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Gateway</em>'.
	 * @see com.chor4integration.chormetamodel.ParallelGateway
	 * @generated
	 */
	EClass getParallelGateway();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.chormetamodel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see com.chor4integration.chormetamodel.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.chormetamodel.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Event</em>'.
	 * @see com.chor4integration.chormetamodel.StartEvent
	 * @generated
	 */
	EClass getStartEvent();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.chormetamodel.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event</em>'.
	 * @see com.chor4integration.chormetamodel.EndEvent
	 * @generated
	 */
	EClass getEndEvent();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.chormetamodel.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see com.chor4integration.chormetamodel.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the reference '{@link com.chor4integration.chormetamodel.Interaction#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see com.chor4integration.chormetamodel.Interaction#getSender()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Sender();

	/**
	 * Returns the meta object for the reference '{@link com.chor4integration.chormetamodel.Interaction#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see com.chor4integration.chormetamodel.Interaction#getReceiver()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Receiver();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.chormetamodel.AtomicInteraction <em>Atomic Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Interaction</em>'.
	 * @see com.chor4integration.chormetamodel.AtomicInteraction
	 * @generated
	 */
	EClass getAtomicInteraction();

	/**
	 * Returns the meta object for the reference '{@link com.chor4integration.chormetamodel.AtomicInteraction#getTargetOperation <em>Target Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Operation</em>'.
	 * @see com.chor4integration.chormetamodel.AtomicInteraction#getTargetOperation()
	 * @see #getAtomicInteraction()
	 * @generated
	 */
	EReference getAtomicInteraction_TargetOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChormetamodelFactory getChormetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.chor4integration.chormetamodel.impl.ChoreographyImpl <em>Choreography</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.chormetamodel.impl.ChoreographyImpl
		 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getChoreography()
		 * @generated
		 */
		EClass CHOREOGRAPHY = eINSTANCE.getChoreography();

		/**
		 * The meta object literal for the '<em><b>Flow Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__FLOW_ELEMENTS = eINSTANCE.getChoreography_FlowElements();

		/**
		 * The meta object literal for the '{@link com.chor4integration.chormetamodel.impl.FlowElementImpl <em>Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.chormetamodel.impl.FlowElementImpl
		 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getFlowElement()
		 * @generated
		 */
		EClass FLOW_ELEMENT = eINSTANCE.getFlowElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_ELEMENT__NAME = eINSTANCE.getFlowElement_Name();

		/**
		 * The meta object literal for the '{@link com.chor4integration.chormetamodel.impl.FlowNodeImpl <em>Flow Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.chormetamodel.impl.FlowNodeImpl
		 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getFlowNode()
		 * @generated
		 */
		EClass FLOW_NODE = eINSTANCE.getFlowNode();

		/**
		 * The meta object literal for the '<em><b>Incomings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__INCOMINGS = eINSTANCE.getFlowNode_Incomings();

		/**
		 * The meta object literal for the '<em><b>Outgoings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__OUTGOINGS = eINSTANCE.getFlowNode_Outgoings();

		/**
		 * The meta object literal for the '{@link com.chor4integration.chormetamodel.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.chormetamodel.impl.SequenceFlowImpl
		 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getSequenceFlow()
		 * @generated
		 */
		EClass SEQUENCE_FLOW = eINSTANCE.getSequenceFlow();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW__TARGET = eINSTANCE.getSequenceFlow_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW__SOURCE = eINSTANCE.getSequenceFlow_Source();

		/**
		 * The meta object literal for the '{@link com.chor4integration.chormetamodel.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.chormetamodel.impl.GatewayImpl
		 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '{@link com.chor4integration.chormetamodel.impl.ExclusiveGatewayImpl <em>Exclusive Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.chormetamodel.impl.ExclusiveGatewayImpl
		 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getExclusiveGateway()
		 * @generated
		 */
		EClass EXCLUSIVE_GATEWAY = eINSTANCE.getExclusiveGateway();

		/**
		 * The meta object literal for the '{@link com.chor4integration.chormetamodel.impl.ParallelGatewayImpl <em>Parallel Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.chormetamodel.impl.ParallelGatewayImpl
		 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getParallelGateway()
		 * @generated
		 */
		EClass PARALLEL_GATEWAY = eINSTANCE.getParallelGateway();

		/**
		 * The meta object literal for the '{@link com.chor4integration.chormetamodel.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.chormetamodel.impl.EventImpl
		 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link com.chor4integration.chormetamodel.impl.StartEventImpl <em>Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.chormetamodel.impl.StartEventImpl
		 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getStartEvent()
		 * @generated
		 */
		EClass START_EVENT = eINSTANCE.getStartEvent();

		/**
		 * The meta object literal for the '{@link com.chor4integration.chormetamodel.impl.EndEventImpl <em>End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.chormetamodel.impl.EndEventImpl
		 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getEndEvent()
		 * @generated
		 */
		EClass END_EVENT = eINSTANCE.getEndEvent();

		/**
		 * The meta object literal for the '{@link com.chor4integration.chormetamodel.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.chormetamodel.impl.InteractionImpl
		 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__SENDER = eINSTANCE.getInteraction_Sender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__RECEIVER = eINSTANCE.getInteraction_Receiver();

		/**
		 * The meta object literal for the '{@link com.chor4integration.chormetamodel.impl.AtomicInteractionImpl <em>Atomic Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.chormetamodel.impl.AtomicInteractionImpl
		 * @see com.chor4integration.chormetamodel.impl.ChormetamodelPackageImpl#getAtomicInteraction()
		 * @generated
		 */
		EClass ATOMIC_INTERACTION = eINSTANCE.getAtomicInteraction();

		/**
		 * The meta object literal for the '<em><b>Target Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_INTERACTION__TARGET_OPERATION = eINSTANCE.getAtomicInteraction_TargetOperation();

	}

} //ChormetamodelPackage
