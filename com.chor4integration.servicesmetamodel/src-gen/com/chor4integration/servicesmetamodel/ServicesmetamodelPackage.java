/**
 */
package com.chor4integration.servicesmetamodel;

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
 * @see com.chor4integration.servicesmetamodel.ServicesmetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface ServicesmetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "servicesmetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.chor4integration.com/servicesmetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "servicesmetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicesmetamodelPackage eINSTANCE = com.chor4integration.servicesmetamodel.impl.ServicesmetamodelPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link com.chor4integration.servicesmetamodel.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.servicesmetamodel.impl.RoleImpl
	 * @see com.chor4integration.servicesmetamodel.impl.ServicesmetamodelPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__IMPLEMENTATION = 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.servicesmetamodel.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.servicesmetamodel.impl.ActorImpl
	 * @see com.chor4integration.servicesmetamodel.impl.ServicesmetamodelPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.servicesmetamodel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.servicesmetamodel.impl.ServiceImpl
	 * @see com.chor4integration.servicesmetamodel.impl.ServicesmetamodelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OPERATIONS = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.servicesmetamodel.impl.StructuralViewImpl <em>Structural View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.servicesmetamodel.impl.StructuralViewImpl
	 * @see com.chor4integration.servicesmetamodel.impl.ServicesmetamodelPackageImpl#getStructuralView()
	 * @generated
	 */
	int STRUCTURAL_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_VIEW__ROLES = 0;

	/**
	 * The number of structural features of the '<em>Structural View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Structural View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.servicesmetamodel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.servicesmetamodel.impl.OperationImpl
	 * @see com.chor4integration.servicesmetamodel.impl.ServicesmetamodelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ARGS = 1;

	/**
	 * The feature id for the '<em><b>Side Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SIDE_EFFECT = 2;

	/**
	 * The feature id for the '<em><b>Invoking Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INVOKING_MSG = 3;

	/**
	 * The feature id for the '<em><b>Answering Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ANSWERING_MSG = 4;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.servicesmetamodel.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.servicesmetamodel.impl.MessageImpl
	 * @see com.chor4integration.servicesmetamodel.impl.ServicesmetamodelPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.chor4integration.servicesmetamodel.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.chor4integration.servicesmetamodel.impl.UserImpl
	 * @see com.chor4integration.servicesmetamodel.impl.ServicesmetamodelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = ACTOR__NAME;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.chor4integration.servicesmetamodel.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see com.chor4integration.servicesmetamodel.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link com.chor4integration.servicesmetamodel.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.chor4integration.servicesmetamodel.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the reference '{@link com.chor4integration.servicesmetamodel.Role#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation</em>'.
	 * @see com.chor4integration.servicesmetamodel.Role#getImplementation()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Implementation();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.servicesmetamodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see com.chor4integration.servicesmetamodel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link com.chor4integration.servicesmetamodel.Service#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see com.chor4integration.servicesmetamodel.Service#getOperations()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Operations();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.servicesmetamodel.StructuralView <em>Structural View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural View</em>'.
	 * @see com.chor4integration.servicesmetamodel.StructuralView
	 * @generated
	 */
	EClass getStructuralView();

	/**
	 * Returns the meta object for the containment reference list '{@link com.chor4integration.servicesmetamodel.StructuralView#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see com.chor4integration.servicesmetamodel.StructuralView#getRoles()
	 * @see #getStructuralView()
	 * @generated
	 */
	EReference getStructuralView_Roles();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.servicesmetamodel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see com.chor4integration.servicesmetamodel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.chor4integration.servicesmetamodel.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.chor4integration.servicesmetamodel.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.chor4integration.servicesmetamodel.Operation#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args</em>'.
	 * @see com.chor4integration.servicesmetamodel.Operation#getArgs()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Args();

	/**
	 * Returns the meta object for the attribute '{@link com.chor4integration.servicesmetamodel.Operation#isSideEffect <em>Side Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side Effect</em>'.
	 * @see com.chor4integration.servicesmetamodel.Operation#isSideEffect()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_SideEffect();

	/**
	 * Returns the meta object for the reference '{@link com.chor4integration.servicesmetamodel.Operation#getInvokingMsg <em>Invoking Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoking Msg</em>'.
	 * @see com.chor4integration.servicesmetamodel.Operation#getInvokingMsg()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_InvokingMsg();

	/**
	 * Returns the meta object for the reference '{@link com.chor4integration.servicesmetamodel.Operation#getAnsweringMsg <em>Answering Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Answering Msg</em>'.
	 * @see com.chor4integration.servicesmetamodel.Operation#getAnsweringMsg()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_AnsweringMsg();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.servicesmetamodel.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see com.chor4integration.servicesmetamodel.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link com.chor4integration.servicesmetamodel.Message#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see com.chor4integration.servicesmetamodel.Message#getContent()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Content();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.servicesmetamodel.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see com.chor4integration.servicesmetamodel.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link com.chor4integration.servicesmetamodel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see com.chor4integration.servicesmetamodel.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link com.chor4integration.servicesmetamodel.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.chor4integration.servicesmetamodel.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServicesmetamodelFactory getServicesmetamodelFactory();

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
		 * The meta object literal for the '{@link com.chor4integration.servicesmetamodel.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.servicesmetamodel.impl.RoleImpl
		 * @see com.chor4integration.servicesmetamodel.impl.ServicesmetamodelPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__IMPLEMENTATION = eINSTANCE.getRole_Implementation();

		/**
		 * The meta object literal for the '{@link com.chor4integration.servicesmetamodel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.servicesmetamodel.impl.ServiceImpl
		 * @see com.chor4integration.servicesmetamodel.impl.ServicesmetamodelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__OPERATIONS = eINSTANCE.getService_Operations();

		/**
		 * The meta object literal for the '{@link com.chor4integration.servicesmetamodel.impl.StructuralViewImpl <em>Structural View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.servicesmetamodel.impl.StructuralViewImpl
		 * @see com.chor4integration.servicesmetamodel.impl.ServicesmetamodelPackageImpl#getStructuralView()
		 * @generated
		 */
		EClass STRUCTURAL_VIEW = eINSTANCE.getStructuralView();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_VIEW__ROLES = eINSTANCE.getStructuralView_Roles();

		/**
		 * The meta object literal for the '{@link com.chor4integration.servicesmetamodel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.servicesmetamodel.impl.OperationImpl
		 * @see com.chor4integration.servicesmetamodel.impl.ServicesmetamodelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__ARGS = eINSTANCE.getOperation_Args();

		/**
		 * The meta object literal for the '<em><b>Side Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__SIDE_EFFECT = eINSTANCE.getOperation_SideEffect();

		/**
		 * The meta object literal for the '<em><b>Invoking Msg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__INVOKING_MSG = eINSTANCE.getOperation_InvokingMsg();

		/**
		 * The meta object literal for the '<em><b>Answering Msg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__ANSWERING_MSG = eINSTANCE.getOperation_AnsweringMsg();

		/**
		 * The meta object literal for the '{@link com.chor4integration.servicesmetamodel.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.servicesmetamodel.impl.MessageImpl
		 * @see com.chor4integration.servicesmetamodel.impl.ServicesmetamodelPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__CONTENT = eINSTANCE.getMessage_Content();

		/**
		 * The meta object literal for the '{@link com.chor4integration.servicesmetamodel.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.servicesmetamodel.impl.UserImpl
		 * @see com.chor4integration.servicesmetamodel.impl.ServicesmetamodelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link com.chor4integration.servicesmetamodel.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.chor4integration.servicesmetamodel.impl.ActorImpl
		 * @see com.chor4integration.servicesmetamodel.impl.ServicesmetamodelPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

	}

} //ServicesmetamodelPackage
