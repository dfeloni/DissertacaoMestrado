/**
 */
package maturityModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Practice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maturityModel.SpecificPractice#getName <em>Name</em>}</li>
 *   <li>{@link maturityModel.SpecificPractice#getDescription <em>Description</em>}</li>
 *   <li>{@link maturityModel.SpecificPractice#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link maturityModel.SpecificPractice#getComplementaryDescription <em>Complementary Description</em>}</li>
 * </ul>
 *
 * @see maturityModel.MaturityModelPackage#getSpecificPractice()
 * @model
 * @generated
 */
public interface SpecificPractice extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see maturityModel.MaturityModelPackage#getSpecificPractice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maturityModel.SpecificPractice#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see maturityModel.MaturityModelPackage#getSpecificPractice_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link maturityModel.SpecificPractice#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acronym</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acronym</em>' attribute.
	 * @see #setAcronym(String)
	 * @see maturityModel.MaturityModelPackage#getSpecificPractice_Acronym()
	 * @model
	 * @generated
	 */
	String getAcronym();

	/**
	 * Sets the value of the '{@link maturityModel.SpecificPractice#getAcronym <em>Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acronym</em>' attribute.
	 * @see #getAcronym()
	 * @generated
	 */
	void setAcronym(String value);

	/**
	 * Returns the value of the '<em><b>Complementary Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complementary Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complementary Description</em>' attribute.
	 * @see #setComplementaryDescription(String)
	 * @see maturityModel.MaturityModelPackage#getSpecificPractice_ComplementaryDescription()
	 * @model
	 * @generated
	 */
	String getComplementaryDescription();

	/**
	 * Sets the value of the '{@link maturityModel.SpecificPractice#getComplementaryDescription <em>Complementary Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complementary Description</em>' attribute.
	 * @see #getComplementaryDescription()
	 * @generated
	 */
	void setComplementaryDescription(String value);

} // SpecificPractice
