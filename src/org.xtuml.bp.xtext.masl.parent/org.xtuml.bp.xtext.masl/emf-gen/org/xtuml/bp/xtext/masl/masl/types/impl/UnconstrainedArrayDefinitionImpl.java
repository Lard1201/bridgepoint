/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtuml.bp.xtext.masl.masl.types.AbstractTypeReference;
import org.xtuml.bp.xtext.masl.masl.types.NamedTypeReference;
import org.xtuml.bp.xtext.masl.masl.types.TypesPackage;
import org.xtuml.bp.xtext.masl.masl.types.UnconstrainedArrayDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unconstrained Array Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.impl.UnconstrainedArrayDefinitionImpl#getIndexType <em>Index Type</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.impl.UnconstrainedArrayDefinitionImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnconstrainedArrayDefinitionImpl extends AbstractTypeDefinitionImpl implements UnconstrainedArrayDefinition {
	/**
	 * The cached value of the '{@link #getIndexType() <em>Index Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexType()
	 * @generated
	 * @ordered
	 */
	protected NamedTypeReference indexType;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected AbstractTypeReference elementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnconstrainedArrayDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.UNCONSTRAINED_ARRAY_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedTypeReference getIndexType() {
		return indexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexType(NamedTypeReference newIndexType, NotificationChain msgs) {
		NamedTypeReference oldIndexType = indexType;
		indexType = newIndexType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__INDEX_TYPE, oldIndexType, newIndexType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexType(NamedTypeReference newIndexType) {
		if (newIndexType != indexType) {
			NotificationChain msgs = null;
			if (indexType != null)
				msgs = ((InternalEObject)indexType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__INDEX_TYPE, null, msgs);
			if (newIndexType != null)
				msgs = ((InternalEObject)newIndexType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__INDEX_TYPE, null, msgs);
			msgs = basicSetIndexType(newIndexType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__INDEX_TYPE, newIndexType, newIndexType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeReference getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementType(AbstractTypeReference newElementType, NotificationChain msgs) {
		AbstractTypeReference oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__ELEMENT_TYPE, oldElementType, newElementType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(AbstractTypeReference newElementType) {
		if (newElementType != elementType) {
			NotificationChain msgs = null;
			if (elementType != null)
				msgs = ((InternalEObject)elementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__ELEMENT_TYPE, null, msgs);
			if (newElementType != null)
				msgs = ((InternalEObject)newElementType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__ELEMENT_TYPE, null, msgs);
			msgs = basicSetElementType(newElementType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__ELEMENT_TYPE, newElementType, newElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__INDEX_TYPE:
				return basicSetIndexType(null, msgs);
			case TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__ELEMENT_TYPE:
				return basicSetElementType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__INDEX_TYPE:
				return getIndexType();
			case TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__ELEMENT_TYPE:
				return getElementType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__INDEX_TYPE:
				setIndexType((NamedTypeReference)newValue);
				return;
			case TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__ELEMENT_TYPE:
				setElementType((AbstractTypeReference)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__INDEX_TYPE:
				setIndexType((NamedTypeReference)null);
				return;
			case TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__ELEMENT_TYPE:
				setElementType((AbstractTypeReference)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__INDEX_TYPE:
				return indexType != null;
			case TypesPackage.UNCONSTRAINED_ARRAY_DEFINITION__ELEMENT_TYPE:
				return elementType != null;
		}
		return super.eIsSet(featureID);
	}

} //UnconstrainedArrayDefinitionImpl