/**
 */
package assessment.util;

import assessment.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see assessment.AssessmentPackage
 * @generated
 */
public class AssessmentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssessmentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AssessmentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentSwitch<Adapter> modelSwitch =
		new AssessmentSwitch<Adapter>() {
			@Override
			public Adapter caseExecutedAssessment(ExecutedAssessment object) {
				return createExecutedAssessmentAdapter();
			}
			@Override
			public Adapter caseSubjectiveAssessment(SubjectiveAssessment object) {
				return createSubjectiveAssessmentAdapter();
			}
			@Override
			public Adapter caseObjectiveAssessment(ObjectiveAssessment object) {
				return createObjectiveAssessmentAdapter();
			}
			@Override
			public Adapter caseQuestionnaire(Questionnaire object) {
				return createQuestionnaireAdapter();
			}
			@Override
			public Adapter caseComplianceItem(ComplianceItem object) {
				return createComplianceItemAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseAnswerOption(AnswerOption object) {
				return createAnswerOptionAdapter();
			}
			@Override
			public Adapter caseScriptTemplate(ScriptTemplate object) {
				return createScriptTemplateAdapter();
			}
			@Override
			public Adapter caseComplianceType(ComplianceType object) {
				return createComplianceTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link assessment.ExecutedAssessment <em>Executed Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assessment.ExecutedAssessment
	 * @generated
	 */
	public Adapter createExecutedAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assessment.SubjectiveAssessment <em>Subjective Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assessment.SubjectiveAssessment
	 * @generated
	 */
	public Adapter createSubjectiveAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assessment.ObjectiveAssessment <em>Objective Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assessment.ObjectiveAssessment
	 * @generated
	 */
	public Adapter createObjectiveAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assessment.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assessment.Questionnaire
	 * @generated
	 */
	public Adapter createQuestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assessment.ComplianceItem <em>Compliance Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assessment.ComplianceItem
	 * @generated
	 */
	public Adapter createComplianceItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assessment.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assessment.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assessment.AnswerOption <em>Answer Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assessment.AnswerOption
	 * @generated
	 */
	public Adapter createAnswerOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assessment.ScriptTemplate <em>Script Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assessment.ScriptTemplate
	 * @generated
	 */
	public Adapter createScriptTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assessment.ComplianceType <em>Compliance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assessment.ComplianceType
	 * @generated
	 */
	public Adapter createComplianceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AssessmentAdapterFactory
