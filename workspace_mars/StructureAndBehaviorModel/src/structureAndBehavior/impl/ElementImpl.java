/**
 */
package structureAndBehavior.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import structureAndBehavior.Element;
import structureAndBehavior.InstanceType;
import structureAndBehavior.StructureAndBehaviorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehavior.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link structureAndBehavior.impl.ElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link structureAndBehavior.impl.ElementImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link structureAndBehavior.impl.ElementImpl#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
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
	 * The default value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected String objective = OBJECTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected static final InstanceType INSTANCE_TYPE_EDEFAULT = InstanceType.SUGGESTED;

	/**
	 * The cached value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected InstanceType instanceType = INSTANCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureAndBehaviorPackage.Literals.ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.ELEMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.ELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjective() {
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjective(String newObjective) {
		String oldObjective = objective;
		objective = newObjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.ELEMENT__OBJECTIVE, oldObjective, objective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceType getInstanceType() {
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceType(InstanceType newInstanceType) {
		InstanceType oldInstanceType = instanceType;
		instanceType = newInstanceType == null ? INSTANCE_TYPE_EDEFAULT : newInstanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.ELEMENT__INSTANCE_TYPE, oldInstanceType, instanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructureAndBehaviorPackage.ELEMENT__NAME:
				return getName();
			case StructureAndBehaviorPackage.ELEMENT__DESCRIPTION:
				return getDescription();
			case StructureAndBehaviorPackage.ELEMENT__OBJECTIVE:
				return getObjective();
			case StructureAndBehaviorPackage.ELEMENT__INSTANCE_TYPE:
				return getInstanceType();
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
			case StructureAndBehaviorPackage.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case StructureAndBehaviorPackage.ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StructureAndBehaviorPackage.ELEMENT__OBJECTIVE:
				setObjective((String)newValue);
				return;
			case StructureAndBehaviorPackage.ELEMENT__INSTANCE_TYPE:
				setInstanceType((InstanceType)newValue);
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
			case StructureAndBehaviorPackage.ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructureAndBehaviorPackage.ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StructureAndBehaviorPackage.ELEMENT__OBJECTIVE:
				setObjective(OBJECTIVE_EDEFAULT);
				return;
			case StructureAndBehaviorPackage.ELEMENT__INSTANCE_TYPE:
				setInstanceType(INSTANCE_TYPE_EDEFAULT);
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
			case StructureAndBehaviorPackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructureAndBehaviorPackage.ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StructureAndBehaviorPackage.ELEMENT__OBJECTIVE:
				return OBJECTIVE_EDEFAULT == null ? objective != null : !OBJECTIVE_EDEFAULT.equals(objective);
			case StructureAndBehaviorPackage.ELEMENT__INSTANCE_TYPE:
				return instanceType != INSTANCE_TYPE_EDEFAULT;
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
		result.append(", objective: ");
		result.append(objective);
		result.append(", instanceType: ");
		result.append(instanceType);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
