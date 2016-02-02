/**
 */
package taxonomy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import taxonomy.ElementType;
import taxonomy.Synonym;
import taxonomy.TaxonomyElement;
import taxonomy.TaxonomyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taxonomy.impl.TaxonomyElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link taxonomy.impl.TaxonomyElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link taxonomy.impl.TaxonomyElementImpl#getCategorizedBy <em>Categorized By</em>}</li>
 *   <li>{@link taxonomy.impl.TaxonomyElementImpl#getAppliesTo <em>Applies To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaxonomyElementImpl extends MinimalEObjectImpl.Container implements TaxonomyElement {
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
	 * The cached value of the '{@link #getCategorizedBy() <em>Categorized By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementType> categorizedBy;

	/**
	 * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Synonym> appliesTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaxonomyElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxonomyPackage.Literals.TAXONOMY_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxonomyPackage.TAXONOMY_ELEMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxonomyPackage.TAXONOMY_ELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementType> getCategorizedBy() {
		if (categorizedBy == null) {
			categorizedBy = new EObjectContainmentEList<ElementType>(ElementType.class, this, TaxonomyPackage.TAXONOMY_ELEMENT__CATEGORIZED_BY);
		}
		return categorizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synonym> getAppliesTo() {
		if (appliesTo == null) {
			appliesTo = new EObjectContainmentEList<Synonym>(Synonym.class, this, TaxonomyPackage.TAXONOMY_ELEMENT__APPLIES_TO);
		}
		return appliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaxonomyPackage.TAXONOMY_ELEMENT__CATEGORIZED_BY:
				return ((InternalEList<?>)getCategorizedBy()).basicRemove(otherEnd, msgs);
			case TaxonomyPackage.TAXONOMY_ELEMENT__APPLIES_TO:
				return ((InternalEList<?>)getAppliesTo()).basicRemove(otherEnd, msgs);
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
			case TaxonomyPackage.TAXONOMY_ELEMENT__NAME:
				return getName();
			case TaxonomyPackage.TAXONOMY_ELEMENT__DESCRIPTION:
				return getDescription();
			case TaxonomyPackage.TAXONOMY_ELEMENT__CATEGORIZED_BY:
				return getCategorizedBy();
			case TaxonomyPackage.TAXONOMY_ELEMENT__APPLIES_TO:
				return getAppliesTo();
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
			case TaxonomyPackage.TAXONOMY_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case TaxonomyPackage.TAXONOMY_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TaxonomyPackage.TAXONOMY_ELEMENT__CATEGORIZED_BY:
				getCategorizedBy().clear();
				getCategorizedBy().addAll((Collection<? extends ElementType>)newValue);
				return;
			case TaxonomyPackage.TAXONOMY_ELEMENT__APPLIES_TO:
				getAppliesTo().clear();
				getAppliesTo().addAll((Collection<? extends Synonym>)newValue);
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
			case TaxonomyPackage.TAXONOMY_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TaxonomyPackage.TAXONOMY_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TaxonomyPackage.TAXONOMY_ELEMENT__CATEGORIZED_BY:
				getCategorizedBy().clear();
				return;
			case TaxonomyPackage.TAXONOMY_ELEMENT__APPLIES_TO:
				getAppliesTo().clear();
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
			case TaxonomyPackage.TAXONOMY_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TaxonomyPackage.TAXONOMY_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TaxonomyPackage.TAXONOMY_ELEMENT__CATEGORIZED_BY:
				return categorizedBy != null && !categorizedBy.isEmpty();
			case TaxonomyPackage.TAXONOMY_ELEMENT__APPLIES_TO:
				return appliesTo != null && !appliesTo.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TaxonomyElementImpl
