/**
 */
package com.chor4integration.servicesmetamodel.impl;

import com.chor4integration.servicesmetamodel.*;

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
public class ServicesmetamodelFactoryImpl extends EFactoryImpl implements ServicesmetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServicesmetamodelFactory init() {
		try {
			ServicesmetamodelFactory theServicesmetamodelFactory = (ServicesmetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(ServicesmetamodelPackage.eNS_URI);
			if (theServicesmetamodelFactory != null) {
				return theServicesmetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServicesmetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesmetamodelFactoryImpl() {
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
		case ServicesmetamodelPackage.SERVICE:
			return createService();
		case ServicesmetamodelPackage.STRUCTURAL_VIEW:
			return createStructuralView();
		case ServicesmetamodelPackage.OPERATION:
			return createOperation();
		case ServicesmetamodelPackage.MESSAGE:
			return createMessage();
		case ServicesmetamodelPackage.USER:
			return createUser();
		case ServicesmetamodelPackage.PARAMETER:
			return createParameter();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralView createStructuralView() {
		StructuralViewImpl structuralView = new StructuralViewImpl();
		return structuralView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesmetamodelPackage getServicesmetamodelPackage() {
		return (ServicesmetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServicesmetamodelPackage getPackage() {
		return ServicesmetamodelPackage.eINSTANCE;
	}

} //ServicesmetamodelFactoryImpl
