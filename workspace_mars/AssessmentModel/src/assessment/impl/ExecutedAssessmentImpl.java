/**
 */
package assessment.impl;

import assessment.AssessmentPackage;
import assessment.ExecutedAssessment;
import assessment.ObjectiveAssessment;
import assessment.SubjectiveAssessment;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executed Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assessment.impl.ExecutedAssessmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link assessment.impl.ExecutedAssessmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link assessment.impl.ExecutedAssessmentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link assessment.impl.ExecutedAssessmentImpl#getMaturityModel <em>Maturity Model</em>}</li>
 *   <li>{@link assessment.impl.ExecutedAssessmentImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link assessment.impl.ExecutedAssessmentImpl#getPerformSubjectiveEvaluation <em>Perform Subjective Evaluation</em>}</li>
 *   <li>{@link assessment.impl.ExecutedAssessmentImpl#getPerformObjectiveEvaluation <em>Perform Objective Evaluation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutedAssessmentImpl extends MinimalEObjectImpl.Container implements ExecutedAssessment {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaturityModel() <em>Maturity Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaturityModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MATURITY_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaturityModel() <em>Maturity Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaturityModel()
	 * @generated
	 * @ordered
	 */
	protected String maturityModel = MATURITY_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcess() <em>Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected String process = PROCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerformSubjectiveEvaluation() <em>Perform Subjective Evaluation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformSubjectiveEvaluation()
	 * @generated
	 * @ordered
	 */
	protected EList<SubjectiveAssessment> performSubjectiveEvaluation;

	/**
	 * The cached value of the '{@link #getPerformObjectiveEvaluation() <em>Perform Objective Evaluation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformObjectiveEvaluation()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectiveAssessment> performObjectiveEvaluation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutedAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.EXECUTED_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.EXECUTED_ASSESSMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.EXECUTED_ASSESSMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.EXECUTED_ASSESSMENT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaturityModel() {
		return maturityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaturityModel(String newMaturityModel) {
		String oldMaturityModel = maturityModel;
		maturityModel = newMaturityModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.EXECUTED_ASSESSMENT__MATURITY_MODEL, oldMaturityModel, maturityModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(String newProcess) {
		String oldProcess = process;
		process = newProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.EXECUTED_ASSESSMENT__PROCESS, oldProcess, process));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubjectiveAssessment> getPerformSubjectiveEvaluation() {
		if (performSubjectiveEvaluation == null) {
			performSubjectiveEvaluation = new EObjectContainmentEList<SubjectiveAssessment>(SubjectiveAssessment.class, this, AssessmentPackage.EXECUTED_ASSESSMENT__PERFORM_SUBJECTIVE_EVALUATION);
		}
		return performSubjectiveEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectiveAssessment> getPerformObjectiveEvaluation() {
		if (performObjectiveEvaluation == null) {
			performObjectiveEvaluation = new EObjectContainmentEList<ObjectiveAssessment>(ObjectiveAssessment.class, this, AssessmentPackage.EXECUTED_ASSESSMENT__PERFORM_OBJECTIVE_EVALUATION);
		}
		return performObjectiveEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.EXECUTED_ASSESSMENT__PERFORM_SUBJECTIVE_EVALUATION:
				return ((InternalEList<?>)getPerformSubjectiveEvaluation()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.EXECUTED_ASSESSMENT__PERFORM_OBJECTIVE_EVALUATION:
				return ((InternalEList<?>)getPerformObjectiveEvaluation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssessmentPackage.EXECUTED_ASSESSMENT__NAME:
				return getName();
			case AssessmentPackage.EXECUTED_ASSESSMENT__DESCRIPTION:
				return getDescription();
			case AssessmentPackage.EXECUTED_ASSESSMENT__DATE:
				return getDate();
			case AssessmentPackage.EXECUTED_ASSESSMENT__MATURITY_MODEL:
				return getMaturityModel();
			case AssessmentPackage.EXECUTED_ASSESSMENT__PROCESS:
				return getProcess();
			case AssessmentPackage.EXECUTED_ASSESSMENT__PERFORM_SUBJECTIVE_EVALUATION:
				return getPerformSubjectiveEvaluation();
			case AssessmentPackage.EXECUTED_ASSESSMENT__PERFORM_OBJECTIVE_EVALUATION:
				return getPerformObjectiveEvaluation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssessmentPackage.EXECUTED_ASSESSMENT__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.EXECUTED_ASSESSMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AssessmentPackage.EXECUTED_ASSESSMENT__DATE:
				setDate((Date)newValue);
				return;
			case AssessmentPackage.EXECUTED_ASSESSMENT__MATURITY_MODEL:
				setMaturityModel((String)newValue);
				return;
			case AssessmentPackage.EXECUTED_ASSESSMENT__PROCESS:
				setProcess((String)newValue);
				return;
			case AssessmentPackage.EXECUTED_ASSESSMENT__PERFORM_SUBJECTIVE_EVALUATION:
				getPerformSubjectiveEvaluation().clear();
				getPerformSubjectiveEvaluation().addAll((Collection<? extends SubjectiveAssessment>)newValue);
				return;
			case AssessmentPackage.EXECUTED_ASSESSMENT__PERFORM_OBJECTIVE_EVALUATION:
				getPerformObjectiveEvaluation().clear();
				getPerformObjectiveEvaluation().addAll((Collection<? extends ObjectiveAssessment>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AssessmentPackage.EXECUTED_ASSESSMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.EXECUTED_ASSESSMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AssessmentPackage.EXECUTED_ASSESSMENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case AssessmentPackage.EXECUTED_ASSESSMENT__MATURITY_MODEL:
				setMaturityModel(MATURITY_MODEL_EDEFAULT);
				return;
			case AssessmentPackage.EXECUTED_ASSESSMENT__PROCESS:
				setProcess(PROCESS_EDEFAULT);
				return;
			case AssessmentPackage.EXECUTED_ASSESSMENT__PERFORM_SUBJECTIVE_EVALUATION:
				getPerformSubjectiveEvaluation().clear();
				return;
			case AssessmentPackage.EXECUTED_ASSESSMENT__PERFORM_OBJECTIVE_EVALUATION:
				getPerformObjectiveEvaluation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AssessmentPackage.EXECUTED_ASSESSMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.EXECUTED_ASSESSMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AssessmentPackage.EXECUTED_ASSESSMENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case AssessmentPackage.EXECUTED_ASSESSMENT__MATURITY_MODEL:
				return MATURITY_MODEL_EDEFAULT == null ? maturityModel != null : !MATURITY_MODEL_EDEFAULT.equals(maturityModel);
			case AssessmentPackage.EXECUTED_ASSESSMENT__PROCESS:
				return PROCESS_EDEFAULT == null ? process != null : !PROCESS_EDEFAULT.equals(process);
			case AssessmentPackage.EXECUTED_ASSESSMENT__PERFORM_SUBJECTIVE_EVALUATION:
				return performSubjectiveEvaluation != null && !performSubjectiveEvaluation.isEmpty();
			case AssessmentPackage.EXECUTED_ASSESSMENT__PERFORM_OBJECTIVE_EVALUATION:
				return performObjectiveEvaluation != null && !performObjectiveEvaluation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", date: ");
		result.append(date);
		result.append(", maturityModel: ");
		result.append(maturityModel);
		result.append(", process: ");
		result.append(process);
		result.append(')');
		return result.toString();
	}

} //ExecutedAssessmentImpl
