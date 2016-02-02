/**
 */
package maturityModel.impl;

import java.util.Collection;

import maturityModel.MaturityLevel;
import maturityModel.MaturityModelPackage;
import maturityModel.ProcessArea;
import maturityModel.SpecificPractice;

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
 * An implementation of the model object '<em><b>Process Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maturityModel.impl.ProcessAreaImpl#getName <em>Name</em>}</li>
 *   <li>{@link maturityModel.impl.ProcessAreaImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link maturityModel.impl.ProcessAreaImpl#getMainDescription <em>Main Description</em>}</li>
 *   <li>{@link maturityModel.impl.ProcessAreaImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link maturityModel.impl.ProcessAreaImpl#getDefines <em>Defines</em>}</li>
 *   <li>{@link maturityModel.impl.ProcessAreaImpl#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessAreaImpl extends MinimalEObjectImpl.Container implements ProcessArea {
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
	 * The default value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected String shortDescription = SHORT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMainDescription() <em>Main Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainDescription() <em>Main Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainDescription()
	 * @generated
	 * @ordered
	 */
	protected String mainDescription = MAIN_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcronym()
	 * @generated
	 * @ordered
	 */
	protected static final String ACRONYM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcronym()
	 * @generated
	 * @ordered
	 */
	protected String acronym = ACRONYM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefines() <em>Defines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefines()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificPractice> defines;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected MaturityLevel implements_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaturityModelPackage.Literals.PROCESS_AREA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.PROCESS_AREA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortDescription(String newShortDescription) {
		String oldShortDescription = shortDescription;
		shortDescription = newShortDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.PROCESS_AREA__SHORT_DESCRIPTION, oldShortDescription, shortDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMainDescription() {
		return mainDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainDescription(String newMainDescription) {
		String oldMainDescription = mainDescription;
		mainDescription = newMainDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.PROCESS_AREA__MAIN_DESCRIPTION, oldMainDescription, mainDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcronym() {
		return acronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcronym(String newAcronym) {
		String oldAcronym = acronym;
		acronym = newAcronym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.PROCESS_AREA__ACRONYM, oldAcronym, acronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificPractice> getDefines() {
		if (defines == null) {
			defines = new EObjectContainmentEList<SpecificPractice>(SpecificPractice.class, this, MaturityModelPackage.PROCESS_AREA__DEFINES);
		}
		return defines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaturityLevel getImplements() {
		if (implements_ != null && implements_.eIsProxy()) {
			InternalEObject oldImplements = (InternalEObject)implements_;
			implements_ = (MaturityLevel)eResolveProxy(oldImplements);
			if (implements_ != oldImplements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MaturityModelPackage.PROCESS_AREA__IMPLEMENTS, oldImplements, implements_));
			}
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaturityLevel basicGetImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(MaturityLevel newImplements) {
		MaturityLevel oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.PROCESS_AREA__IMPLEMENTS, oldImplements, implements_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaturityModelPackage.PROCESS_AREA__DEFINES:
				return ((InternalEList<?>)getDefines()).basicRemove(otherEnd, msgs);
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
			case MaturityModelPackage.PROCESS_AREA__NAME:
				return getName();
			case MaturityModelPackage.PROCESS_AREA__SHORT_DESCRIPTION:
				return getShortDescription();
			case MaturityModelPackage.PROCESS_AREA__MAIN_DESCRIPTION:
				return getMainDescription();
			case MaturityModelPackage.PROCESS_AREA__ACRONYM:
				return getAcronym();
			case MaturityModelPackage.PROCESS_AREA__DEFINES:
				return getDefines();
			case MaturityModelPackage.PROCESS_AREA__IMPLEMENTS:
				if (resolve) return getImplements();
				return basicGetImplements();
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
			case MaturityModelPackage.PROCESS_AREA__NAME:
				setName((String)newValue);
				return;
			case MaturityModelPackage.PROCESS_AREA__SHORT_DESCRIPTION:
				setShortDescription((String)newValue);
				return;
			case MaturityModelPackage.PROCESS_AREA__MAIN_DESCRIPTION:
				setMainDescription((String)newValue);
				return;
			case MaturityModelPackage.PROCESS_AREA__ACRONYM:
				setAcronym((String)newValue);
				return;
			case MaturityModelPackage.PROCESS_AREA__DEFINES:
				getDefines().clear();
				getDefines().addAll((Collection<? extends SpecificPractice>)newValue);
				return;
			case MaturityModelPackage.PROCESS_AREA__IMPLEMENTS:
				setImplements((MaturityLevel)newValue);
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
			case MaturityModelPackage.PROCESS_AREA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MaturityModelPackage.PROCESS_AREA__SHORT_DESCRIPTION:
				setShortDescription(SHORT_DESCRIPTION_EDEFAULT);
				return;
			case MaturityModelPackage.PROCESS_AREA__MAIN_DESCRIPTION:
				setMainDescription(MAIN_DESCRIPTION_EDEFAULT);
				return;
			case MaturityModelPackage.PROCESS_AREA__ACRONYM:
				setAcronym(ACRONYM_EDEFAULT);
				return;
			case MaturityModelPackage.PROCESS_AREA__DEFINES:
				getDefines().clear();
				return;
			case MaturityModelPackage.PROCESS_AREA__IMPLEMENTS:
				setImplements((MaturityLevel)null);
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
			case MaturityModelPackage.PROCESS_AREA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MaturityModelPackage.PROCESS_AREA__SHORT_DESCRIPTION:
				return SHORT_DESCRIPTION_EDEFAULT == null ? shortDescription != null : !SHORT_DESCRIPTION_EDEFAULT.equals(shortDescription);
			case MaturityModelPackage.PROCESS_AREA__MAIN_DESCRIPTION:
				return MAIN_DESCRIPTION_EDEFAULT == null ? mainDescription != null : !MAIN_DESCRIPTION_EDEFAULT.equals(mainDescription);
			case MaturityModelPackage.PROCESS_AREA__ACRONYM:
				return ACRONYM_EDEFAULT == null ? acronym != null : !ACRONYM_EDEFAULT.equals(acronym);
			case MaturityModelPackage.PROCESS_AREA__DEFINES:
				return defines != null && !defines.isEmpty();
			case MaturityModelPackage.PROCESS_AREA__IMPLEMENTS:
				return implements_ != null;
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
		result.append(", shortDescription: ");
		result.append(shortDescription);
		result.append(", mainDescription: ");
		result.append(mainDescription);
		result.append(", acronym: ");
		result.append(acronym);
		result.append(')');
		return result.toString();
	}

} //ProcessAreaImpl
