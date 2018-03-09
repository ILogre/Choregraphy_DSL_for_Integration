/**
 */
package com.chor4integration.chor4int.provider;

import com.chor4integration.chor4int.util.Chor4intAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Chor4intItemProviderAdapterFactory extends Chor4intAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chor4intItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.chor4integration.chor4int.Choreography} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographyItemProvider choreographyItemProvider;

	/**
	 * This creates an adapter for a {@link com.chor4integration.chor4int.Choreography}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoreographyAdapter() {
		if (choreographyItemProvider == null) {
			choreographyItemProvider = new ChoreographyItemProvider(this);
		}

		return choreographyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.chor4integration.chor4int.SequenceFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceFlowItemProvider sequenceFlowItemProvider;

	/**
	 * This creates an adapter for a {@link com.chor4integration.chor4int.SequenceFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceFlowAdapter() {
		if (sequenceFlowItemProvider == null) {
			sequenceFlowItemProvider = new SequenceFlowItemProvider(this);
		}

		return sequenceFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.chor4integration.chor4int.ExclusiveGateway} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveGatewayItemProvider exclusiveGatewayItemProvider;

	/**
	 * This creates an adapter for a {@link com.chor4integration.chor4int.ExclusiveGateway}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExclusiveGatewayAdapter() {
		if (exclusiveGatewayItemProvider == null) {
			exclusiveGatewayItemProvider = new ExclusiveGatewayItemProvider(this);
		}

		return exclusiveGatewayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.chor4integration.chor4int.ParallelGateway} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelGatewayItemProvider parallelGatewayItemProvider;

	/**
	 * This creates an adapter for a {@link com.chor4integration.chor4int.ParallelGateway}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParallelGatewayAdapter() {
		if (parallelGatewayItemProvider == null) {
			parallelGatewayItemProvider = new ParallelGatewayItemProvider(this);
		}

		return parallelGatewayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.chor4integration.chor4int.StartEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartEventItemProvider startEventItemProvider;

	/**
	 * This creates an adapter for a {@link com.chor4integration.chor4int.StartEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStartEventAdapter() {
		if (startEventItemProvider == null) {
			startEventItemProvider = new StartEventItemProvider(this);
		}

		return startEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.chor4integration.chor4int.EndEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndEventItemProvider endEventItemProvider;

	/**
	 * This creates an adapter for a {@link com.chor4integration.chor4int.EndEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndEventAdapter() {
		if (endEventItemProvider == null) {
			endEventItemProvider = new EndEventItemProvider(this);
		}

		return endEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.chor4integration.chor4int.Role} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleItemProvider roleItemProvider;

	/**
	 * This creates an adapter for a {@link com.chor4integration.chor4int.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAdapter() {
		if (roleItemProvider == null) {
			roleItemProvider = new RoleItemProvider(this);
		}

		return roleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.chor4integration.chor4int.AtomicInteraction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicInteractionItemProvider atomicInteractionItemProvider;

	/**
	 * This creates an adapter for a {@link com.chor4integration.chor4int.AtomicInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtomicInteractionAdapter() {
		if (atomicInteractionItemProvider == null) {
			atomicInteractionItemProvider = new AtomicInteractionItemProvider(this);
		}

		return atomicInteractionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (choreographyItemProvider != null)
			choreographyItemProvider.dispose();
		if (sequenceFlowItemProvider != null)
			sequenceFlowItemProvider.dispose();
		if (exclusiveGatewayItemProvider != null)
			exclusiveGatewayItemProvider.dispose();
		if (parallelGatewayItemProvider != null)
			parallelGatewayItemProvider.dispose();
		if (startEventItemProvider != null)
			startEventItemProvider.dispose();
		if (endEventItemProvider != null)
			endEventItemProvider.dispose();
		if (roleItemProvider != null)
			roleItemProvider.dispose();
		if (atomicInteractionItemProvider != null)
			atomicInteractionItemProvider.dispose();
	}

}
