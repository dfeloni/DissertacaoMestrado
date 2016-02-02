/**
 */
package structureAndBehavior.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import structureAndBehavior.StructureAndBehaviorPackage;
import structureAndBehavior.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehavior.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link structureAndBehavior.impl.TaskImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link structureAndBehavior.impl.TaskImpl#getComplementaryDescription <em>Complementary Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
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
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getComplementaryDescription() <em>Complementary Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementaryDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENTARY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplementaryDescription() <em>Complementary Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementaryDescription()
	 * @generated
	 * @ordered
	 */
	protected String complementaryDescription = COMPLEMENTARY_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureAndBehaviorPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(Integer newNumber) {
		Integer oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.TASK__NUMBER, oldNumber, number));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.TASK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplementaryDescription() {
		return complementaryDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplementaryDescription(String newComplementaryDescription) {
		String oldComplementaryDescription = complementaryDescription;
		complementaryDescription = newComplementaryDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.TASK__COMPLEMENTARY_DESCRIPTION, oldComplementaryDescription, complementaryDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructureAndBehaviorPackage.TASK__DESCRIPTION:
				return getDescription();
			case StructureAndBehaviorPackage.TASK__NUMBER:
				return getNumber();
			case StructureAndBehaviorPackage.TASK__COMPLEMENTARY_DESCRIPTION:
				return getComplementaryDescription();
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
			case StructureAndBehaviorPackage.TASK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StructureAndBehaviorPackage.TASK__NUMBER:
				setNumber((Integer)newValue);
				return;
			case StructureAndBehaviorPackage.TASK__COMPLEMENTARY_DESCRIPTION:
				setComplementaryDescription((String)newValue);
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
			case StructureAndBehaviorPackage.TASK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StructureAndBehaviorPackage.TASK__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case StructureAndBehaviorPackage.TASK__COMPLEMENTARY_DESCRIPTION:
				setComplementaryDescription(COMPLEMENTARY_DESCRIPTION_EDEFAULT);
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
			case StructureAndBehaviorPackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StructureAndBehaviorPackage.TASK__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case StructureAndBehaviorPackage.TASK__COMPLEMENTARY_DESCRIPTION:
				return COMPLEMENTARY_DESCRIPTION_EDEFAULT == null ? complementaryDescription != null : !COMPLEMENTARY_DESCRIPTION_EDEFAULT.equals(complementaryDescription);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", number: ");
		result.append(number);
		result.append(", complementaryDescription: ");
		result.append(complementaryDescription);
		result.append(')');
		return result.toString();
	}

} //TaskImpl