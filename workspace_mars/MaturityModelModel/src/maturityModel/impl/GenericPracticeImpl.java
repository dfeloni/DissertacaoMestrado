/**
 */
package maturityModel.impl;

import java.util.Collection;

import maturityModel.GPSubPractice;
import maturityModel.GenericPractice;
import maturityModel.MaturityModelPackage;

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
 * An implementation of the model object '<em><b>Generic Practice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maturityModel.impl.GenericPracticeImpl#getName <em>Name</em>}</li>
 *   <li>{@link maturityModel.impl.GenericPracticeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link maturityModel.impl.GenericPracticeImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link maturityModel.impl.GenericPracticeImpl#getComplementaryDescription <em>Complementary Description</em>}</li>
 *   <li>{@link maturityModel.impl.GenericPracticeImpl#getDivided <em>Divided</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericPracticeImpl extends MinimalEObjectImpl.Container implements GenericPractice {
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
	 * The cached value of the '{@link #getDivided() <em>Divided</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivided()
	 * @generated
	 * @ordered
	 */
	protected EList<GPSubPractice> divided;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericPracticeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaturityModelPackage.Literals.GENERIC_PRACTICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.GENERIC_PRACTICE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.GENERIC_PRACTICE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.GENERIC_PRACTICE__ACRONYM, oldAcronym, acronym));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.GENERIC_PRACTICE__COMPLEMENTARY_DESCRIPTION, oldComplementaryDescription, complementaryDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GPSubPractice> getDivided() {
		if (divided == null) {
			divided = new EObjectContainmentEList<GPSubPractice>(GPSubPractice.class, this, MaturityModelPackage.GENERIC_PRACTICE__DIVIDED);
		}
		return divided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaturityModelPackage.GENERIC_PRACTICE__DIVIDED:
				return ((InternalEList<?>)getDivided()).basicRemove(otherEnd, msgs);
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
			case MaturityModelPackage.GENERIC_PRACTICE__NAME:
				return getName();
			case MaturityModelPackage.GENERIC_PRACTICE__DESCRIPTION:
				return getDescription();
			case MaturityModelPackage.GENERIC_PRACTICE__ACRONYM:
				return getAcronym();
			case MaturityModelPackage.GENERIC_PRACTICE__COMPLEMENTARY_DESCRIPTION:
				return getComplementaryDescription();
			case MaturityModelPackage.GENERIC_PRACTICE__DIVIDED:
				return getDivided();
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
			case MaturityModelPackage.GENERIC_PRACTICE__NAME:
				setName((String)newValue);
				return;
			case MaturityModelPackage.GENERIC_PRACTICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MaturityModelPackage.GENERIC_PRACTICE__ACRONYM:
				setAcronym((String)newValue);
				return;
			case MaturityModelPackage.GENERIC_PRACTICE__COMPLEMENTARY_DESCRIPTION:
				setComplementaryDescription((String)newValue);
				return;
			case MaturityModelPackage.GENERIC_PRACTICE__DIVIDED:
				getDivided().clear();
				getDivided().addAll((Collection<? extends GPSubPractice>)newValue);
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
			case MaturityModelPackage.GENERIC_PRACTICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MaturityModelPackage.GENERIC_PRACTICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MaturityModelPackage.GENERIC_PRACTICE__ACRONYM:
				setAcronym(ACRONYM_EDEFAULT);
				return;
			case MaturityModelPackage.GENERIC_PRACTICE__COMPLEMENTARY_DESCRIPTION:
				setComplementaryDescription(COMPLEMENTARY_DESCRIPTION_EDEFAULT);
				return;
			case MaturityModelPackage.GENERIC_PRACTICE__DIVIDED:
				getDivided().clear();
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
			case MaturityModelPackage.GENERIC_PRACTICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MaturityModelPackage.GENERIC_PRACTICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MaturityModelPackage.GENERIC_PRACTICE__ACRONYM:
				return ACRONYM_EDEFAULT == null ? acronym != null : !ACRONYM_EDEFAULT.equals(acronym);
			case MaturityModelPackage.GENERIC_PRACTICE__COMPLEMENTARY_DESCRIPTION:
				return COMPLEMENTARY_DESCRIPTION_EDEFAULT == null ? complementaryDescription != null : !COMPLEMENTARY_DESCRIPTION_EDEFAULT.equals(complementaryDescription);
			case MaturityModelPackage.GENERIC_PRACTICE__DIVIDED:
				return divided != null && !divided.isEmpty();
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
		result.append(", acronym: ");
		result.append(acronym);
		result.append(", complementaryDescription: ");
		result.append(complementaryDescription);
		result.append(')');
		return result.toString();
	}

} //GenericPracticeImpl
