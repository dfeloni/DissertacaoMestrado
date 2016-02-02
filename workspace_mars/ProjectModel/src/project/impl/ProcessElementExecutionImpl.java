/**
 */
package project.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import project.ProcessElementExecution;
import project.ProcessElementType;
import project.ProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Element Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project.impl.ProcessElementExecutionImpl#getName <em>Name</em>}</li>
 *   <li>{@link project.impl.ProcessElementExecutionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link project.impl.ProcessElementExecutionImpl#getObservations <em>Observations</em>}</li>
 *   <li>{@link project.impl.ProcessElementExecutionImpl#isExecuted <em>Executed</em>}</li>
 *   <li>{@link project.impl.ProcessElementExecutionImpl#getProcessElementType <em>Process Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessElementExecutionImpl extends MinimalEObjectImpl.Container implements ProcessElementExecution {
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
	 * The default value of the '{@link #isExecuted() <em>Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecuted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXECUTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExecuted() <em>Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecuted()
	 * @generated
	 * @ordered
	 */
	protected boolean executed = EXECUTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessElementType() <em>Process Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessElementType()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessElementType PROCESS_ELEMENT_TYPE_EDEFAULT = ProcessElementType.GENERIC_PRACTICE;

	/**
	 * The cached value of the '{@link #getProcessElementType() <em>Process Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessElementType()
	 * @generated
	 * @ordered
	 */
	protected ProcessElementType processElementType = PROCESS_ELEMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessElementExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectPackage.Literals.PROCESS_ELEMENT_EXECUTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROCESS_ELEMENT_EXECUTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROCESS_ELEMENT_EXECUTION__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROCESS_ELEMENT_EXECUTION__OBSERVATIONS, oldObservations, observations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExecuted() {
		return executed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecuted(boolean newExecuted) {
		boolean oldExecuted = executed;
		executed = newExecuted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROCESS_ELEMENT_EXECUTION__EXECUTED, oldExecuted, executed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessElementType getProcessElementType() {
		return processElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessElementType(ProcessElementType newProcessElementType) {
		ProcessElementType oldProcessElementType = processElementType;
		processElementType = newProcessElementType == null ? PROCESS_ELEMENT_TYPE_EDEFAULT : newProcessElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROCESS_ELEMENT_EXECUTION__PROCESS_ELEMENT_TYPE, oldProcessElementType, processElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__NAME:
				return getName();
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__DESCRIPTION:
				return getDescription();
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__OBSERVATIONS:
				return getObservations();
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__EXECUTED:
				return isExecuted();
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__PROCESS_ELEMENT_TYPE:
				return getProcessElementType();
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
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__NAME:
				setName((String)newValue);
				return;
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__OBSERVATIONS:
				setObservations((String)newValue);
				return;
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__EXECUTED:
				setExecuted((Boolean)newValue);
				return;
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__PROCESS_ELEMENT_TYPE:
				setProcessElementType((ProcessElementType)newValue);
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
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__OBSERVATIONS:
				setObservations(OBSERVATIONS_EDEFAULT);
				return;
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__EXECUTED:
				setExecuted(EXECUTED_EDEFAULT);
				return;
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__PROCESS_ELEMENT_TYPE:
				setProcessElementType(PROCESS_ELEMENT_TYPE_EDEFAULT);
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
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__OBSERVATIONS:
				return OBSERVATIONS_EDEFAULT == null ? observations != null : !OBSERVATIONS_EDEFAULT.equals(observations);
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__EXECUTED:
				return executed != EXECUTED_EDEFAULT;
			case ProjectPackage.PROCESS_ELEMENT_EXECUTION__PROCESS_ELEMENT_TYPE:
				return processElementType != PROCESS_ELEMENT_TYPE_EDEFAULT;
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
		result.append(", executed: ");
		result.append(executed);
		result.append(", processElementType: ");
		result.append(processElementType);
		result.append(')');
		return result.toString();
	}

} //ProcessElementExecutionImpl
