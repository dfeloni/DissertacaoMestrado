/**
 */
package assessment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see assessment.AssessmentFactory
 * @model kind="package"
 * @generated
 */
public interface AssessmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assessment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/AssessmentModel/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "asmnt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssessmentPackage eINSTANCE = assessment.impl.AssessmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link assessment.impl.ExecutedAssessmentImpl <em>Executed Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.ExecutedAssessmentImpl
	 * @see assessment.impl.AssessmentPackageImpl#getExecutedAssessment()
	 * @generated
	 */
	int EXECUTED_ASSESSMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ASSESSMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ASSESSMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ASSESSMENT__DATE = 2;

	/**
	 * The feature id for the '<em><b>Maturity Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ASSESSMENT__MATURITY_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ASSESSMENT__PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Perform Subjective Evaluation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ASSESSMENT__PERFORM_SUBJECTIVE_EVALUATION = 5;

	/**
	 * The feature id for the '<em><b>Perform Objective Evaluation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ASSESSMENT__PERFORM_OBJECTIVE_EVALUATION = 6;

	/**
	 * The number of structural features of the '<em>Executed Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ASSESSMENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Executed Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTED_ASSESSMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.SubjectiveAssessmentImpl <em>Subjective Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.SubjectiveAssessmentImpl
	 * @see assessment.impl.AssessmentPackageImpl#getSubjectiveAssessment()
	 * @generated
	 */
	int SUBJECTIVE_ASSESSMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTIVE_ASSESSMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTIVE_ASSESSMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Organizes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTIVE_ASSESSMENT__ORGANIZES = 2;

	/**
	 * The number of structural features of the '<em>Subjective Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTIVE_ASSESSMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Subjective Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTIVE_ASSESSMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.ObjectiveAssessmentImpl <em>Objective Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.ObjectiveAssessmentImpl
	 * @see assessment.impl.AssessmentPackageImpl#getObjectiveAssessment()
	 * @generated
	 */
	int OBJECTIVE_ASSESSMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_ASSESSMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_ASSESSMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Defines Evaluation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_ASSESSMENT__DEFINES_EVALUATION_RULES = 2;

	/**
	 * The number of structural features of the '<em>Objective Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_ASSESSMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Objective Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_ASSESSMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.QuestionnaireImpl
	 * @see assessment.impl.AssessmentPackageImpl#getQuestionnaire()
	 * @generated
	 */
	int QUESTIONNAIRE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Process Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__PROCESS_AREA = 2;

	/**
	 * The feature id for the '<em><b>Maturity Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__MATURITY_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Evaluates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__EVALUATES = 4;

	/**
	 * The number of structural features of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.ComplianceItemImpl <em>Compliance Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.ComplianceItemImpl
	 * @see assessment.impl.AssessmentPackageImpl#getComplianceItem()
	 * @generated
	 */
	int COMPLIANCE_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_ITEM__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Generic Practice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_ITEM__GENERIC_PRACTICE = 1;

	/**
	 * The feature id for the '<em><b>Generic Sub Practice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_ITEM__GENERIC_SUB_PRACTICE = 2;

	/**
	 * The feature id for the '<em><b>Specific Practice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_ITEM__SPECIFIC_PRACTICE = 3;

	/**
	 * The feature id for the '<em><b>Determined By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_ITEM__DETERMINED_BY = 4;

	/**
	 * The feature id for the '<em><b>Defines Compliance Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_ITEM__DEFINES_COMPLIANCE_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_ITEM__RESULT = 6;

	/**
	 * The number of structural features of the '<em>Compliance Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_ITEM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Compliance Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.QuestionImpl
	 * @see assessment.impl.AssessmentPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 5;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTION = 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__WEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Evaluates By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__EVALUATES_BY = 2;

	/**
	 * The feature id for the '<em><b>User Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__USER_ANSWER = 3;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.AnswerOptionImpl <em>Answer Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.AnswerOptionImpl
	 * @see assessment.impl.AssessmentPackageImpl#getAnswerOption()
	 * @generated
	 */
	int ANSWER_OPTION = 6;

	/**
	 * The feature id for the '<em><b>Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPTION__OPTION = 0;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPTION__SCORE = 1;

	/**
	 * The number of structural features of the '<em>Answer Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Answer Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.ScriptTemplateImpl <em>Script Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.ScriptTemplateImpl
	 * @see assessment.impl.AssessmentPackageImpl#getScriptTemplate()
	 * @generated
	 */
	int SCRIPT_TEMPLATE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TEMPLATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TEMPLATE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TEMPLATE__TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Script Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TEMPLATE__SCRIPT_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Script Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TEMPLATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Script Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.impl.ComplianceTypeImpl <em>Compliance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.impl.ComplianceTypeImpl
	 * @see assessment.impl.AssessmentPackageImpl#getComplianceType()
	 * @generated
	 */
	int COMPLIANCE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_TYPE__MIN_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_TYPE__MAX_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Compliance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Compliance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assessment.ScriptType <em>Script Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assessment.ScriptType
	 * @see assessment.impl.AssessmentPackageImpl#getScriptType()
	 * @generated
	 */
	int SCRIPT_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link assessment.ExecutedAssessment <em>Executed Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executed Assessment</em>'.
	 * @see assessment.ExecutedAssessment
	 * @generated
	 */
	EClass getExecutedAssessment();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ExecutedAssessment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assessment.ExecutedAssessment#getName()
	 * @see #getExecutedAssessment()
	 * @generated
	 */
	EAttribute getExecutedAssessment_Name();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ExecutedAssessment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see assessment.ExecutedAssessment#getDescription()
	 * @see #getExecutedAssessment()
	 * @generated
	 */
	EAttribute getExecutedAssessment_Description();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ExecutedAssessment#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see assessment.ExecutedAssessment#getDate()
	 * @see #getExecutedAssessment()
	 * @generated
	 */
	EAttribute getExecutedAssessment_Date();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ExecutedAssessment#getMaturityModel <em>Maturity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maturity Model</em>'.
	 * @see assessment.ExecutedAssessment#getMaturityModel()
	 * @see #getExecutedAssessment()
	 * @generated
	 */
	EAttribute getExecutedAssessment_MaturityModel();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ExecutedAssessment#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process</em>'.
	 * @see assessment.ExecutedAssessment#getProcess()
	 * @see #getExecutedAssessment()
	 * @generated
	 */
	EAttribute getExecutedAssessment_Process();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.ExecutedAssessment#getPerformSubjectiveEvaluation <em>Perform Subjective Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Perform Subjective Evaluation</em>'.
	 * @see assessment.ExecutedAssessment#getPerformSubjectiveEvaluation()
	 * @see #getExecutedAssessment()
	 * @generated
	 */
	EReference getExecutedAssessment_PerformSubjectiveEvaluation();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.ExecutedAssessment#getPerformObjectiveEvaluation <em>Perform Objective Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Perform Objective Evaluation</em>'.
	 * @see assessment.ExecutedAssessment#getPerformObjectiveEvaluation()
	 * @see #getExecutedAssessment()
	 * @generated
	 */
	EReference getExecutedAssessment_PerformObjectiveEvaluation();

	/**
	 * Returns the meta object for class '{@link assessment.SubjectiveAssessment <em>Subjective Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subjective Assessment</em>'.
	 * @see assessment.SubjectiveAssessment
	 * @generated
	 */
	EClass getSubjectiveAssessment();

	/**
	 * Returns the meta object for the attribute '{@link assessment.SubjectiveAssessment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assessment.SubjectiveAssessment#getName()
	 * @see #getSubjectiveAssessment()
	 * @generated
	 */
	EAttribute getSubjectiveAssessment_Name();

	/**
	 * Returns the meta object for the attribute '{@link assessment.SubjectiveAssessment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see assessment.SubjectiveAssessment#getDescription()
	 * @see #getSubjectiveAssessment()
	 * @generated
	 */
	EAttribute getSubjectiveAssessment_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.SubjectiveAssessment#getOrganizes <em>Organizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizes</em>'.
	 * @see assessment.SubjectiveAssessment#getOrganizes()
	 * @see #getSubjectiveAssessment()
	 * @generated
	 */
	EReference getSubjectiveAssessment_Organizes();

	/**
	 * Returns the meta object for class '{@link assessment.ObjectiveAssessment <em>Objective Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective Assessment</em>'.
	 * @see assessment.ObjectiveAssessment
	 * @generated
	 */
	EClass getObjectiveAssessment();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ObjectiveAssessment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assessment.ObjectiveAssessment#getName()
	 * @see #getObjectiveAssessment()
	 * @generated
	 */
	EAttribute getObjectiveAssessment_Name();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ObjectiveAssessment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see assessment.ObjectiveAssessment#getDescription()
	 * @see #getObjectiveAssessment()
	 * @generated
	 */
	EAttribute getObjectiveAssessment_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.ObjectiveAssessment#getDefinesEvaluationRules <em>Defines Evaluation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defines Evaluation Rules</em>'.
	 * @see assessment.ObjectiveAssessment#getDefinesEvaluationRules()
	 * @see #getObjectiveAssessment()
	 * @generated
	 */
	EReference getObjectiveAssessment_DefinesEvaluationRules();

	/**
	 * Returns the meta object for class '{@link assessment.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see assessment.Questionnaire
	 * @generated
	 */
	EClass getQuestionnaire();

	/**
	 * Returns the meta object for the attribute '{@link assessment.Questionnaire#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assessment.Questionnaire#getName()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_Name();

	/**
	 * Returns the meta object for the attribute '{@link assessment.Questionnaire#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see assessment.Questionnaire#getDescription()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_Description();

	/**
	 * Returns the meta object for the attribute '{@link assessment.Questionnaire#getProcessArea <em>Process Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Area</em>'.
	 * @see assessment.Questionnaire#getProcessArea()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_ProcessArea();

	/**
	 * Returns the meta object for the attribute '{@link assessment.Questionnaire#getMaturityLevel <em>Maturity Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maturity Level</em>'.
	 * @see assessment.Questionnaire#getMaturityLevel()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EAttribute getQuestionnaire_MaturityLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.Questionnaire#getEvaluates <em>Evaluates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluates</em>'.
	 * @see assessment.Questionnaire#getEvaluates()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Evaluates();

	/**
	 * Returns the meta object for class '{@link assessment.ComplianceItem <em>Compliance Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compliance Item</em>'.
	 * @see assessment.ComplianceItem
	 * @generated
	 */
	EClass getComplianceItem();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ComplianceItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see assessment.ComplianceItem#getDescription()
	 * @see #getComplianceItem()
	 * @generated
	 */
	EAttribute getComplianceItem_Description();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ComplianceItem#getGenericPractice <em>Generic Practice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic Practice</em>'.
	 * @see assessment.ComplianceItem#getGenericPractice()
	 * @see #getComplianceItem()
	 * @generated
	 */
	EAttribute getComplianceItem_GenericPractice();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ComplianceItem#getGenericSubPractice <em>Generic Sub Practice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic Sub Practice</em>'.
	 * @see assessment.ComplianceItem#getGenericSubPractice()
	 * @see #getComplianceItem()
	 * @generated
	 */
	EAttribute getComplianceItem_GenericSubPractice();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ComplianceItem#getSpecificPractice <em>Specific Practice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specific Practice</em>'.
	 * @see assessment.ComplianceItem#getSpecificPractice()
	 * @see #getComplianceItem()
	 * @generated
	 */
	EAttribute getComplianceItem_SpecificPractice();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.ComplianceItem#getDeterminedBy <em>Determined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Determined By</em>'.
	 * @see assessment.ComplianceItem#getDeterminedBy()
	 * @see #getComplianceItem()
	 * @generated
	 */
	EReference getComplianceItem_DeterminedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.ComplianceItem#getDefinesComplianceLevel <em>Defines Compliance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defines Compliance Level</em>'.
	 * @see assessment.ComplianceItem#getDefinesComplianceLevel()
	 * @see #getComplianceItem()
	 * @generated
	 */
	EReference getComplianceItem_DefinesComplianceLevel();

	/**
	 * Returns the meta object for the reference '{@link assessment.ComplianceItem#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see assessment.ComplianceItem#getResult()
	 * @see #getComplianceItem()
	 * @generated
	 */
	EReference getComplianceItem_Result();

	/**
	 * Returns the meta object for class '{@link assessment.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see assessment.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link assessment.Question#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see assessment.Question#getQuestion()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Question();

	/**
	 * Returns the meta object for the attribute '{@link assessment.Question#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see assessment.Question#getWeight()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Weight();

	/**
	 * Returns the meta object for the containment reference list '{@link assessment.Question#getEvaluatesBy <em>Evaluates By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluates By</em>'.
	 * @see assessment.Question#getEvaluatesBy()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_EvaluatesBy();

	/**
	 * Returns the meta object for the reference '{@link assessment.Question#getUserAnswer <em>User Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Answer</em>'.
	 * @see assessment.Question#getUserAnswer()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_UserAnswer();

	/**
	 * Returns the meta object for class '{@link assessment.AnswerOption <em>Answer Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer Option</em>'.
	 * @see assessment.AnswerOption
	 * @generated
	 */
	EClass getAnswerOption();

	/**
	 * Returns the meta object for the attribute '{@link assessment.AnswerOption#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option</em>'.
	 * @see assessment.AnswerOption#getOption()
	 * @see #getAnswerOption()
	 * @generated
	 */
	EAttribute getAnswerOption_Option();

	/**
	 * Returns the meta object for the attribute '{@link assessment.AnswerOption#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see assessment.AnswerOption#getScore()
	 * @see #getAnswerOption()
	 * @generated
	 */
	EAttribute getAnswerOption_Score();

	/**
	 * Returns the meta object for class '{@link assessment.ScriptTemplate <em>Script Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Template</em>'.
	 * @see assessment.ScriptTemplate
	 * @generated
	 */
	EClass getScriptTemplate();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ScriptTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assessment.ScriptTemplate#getName()
	 * @see #getScriptTemplate()
	 * @generated
	 */
	EAttribute getScriptTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ScriptTemplate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see assessment.ScriptTemplate#getDescription()
	 * @see #getScriptTemplate()
	 * @generated
	 */
	EAttribute getScriptTemplate_Description();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ScriptTemplate#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template</em>'.
	 * @see assessment.ScriptTemplate#getTemplate()
	 * @see #getScriptTemplate()
	 * @generated
	 */
	EAttribute getScriptTemplate_Template();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ScriptTemplate#getScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Type</em>'.
	 * @see assessment.ScriptTemplate#getScriptType()
	 * @see #getScriptTemplate()
	 * @generated
	 */
	EAttribute getScriptTemplate_ScriptType();

	/**
	 * Returns the meta object for class '{@link assessment.ComplianceType <em>Compliance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compliance Type</em>'.
	 * @see assessment.ComplianceType
	 * @generated
	 */
	EClass getComplianceType();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ComplianceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assessment.ComplianceType#getName()
	 * @see #getComplianceType()
	 * @generated
	 */
	EAttribute getComplianceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ComplianceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see assessment.ComplianceType#getDescription()
	 * @see #getComplianceType()
	 * @generated
	 */
	EAttribute getComplianceType_Description();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ComplianceType#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see assessment.ComplianceType#getMinValue()
	 * @see #getComplianceType()
	 * @generated
	 */
	EAttribute getComplianceType_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link assessment.ComplianceType#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see assessment.ComplianceType#getMaxValue()
	 * @see #getComplianceType()
	 * @generated
	 */
	EAttribute getComplianceType_MaxValue();

	/**
	 * Returns the meta object for enum '{@link assessment.ScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Script Type</em>'.
	 * @see assessment.ScriptType
	 * @generated
	 */
	EEnum getScriptType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssessmentFactory getAssessmentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link assessment.impl.ExecutedAssessmentImpl <em>Executed Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.ExecutedAssessmentImpl
		 * @see assessment.impl.AssessmentPackageImpl#getExecutedAssessment()
		 * @generated
		 */
		EClass EXECUTED_ASSESSMENT = eINSTANCE.getExecutedAssessment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_ASSESSMENT__NAME = eINSTANCE.getExecutedAssessment_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_ASSESSMENT__DESCRIPTION = eINSTANCE.getExecutedAssessment_Description();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_ASSESSMENT__DATE = eINSTANCE.getExecutedAssessment_Date();

		/**
		 * The meta object literal for the '<em><b>Maturity Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_ASSESSMENT__MATURITY_MODEL = eINSTANCE.getExecutedAssessment_MaturityModel();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTED_ASSESSMENT__PROCESS = eINSTANCE.getExecutedAssessment_Process();

		/**
		 * The meta object literal for the '<em><b>Perform Subjective Evaluation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTED_ASSESSMENT__PERFORM_SUBJECTIVE_EVALUATION = eINSTANCE.getExecutedAssessment_PerformSubjectiveEvaluation();

		/**
		 * The meta object literal for the '<em><b>Perform Objective Evaluation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTED_ASSESSMENT__PERFORM_OBJECTIVE_EVALUATION = eINSTANCE.getExecutedAssessment_PerformObjectiveEvaluation();

		/**
		 * The meta object literal for the '{@link assessment.impl.SubjectiveAssessmentImpl <em>Subjective Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.SubjectiveAssessmentImpl
		 * @see assessment.impl.AssessmentPackageImpl#getSubjectiveAssessment()
		 * @generated
		 */
		EClass SUBJECTIVE_ASSESSMENT = eINSTANCE.getSubjectiveAssessment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECTIVE_ASSESSMENT__NAME = eINSTANCE.getSubjectiveAssessment_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECTIVE_ASSESSMENT__DESCRIPTION = eINSTANCE.getSubjectiveAssessment_Description();

		/**
		 * The meta object literal for the '<em><b>Organizes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECTIVE_ASSESSMENT__ORGANIZES = eINSTANCE.getSubjectiveAssessment_Organizes();

		/**
		 * The meta object literal for the '{@link assessment.impl.ObjectiveAssessmentImpl <em>Objective Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.ObjectiveAssessmentImpl
		 * @see assessment.impl.AssessmentPackageImpl#getObjectiveAssessment()
		 * @generated
		 */
		EClass OBJECTIVE_ASSESSMENT = eINSTANCE.getObjectiveAssessment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE_ASSESSMENT__NAME = eINSTANCE.getObjectiveAssessment_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE_ASSESSMENT__DESCRIPTION = eINSTANCE.getObjectiveAssessment_Description();

		/**
		 * The meta object literal for the '<em><b>Defines Evaluation Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE_ASSESSMENT__DEFINES_EVALUATION_RULES = eINSTANCE.getObjectiveAssessment_DefinesEvaluationRules();

		/**
		 * The meta object literal for the '{@link assessment.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.QuestionnaireImpl
		 * @see assessment.impl.AssessmentPackageImpl#getQuestionnaire()
		 * @generated
		 */
		EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__NAME = eINSTANCE.getQuestionnaire_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__DESCRIPTION = eINSTANCE.getQuestionnaire_Description();

		/**
		 * The meta object literal for the '<em><b>Process Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__PROCESS_AREA = eINSTANCE.getQuestionnaire_ProcessArea();

		/**
		 * The meta object literal for the '<em><b>Maturity Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONNAIRE__MATURITY_LEVEL = eINSTANCE.getQuestionnaire_MaturityLevel();

		/**
		 * The meta object literal for the '<em><b>Evaluates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__EVALUATES = eINSTANCE.getQuestionnaire_Evaluates();

		/**
		 * The meta object literal for the '{@link assessment.impl.ComplianceItemImpl <em>Compliance Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.ComplianceItemImpl
		 * @see assessment.impl.AssessmentPackageImpl#getComplianceItem()
		 * @generated
		 */
		EClass COMPLIANCE_ITEM = eINSTANCE.getComplianceItem();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_ITEM__DESCRIPTION = eINSTANCE.getComplianceItem_Description();

		/**
		 * The meta object literal for the '<em><b>Generic Practice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_ITEM__GENERIC_PRACTICE = eINSTANCE.getComplianceItem_GenericPractice();

		/**
		 * The meta object literal for the '<em><b>Generic Sub Practice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_ITEM__GENERIC_SUB_PRACTICE = eINSTANCE.getComplianceItem_GenericSubPractice();

		/**
		 * The meta object literal for the '<em><b>Specific Practice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_ITEM__SPECIFIC_PRACTICE = eINSTANCE.getComplianceItem_SpecificPractice();

		/**
		 * The meta object literal for the '<em><b>Determined By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_ITEM__DETERMINED_BY = eINSTANCE.getComplianceItem_DeterminedBy();

		/**
		 * The meta object literal for the '<em><b>Defines Compliance Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_ITEM__DEFINES_COMPLIANCE_LEVEL = eINSTANCE.getComplianceItem_DefinesComplianceLevel();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_ITEM__RESULT = eINSTANCE.getComplianceItem_Result();

		/**
		 * The meta object literal for the '{@link assessment.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.QuestionImpl
		 * @see assessment.impl.AssessmentPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__QUESTION = eINSTANCE.getQuestion_Question();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__WEIGHT = eINSTANCE.getQuestion_Weight();

		/**
		 * The meta object literal for the '<em><b>Evaluates By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__EVALUATES_BY = eINSTANCE.getQuestion_EvaluatesBy();

		/**
		 * The meta object literal for the '<em><b>User Answer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__USER_ANSWER = eINSTANCE.getQuestion_UserAnswer();

		/**
		 * The meta object literal for the '{@link assessment.impl.AnswerOptionImpl <em>Answer Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.AnswerOptionImpl
		 * @see assessment.impl.AssessmentPackageImpl#getAnswerOption()
		 * @generated
		 */
		EClass ANSWER_OPTION = eINSTANCE.getAnswerOption();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER_OPTION__OPTION = eINSTANCE.getAnswerOption_Option();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER_OPTION__SCORE = eINSTANCE.getAnswerOption_Score();

		/**
		 * The meta object literal for the '{@link assessment.impl.ScriptTemplateImpl <em>Script Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.ScriptTemplateImpl
		 * @see assessment.impl.AssessmentPackageImpl#getScriptTemplate()
		 * @generated
		 */
		EClass SCRIPT_TEMPLATE = eINSTANCE.getScriptTemplate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TEMPLATE__NAME = eINSTANCE.getScriptTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TEMPLATE__DESCRIPTION = eINSTANCE.getScriptTemplate_Description();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TEMPLATE__TEMPLATE = eINSTANCE.getScriptTemplate_Template();

		/**
		 * The meta object literal for the '<em><b>Script Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TEMPLATE__SCRIPT_TYPE = eINSTANCE.getScriptTemplate_ScriptType();

		/**
		 * The meta object literal for the '{@link assessment.impl.ComplianceTypeImpl <em>Compliance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.impl.ComplianceTypeImpl
		 * @see assessment.impl.AssessmentPackageImpl#getComplianceType()
		 * @generated
		 */
		EClass COMPLIANCE_TYPE = eINSTANCE.getComplianceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_TYPE__NAME = eINSTANCE.getComplianceType_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_TYPE__DESCRIPTION = eINSTANCE.getComplianceType_Description();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_TYPE__MIN_VALUE = eINSTANCE.getComplianceType_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_TYPE__MAX_VALUE = eINSTANCE.getComplianceType_MaxValue();

		/**
		 * The meta object literal for the '{@link assessment.ScriptType <em>Script Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assessment.ScriptType
		 * @see assessment.impl.AssessmentPackageImpl#getScriptType()
		 * @generated
		 */
		EEnum SCRIPT_TYPE = eINSTANCE.getScriptType();

	}

} //AssessmentPackage
