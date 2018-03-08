/*
 * generated by Xtext 2.12.0
 */
package com.chor4integration.textdsl.serializer;

import com.chor4integration.chor4int.AtomicInteraction;
import com.chor4integration.chor4int.Choreography;
import com.chor4integration.chor4int.ChormetamodelPackage;
import com.chor4integration.chor4int.EndEvent;
import com.chor4integration.chor4int.ExclusiveGateway;
import com.chor4integration.chor4int.ParallelGateway;
import com.chor4integration.chor4int.SequenceFlow;
import com.chor4integration.chor4int.StartEvent;
import com.chor4integration.servicesmetamodel.Message;
import com.chor4integration.servicesmetamodel.Operation;
import com.chor4integration.servicesmetamodel.Role;
import com.chor4integration.servicesmetamodel.Service;
import com.chor4integration.servicesmetamodel.ServicesmetamodelPackage;
import com.chor4integration.servicesmetamodel.User;
import com.chor4integration.textdsl.services.Chor4IntTxtDslGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class Chor4IntTxtDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Chor4IntTxtDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ChormetamodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ChormetamodelPackage.ATOMIC_INTERACTION:
				sequence_AtomicInteraction(context, (AtomicInteraction) semanticObject); 
				return; 
			case ChormetamodelPackage.CHOREOGRAPHY:
				sequence_Choreography(context, (Choreography) semanticObject); 
				return; 
			case ChormetamodelPackage.END_EVENT:
				sequence_EndEvent(context, (EndEvent) semanticObject); 
				return; 
			case ChormetamodelPackage.EXCLUSIVE_GATEWAY:
				sequence_ExclusiveGateway(context, (ExclusiveGateway) semanticObject); 
				return; 
			case ChormetamodelPackage.PARALLEL_GATEWAY:
				sequence_ParallelGateway(context, (ParallelGateway) semanticObject); 
				return; 
			case ChormetamodelPackage.SEQUENCE_FLOW:
				sequence_SequenceFlow(context, (SequenceFlow) semanticObject); 
				return; 
			case ChormetamodelPackage.START_EVENT:
				sequence_StartEvent(context, (StartEvent) semanticObject); 
				return; 
			}
		else if (epackage == ServicesmetamodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ServicesmetamodelPackage.MESSAGE:
				sequence_Message(context, (Message) semanticObject); 
				return; 
			case ServicesmetamodelPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case ServicesmetamodelPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case ServicesmetamodelPackage.SERVICE:
				sequence_Service(context, (Service) semanticObject); 
				return; 
			case ServicesmetamodelPackage.USER:
				sequence_User(context, (User) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     FlowElement returns AtomicInteraction
	 *     FlowNode returns AtomicInteraction
	 *     AtomicInteraction returns AtomicInteraction
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (incomings+=[SequenceFlow|EString] incomings+=[SequenceFlow|EString]*)? 
	 *         (outgoings+=[SequenceFlow|EString] outgoings+=[SequenceFlow|EString]*)? 
	 *         sender=[Role|EString] 
	 *         receiver=[Role|EString] 
	 *         targetOperation=[Operation|EString]?
	 *     )
	 */
	protected void sequence_AtomicInteraction(ISerializationContext context, AtomicInteraction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Choreography returns Choreography
	 *
	 * Constraint:
	 *     (flowElements+=FlowElement flowElements+=FlowElement*)?
	 */
	protected void sequence_Choreography(ISerializationContext context, Choreography semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlowElement returns EndEvent
	 *     FlowNode returns EndEvent
	 *     EndEvent returns EndEvent
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (incomings+=[SequenceFlow|EString] incomings+=[SequenceFlow|EString]*)? 
	 *         (outgoings+=[SequenceFlow|EString] outgoings+=[SequenceFlow|EString]*)?
	 *     )
	 */
	protected void sequence_EndEvent(ISerializationContext context, EndEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlowElement returns ExclusiveGateway
	 *     FlowNode returns ExclusiveGateway
	 *     ExclusiveGateway returns ExclusiveGateway
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (incomings+=[SequenceFlow|EString] incomings+=[SequenceFlow|EString]*)? 
	 *         (outgoings+=[SequenceFlow|EString] outgoings+=[SequenceFlow|EString]*)?
	 *     )
	 */
	protected void sequence_ExclusiveGateway(ISerializationContext context, ExclusiveGateway semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Message returns Message
	 *
	 * Constraint:
	 *     content=EJavaObject?
	 */
	protected void sequence_Message(ISerializationContext context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (name=EString args=EJavaObject? sideEffect=EBoolean invokingMsg=[Message|EString] answeringMsg=[Message|EString]?)
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlowElement returns ParallelGateway
	 *     FlowNode returns ParallelGateway
	 *     ParallelGateway returns ParallelGateway
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (incomings+=[SequenceFlow|EString] incomings+=[SequenceFlow|EString]*)? 
	 *         (outgoings+=[SequenceFlow|EString] outgoings+=[SequenceFlow|EString]*)?
	 *     )
	 */
	protected void sequence_ParallelGateway(ISerializationContext context, ParallelGateway semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (name=EString implementation=[Actor|EString]?)
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlowElement returns SequenceFlow
	 *     SequenceFlow returns SequenceFlow
	 *
	 * Constraint:
	 *     (name=EString target=[FlowNode|EString] source=[FlowNode|EString])
	 */
	protected void sequence_SequenceFlow(ISerializationContext context, SequenceFlow semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ChormetamodelPackage.Literals.FLOW_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChormetamodelPackage.Literals.FLOW_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, ChormetamodelPackage.Literals.SEQUENCE_FLOW__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChormetamodelPackage.Literals.SEQUENCE_FLOW__TARGET));
			if (transientValues.isValueTransient(semanticObject, ChormetamodelPackage.Literals.SEQUENCE_FLOW__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ChormetamodelPackage.Literals.SEQUENCE_FLOW__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSequenceFlowAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSequenceFlowAccess().getTargetFlowNodeEStringParserRuleCall_4_0_1(), semanticObject.eGet(ChormetamodelPackage.Literals.SEQUENCE_FLOW__TARGET, false));
		feeder.accept(grammarAccess.getSequenceFlowAccess().getSourceFlowNodeEStringParserRuleCall_6_0_1(), semanticObject.eGet(ChormetamodelPackage.Literals.SEQUENCE_FLOW__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Actor returns Service
	 *     Service returns Service
	 *
	 * Constraint:
	 *     (name=EString (operations+=Operation operations+=Operation*)?)
	 */
	protected void sequence_Service(ISerializationContext context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FlowElement returns StartEvent
	 *     FlowNode returns StartEvent
	 *     StartEvent returns StartEvent
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (incomings+=[SequenceFlow|EString] incomings+=[SequenceFlow|EString]*)? 
	 *         (outgoings+=[SequenceFlow|EString] outgoings+=[SequenceFlow|EString]*)?
	 *     )
	 */
	protected void sequence_StartEvent(ISerializationContext context, StartEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Actor returns User
	 *     User returns User
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_User(ISerializationContext context, User semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ServicesmetamodelPackage.Literals.ACTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServicesmetamodelPackage.Literals.ACTOR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUserAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
