/**
 */
package project.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import project.ProjectFeedback;
import project.ProjectFeedbackType;
import project.ProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project.impl.ProjectFeedbackImpl#getName <em>Name</em>}</li>
 *   <li>{@link project.impl.ProjectFeedbackImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link project.impl.ProjectFeedbackImpl#getObservations <em>Observations</em>}</li>
 *   <li>{@link project.impl.ProjectFeedbackImpl#getProjectFeedbackType <em>Project Feedback Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectFeedbackImpl extends MinimalEObjectImpl.Container implements ProjectFeedback {
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
	 * The default value of the '{@link #getObservations() <em>Observations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservations()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservations() <em>Observations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservations()
	 * @generated
	 * @ordered
	 */
	protected String observations = OBSERVATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectFeedbackType() <em>Project Feedback Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectFeedbackType()
	 * @generated
	 * @ordered
	 */
	protected static final ProjectFeedbackType PROJECT_FEEDBACK_TYPE_EDEFAULT = ProjectFeedbackType.NEGATIVE;

	/**
	 * The cached value of the '{@link #getProjectFeedbackType() <em>Project Feedback Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectFeedbackType()
	 * @generated
	 * @ordered
	 */
	protected ProjectFeedbackType projectFeedbackType = PROJECT_FEEDBACK_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectFeedbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectPackage.Literals.PROJECT_FEEDBACK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT_FEEDBACK__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT_FEEDBACK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObservations() {
		return observations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservations(String newObservations) {
		String oldObservations = observations;
		observations = newObservations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT_FEEDBACK__OBSERVATIONS, oldObservations, observations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectFeedbackType getProjectFeedbackType() {
		return projectFeedbackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectFeedbackType(ProjectFeedbackType newProjectFeedbackType) {
		ProjectFeedbackType oldProjectFeedbackType = projectFeedbackType;
		projectFeedbackType = newProjectFeedbackType == null ? PROJECT_FEEDBACK_TYPE_EDEFAULT : newProjectFeedbackType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT_FEEDBACK__PROJECT_FEEDBACK_TYPE, oldProjectFeedbackType, projectFeedbackType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjectPackage.PROJECT_FEEDBACK__NAME:
				return getName();
			case ProjectPackage.PROJECT_FEEDBACK__DESCRIPTION:
				return getDescription();
			case ProjectPackage.PROJECT_FEEDBACK__OBSERVATIONS:
				return getObservations();
			case ProjectPackage.PROJECT_FEEDBACK__PROJECT_FEEDBACK_TYPE:
				return getProjectFeedbackType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProjectPackage.PROJECT_FEEDBACK__NAME:
				setName((String)newValue);
				return;
			case ProjectPackage.PROJECT_FEEDBACK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProjectPackage.PROJECT_FEEDBACK__OBSERVATIONS:
				setObservations((String)newValue);
				return;
			case ProjectPackage.PROJECT_FEEDBACK__PROJECT_FEEDBACK_TYPE:
				setProjectFeedbackType((ProjectFeedbackType)newValue);
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
			case ProjectPackage.PROJECT_FEEDBACK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProjectPackage.PROJECT_FEEDBACK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProjectPackage.PROJECT_FEEDBACK__OBSERVATIONS:
				setObservations(OBSERVATIONS_EDEFAULT);
				return;
			case ProjectPackage.PROJECT_FEEDBACK__PROJECT_FEEDBACK_TYPE:
				setProjectFeedbackType(PROJECT_FEEDBACK_TYPE_EDEFAULT);
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
			case ProjectPackage.PROJECT_FEEDBACK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProjectPackage.PROJECT_FEEDBACK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProjectPackage.PROJECT_FEEDBACK__OBSERVATIONS:
				return OBSERVATIONS_EDEFAULT == null ? observations != null : !OBSERVATIONS_EDEFAULT.equals(observations);
			case ProjectPackage.PROJECT_FEEDBACK__PROJECT_FEEDBACK_TYPE:
				return projectFeedbackType != PROJECT_FEEDBACK_TYPE_EDEFAULT;
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
		result.append(", observations: ");
		result.append(observations);
		result.append(", projectFeedbackType: ");
		result.append(projectFeedbackType);
		result.append(')');
		return result.toString();
	}

} //ProjectFeedbackImpl
