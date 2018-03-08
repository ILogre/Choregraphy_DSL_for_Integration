/**
 */
package com.chor4integration.chormetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.chor4integration.chormetamodel.SequenceFlow#getTarget <em>Target</em>}</li>
 *   <li>{@link com.chor4integration.chormetamodel.SequenceFlow#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see com.chor4integration.chormetamodel.ChormetamodelPackage#getSequenceFlow()
 * @model
 * @generated
 */
public interface SequenceFlow extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.chor4integration.chormetamodel.FlowNode#getIncomings <em>Incomings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(FlowNode)
	 * @see com.chor4integration.chormetamodel.ChormetamodelPackage#getSequenceFlow_Target()
	 * @see com.chor4integration.chormetamodel.FlowNode#getIncomings
	 * @model opposite="incomings" required="true"
	 * @generated
	 */
	FlowNode getTarget();

	/**
	 * Sets the value of the '{@link com.chor4integration.chormetamodel.SequenceFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.chor4integration.chormetamodel.FlowNode#getOutgoings <em>Outgoings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(FlowNode)
	 * @see com.chor4integration.chormetamodel.ChormetamodelPackage#getSequenceFlow_Source()
	 * @see com.chor4integration.chormetamodel.FlowNode#getOutgoings
	 * @model opposite="outgoings" required="true"
	 * @generated
	 */
	FlowNode getSource();

	/**
	 * Sets the value of the '{@link com.chor4integration.chormetamodel.SequenceFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(FlowNode value);

} // SequenceFlow
