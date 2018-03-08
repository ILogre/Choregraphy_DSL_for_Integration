/**
 */
package chor4integration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chor4integration.SequenceFlow#getTarget <em>Target</em>}</li>
 *   <li>{@link chor4integration.SequenceFlow#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see chor4integration.Chor4integrationPackage#getSequenceFlow()
 * @model
 * @generated
 */
public interface SequenceFlow extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link chor4integration.FlowNode#getIncomings <em>Incomings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(FlowNode)
	 * @see chor4integration.Chor4integrationPackage#getSequenceFlow_Target()
	 * @see chor4integration.FlowNode#getIncomings
	 * @model opposite="incomings" required="true"
	 * @generated
	 */
	FlowNode getTarget();

	/**
	 * Sets the value of the '{@link chor4integration.SequenceFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link chor4integration.FlowNode#getOutgoings <em>Outgoings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(FlowNode)
	 * @see chor4integration.Chor4integrationPackage#getSequenceFlow_Source()
	 * @see chor4integration.FlowNode#getOutgoings
	 * @model opposite="outgoings" required="true"
	 * @generated
	 */
	FlowNode getSource();

	/**
	 * Sets the value of the '{@link chor4integration.SequenceFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(FlowNode value);

} // SequenceFlow
