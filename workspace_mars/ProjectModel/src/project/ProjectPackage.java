/**
 */
package project;

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
 * @see project.ProjectFactory
 * @model kind="package"
 * @generated
 */
public interface ProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "project";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/ProjectModel/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prj";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjectPackage eINSTANCE = project.impl.ProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link project.impl.ProjectFeedbackImpl <em>Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project.impl.ProjectFeedbackImpl
	 * @see project.impl.ProjectPackageImpl#getProjectFeedback()
	 * @generated
	 */
	int PROJECT_FEEDBACK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEEDBACK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEEDBACK__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Observations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEEDBACK__OBSERVATIONS = 2;

	/**
	 * The feature id for the '<em><b>Project Feedback Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEEDBACK__PROJECT_FEEDBACK_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEEDBACK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEEDBACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project.impl.ProjectImpl
	 * @see project.impl.ProjectPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Expected Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__EXPECTED_START_DATE = 2;

	/**
	 * The feature id for the '<em><b>Expected End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__EXPECTED_END_DATE = 3;

	/**
	 * The feature id for the '<em><b>Estimated Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ESTIMATED_COST = 4;

	/**
	 * The feature id for the '<em><b>Estimated Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ESTIMATED_EFFORT = 5;

	/**
	 * The feature id for the '<em><b>Has To Satisfy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__HAS_TO_SATISFY = 6;

	/**
	 * The feature id for the '<em><b>Evaluates Performance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__EVALUATES_PERFORMANCE = 7;

	/**
	 * The feature id for the '<em><b>Executes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__EXECUTES = 8;

	/**
	 * The feature id for the '<em><b>Real Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REAL_START_DATE = 9;

	/**
	 * The feature id for the '<em><b>Real End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REAL_END_DATE = 10;

	/**
	 * The feature id for the '<em><b>Real Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REAL_COST = 11;

	/**
	 * The feature id for the '<em><b>Real Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REAL_EFFORT = 12;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project.impl.ProcessElementExecutionImpl <em>Process Element Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project.impl.ProcessElementExecutionImpl
	 * @see project.impl.ProjectPackageImpl#getProcessElementExecution()
	 * @generated
	 */
	int PROCESS_ELEMENT_EXECUTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT_EXECUTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT_EXECUTION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Observations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT_EXECUTION__OBSERVATIONS = 2;

	/**
	 * The feature id for the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT_EXECUTION__EXECUTED = 3;

	/**
	 * The feature id for the '<em><b>Process Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT_EXECUTION__PROCESS_ELEMENT_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Process Element Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT_EXECUTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Process Element Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENT_EXECUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project.impl.GoalImpl
	 * @see project.impl.ProjectPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Accomplished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ACCOMPLISHED = 2;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link project.ProcessElementType <em>Process Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project.ProcessElementType
	 * @see project.impl.ProjectPackageImpl#getProcessElementType()
	 * @generated
	 */
	int PROCESS_ELEMENT_TYPE = 4;

	/**
	 * The meta object id for the '{@link project.ProjectFeedbackType <em>Feedback Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project.ProjectFeedbackType
	 * @see project.impl.ProjectPackageImpl#getProjectFeedbackType()
	 * @generated
	 */
	int PROJECT_FEEDBACK_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link project.ProjectFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback</em>'.
	 * @see project.ProjectFeedback
	 * @generated
	 */
	EClass getProjectFeedback();

	/**
	 * Returns the meta object for the attribute '{@link project.ProjectFeedback#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see project.ProjectFeedback#getName()
	 * @see #getProjectFeedback()
	 * @generated
	 */
	EAttribute getProjectFeedback_Name();

	/**
	 * Returns the meta object for the attribute '{@link project.ProjectFeedback#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see project.ProjectFeedback#getDescription()
	 * @see #getProjectFeedback()
	 * @generated
	 */
	EAttribute getProjectFeedback_Description();

	/**
	 * Returns the meta object for the attribute '{@link project.ProjectFeedback#getObservations <em>Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observations</em>'.
	 * @see project.ProjectFeedback#getObservations()
	 * @see #getProjectFeedback()
	 * @generated
	 */
	EAttribute getProjectFeedback_Observations();

	/**
	 * Returns the meta object for the attribute '{@link project.ProjectFeedback#getProjectFeedbackType <em>Project Feedback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Feedback Type</em>'.
	 * @see project.ProjectFeedback#getProjectFeedbackType()
	 * @see #getProjectFeedback()
	 * @generated
	 */
	EAttribute getProjectFeedback_ProjectFeedbackType();

	/**
	 * Returns the meta object for class '{@link project.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see project.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link project.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see project.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link project.Project#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see project.Project#getDescription()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Description();

	/**
	 * Returns the meta object for the attribute '{@link project.Project#getExpectedStartDate <em>Expected Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Start Date</em>'.
	 * @see project.Project#getExpectedStartDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ExpectedStartDate();

	/**
	 * Returns the meta object for the attribute '{@link project.Project#getExpectedEndDate <em>Expected End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected End Date</em>'.
	 * @see project.Project#getExpectedEndDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ExpectedEndDate();

	/**
	 * Returns the meta object for the attribute '{@link project.Project#getEstimatedCost <em>Estimated Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Cost</em>'.
	 * @see project.Project#getEstimatedCost()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_EstimatedCost();

	/**
	 * Returns the meta object for the attribute '{@link project.Project#getEstimatedEffort <em>Estimated Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Effort</em>'.
	 * @see project.Project#getEstimatedEffort()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_EstimatedEffort();

	/**
	 * Returns the meta object for the containment reference list '{@link project.Project#getHasToSatisfy <em>Has To Satisfy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has To Satisfy</em>'.
	 * @see project.Project#getHasToSatisfy()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_HasToSatisfy();

	/**
	 * Returns the meta object for the containment reference list '{@link project.Project#getEvaluatesPerformance <em>Evaluates Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluates Performance</em>'.
	 * @see project.Project#getEvaluatesPerformance()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_EvaluatesPerformance();

	/**
	 * Returns the meta object for the containment reference list '{@link project.Project#getExecutes <em>Executes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executes</em>'.
	 * @see project.Project#getExecutes()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Executes();

	/**
	 * Returns the meta object for the attribute '{@link project.Project#getRealStartDate <em>Real Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Start Date</em>'.
	 * @see project.Project#getRealStartDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_RealStartDate();

	/**
	 * Returns the meta object for the attribute '{@link project.Project#getRealEndDate <em>Real End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real End Date</em>'.
	 * @see project.Project#getRealEndDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_RealEndDate();

	/**
	 * Returns the meta object for the attribute '{@link project.Project#getRealCost <em>Real Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Cost</em>'.
	 * @see project.Project#getRealCost()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_RealCost();

	/**
	 * Returns the meta object for the attribute '{@link project.Project#getRealEffort <em>Real Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Effort</em>'.
	 * @see project.Project#getRealEffort()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_RealEffort();

	/**
	 * Returns the meta object for class '{@link project.ProcessElementExecution <em>Process Element Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Element Execution</em>'.
	 * @see project.ProcessElementExecution
	 * @generated
	 */
	EClass getProcessElementExecution();

	/**
	 * Returns the meta object for the attribute '{@link project.ProcessElementExecution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see project.ProcessElementExecution#getName()
	 * @see #getProcessElementExecution()
	 * @generated
	 */
	EAttribute getProcessElementExecution_Name();

	/**
	 * Returns the meta object for the attribute '{@link project.ProcessElementExecution#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see project.ProcessElementExecution#getDescription()
	 * @see #getProcessElementExecution()
	 * @generated
	 */
	EAttribute getProcessElementExecution_Description();

	/**
	 * Returns the meta object for the attribute '{@link project.ProcessElementExecution#getObservations <em>Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observations</em>'.
	 * @see project.ProcessElementExecution#getObservations()
	 * @see #getProcessElementExecution()
	 * @generated
	 */
	EAttribute getProcessElementExecution_Observations();

	/**
	 * Returns the meta object for the attribute '{@link project.ProcessElementExecution#isExecuted <em>Executed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executed</em>'.
	 * @see project.ProcessElementExecution#isExecuted()
	 * @see #getProcessElementExecution()
	 * @generated
	 */
	EAttribute getProcessElementExecution_Executed();

	/**
	 * Returns the meta object for the attribute '{@link project.ProcessElementExecution#getProcessElementType <em>Process Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Element Type</em>'.
	 * @see project.ProcessElementExecution#getProcessElementType()
	 * @see #getProcessElementExecution()
	 * @generated
	 */
	EAttribute getProcessElementExecution_ProcessElementType();

	/**
	 * Returns the meta object for class '{@link project.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see project.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link project.Goal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see project.Goal#getName()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Name();

	/**
	 * Returns the meta object for the attribute '{@link project.Goal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see project.Goal#getDescription()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Description();

	/**
	 * Returns the meta object for the attribute '{@link project.Goal#isAccomplished <em>Accomplished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accomplished</em>'.
	 * @see project.Goal#isAccomplished()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Accomplished();

	/**
	 * Returns the meta object for enum '{@link project.ProcessElementType <em>Process Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Element Type</em>'.
	 * @see project.ProcessElementType
	 * @generated
	 */
	EEnum getProcessElementType();

	/**
	 * Returns the meta object for enum '{@link project.ProjectFeedbackType <em>Feedback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feedback Type</em>'.
	 * @see project.ProjectFeedbackType
	 * @generated
	 */
	EEnum getProjectFeedbackType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjectFactory getProjectFactory();

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
		 * The meta object literal for the '{@link project.impl.ProjectFeedbackImpl <em>Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project.impl.ProjectFeedbackImpl
		 * @see project.impl.ProjectPackageImpl#getProjectFeedback()
		 * @generated
		 */
		EClass PROJECT_FEEDBACK = eINSTANCE.getProjectFeedback();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_FEEDBACK__NAME = eINSTANCE.getProjectFeedback_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_FEEDBACK__DESCRIPTION = eINSTANCE.getProjectFeedback_Description();

		/**
		 * The meta object literal for the '<em><b>Observations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_FEEDBACK__OBSERVATIONS = eINSTANCE.getProjectFeedback_Observations();

		/**
		 * The meta object literal for the '<em><b>Project Feedback Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_FEEDBACK__PROJECT_FEEDBACK_TYPE = eINSTANCE.getProjectFeedback_ProjectFeedbackType();

		/**
		 * The meta object literal for the '{@link project.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project.impl.ProjectImpl
		 * @see project.impl.ProjectPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

		/**
		 * The meta object literal for the '<em><b>Expected Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__EXPECTED_START_DATE = eINSTANCE.getProject_ExpectedStartDate();

		/**
		 * The meta object literal for the '<em><b>Expected End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__EXPECTED_END_DATE = eINSTANCE.getProject_ExpectedEndDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ESTIMATED_COST = eINSTANCE.getProject_EstimatedCost();

		/**
		 * The meta object literal for the '<em><b>Estimated Effort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ESTIMATED_EFFORT = eINSTANCE.getProject_EstimatedEffort();

		/**
		 * The meta object literal for the '<em><b>Has To Satisfy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__HAS_TO_SATISFY = eINSTANCE.getProject_HasToSatisfy();

		/**
		 * The meta object literal for the '<em><b>Evaluates Performance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__EVALUATES_PERFORMANCE = eINSTANCE.getProject_EvaluatesPerformance();

		/**
		 * The meta object literal for the '<em><b>Executes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__EXECUTES = eINSTANCE.getProject_Executes();

		/**
		 * The meta object literal for the '<em><b>Real Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__REAL_START_DATE = eINSTANCE.getProject_RealStartDate();

		/**
		 * The meta object literal for the '<em><b>Real End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__REAL_END_DATE = eINSTANCE.getProject_RealEndDate();

		/**
		 * The meta object literal for the '<em><b>Real Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__REAL_COST = eINSTANCE.getProject_RealCost();

		/**
		 * The meta object literal for the '<em><b>Real Effort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__REAL_EFFORT = eINSTANCE.getProject_RealEffort();

		/**
		 * The meta object literal for the '{@link project.impl.ProcessElementExecutionImpl <em>Process Element Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project.impl.ProcessElementExecutionImpl
		 * @see project.impl.ProjectPackageImpl#getProcessElementExecution()
		 * @generated
		 */
		EClass PROCESS_ELEMENT_EXECUTION = eINSTANCE.getProcessElementExecution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_ELEMENT_EXECUTION__NAME = eINSTANCE.getProcessElementExecution_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_ELEMENT_EXECUTION__DESCRIPTION = eINSTANCE.getProcessElementExecution_Description();

		/**
		 * The meta object literal for the '<em><b>Observations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_ELEMENT_EXECUTION__OBSERVATIONS = eINSTANCE.getProcessElementExecution_Observations();

		/**
		 * The meta object literal for the '<em><b>Executed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_ELEMENT_EXECUTION__EXECUTED = eINSTANCE.getProcessElementExecution_Executed();

		/**
		 * The meta object literal for the '<em><b>Process Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_ELEMENT_EXECUTION__PROCESS_ELEMENT_TYPE = eINSTANCE.getProcessElementExecution_ProcessElementType();

		/**
		 * The meta object literal for the '{@link project.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project.impl.GoalImpl
		 * @see project.impl.ProjectPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__DESCRIPTION = eINSTANCE.getGoal_Description();

		/**
		 * The meta object literal for the '<em><b>Accomplished</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__ACCOMPLISHED = eINSTANCE.getGoal_Accomplished();

		/**
		 * The meta object literal for the '{@link project.ProcessElementType <em>Process Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project.ProcessElementType
		 * @see project.impl.ProjectPackageImpl#getProcessElementType()
		 * @generated
		 */
		EEnum PROCESS_ELEMENT_TYPE = eINSTANCE.getProcessElementType();

		/**
		 * The meta object literal for the '{@link project.ProjectFeedbackType <em>Feedback Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project.ProjectFeedbackType
		 * @see project.impl.ProjectPackageImpl#getProjectFeedbackType()
		 * @generated
		 */
		EEnum PROJECT_FEEDBACK_TYPE = eINSTANCE.getProjectFeedbackType();

	}

} //ProjectPackage
