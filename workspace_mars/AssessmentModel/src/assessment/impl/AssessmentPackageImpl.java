/**
 */
package assessment.impl;

import assessment.AnswerOption;
import assessment.AssessmentFactory;
import assessment.AssessmentPackage;
import assessment.ComplianceItem;
import assessment.ComplianceType;
import assessment.ExecutedAssessment;
import assessment.ObjectiveAssessment;
import assessment.Question;
import assessment.Questionnaire;
import assessment.ScriptTemplate;
import assessment.ScriptType;
import assessment.SubjectiveAssessment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssessmentPackageImpl extends EPackageImpl implements AssessmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executedAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectiveAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complianceItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complianceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scriptTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see assessment.AssessmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssessmentPackageImpl() {
		super(eNS_URI, AssessmentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AssessmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssessmentPackage init() {
		if (isInited) return (AssessmentPackage)EPackage.Registry.INSTANCE.getEPackage(AssessmentPackage.eNS_URI);

		// Obtain or create and register package
		AssessmentPackageImpl theAssessmentPackage = (AssessmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AssessmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AssessmentPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAssessmentPackage.createPackageContents();

		// Initialize created meta-data
		theAssessmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssessmentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssessmentPackage.eNS_URI, theAssessmentPackage);
		return theAssessmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutedAssessment() {
		return executedAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedAssessment_Name() {
		return (EAttribute)executedAssessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedAssessment_Description() {
		return (EAttribute)executedAssessmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedAssessment_Date() {
		return (EAttribute)executedAssessmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedAssessment_MaturityModel() {
		return (EAttribute)executedAssessmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutedAssessment_Process() {
		return (EAttribute)executedAssessmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutedAssessment_PerformSubjectiveEvaluation() {
		return (EReference)executedAssessmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutedAssessment_PerformObjectiveEvaluation() {
		return (EReference)executedAssessmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectiveAssessment() {
		return subjectiveAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectiveAssessment_Name() {
		return (EAttribute)subjectiveAssessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectiveAssessment_Description() {
		return (EAttribute)subjectiveAssessmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubjectiveAssessment_Organizes() {
		return (EReference)subjectiveAssessmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectiveAssessment() {
		return objectiveAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectiveAssessment_Name() {
		return (EAttribute)objectiveAssessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectiveAssessment_Description() {
		return (EAttribute)objectiveAssessmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectiveAssessment_DefinesEvaluationRules() {
		return (EReference)objectiveAssessmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaire() {
		return questionnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionnaire_Name() {
		return (EAttribute)questionnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionnaire_Description() {
		return (EAttribute)questionnaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionnaire_ProcessArea() {
		return (EAttribute)questionnaireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionnaire_MaturityLevel() {
		return (EAttribute)questionnaireEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Evaluates() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplianceItem() {
		return complianceItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplianceItem_Description() {
		return (EAttribute)complianceItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplianceItem_GenericPractice() {
		return (EAttribute)complianceItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplianceItem_GenericSubPractice() {
		return (EAttribute)complianceItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplianceItem_SpecificPractice() {
		return (EAttribute)complianceItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplianceItem_DeterminedBy() {
		return (EReference)complianceItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplianceItem_DefinesComplianceLevel() {
		return (EReference)complianceItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplianceItem_Result() {
		return (EReference)complianceItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Question() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Weight() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_EvaluatesBy() {
		return (EReference)questionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_UserAnswer() {
		return (EReference)questionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnswerOption() {
		return answerOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswerOption_Option() {
		return (EAttribute)answerOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswerOption_Score() {
		return (EAttribute)answerOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptTemplate() {
		return scriptTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptTemplate_Name() {
		return (EAttribute)scriptTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptTemplate_Description() {
		return (EAttribute)scriptTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptTemplate_Template() {
		return (EAttribute)scriptTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptTemplate_ScriptType() {
		return (EAttribute)scriptTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplianceType() {
		return complianceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplianceType_Name() {
		return (EAttribute)complianceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplianceType_Description() {
		return (EAttribute)complianceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplianceType_MinValue() {
		return (EAttribute)complianceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplianceType_MaxValue() {
		return (EAttribute)complianceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScriptType() {
		return scriptTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentFactory getAssessmentFactory() {
		return (AssessmentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		executedAssessmentEClass = createEClass(EXECUTED_ASSESSMENT);
		createEAttribute(executedAssessmentEClass, EXECUTED_ASSESSMENT__NAME);
		createEAttribute(executedAssessmentEClass, EXECUTED_ASSESSMENT__DESCRIPTION);
		createEAttribute(executedAssessmentEClass, EXECUTED_ASSESSMENT__DATE);
		createEAttribute(executedAssessmentEClass, EXECUTED_ASSESSMENT__MATURITY_MODEL);
		createEAttribute(executedAssessmentEClass, EXECUTED_ASSESSMENT__PROCESS);
		createEReference(executedAssessmentEClass, EXECUTED_ASSESSMENT__PERFORM_SUBJECTIVE_EVALUATION);
		createEReference(executedAssessmentEClass, EXECUTED_ASSESSMENT__PERFORM_OBJECTIVE_EVALUATION);

		subjectiveAssessmentEClass = createEClass(SUBJECTIVE_ASSESSMENT);
		createEAttribute(subjectiveAssessmentEClass, SUBJECTIVE_ASSESSMENT__NAME);
		createEAttribute(subjectiveAssessmentEClass, SUBJECTIVE_ASSESSMENT__DESCRIPTION);
		createEReference(subjectiveAssessmentEClass, SUBJECTIVE_ASSESSMENT__ORGANIZES);

		objectiveAssessmentEClass = createEClass(OBJECTIVE_ASSESSMENT);
		createEAttribute(objectiveAssessmentEClass, OBJECTIVE_ASSESSMENT__NAME);
		createEAttribute(objectiveAssessmentEClass, OBJECTIVE_ASSESSMENT__DESCRIPTION);
		createEReference(objectiveAssessmentEClass, OBJECTIVE_ASSESSMENT__DEFINES_EVALUATION_RULES);

		questionnaireEClass = createEClass(QUESTIONNAIRE);
		createEAttribute(questionnaireEClass, QUESTIONNAIRE__NAME);
		createEAttribute(questionnaireEClass, QUESTIONNAIRE__DESCRIPTION);
		createEAttribute(questionnaireEClass, QUESTIONNAIRE__PROCESS_AREA);
		createEAttribute(questionnaireEClass, QUESTIONNAIRE__MATURITY_LEVEL);
		createEReference(questionnaireEClass, QUESTIONNAIRE__EVALUATES);

		complianceItemEClass = createEClass(COMPLIANCE_ITEM);
		createEAttribute(complianceItemEClass, COMPLIANCE_ITEM__DESCRIPTION);
		createEAttribute(complianceItemEClass, COMPLIANCE_ITEM__GENERIC_PRACTICE);
		createEAttribute(complianceItemEClass, COMPLIANCE_ITEM__GENERIC_SUB_PRACTICE);
		createEAttribute(complianceItemEClass, COMPLIANCE_ITEM__SPECIFIC_PRACTICE);
		createEReference(complianceItemEClass, COMPLIANCE_ITEM__DETERMINED_BY);
		createEReference(complianceItemEClass, COMPLIANCE_ITEM__DEFINES_COMPLIANCE_LEVEL);
		createEReference(complianceItemEClass, COMPLIANCE_ITEM__RESULT);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__QUESTION);
		createEAttribute(questionEClass, QUESTION__WEIGHT);
		createEReference(questionEClass, QUESTION__EVALUATES_BY);
		createEReference(questionEClass, QUESTION__USER_ANSWER);

		answerOptionEClass = createEClass(ANSWER_OPTION);
		createEAttribute(answerOptionEClass, ANSWER_OPTION__OPTION);
		createEAttribute(answerOptionEClass, ANSWER_OPTION__SCORE);

		scriptTemplateEClass = createEClass(SCRIPT_TEMPLATE);
		createEAttribute(scriptTemplateEClass, SCRIPT_TEMPLATE__NAME);
		createEAttribute(scriptTemplateEClass, SCRIPT_TEMPLATE__DESCRIPTION);
		createEAttribute(scriptTemplateEClass, SCRIPT_TEMPLATE__TEMPLATE);
		createEAttribute(scriptTemplateEClass, SCRIPT_TEMPLATE__SCRIPT_TYPE);

		complianceTypeEClass = createEClass(COMPLIANCE_TYPE);
		createEAttribute(complianceTypeEClass, COMPLIANCE_TYPE__NAME);
		createEAttribute(complianceTypeEClass, COMPLIANCE_TYPE__DESCRIPTION);
		createEAttribute(complianceTypeEClass, COMPLIANCE_TYPE__MIN_VALUE);
		createEAttribute(complianceTypeEClass, COMPLIANCE_TYPE__MAX_VALUE);

		// Create enums
		scriptTypeEEnum = createEEnum(SCRIPT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(executedAssessmentEClass, ExecutedAssessment.class, "ExecutedAssessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutedAssessment_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExecutedAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedAssessment_Description(), ecorePackage.getEString(), "description", null, 0, 1, ExecutedAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedAssessment_Date(), ecorePackage.getEDate(), "date", null, 0, 1, ExecutedAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedAssessment_MaturityModel(), ecorePackage.getEString(), "maturityModel", null, 0, 1, ExecutedAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutedAssessment_Process(), ecorePackage.getEString(), "process", null, 0, 1, ExecutedAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutedAssessment_PerformSubjectiveEvaluation(), this.getSubjectiveAssessment(), null, "performSubjectiveEvaluation", null, 0, -1, ExecutedAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutedAssessment_PerformObjectiveEvaluation(), this.getObjectiveAssessment(), null, "performObjectiveEvaluation", null, 0, -1, ExecutedAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subjectiveAssessmentEClass, SubjectiveAssessment.class, "SubjectiveAssessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubjectiveAssessment_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubjectiveAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubjectiveAssessment_Description(), ecorePackage.getEString(), "description", null, 0, 1, SubjectiveAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubjectiveAssessment_Organizes(), this.getQuestionnaire(), null, "organizes", null, 0, -1, SubjectiveAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveAssessmentEClass, ObjectiveAssessment.class, "ObjectiveAssessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectiveAssessment_Name(), ecorePackage.getEString(), "name", null, 0, 1, ObjectiveAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectiveAssessment_Description(), ecorePackage.getEString(), "description", null, 0, 1, ObjectiveAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectiveAssessment_DefinesEvaluationRules(), this.getScriptTemplate(), null, "definesEvaluationRules", null, 0, -1, ObjectiveAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionnaireEClass, Questionnaire.class, "Questionnaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionnaire_Name(), ecorePackage.getEString(), "name", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionnaire_Description(), ecorePackage.getEString(), "description", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionnaire_ProcessArea(), ecorePackage.getEString(), "processArea", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionnaire_MaturityLevel(), ecorePackage.getEString(), "maturityLevel", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_Evaluates(), this.getComplianceItem(), null, "evaluates", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complianceItemEClass, ComplianceItem.class, "ComplianceItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplianceItem_Description(), ecorePackage.getEString(), "description", null, 0, 1, ComplianceItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceItem_GenericPractice(), ecorePackage.getEString(), "genericPractice", null, 0, 1, ComplianceItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceItem_GenericSubPractice(), ecorePackage.getEString(), "genericSubPractice", null, 0, 1, ComplianceItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceItem_SpecificPractice(), ecorePackage.getEString(), "specificPractice", null, 0, 1, ComplianceItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceItem_DeterminedBy(), this.getQuestion(), null, "determinedBy", null, 0, -1, ComplianceItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceItem_DefinesComplianceLevel(), this.getComplianceType(), null, "definesComplianceLevel", null, 0, -1, ComplianceItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceItem_Result(), this.getComplianceType(), null, "result", null, 0, 1, ComplianceItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Question(), ecorePackage.getEString(), "question", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Weight(), ecorePackage.getEFloat(), "weight", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_EvaluatesBy(), this.getAnswerOption(), null, "evaluatesBy", null, 0, -1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_UserAnswer(), this.getAnswerOption(), null, "userAnswer", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(answerOptionEClass, AnswerOption.class, "AnswerOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnswerOption_Option(), ecorePackage.getEString(), "option", null, 0, 1, AnswerOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswerOption_Score(), ecorePackage.getEFloat(), "score", null, 0, 1, AnswerOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptTemplateEClass, ScriptTemplate.class, "ScriptTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScriptTemplate_Name(), ecorePackage.getEString(), "name", null, 0, 1, ScriptTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScriptTemplate_Description(), ecorePackage.getEString(), "description", null, 0, 1, ScriptTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScriptTemplate_Template(), ecorePackage.getEString(), "template", null, 0, 1, ScriptTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScriptTemplate_ScriptType(), this.getScriptType(), "scriptType", null, 0, 1, ScriptTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complianceTypeEClass, ComplianceType.class, "ComplianceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplianceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComplianceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ComplianceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceType_MinValue(), ecorePackage.getEFloat(), "minValue", null, 0, 1, ComplianceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceType_MaxValue(), ecorePackage.getEFloat(), "maxValue", null, 0, 1, ComplianceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(scriptTypeEEnum, ScriptType.class, "ScriptType");
		addEEnumLiteral(scriptTypeEEnum, ScriptType.MODEL_TO_MODEL);
		addEEnumLiteral(scriptTypeEEnum, ScriptType.MODEL_TO_TEXT);

		// Create resource
		createResource(eNS_URI);
	}

} //AssessmentPackageImpl
