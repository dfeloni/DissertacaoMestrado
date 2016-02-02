/**
 */
package maturityModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maturityModel.ProcessArea#getName <em>Name</em>}</li>
 *   <li>{@link maturityModel.ProcessArea#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link maturityModel.ProcessArea#getMainDescription <em>Main Description</em>}</li>
 *   <li>{@link maturityModel.ProcessArea#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link maturityModel.ProcessArea#getDefines <em>Defines</em>}</li>
 *   <li>{@link maturityModel.ProcessArea#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see maturityModel.MaturityModelPackage#getProcessArea()
 * @model
 * @generated
 */
public interface ProcessArea extends EObject {
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
	 * @see maturityModel.MaturityModelPackage#getProcessArea_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maturityModel.ProcessArea#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Description</em>' attribute.
	 * @see #setShortDescription(String)
	 * @see maturityModel.MaturityModelPackage#getProcessArea_ShortDescription()
	 * @model
	 * @generated
	 */
	String getShortDescription();

	/**
	 * Sets the value of the '{@link maturityModel.ProcessArea#getShortDescription <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Description</em>' attribute.
	 * @see #getShortDescription()
	 * @generated
	 */
	void setShortDescription(String value);

	/**
	 * Returns the value of the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Description</em>' attribute.
	 * @see #setMainDescription(String)
	 * @see maturityModel.MaturityModelPackage#getProcessArea_MainDescription()
	 * @model
	 * @generated
	 */
	String getMainDescription();

	/**
	 * Sets the value of the '{@link maturityModel.ProcessArea#getMainDescription <em>Main Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Description</em>' attribute.
	 * @see #getMainDescription()
	 * @generated
	 */
	void setMainDescription(String value);

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
	 * @see maturityModel.MaturityModelPackage#getProcessArea_Acronym()
	 * @model
	 * @generated
	 */
	String getAcronym();

	/**
	 * Sets the value of the '{@link maturityModel.ProcessArea#getAcronym <em>Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acronym</em>' attribute.
	 * @see #getAcronym()
	 * @generated
	 */
	void setAcronym(String value);

	/**
	 * Returns the value of the '<em><b>Defines</b></em>' containment reference list.
	 * The list contents are of type {@link maturityModel.SpecificPractice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines</em>' containment reference list.
	 * @see maturityModel.MaturityModelPackage#getProcessArea_Defines()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecificPractice> getDefines();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(MaturityLevel)
	 * @see maturityModel.MaturityModelPackage#getProcessArea_Implements()
	 * @model
	 * @generated
	 */
	MaturityLevel getImplements();

	/**
	 * Sets the value of the '{@link maturityModel.ProcessArea#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(MaturityLevel value);

} // ProcessArea
