/**
 */
package assessment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assessment.Questionnaire#getName <em>Name</em>}</li>
 *   <li>{@link assessment.Questionnaire#getDescription <em>Description</em>}</li>
 *   <li>{@link assessment.Questionnaire#getProcessArea <em>Process Area</em>}</li>
 *   <li>{@link assessment.Questionnaire#getMaturityLevel <em>Maturity Level</em>}</li>
 *   <li>{@link assessment.Questionnaire#getEvaluates <em>Evaluates</em>}</li>
 * </ul>
 *
 * @see assessment.AssessmentPackage#getQuestionnaire()
 * @model
 * @generated
 */
public interface Questionnaire extends EObject {
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
	 * @see assessment.AssessmentPackage#getQuestionnaire_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assessment.Questionnaire#getName <em>Name</em>}' attribute.
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
	 * @see assessment.AssessmentPackage#getQuestionnaire_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link assessment.Questionnaire#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Process Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Area</em>' attribute.
	 * @see #setProcessArea(String)
	 * @see assessment.AssessmentPackage#getQuestionnaire_ProcessArea()
	 * @model
	 * @generated
	 */
	String getProcessArea();

	/**
	 * Sets the value of the '{@link assessment.Questionnaire#getProcessArea <em>Process Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Area</em>' attribute.
	 * @see #getProcessArea()
	 * @generated
	 */
	void setProcessArea(String value);

	/**
	 * Returns the value of the '<em><b>Maturity Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maturity Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maturity Level</em>' attribute.
	 * @see #setMaturityLevel(String)
	 * @see assessment.AssessmentPackage#getQuestionnaire_MaturityLevel()
	 * @model
	 * @generated
	 */
	String getMaturityLevel();

	/**
	 * Sets the value of the '{@link assessment.Questionnaire#getMaturityLevel <em>Maturity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maturity Level</em>' attribute.
	 * @see #getMaturityLevel()
	 * @generated
	 */
	void setMaturityLevel(String value);

	/**
	 * Returns the value of the '<em><b>Evaluates</b></em>' containment reference list.
	 * The list contents are of type {@link assessment.ComplianceItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluates</em>' containment reference list.
	 * @see assessment.AssessmentPackage#getQuestionnaire_Evaluates()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComplianceItem> getEvaluates();

} // Questionnaire
