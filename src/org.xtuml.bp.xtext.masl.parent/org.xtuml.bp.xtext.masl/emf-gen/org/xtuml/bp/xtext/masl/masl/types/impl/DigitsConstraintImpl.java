/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtuml.bp.xtext.masl.masl.behavior.ConstExpression;

import org.xtuml.bp.xtext.masl.masl.types.DigitsConstraint;
import org.xtuml.bp.xtext.masl.masl.types.RangeConstraint;
import org.xtuml.bp.xtext.masl.masl.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digits Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.impl.DigitsConstraintImpl#getDigits <em>Digits</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.impl.DigitsConstraintImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DigitsConstraintImpl extends AbstractTypeConstraintImpl implements DigitsConstraint {
	/**
	 * The cached value of the '{@link #getDigits() <em>Digits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigits()
	 * @generated
	 * @ordered
	 */
	protected ConstExpression digits;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected RangeConstraint constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitsConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.DIGITS_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstExpression getDigits() {
		return digits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDigits(ConstExpression newDigits, NotificationChain msgs) {
		ConstExpression oldDigits = digits;
		digits = newDigits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DIGITS_CONSTRAINT__DIGITS, oldDigits, newDigits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigits(ConstExpression newDigits) {
		if (newDigits != digits) {
			NotificationChain msgs = null;
			if (digits != null)
				msgs = ((InternalEObject)digits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DIGITS_CONSTRAINT__DIGITS, null, msgs);
			if (newDigits != null)
				msgs = ((InternalEObject)newDigits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DIGITS_CONSTRAINT__DIGITS, null, msgs);
			msgs = basicSetDigits(newDigits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DIGITS_CONSTRAINT__DIGITS, newDigits, newDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeConstraint getConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(RangeConstraint newConstraint, NotificationChain msgs) {
		RangeConstraint oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DIGITS_CONSTRAINT__CONSTRAINT, oldConstraint, newConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(RangeConstraint newConstraint) {
		if (newConstraint != constraint) {
			NotificationChain msgs = null;
			if (constraint != null)
				msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DIGITS_CONSTRAINT__CONSTRAINT, null, msgs);
			if (newConstraint != null)
				msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DIGITS_CONSTRAINT__CONSTRAINT, null, msgs);
			msgs = basicSetConstraint(newConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DIGITS_CONSTRAINT__CONSTRAINT, newConstraint, newConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DIGITS_CONSTRAINT__DIGITS:
				return basicSetDigits(null, msgs);
			case TypesPackage.DIGITS_CONSTRAINT__CONSTRAINT:
				return basicSetConstraint(null, msgs);
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
			case TypesPackage.DIGITS_CONSTRAINT__DIGITS:
				return getDigits();
			case TypesPackage.DIGITS_CONSTRAINT__CONSTRAINT:
				return getConstraint();
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
			case TypesPackage.DIGITS_CONSTRAINT__DIGITS:
				setDigits((ConstExpression)newValue);
				return;
			case TypesPackage.DIGITS_CONSTRAINT__CONSTRAINT:
				setConstraint((RangeConstraint)newValue);
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
			case TypesPackage.DIGITS_CONSTRAINT__DIGITS:
				setDigits((ConstExpression)null);
				return;
			case TypesPackage.DIGITS_CONSTRAINT__CONSTRAINT:
				setConstraint((RangeConstraint)null);
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
			case TypesPackage.DIGITS_CONSTRAINT__DIGITS:
				return digits != null;
			case TypesPackage.DIGITS_CONSTRAINT__CONSTRAINT:
				return constraint != null;
		}
		return super.eIsSet(featureID);
	}

} //DigitsConstraintImpl
