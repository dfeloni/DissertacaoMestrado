/**
 */
package assessment.impl;

import assessment.AssessmentPackage;
import assessment.ScriptTemplate;
import assessment.ScriptType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assessment.impl.ScriptTemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link assessment.impl.ScriptTemplateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link assessment.impl.ScriptTemplateImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link assessment.impl.ScriptTemplateImpl#getScriptType <em>Script Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptTemplateImpl extends MinimalEObjectImpl.Container implements ScriptTemplate {
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
	 * The default value of the '{@link #getTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected String template = TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScriptType() <em>Script Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptType()
	 * @generated
	 * @ordered
	 */
	protected static final ScriptType SCRIPT_TYPE_EDEFAULT = ScriptType.MODEL_TO_MODEL;

	/**
	 * The cached value of the '{@link #getScriptType() <em>Script Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptType()
	 * @generated
	 * @ordered
	 */
	protected ScriptType scriptType = SCRIPT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.SCRIPT_TEMPLATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SCRIPT_TEMPLATE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SCRIPT_TEMPLATE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(String newTemplate) {
		String oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SCRIPT_TEMPLATE__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptType getScriptType() {
		return scriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptType(ScriptType newScriptType) {
		ScriptType oldScriptType = scriptType;
		scriptType = newScriptType == null ? SCRIPT_TYPE_EDEFAULT : newScriptType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SCRIPT_TEMPLATE__SCRIPT_TYPE, oldScriptType, scriptType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssessmentPackage.SCRIPT_TEMPLATE__NAME:
				return getName();
			case AssessmentPackage.SCRIPT_TEMPLATE__DESCRIPTION:
				return getDescription();
			case AssessmentPackage.SCRIPT_TEMPLATE__TEMPLATE:
				return getTemplate();
			case AssessmentPackage.SCRIPT_TEMPLATE__SCRIPT_TYPE:
				return getScriptType();
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
			case AssessmentPackage.SCRIPT_TEMPLATE__NAME:
				setName((String)newValue);
				return;
			case AssessmentPackage.SCRIPT_TEMPLATE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AssessmentPackage.SCRIPT_TEMPLATE__TEMPLATE:
				setTemplate((String)newValue);
				return;
			case AssessmentPackage.SCRIPT_TEMPLATE__SCRIPT_TYPE:
				setScriptType((ScriptType)newValue);
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
			case AssessmentPackage.SCRIPT_TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssessmentPackage.SCRIPT_TEMPLATE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AssessmentPackage.SCRIPT_TEMPLATE__TEMPLATE:
				setTemplate(TEMPLATE_EDEFAULT);
				return;
			case AssessmentPackage.SCRIPT_TEMPLATE__SCRIPT_TYPE:
				setScriptType(SCRIPT_TYPE_EDEFAULT);
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
			case AssessmentPackage.SCRIPT_TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssessmentPackage.SCRIPT_TEMPLATE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AssessmentPackage.SCRIPT_TEMPLATE__TEMPLATE:
				return TEMPLATE_EDEFAULT == null ? template != null : !TEMPLATE_EDEFAULT.equals(template);
			case AssessmentPackage.SCRIPT_TEMPLATE__SCRIPT_TYPE:
				return scriptType != SCRIPT_TYPE_EDEFAULT;
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
		result.append(", template: ");
		result.append(template);
		result.append(", scriptType: ");
		result.append(scriptType);
		result.append(')');
		return result.toString();
	}

} //ScriptTemplateImpl
