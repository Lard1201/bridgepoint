/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.structure;

import org.xtuml.bp.xtext.masl.masl.types.AbstractTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.DomainFunctionDeclaration#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.DomainFunctionDeclaration#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getDomainFunctionDeclaration()
 * @model
 * @generated
 */
public interface DomainFunctionDeclaration extends Parameterized, AbstractFeature {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.xtuml.bp.xtext.masl.masl.structure.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.Visibility
	 * @see #setVisibility(Visibility)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getDomainFunctionDeclaration_Visibility()
	 * @model unique="false"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.DomainFunctionDeclaration#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.xtuml.bp.xtext.masl.masl.structure.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(AbstractTypeReference)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getDomainFunctionDeclaration_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	AbstractTypeReference getReturnType();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.DomainFunctionDeclaration#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(AbstractTypeReference value);

} // DomainFunctionDeclaration
