/**
 */
package assessment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compliance Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assessment.ComplianceItem#getDescription <em>Description</em>}</li>
 *   <li>{@link assessment.ComplianceItem#getGenericPractice <em>Generic Practice</em>}</li>
 *   <li>{@link assessment.ComplianceItem#getGenericSubPractice <em>Generic Sub Practice</em>}</li>
 *   <li>{@link assessment.ComplianceItem#getSpecificPractice <em>Specific Practice</em>}</li>
 *   <li>{@link assessment.ComplianceItem#getDeterminedBy <em>Determined By</em>}</li>
 *   <li>{@link assessment.ComplianceItem#getDefinesComplianceLevel <em>Defines Compliance Level</em>}</li>
 *   <li>{@link assessment.ComplianceItem#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see assessment.AssessmentPackage#getComplianceItem()
 * @model
 * @generated
 */
public interface ComplianceItem extends EObject {
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
	 * @see assessment.AssessmentPackage#getComplianceItem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link assessment.ComplianceItem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Generic Practice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Practice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Practice</em>' attribute.
	 * @see #setGenericPractice(String)
	 * @see assessment.AssessmentPackage#getComplianceItem_GenericPractice()
	 * @model
	 * @generated
	 */
	String getGenericPractice();

	/**
	 * Sets the value of the '{@link assessment.ComplianceItem#getGenericPractice <em>Generic Practice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Practice</em>' attribute.
	 * @see #getGenericPractice()
	 * @generated
	 */
	void setGenericPractice(String value);

	/**
	 * Returns the value of the '<em><b>Generic Sub Practice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Sub Practice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Sub Practice</em>' attribute.
	 * @see #setGenericSubPractice(String)
	 * @see assessment.AssessmentPackage#getComplianceItem_GenericSubPractice()
	 * @model
	 * @generated
	 */
	String getGenericSubPractice();

	/**
	 * Sets the value of the '{@link assessment.ComplianceItem#getGenericSubPractice <em>Generic Sub Practice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Sub Practice</em>' attribute.
	 * @see #getGenericSubPractice()
	 * @generated
	 */
	void setGenericSubPractice(String value);

	/**
	 * Returns the value of the '<em><b>Specific Practice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Practice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Practice</em>' attribute.
	 * @see #setSpecificPractice(String)
	 * @see assessment.AssessmentPackage#getComplianceItem_SpecificPractice()
	 * @model
	 * @generated
	 */
	String getSpecificPractice();

	/**
	 * Sets the value of the '{@link assessment.ComplianceItem#getSpecificPractice <em>Specific Practice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Practice</em>' attribute.
	 * @see #getSpecificPractice()
	 * @generated
	 */
	void setSpecificPractice(String value);

	/**
	 * Returns the value of the '<em><b>Determined By</b></em>' containment reference list.
	 * The list contents are of type {@link assessment.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Determined By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Determined By</em>' containment reference list.
	 * @see assessment.AssessmentPackage#getComplianceItem_DeterminedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getDeterminedBy();

	/**
	 * Returns the value of the '<em><b>Defines Compliance Level</b></em>' containment reference list.
	 * The list contents are of type {@link assessment.ComplianceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defines Compliance Level</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines Compliance Level</em>' containment reference list.
	 * @see assessment.AssessmentPackage#getComplianceItem_DefinesComplianceLevel()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComplianceType> getDefinesComplianceLevel();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(ComplianceType)
	 * @see assessment.AssessmentPackage#getComplianceItem_Result()
	 * @model
	 * @generated
	 */
	ComplianceType getResult();

	/**
	 * Sets the value of the '{@link assessment.ComplianceItem#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(ComplianceType value);

} // ComplianceItem
