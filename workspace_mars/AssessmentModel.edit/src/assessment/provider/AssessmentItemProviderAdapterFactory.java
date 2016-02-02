/**
 */
package assessment.provider;

import assessment.util.AssessmentAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssessmentItemProviderAdapterFactory extends AssessmentAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link assessment.ExecutedAssessment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutedAssessmentItemProvider executedAssessmentItemProvider;

	/**
	 * This creates an adapter for a {@link assessment.ExecutedAssessment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutedAssessmentAdapter() {
		if (executedAssessmentItemProvider == null) {
			executedAssessmentItemProvider = new ExecutedAssessmentItemProvider(this);
		}

		return executedAssessmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link assessment.SubjectiveAssessment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectiveAssessmentItemProvider subjectiveAssessmentItemProvider;

	/**
	 * This creates an adapter for a {@link assessment.SubjectiveAssessment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubjectiveAssessmentAdapter() {
		if (subjectiveAssessmentItemProvider == null) {
			subjectiveAssessmentItemProvider = new SubjectiveAssessmentItemProvider(this);
		}

		return subjectiveAssessmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link assessment.ObjectiveAssessment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveAssessmentItemProvider objectiveAssessmentItemProvider;

	/**
	 * This creates an adapter for a {@link assessment.ObjectiveAssessment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectiveAssessmentAdapter() {
		if (objectiveAssessmentItemProvider == null) {
			objectiveAssessmentItemProvider = new ObjectiveAssessmentItemProvider(this);
		}

		return objectiveAssessmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link assessment.Questionnaire} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireItemProvider questionnaireItemProvider;

	/**
	 * This creates an adapter for a {@link assessment.Questionnaire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuestionnaireAdapter() {
		if (questionnaireItemProvider == null) {
			questionnaireItemProvider = new QuestionnaireItemProvider(this);
		}

		return questionnaireItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link assessment.ComplianceItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplianceItemItemProvider complianceItemItemProvider;

	/**
	 * This creates an adapter for a {@link assessment.ComplianceItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComplianceItemAdapter() {
		if (complianceItemItemProvider == null) {
			complianceItemItemProvider = new ComplianceItemItemProvider(this);
		}

		return complianceItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link assessment.Question} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionItemProvider questionItemProvider;

	/**
	 * This creates an adapter for a {@link assessment.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuestionAdapter() {
		if (questionItemProvider == null) {
			questionItemProvider = new QuestionItemProvider(this);
		}

		return questionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link assessment.AnswerOption} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnswerOptionItemProvider answerOptionItemProvider;

	/**
	 * This creates an adapter for a {@link assessment.AnswerOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnswerOptionAdapter() {
		if (answerOptionItemProvider == null) {
			answerOptionItemProvider = new AnswerOptionItemProvider(this);
		}

		return answerOptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link assessment.ScriptTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptTemplateItemProvider scriptTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link assessment.ScriptTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScriptTemplateAdapter() {
		if (scriptTemplateItemProvider == null) {
			scriptTemplateItemProvider = new ScriptTemplateItemProvider(this);
		}

		return scriptTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link assessment.ComplianceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplianceTypeItemProvider complianceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link assessment.ComplianceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComplianceTypeAdapter() {
		if (complianceTypeItemProvider == null) {
			complianceTypeItemProvider = new ComplianceTypeItemProvider(this);
		}

		return complianceTypeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (executedAssessmentItemProvider != null) executedAssessmentItemProvider.dispose();
		if (subjectiveAssessmentItemProvider != null) subjectiveAssessmentItemProvider.dispose();
		if (objectiveAssessmentItemProvider != null) objectiveAssessmentItemProvider.dispose();
		if (questionnaireItemProvider != null) questionnaireItemProvider.dispose();
		if (complianceItemItemProvider != null) complianceItemItemProvider.dispose();
		if (questionItemProvider != null) questionItemProvider.dispose();
		if (answerOptionItemProvider != null) answerOptionItemProvider.dispose();
		if (scriptTemplateItemProvider != null) scriptTemplateItemProvider.dispose();
		if (complianceTypeItemProvider != null) complianceTypeItemProvider.dispose();
	}

}