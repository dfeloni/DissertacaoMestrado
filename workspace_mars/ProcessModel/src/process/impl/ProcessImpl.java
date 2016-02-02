/**
 */
package process.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import process.Phase;
import process.ProcessPackage;
import process.ProcessType;

import project.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link process.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getProcessType <em>Process Type</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getHas <em>Has</em>}</li>
 *   <li>{@link process.impl.ProcessImpl#getFollows <em>Follows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements process.Process {
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
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected String background = BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessType() <em>Process Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessType()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessType PROCESS_TYPE_EDEFAULT = ProcessType.PROCESS_TEMPLATE;

	/**
	 * The cached value of the '{@link #getProcessType() <em>Process Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessType()
	 * @generated
	 * @ordered
	 */
	protected ProcessType processType = PROCESS_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected EList<Phase> has;

	/**
	 * The cached value of the '{@link #getFollows() <em>Follows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollows()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> follows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.PROCESS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(String newBackground) {
		String oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessType getProcessType() {
		return processType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessType(ProcessType newProcessType) {
		ProcessType oldProcessType = processType;
		processType = newProcessType == null ? PROCESS_TYPE_EDEFAULT : newProcessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS__PROCESS_TYPE, oldProcessType, processType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phase> getHas() {
		if (has == null) {
			has = new EObjectContainmentEList<Phase>(Phase.class, this, ProcessPackage.PROCESS__HAS);
		}
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getFollows() {
		if (follows == null) {
			follows = new EObjectResolvingEList<Project>(Project.class, this, ProcessPackage.PROCESS__FOLLOWS);
		}
		return follows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.PROCESS__HAS:
				return ((InternalEList<?>)getHas()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.PROCESS__NAME:
				return getName();
			case ProcessPackage.PROCESS__DESCRIPTION:
				return getDescription();
			case ProcessPackage.PROCESS__PURPOSE:
				return getPurpose();
			case ProcessPackage.PROCESS__BACKGROUND:
				return getBackground();
			case ProcessPackage.PROCESS__PROCESS_TYPE:
				return getProcessType();
			case ProcessPackage.PROCESS__HAS:
				return getHas();
			case ProcessPackage.PROCESS__FOLLOWS:
				return getFollows();
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
			case ProcessPackage.PROCESS__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.PROCESS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProcessPackage.PROCESS__PURPOSE:
				setPurpose((String)newValue);
				return;
			case ProcessPackage.PROCESS__BACKGROUND:
				setBackground((String)newValue);
				return;
			case ProcessPackage.PROCESS__PROCESS_TYPE:
				setProcessType((ProcessType)newValue);
				return;
			case ProcessPackage.PROCESS__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends Phase>)newValue);
				return;
			case ProcessPackage.PROCESS__FOLLOWS:
				getFollows().clear();
				getFollows().addAll((Collection<? extends Project>)newValue);
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
			case ProcessPackage.PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.PROCESS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProcessPackage.PROCESS__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case ProcessPackage.PROCESS__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case ProcessPackage.PROCESS__PROCESS_TYPE:
				setProcessType(PROCESS_TYPE_EDEFAULT);
				return;
			case ProcessPackage.PROCESS__HAS:
				getHas().clear();
				return;
			case ProcessPackage.PROCESS__FOLLOWS:
				getFollows().clear();
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
			case ProcessPackage.PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.PROCESS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProcessPackage.PROCESS__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case ProcessPackage.PROCESS__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case ProcessPackage.PROCESS__PROCESS_TYPE:
				return processType != PROCESS_TYPE_EDEFAULT;
			case ProcessPackage.PROCESS__HAS:
				return has != null && !has.isEmpty();
			case ProcessPackage.PROCESS__FOLLOWS:
				return follows != null && !follows.isEmpty();
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
		result.append(", purpose: ");
		result.append(purpose);
		result.append(", background: ");
		result.append(background);
		result.append(", processType: ");
		result.append(processType);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
