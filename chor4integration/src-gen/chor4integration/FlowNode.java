/**
 */
package chor4integration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chor4integration.FlowNode#getIncomings <em>Incomings</em>}</li>
 *   <li>{@link chor4integration.FlowNode#getOutgoings <em>Outgoings</em>}</li>
 * </ul>
 *
 * @see chor4integration.Chor4integrationPackage#getFlowNode()
 * @model abstract="true"
 * @generated
 */
public interface FlowNode extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Incomings</b></em>' reference list.
	 * The list contents are of type {@link chor4integration.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link chor4integration.SequenceFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incomings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomings</em>' reference list.
	 * @see chor4integration.Chor4integrationPackage#getFlowNode_Incomings()
	 * @see chor4integration.SequenceFlow#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<SequenceFlow> getIncomings();

	/**
	 * Returns the value of the '<em><b>Outgoings</b></em>' reference list.
	 * The list contents are of type {@link chor4integration.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link chor4integration.SequenceFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoings</em>' reference list.
	 * @see chor4integration.Chor4integrationPackage#getFlowNode_Outgoings()
	 * @see chor4integration.SequenceFlow#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<SequenceFlow> getOutgoings();

} // FlowNode
