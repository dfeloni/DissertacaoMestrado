/**
 */
package structureAndBehavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import structureAndBehavior.Activity;
import structureAndBehavior.ActivityType;
import structureAndBehavior.Role;
import structureAndBehavior.StructureAndBehaviorPackage;
import structureAndBehavior.Task;
import structureAndBehavior.WorkProduct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehavior.impl.ActivityImpl#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link structureAndBehavior.impl.ActivityImpl#getExecutes <em>Executes</em>}</li>
 *   <li>{@link structureAndBehavior.impl.ActivityImpl#getInput <em>Input</em>}</li>
 *   <li>{@link structureAndBehavior.impl.ActivityImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link structureAndBehavior.impl.ActivityImpl#getPerformedBy <em>Performed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends ElementImpl implements Activity {
	/**
	 * The default value of the '{@link #getActivityType() <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityType()
	 * @generated
	 * @ordered
	 */
	protected static final ActivityType ACTIVITY_TYPE_EDEFAULT = ActivityType.MANDATORY;

	/**
	 * The cached value of the '{@link #getActivityType() <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityType()
	 * @generated
	 * @ordered
	 */
	protected ActivityType activityType = ACTIVITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExecutes() <em>Executes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> executes;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> output;

	/**
	 * The cached value of the '{@link #getPerformedBy() <em>Performed By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> performedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureAndBehaviorPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType getActivityType() {
		return activityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityType(ActivityType newActivityType) {
		ActivityType oldActivityType = activityType;
		activityType = newActivityType == null ? ACTIVITY_TYPE_EDEFAULT : newActivityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.ACTIVITY__ACTIVITY_TYPE, oldActivityType, activityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getExecutes() {
		if (executes == null) {
			executes = new EObjectContainmentEList<Task>(Task.class, this, StructureAndBehaviorPackage.ACTIVITY__EXECUTES);
		}
		return executes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProduct> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<WorkProduct>(WorkProduct.class, this, StructureAndBehaviorPackage.ACTIVITY__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkProduct> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<WorkProduct>(WorkProduct.class, this, StructureAndBehaviorPackage.ACTIVITY__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getPerformedBy() {
		if (performedBy == null) {
			performedBy = new EObjectContainmentEList<Role>(Role.class, this, StructureAndBehaviorPackage.ACTIVITY__PERFORMED_BY);
		}
		return performedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructureAndBehaviorPackage.ACTIVITY__EXECUTES:
				return ((InternalEList<?>)getExecutes()).basicRemove(otherEnd, msgs);
			case StructureAndBehaviorPackage.ACTIVITY__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case StructureAndBehaviorPackage.ACTIVITY__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case StructureAndBehaviorPackage.ACTIVITY__PERFORMED_BY:
				return ((InternalEList<?>)getPerformedBy()).basicRemove(otherEnd, msgs);
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
			case StructureAndBehaviorPackage.ACTIVITY__ACTIVITY_TYPE:
				return getActivityType();
			case StructureAndBehaviorPackage.ACTIVITY__EXECUTES:
				return getExecutes();
			case StructureAndBehaviorPackage.ACTIVITY__INPUT:
				return getInput();
			case StructureAndBehaviorPackage.ACTIVITY__OUTPUT:
				return getOutput();
			case StructureAndBehaviorPackage.ACTIVITY__PERFORMED_BY:
				return getPerformedBy();
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
			case StructureAndBehaviorPackage.ACTIVITY__ACTIVITY_TYPE:
				setActivityType((ActivityType)newValue);
				return;
			case StructureAndBehaviorPackage.ACTIVITY__EXECUTES:
				getExecutes().clear();
				getExecutes().addAll((Collection<? extends Task>)newValue);
				return;
			case StructureAndBehaviorPackage.ACTIVITY__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case StructureAndBehaviorPackage.ACTIVITY__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case StructureAndBehaviorPackage.ACTIVITY__PERFORMED_BY:
				getPerformedBy().clear();
				getPerformedBy().addAll((Collection<? extends Role>)newValue);
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
			case StructureAndBehaviorPackage.ACTIVITY__ACTIVITY_TYPE:
				setActivityType(ACTIVITY_TYPE_EDEFAULT);
				return;
			case StructureAndBehaviorPackage.ACTIVITY__EXECUTES:
				getExecutes().clear();
				return;
			case StructureAndBehaviorPackage.ACTIVITY__INPUT:
				getInput().clear();
				return;
			case StructureAndBehaviorPackage.ACTIVITY__OUTPUT:
				getOutput().clear();
				return;
			case StructureAndBehaviorPackage.ACTIVITY__PERFORMED_BY:
				getPerformedBy().clear();
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
			case StructureAndBehaviorPackage.ACTIVITY__ACTIVITY_TYPE:
				return activityType != ACTIVITY_TYPE_EDEFAULT;
			case StructureAndBehaviorPackage.ACTIVITY__EXECUTES:
				return executes != null && !executes.isEmpty();
			case StructureAndBehaviorPackage.ACTIVITY__INPUT:
				return input != null && !input.isEmpty();
			case StructureAndBehaviorPackage.ACTIVITY__OUTPUT:
				return output != null && !output.isEmpty();
			case StructureAndBehaviorPackage.ACTIVITY__PERFORMED_BY:
				return performedBy != null && !performedBy.isEmpty();
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
		result.append(" (activityType: ");
		result.append(activityType);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
