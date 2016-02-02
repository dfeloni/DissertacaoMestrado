/**
 */
package assessment.impl;

import assessment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssessmentFactoryImpl extends EFactoryImpl implements AssessmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssessmentFactory init() {
		try {
			AssessmentFactory theAssessmentFactory = (AssessmentFactory)EPackage.Registry.INSTANCE.getEFactory(AssessmentPackage.eNS_URI);
			if (theAssessmentFactory != null) {
				return theAssessmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssessmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AssessmentPackage.EXECUTED_ASSESSMENT: return createExecutedAssessment();
			case AssessmentPackage.SUBJECTIVE_ASSESSMENT: return createSubjectiveAssessment();
			case AssessmentPackage.OBJECTIVE_ASSESSMENT: return createObjectiveAssessment();
			case AssessmentPackage.QUESTIONNAIRE: return createQuestionnaire();
			case AssessmentPackage.COMPLIANCE_ITEM: return createComplianceItem();
			case AssessmentPackage.QUESTION: return createQuestion();
			case AssessmentPackage.ANSWER_OPTION: return createAnswerOption();
			case AssessmentPackage.SCRIPT_TEMPLATE: return createScriptTemplate();
			case AssessmentPackage.COMPLIANCE_TYPE: return createComplianceType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AssessmentPackage.SCRIPT_TYPE:
				return createScriptTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AssessmentPackage.SCRIPT_TYPE:
				return convertScriptTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutedAssessment createExecutedAssessment() {
		ExecutedAssessmentImpl executedAssessment = new ExecutedAssessmentImpl();
		return executedAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectiveAssessment createSubjectiveAssessment() {
		SubjectiveAssessmentImpl subjectiveAssessment = new SubjectiveAssessmentImpl();
		return subjectiveAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveAssessment createObjectiveAssessment() {
		ObjectiveAssessmentImpl objectiveAssessment = new ObjectiveAssessmentImpl();
		return objectiveAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplianceItem createComplianceItem() {
		ComplianceItemImpl complianceItem = new ComplianceItemImpl();
		return complianceItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerOption createAnswerOption() {
		AnswerOptionImpl answerOption = new AnswerOptionImpl();
		return answerOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptTemplate createScriptTemplate() {
		ScriptTemplateImpl scriptTemplate = new ScriptTemplateImpl();
		return scriptTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplianceType createComplianceType() {
		ComplianceTypeImpl complianceType = new ComplianceTypeImpl();
		return complianceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptType createScriptTypeFromString(EDataType eDataType, String initialValue) {
		ScriptType result = ScriptType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScriptTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentPackage getAssessmentPackage() {
		return (AssessmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssessmentPackage getPackage() {
		return AssessmentPackage.eINSTANCE;
	}

} //AssessmentFactoryImpl
