/**
 */
package maturityModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Practice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maturityModel.GenericPractice#getName <em>Name</em>}</li>
 *   <li>{@link maturityModel.GenericPractice#getDescription <em>Description</em>}</li>
 *   <li>{@link maturityModel.GenericPractice#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link maturityModel.GenericPractice#getComplementaryDescription <em>Complementary Description</em>}</li>
 *   <li>{@link maturityModel.GenericPractice#getDivided <em>Divided</em>}</li>
 * </ul>
 *
 * @see maturityModel.MaturityModelPackage#getGenericPractice()
 * @model
 * @generated
 */
public interface GenericPractice extends EObject {
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
	 * @see maturityModel.MaturityModelPackage#getGenericPractice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maturityModel.GenericPractice#getName <em>Name</em>}' attribute.
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
	 * @see maturityModel.MaturityModelPackage#getGenericPractice_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link maturityModel.GenericPractice#getDescription <em>Description</em>}' attribute.
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
	 * @see maturityModel.MaturityModelPackage#getGenericPractice_Acronym()
	 * @model
	 * @generated
	 */
	String getAcronym();

	/**
	 * Sets the value of the '{@link maturityModel.GenericPractice#getAcronym <em>Acronym</em>}' attribute.
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
	 * @see maturityModel.MaturityModelPackage#getGenericPractice_ComplementaryDescription()
	 * @model
	 * @generated
	 */
	String getComplementaryDescription();

	/**
	 * Sets the value of the '{@link maturityModel.GenericPractice#getComplementaryDescription <em>Complementary Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complementary Description</em>' attribute.
	 * @see #getComplementaryDescription()
	 * @generated
	 */
	void setComplementaryDescription(String value);

	/**
	 * Returns the value of the '<em><b>Divided</b></em>' containment reference list.
	 * The list contents are of type {@link maturityModel.GPSubPractice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Divided</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divided</em>' containment reference list.
	 * @see maturityModel.MaturityModelPackage#getGenericPractice_Divided()
	 * @model containment="true"
	 * @generated
	 */
	EList<GPSubPractice> getDivided();

} // GenericPractice
