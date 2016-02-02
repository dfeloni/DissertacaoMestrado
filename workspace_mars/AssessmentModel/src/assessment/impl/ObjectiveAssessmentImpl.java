/**
 */
package assessment.impl;

import assessment.AssessmentPackage;
import assessment.ObjectiveAssessment;
import assessment.ScriptTemplate;

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
 * An implementation of the model object '<em><b>Objective Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assessment.impl.ObjectiveAssessmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link assessment.impl.ObjectiveAssessmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link assessment.impl.ObjectiveAssessmentImpl#getDefinesEvaluationRules <em>Defines Evaluation Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveAssessmentImpl extends MinimalEObjectImpl.Container implements ObjectiveAssessment {
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
	 * The cached value of the '{@link #getDefinesEvaluationRules() <em>Defines Evaluation Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinesEvaluationRules()
	 * @generated
	 * @ordered
	 */
	protected EList<ScriptTemplate> definesEvaluationRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.OBJECTIVE_ASSESSMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.OBJECTIVE_ASSESSMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.OBJECTIVE_ASSESSMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptTemplate> getDefinesEvaluationRules() {
		if (definesEvaluationRules == null) {
			definesEvaluationRules = new EObjectContainmentEList<ScriptTemplate>(ScriptTemplate.class, this, AssessmentPackage.OBJECTIVE_ASSESSMENT__DEFINES_EVALUATION_RULES);
		}
		return definesEvaluationRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.OBJECTIVE_ASSESSMENT__DEFINES_EVALUATION_RULES:
				return ((InternalEList<?>)getDefinesEvaluationRules()).basicRemove(otherEnd, msgs);
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
			case AssessmentPackage.OBJECTIVE_ASSESSMENT__NAME:
				return getName();
			case AssessmentPackage.OBJECTIVE_ASSESSMENT__DESCRIPTION:
				return getDescription();
			case AssessmentPackage.OBJECTIVE_ASSESSMENT__DEFINES_EVALUATION_RULES:
				return getDefinesEvaluationRules();
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
			case AssessmentPackage.OBJECTIVE_ASSESSMENT__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.OBJECTIVE_ASSESSMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AssessmentPackage.OBJECTIVE_ASSESSMENT__DEFINES_EVALUATION_RULES:
				getDefinesEvaluationRules().clear();
				getDefinesEvaluationRules().addAll((Collection<? extends ScriptTemplate>)newValue);
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
			case AssessmentPackage.OBJECTIVE_ASSESSMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.OBJECTIVE_ASSESSMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AssessmentPackage.OBJECTIVE_ASSESSMENT__DEFINES_EVALUATION_RULES:
				getDefinesEvaluationRules().clear();
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
			case AssessmentPackage.OBJECTIVE_ASSESSMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.OBJECTIVE_ASSESSMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AssessmentPackage.OBJECTIVE_ASSESSMENT__DEFINES_EVALUATION_RULES:
				return definesEvaluationRules != null && !definesEvaluationRules.isEmpty();
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

} //ObjectiveAssessmentImpl
