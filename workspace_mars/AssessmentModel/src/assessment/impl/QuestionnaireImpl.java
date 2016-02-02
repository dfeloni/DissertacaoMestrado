/**
 */
package assessment.impl;

import assessment.AssessmentPackage;
import assessment.ComplianceItem;
import assessment.Questionnaire;

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
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assessment.impl.QuestionnaireImpl#getName <em>Name</em>}</li>
 *   <li>{@link assessment.impl.QuestionnaireImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link assessment.impl.QuestionnaireImpl#getProcessArea <em>Process Area</em>}</li>
 *   <li>{@link assessment.impl.QuestionnaireImpl#getMaturityLevel <em>Maturity Level</em>}</li>
 *   <li>{@link assessment.impl.QuestionnaireImpl#getEvaluates <em>Evaluates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireImpl extends MinimalEObjectImpl.Container implements Questionnaire {
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
	 * The default value of the '{@link #getProcessArea() <em>Process Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessArea()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessArea() <em>Process Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessArea()
	 * @generated
	 * @ordered
	 */
	protected String processArea = PROCESS_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaturityLevel() <em>Maturity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaturityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String MATURITY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaturityLevel() <em>Maturity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaturityLevel()
	 * @generated
	 * @ordered
	 */
	protected String maturityLevel = MATURITY_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvaluates() <em>Evaluates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluates()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplianceItem> evaluates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.QUESTIONNAIRE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.QUESTIONNAIRE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.QUESTIONNAIRE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessArea() {
		return processArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessArea(String newProcessArea) {
		String oldProcessArea = processArea;
		processArea = newProcessArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.QUESTIONNAIRE__PROCESS_AREA, oldProcessArea, processArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaturityLevel() {
		return maturityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaturityLevel(String newMaturityLevel) {
		String oldMaturityLevel = maturityLevel;
		maturityLevel = newMaturityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.QUESTIONNAIRE__MATURITY_LEVEL, oldMaturityLevel, maturityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplianceItem> getEvaluates() {
		if (evaluates == null) {
			evaluates = new EObjectContainmentEList<ComplianceItem>(ComplianceItem.class, this, AssessmentPackage.QUESTIONNAIRE__EVALUATES);
		}
		return evaluates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.QUESTIONNAIRE__EVALUATES:
				return ((InternalEList<?>)getEvaluates()).basicRemove(otherEnd, msgs);
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
			case AssessmentPackage.QUESTIONNAIRE__NAME:
				return getName();
			case AssessmentPackage.QUESTIONNAIRE__DESCRIPTION:
				return getDescription();
			case AssessmentPackage.QUESTIONNAIRE__PROCESS_AREA:
				return getProcessArea();
			case AssessmentPackage.QUESTIONNAIRE__MATURITY_LEVEL:
				return getMaturityLevel();
			case AssessmentPackage.QUESTIONNAIRE__EVALUATES:
				return getEvaluates();
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
			case AssessmentPackage.QUESTIONNAIRE__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.QUESTIONNAIRE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AssessmentPackage.QUESTIONNAIRE__PROCESS_AREA:
				setProcessArea((String)newValue);
				return;
			case AssessmentPackage.QUESTIONNAIRE__MATURITY_LEVEL:
				setMaturityLevel((String)newValue);
				return;
			case AssessmentPackage.QUESTIONNAIRE__EVALUATES:
				getEvaluates().clear();
				getEvaluates().addAll((Collection<? extends ComplianceItem>)newValue);
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
			case AssessmentPackage.QUESTIONNAIRE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.QUESTIONNAIRE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AssessmentPackage.QUESTIONNAIRE__PROCESS_AREA:
				setProcessArea(PROCESS_AREA_EDEFAULT);
				return;
			case AssessmentPackage.QUESTIONNAIRE__MATURITY_LEVEL:
				setMaturityLevel(MATURITY_LEVEL_EDEFAULT);
				return;
			case AssessmentPackage.QUESTIONNAIRE__EVALUATES:
				getEvaluates().clear();
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
			case AssessmentPackage.QUESTIONNAIRE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.QUESTIONNAIRE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AssessmentPackage.QUESTIONNAIRE__PROCESS_AREA:
				return PROCESS_AREA_EDEFAULT == null ? processArea != null : !PROCESS_AREA_EDEFAULT.equals(processArea);
			case AssessmentPackage.QUESTIONNAIRE__MATURITY_LEVEL:
				return MATURITY_LEVEL_EDEFAULT == null ? maturityLevel != null : !MATURITY_LEVEL_EDEFAULT.equals(maturityLevel);
			case AssessmentPackage.QUESTIONNAIRE__EVALUATES:
				return evaluates != null && !evaluates.isEmpty();
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
		result.append(", processArea: ");
		result.append(processArea);
		result.append(", maturityLevel: ");
		result.append(maturityLevel);
		result.append(')');
		return result.toString();
	}

} //QuestionnaireImpl
