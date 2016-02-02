/**
 */
package maturityModel.impl;

import java.util.Collection;

import maturityModel.GenericPractice;
import maturityModel.MaturityLevel;
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
 * An implementation of the model object '<em><b>Maturity Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maturityModel.impl.MaturityLevelImpl#getName <em>Name</em>}</li>
 *   <li>{@link maturityModel.impl.MaturityLevelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link maturityModel.impl.MaturityLevelImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link maturityModel.impl.MaturityLevelImpl#getEvolvesInto <em>Evolves Into</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaturityLevelImpl extends MinimalEObjectImpl.Container implements MaturityLevel {
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
	 * The cached value of the '{@link #getEvolvesInto() <em>Evolves Into</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolvesInto()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericPractice> evolvesInto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaturityLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaturityModelPackage.Literals.MATURITY_LEVEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.MATURITY_LEVEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.MATURITY_LEVEL__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.MATURITY_LEVEL__ACRONYM, oldAcronym, acronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericPractice> getEvolvesInto() {
		if (evolvesInto == null) {
			evolvesInto = new EObjectContainmentEList<GenericPractice>(GenericPractice.class, this, MaturityModelPackage.MATURITY_LEVEL__EVOLVES_INTO);
		}
		return evolvesInto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaturityModelPackage.MATURITY_LEVEL__EVOLVES_INTO:
				return ((InternalEList<?>)getEvolvesInto()).basicRemove(otherEnd, msgs);
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
			case MaturityModelPackage.MATURITY_LEVEL__NAME:
				return getName();
			case MaturityModelPackage.MATURITY_LEVEL__DESCRIPTION:
				return getDescription();
			case MaturityModelPackage.MATURITY_LEVEL__ACRONYM:
				return getAcronym();
			case MaturityModelPackage.MATURITY_LEVEL__EVOLVES_INTO:
				return getEvolvesInto();
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
			case MaturityModelPackage.MATURITY_LEVEL__NAME:
				setName((String)newValue);
				return;
			case MaturityModelPackage.MATURITY_LEVEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MaturityModelPackage.MATURITY_LEVEL__ACRONYM:
				setAcronym((String)newValue);
				return;
			case MaturityModelPackage.MATURITY_LEVEL__EVOLVES_INTO:
				getEvolvesInto().clear();
				getEvolvesInto().addAll((Collection<? extends GenericPractice>)newValue);
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
			case MaturityModelPackage.MATURITY_LEVEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MaturityModelPackage.MATURITY_LEVEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MaturityModelPackage.MATURITY_LEVEL__ACRONYM:
				setAcronym(ACRONYM_EDEFAULT);
				return;
			case MaturityModelPackage.MATURITY_LEVEL__EVOLVES_INTO:
				getEvolvesInto().clear();
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
			case MaturityModelPackage.MATURITY_LEVEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MaturityModelPackage.MATURITY_LEVEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MaturityModelPackage.MATURITY_LEVEL__ACRONYM:
				return ACRONYM_EDEFAULT == null ? acronym != null : !ACRONYM_EDEFAULT.equals(acronym);
			case MaturityModelPackage.MATURITY_LEVEL__EVOLVES_INTO:
				return evolvesInto != null && !evolvesInto.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //MaturityLevelImpl
