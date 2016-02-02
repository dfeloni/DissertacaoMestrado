/**
 */
package maturityModel;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maturity Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maturityModel.MaturityModel#getName <em>Name</em>}</li>
 *   <li>{@link maturityModel.MaturityModel#getVersion <em>Version</em>}</li>
 *   <li>{@link maturityModel.MaturityModel#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link maturityModel.MaturityModel#getAuthor <em>Author</em>}</li>
 *   <li>{@link maturityModel.MaturityModel#getDescription <em>Description</em>}</li>
 *   <li>{@link maturityModel.MaturityModel#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link maturityModel.MaturityModel#getUrl <em>Url</em>}</li>
 *   <li>{@link maturityModel.MaturityModel#getOrganizes <em>Organizes</em>}</li>
 *   <li>{@link maturityModel.MaturityModel#getEvolvesInto <em>Evolves Into</em>}</li>
 * </ul>
 *
 * @see maturityModel.MaturityModelPackage#getMaturityModel()
 * @model
 * @generated
 */
public interface MaturityModel extends EObject {
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
	 * @see maturityModel.MaturityModelPackage#getMaturityModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maturityModel.MaturityModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see maturityModel.MaturityModelPackage#getMaturityModel_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link maturityModel.MaturityModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(Date)
	 * @see maturityModel.MaturityModelPackage#getMaturityModel_ReleaseDate()
	 * @model
	 * @generated
	 */
	Date getReleaseDate();

	/**
	 * Sets the value of the '{@link maturityModel.MaturityModel#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see maturityModel.MaturityModelPackage#getMaturityModel_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link maturityModel.MaturityModel#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

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
	 * @see maturityModel.MaturityModelPackage#getMaturityModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link maturityModel.MaturityModel#getDescription <em>Description</em>}' attribute.
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
	 * @see maturityModel.MaturityModelPackage#getMaturityModel_Acronym()
	 * @model
	 * @generated
	 */
	String getAcronym();

	/**
	 * Sets the value of the '{@link maturityModel.MaturityModel#getAcronym <em>Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acronym</em>' attribute.
	 * @see #getAcronym()
	 * @generated
	 */
	void setAcronym(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see maturityModel.MaturityModelPackage#getMaturityModel_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link maturityModel.MaturityModel#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Organizes</b></em>' containment reference list.
	 * The list contents are of type {@link maturityModel.ProcessArea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizes</em>' containment reference list.
	 * @see maturityModel.MaturityModelPackage#getMaturityModel_Organizes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessArea> getOrganizes();

	/**
	 * Returns the value of the '<em><b>Evolves Into</b></em>' containment reference list.
	 * The list contents are of type {@link maturityModel.MaturityLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolves Into</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolves Into</em>' containment reference list.
	 * @see maturityModel.MaturityModelPackage#getMaturityModel_EvolvesInto()
	 * @model containment="true"
	 * @generated
	 */
	EList<MaturityLevel> getEvolvesInto();

} // MaturityModel
