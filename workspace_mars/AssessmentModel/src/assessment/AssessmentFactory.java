/**
 */
package assessment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see assessment.AssessmentPackage
 * @generated
 */
public interface AssessmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssessmentFactory eINSTANCE = assessment.impl.AssessmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Executed Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executed Assessment</em>'.
	 * @generated
	 */
	ExecutedAssessment createExecutedAssessment();

	/**
	 * Returns a new object of class '<em>Subjective Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subjective Assessment</em>'.
	 * @generated
	 */
	SubjectiveAssessment createSubjectiveAssessment();

	/**
	 * Returns a new object of class '<em>Objective Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Assessment</em>'.
	 * @generated
	 */
	ObjectiveAssessment createObjectiveAssessment();

	/**
	 * Returns a new object of class '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionnaire</em>'.
	 * @generated
	 */
	Questionnaire createQuestionnaire();

	/**
	 * Returns a new object of class '<em>Compliance Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compliance Item</em>'.
	 * @generated
	 */
	ComplianceItem createComplianceItem();

	/**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
	Question createQuestion();

	/**
	 * Returns a new object of class '<em>Answer Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Answer Option</em>'.
	 * @generated
	 */
	AnswerOption createAnswerOption();

	/**
	 * Returns a new object of class '<em>Script Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script Template</em>'.
	 * @generated
	 */
	ScriptTemplate createScriptTemplate();

	/**
	 * Returns a new object of class '<em>Compliance Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compliance Type</em>'.
	 * @generated
	 */
	ComplianceType createComplianceType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AssessmentPackage getAssessmentPackage();

} //AssessmentFactory
