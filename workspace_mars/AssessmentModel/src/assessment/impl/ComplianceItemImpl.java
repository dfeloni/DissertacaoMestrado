/**
 */
package assessment.impl;

import assessment.AssessmentPackage;
import assessment.ComplianceItem;
import assessment.ComplianceType;
import assessment.Question;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compliance Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assessment.impl.ComplianceItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link assessment.impl.ComplianceItemImpl#getGenericPractice <em>Generic Practice</em>}</li>
 *   <li>{@link assessment.impl.ComplianceItemImpl#getGenericSubPractice <em>Generic Sub Practice</em>}</li>
 *   <li>{@link assessment.impl.ComplianceItemImpl#getSpecificPractice <em>Specific Practice</em>}</li>
 *   <li>{@link assessment.impl.ComplianceItemImpl#getDeterminedBy <em>Determined By</em>}</li>
 *   <li>{@link assessment.impl.ComplianceItemImpl#getDefinesComplianceLevel <em>Defines Compliance Level</em>}</li>
 *   <li>{@link assessment.impl.ComplianceItemImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplianceItemImpl extends MinimalEObjectImpl.Container implements ComplianceItem {
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
	 * The default value of the '{@link #getGenericPractice() <em>Generic Practice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericPractice()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERIC_PRACTICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenericPractice() <em>Generic Practice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericPractice()
	 * @generated
	 * @ordered
	 */
	protected String genericPractice = GENERIC_PRACTICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenericSubPractice() <em>Generic Sub Practice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericSubPractice()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERIC_SUB_PRACTICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenericSubPractice() <em>Generic Sub Practice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericSubPractice()
	 * @generated
	 * @ordered
	 */
	protected String genericSubPractice = GENERIC_SUB_PRACTICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecificPractice() <em>Specific Practice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificPractice()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFIC_PRACTICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificPractice() <em>Specific Practice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificPractice()
	 * @generated
	 * @ordered
	 */
	protected String specificPractice = SPECIFIC_PRACTICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeterminedBy() <em>Determined By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeterminedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> determinedBy;

	/**
	 * The cached value of the '{@link #getDefinesComplianceLevel() <em>Defines Compliance Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinesComplianceLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplianceType> definesComplianceLevel;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected ComplianceType result;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplianceItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.COMPLIANCE_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.COMPLIANCE_ITEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenericPractice() {
		return genericPractice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericPractice(String newGenericPractice) {
		String oldGenericPractice = genericPractice;
		genericPractice = newGenericPractice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.COMPLIANCE_ITEM__GENERIC_PRACTICE, oldGenericPractice, genericPractice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenericSubPractice() {
		return genericSubPractice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericSubPractice(String newGenericSubPractice) {
		String oldGenericSubPractice = genericSubPractice;
		genericSubPractice = newGenericSubPractice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.COMPLIANCE_ITEM__GENERIC_SUB_PRACTICE, oldGenericSubPractice, genericSubPractice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificPractice() {
		return specificPractice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificPractice(String newSpecificPractice) {
		String oldSpecificPractice = specificPractice;
		specificPractice = newSpecificPractice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.COMPLIANCE_ITEM__SPECIFIC_PRACTICE, oldSpecificPractice, specificPractice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getDeterminedBy() {
		if (determinedBy == null) {
			determinedBy = new EObjectContainmentEList<Question>(Question.class, this, AssessmentPackage.COMPLIANCE_ITEM__DETERMINED_BY);
		}
		return determinedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplianceType> getDefinesComplianceLevel() {
		if (definesComplianceLevel == null) {
			definesComplianceLevel = new EObjectContainmentEList<ComplianceType>(ComplianceType.class, this, AssessmentPackage.COMPLIANCE_ITEM__DEFINES_COMPLIANCE_LEVEL);
		}
		return definesComplianceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplianceType getResult() {
		if (result != null && result.eIsProxy()) {
			InternalEObject oldResult = (InternalEObject)result;
			result = (ComplianceType)eResolveProxy(oldResult);
			if (result != oldResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssessmentPackage.COMPLIANCE_ITEM__RESULT, oldResult, result));
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplianceType basicGetResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(ComplianceType newResult) {
		ComplianceType oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.COMPLIANCE_ITEM__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.COMPLIANCE_ITEM__DETERMINED_BY:
				return ((InternalEList<?>)getDeterminedBy()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.COMPLIANCE_ITEM__DEFINES_COMPLIANCE_LEVEL:
				return ((InternalEList<?>)getDefinesComplianceLevel()).basicRemove(otherEnd, msgs);
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
			case AssessmentPackage.COMPLIANCE_ITEM__DESCRIPTION:
				return getDescription();
			case AssessmentPackage.COMPLIANCE_ITEM__GENERIC_PRACTICE:
				return getGenericPractice();
			case AssessmentPackage.COMPLIANCE_ITEM__GENERIC_SUB_PRACTICE:
				return getGenericSubPractice();
			case AssessmentPackage.COMPLIANCE_ITEM__SPECIFIC_PRACTICE:
				return getSpecificPractice();
			case AssessmentPackage.COMPLIANCE_ITEM__DETERMINED_BY:
				return getDeterminedBy();
			case AssessmentPackage.COMPLIANCE_ITEM__DEFINES_COMPLIANCE_LEVEL:
				return getDefinesComplianceLevel();
			case AssessmentPackage.COMPLIANCE_ITEM__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
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
			case AssessmentPackage.COMPLIANCE_ITEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AssessmentPackage.COMPLIANCE_ITEM__GENERIC_PRACTICE:
				setGenericPractice((String)newValue);
				return;
			case AssessmentPackage.COMPLIANCE_ITEM__GENERIC_SUB_PRACTICE:
				setGenericSubPractice((String)newValue);
				return;
			case AssessmentPackage.COMPLIANCE_ITEM__SPECIFIC_PRACTICE:
				setSpecificPractice((String)newValue);
				return;
			case AssessmentPackage.COMPLIANCE_ITEM__DETERMINED_BY:
				getDeterminedBy().clear();
				getDeterminedBy().addAll((Collection<? extends Question>)newValue);
				return;
			case AssessmentPackage.COMPLIANCE_ITEM__DEFINES_COMPLIANCE_LEVEL:
				getDefinesComplianceLevel().clear();
				getDefinesComplianceLevel().addAll((Collection<? extends ComplianceType>)newValue);
				return;
			case AssessmentPackage.COMPLIANCE_ITEM__RESULT:
				setResult((ComplianceType)newValue);
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
			case AssessmentPackage.COMPLIANCE_ITEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AssessmentPackage.COMPLIANCE_ITEM__GENERIC_PRACTICE:
				setGenericPractice(GENERIC_PRACTICE_EDEFAULT);
				return;
			case AssessmentPackage.COMPLIANCE_ITEM__GENERIC_SUB_PRACTICE:
				setGenericSubPractice(GENERIC_SUB_PRACTICE_EDEFAULT);
				return;
			case AssessmentPackage.COMPLIANCE_ITEM__SPECIFIC_PRACTICE:
				setSpecificPractice(SPECIFIC_PRACTICE_EDEFAULT);
				return;
			case AssessmentPackage.COMPLIANCE_ITEM__DETERMINED_BY:
				getDeterminedBy().clear();
				return;
			case AssessmentPackage.COMPLIANCE_ITEM__DEFINES_COMPLIANCE_LEVEL:
				getDefinesComplianceLevel().clear();
				return;
			case AssessmentPackage.COMPLIANCE_ITEM__RESULT:
				setResult((ComplianceType)null);
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
			case AssessmentPackage.COMPLIANCE_ITEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AssessmentPackage.COMPLIANCE_ITEM__GENERIC_PRACTICE:
				return GENERIC_PRACTICE_EDEFAULT == null ? genericPractice != null : !GENERIC_PRACTICE_EDEFAULT.equals(genericPractice);
			case AssessmentPackage.COMPLIANCE_ITEM__GENERIC_SUB_PRACTICE:
				return GENERIC_SUB_PRACTICE_EDEFAULT == null ? genericSubPractice != null : !GENERIC_SUB_PRACTICE_EDEFAULT.equals(genericSubPractice);
			case AssessmentPackage.COMPLIANCE_ITEM__SPECIFIC_PRACTICE:
				return SPECIFIC_PRACTICE_EDEFAULT == null ? specificPractice != null : !SPECIFIC_PRACTICE_EDEFAULT.equals(specificPractice);
			case AssessmentPackage.COMPLIANCE_ITEM__DETERMINED_BY:
				return determinedBy != null && !determinedBy.isEmpty();
			case AssessmentPackage.COMPLIANCE_ITEM__DEFINES_COMPLIANCE_LEVEL:
				return definesComplianceLevel != null && !definesComplianceLevel.isEmpty();
			case AssessmentPackage.COMPLIANCE_ITEM__RESULT:
				return result != null;
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
		result.append(", genericPractice: ");
		result.append(genericPractice);
		result.append(", genericSubPractice: ");
		result.append(genericSubPractice);
		result.append(", specificPractice: ");
		result.append(specificPractice);
		result.append(')');
		return result.toString();
	}

} //ComplianceItemImpl
