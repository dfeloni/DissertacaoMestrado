/**
 */
package structureAndBehavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import structureAndBehavior.EvidenceType;
import structureAndBehavior.StructureAndBehaviorPackage;
import structureAndBehavior.Tool;
import structureAndBehavior.WorkProduct;
import structureAndBehavior.WorkProductType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehavior.impl.WorkProductImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link structureAndBehavior.impl.WorkProductImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link structureAndBehavior.impl.WorkProductImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link structureAndBehavior.impl.WorkProductImpl#getWorkProductType <em>Work Product Type</em>}</li>
 *   <li>{@link structureAndBehavior.impl.WorkProductImpl#getEvidenceType <em>Evidence Type</em>}</li>
 *   <li>{@link structureAndBehavior.impl.WorkProductImpl#getCreatedOn <em>Created On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkProductImpl extends ElementImpl implements WorkProduct {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getWorkProductType() <em>Work Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkProductType()
	 * @generated
	 * @ordered
	 */
	protected static final WorkProductType WORK_PRODUCT_TYPE_EDEFAULT = WorkProductType.INPUT;

	/**
	 * The cached value of the '{@link #getWorkProductType() <em>Work Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkProductType()
	 * @generated
	 * @ordered
	 */
	protected WorkProductType workProductType = WORK_PRODUCT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvidenceType() <em>Evidence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidenceType()
	 * @generated
	 * @ordered
	 */
	protected static final EvidenceType EVIDENCE_TYPE_EDEFAULT = EvidenceType.INDIRECT_EVIDENCE;

	/**
	 * The cached value of the '{@link #getEvidenceType() <em>Evidence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidenceType()
	 * @generated
	 * @ordered
	 */
	protected EvidenceType evidenceType = EVIDENCE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreatedOn() <em>Created On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> createdOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureAndBehaviorPackage.Literals.WORK_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.WORK_PRODUCT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.WORK_PRODUCT__FILE_NAME, oldFileName, fileName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.WORK_PRODUCT__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductType getWorkProductType() {
		return workProductType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkProductType(WorkProductType newWorkProductType) {
		WorkProductType oldWorkProductType = workProductType;
		workProductType = newWorkProductType == null ? WORK_PRODUCT_TYPE_EDEFAULT : newWorkProductType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE, oldWorkProductType, workProductType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tool> getCreatedOn() {
		if (createdOn == null) {
			createdOn = new EObjectContainmentEList<Tool>(Tool.class, this, StructureAndBehaviorPackage.WORK_PRODUCT__CREATED_ON);
		}
		return createdOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructureAndBehaviorPackage.WORK_PRODUCT__CREATED_ON:
				return ((InternalEList<?>)getCreatedOn()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceType getEvidenceType() {
		return evidenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvidenceType(EvidenceType newEvidenceType) {
		EvidenceType oldEvidenceType = evidenceType;
		evidenceType = newEvidenceType == null ? EVIDENCE_TYPE_EDEFAULT : newEvidenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.WORK_PRODUCT__EVIDENCE_TYPE, oldEvidenceType, evidenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructureAndBehaviorPackage.WORK_PRODUCT__URL:
				return getUrl();
			case StructureAndBehaviorPackage.WORK_PRODUCT__FILE_NAME:
				return getFileName();
			case StructureAndBehaviorPackage.WORK_PRODUCT__TEMPLATE:
				return getTemplate();
			case StructureAndBehaviorPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				return getWorkProductType();
			case StructureAndBehaviorPackage.WORK_PRODUCT__EVIDENCE_TYPE:
				return getEvidenceType();
			case StructureAndBehaviorPackage.WORK_PRODUCT__CREATED_ON:
				return getCreatedOn();
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
			case StructureAndBehaviorPackage.WORK_PRODUCT__URL:
				setUrl((String)newValue);
				return;
			case StructureAndBehaviorPackage.WORK_PRODUCT__FILE_NAME:
				setFileName((String)newValue);
				return;
			case StructureAndBehaviorPackage.WORK_PRODUCT__TEMPLATE:
				setTemplate((String)newValue);
				return;
			case StructureAndBehaviorPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				setWorkProductType((WorkProductType)newValue);
				return;
			case StructureAndBehaviorPackage.WORK_PRODUCT__EVIDENCE_TYPE:
				setEvidenceType((EvidenceType)newValue);
				return;
			case StructureAndBehaviorPackage.WORK_PRODUCT__CREATED_ON:
				getCreatedOn().clear();
				getCreatedOn().addAll((Collection<? extends Tool>)newValue);
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
			case StructureAndBehaviorPackage.WORK_PRODUCT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case StructureAndBehaviorPackage.WORK_PRODUCT__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case StructureAndBehaviorPackage.WORK_PRODUCT__TEMPLATE:
				setTemplate(TEMPLATE_EDEFAULT);
				return;
			case StructureAndBehaviorPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				setWorkProductType(WORK_PRODUCT_TYPE_EDEFAULT);
				return;
			case StructureAndBehaviorPackage.WORK_PRODUCT__EVIDENCE_TYPE:
				setEvidenceType(EVIDENCE_TYPE_EDEFAULT);
				return;
			case StructureAndBehaviorPackage.WORK_PRODUCT__CREATED_ON:
				getCreatedOn().clear();
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
			case StructureAndBehaviorPackage.WORK_PRODUCT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case StructureAndBehaviorPackage.WORK_PRODUCT__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case StructureAndBehaviorPackage.WORK_PRODUCT__TEMPLATE:
				return TEMPLATE_EDEFAULT == null ? template != null : !TEMPLATE_EDEFAULT.equals(template);
			case StructureAndBehaviorPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				return workProductType != WORK_PRODUCT_TYPE_EDEFAULT;
			case StructureAndBehaviorPackage.WORK_PRODUCT__EVIDENCE_TYPE:
				return evidenceType != EVIDENCE_TYPE_EDEFAULT;
			case StructureAndBehaviorPackage.WORK_PRODUCT__CREATED_ON:
				return createdOn != null && !createdOn.isEmpty();
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
		result.append(" (url: ");
		result.append(url);
		result.append(", fileName: ");
		result.append(fileName);
		result.append(", template: ");
		result.append(template);
		result.append(", workProductType: ");
		result.append(workProductType);
		result.append(", evidenceType: ");
		result.append(evidenceType);
		result.append(')');
		return result.toString();
	}

} //WorkProductImpl
