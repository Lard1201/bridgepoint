/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.CaseStatement#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.CaseStatement#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.CaseStatement#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getCaseStatement()
 * @model
 * @generated
 */
public interface CaseStatement extends AbstractStatement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getCaseStatement_Value()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.behavior.CaseStatement#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtuml.bp.xtext.masl.masl.behavior.CaseAlternative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternatives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getCaseStatement_Alternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<CaseAlternative> getAlternatives();

	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(CaseOthers)
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getCaseStatement_Default()
	 * @model containment="true"
	 * @generated
	 */
	CaseOthers getDefault();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.behavior.CaseStatement#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(CaseOthers value);

} // CaseStatement
