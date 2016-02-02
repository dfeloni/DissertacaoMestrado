/**
 */
package maturityModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maturity Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maturityModel.MaturityLevel#getName <em>Name</em>}</li>
 *   <li>{@link maturityModel.MaturityLevel#getDescription <em>Description</em>}</li>
 *   <li>{@link maturityModel.MaturityLevel#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link maturityModel.MaturityLevel#getEvolvesInto <em>Evolves Into</em>}</li>
 * </ul>
 *
 * @see maturityModel.MaturityModelPackage#getMaturityLevel()
 * @model
 * @generated
 */
public interface MaturityLevel extends EObject {
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
	 * @see maturityModel.MaturityModelPackage#getMaturityLevel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maturityModel.MaturityLevel#getName <em>Name</em>}' attribute.
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
	 * @see maturityModel.MaturityModelPackage#getMaturityLevel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link maturityModel.MaturityLevel#getDescription <em>Description</em>}' attribute.
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
	 * @see maturityModel.MaturityModelPackage#getMaturityLevel_Acronym()
	 * @model
	 * @generated
	 */
	String getAcronym();

	/**
	 * Sets the value of the '{@link maturityModel.MaturityLevel#getAcronym <em>Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acronym</em>' attribute.
	 * @see #getAcronym()
	 * @generated
	 */
	void setAcronym(String value);

	/**
	 * Returns the value of the '<em><b>Evolves Into</b></em>' containment reference list.
	 * The list contents are of type {@link maturityModel.GenericPractice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolves Into</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolves Into</em>' containment reference list.
	 * @see maturityModel.MaturityModelPackage#getMaturityLevel_EvolvesInto()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericPractice> getEvolvesInto();

} // MaturityLevel
