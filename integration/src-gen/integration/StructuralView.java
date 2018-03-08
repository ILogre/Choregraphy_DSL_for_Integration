/**
 */
package integration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link integration.StructuralView#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see integration.IntegrationPackage#getStructuralView()
 * @model
 * @generated
 */
public interface StructuralView extends EObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link integration.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see integration.IntegrationPackage#getStructuralView_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // StructuralView
