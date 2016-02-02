/**
 */
package report.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import report.Report;
import report.ReportItem;
import report.ReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link report.impl.ReportImpl#getDate <em>Date</em>}</li>
 *   <li>{@link report.impl.ReportImpl#getEvaluationType <em>Evaluation Type</em>}</li>
 *   <li>{@link report.impl.ReportImpl#getMaturityModel <em>Maturity Model</em>}</li>
 *   <li>{@link report.impl.ReportImpl#getMaturityLevel <em>Maturity Level</em>}</li>
 *   <li>{@link report.impl.ReportImpl#getProcessArea <em>Process Area</em>}</li>
 *   <li>{@link report.impl.ReportImpl#getProcessInstance <em>Process Instance</em>}</li>
 *   <li>{@link report.impl.ReportImpl#getDetailedBy <em>Detailed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportImpl extends MinimalEObjectImpl.Container implements Report {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvaluationType() <em>Evaluation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationType()
	 * @generated
	 * @ordered
	 */
	protected static final String EVALUATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvaluationType() <em>Evaluation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationType()
	 * @generated
	 * @ordered
	 */
	protected String evaluationType = EVALUATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaturityModel() <em>Maturity Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaturityModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MATURITY_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaturityModel() <em>Maturity Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaturityModel()
	 * @generated
	 * @ordered
	 */
	protected String maturityModel = MATURITY_MODEL_EDEFAULT;

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
	 * The default value of the '{@link #getProcessInstance() <em>Process Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessInstance()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessInstance() <em>Process Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessInstance()
	 * @generated
	 * @ordered
	 */
	protected String processInstance = PROCESS_INSTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetailedBy() <em>Detailed By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportItem> detailedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportPackage.Literals.REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvaluationType() {
		return evaluationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationType(String newEvaluationType) {
		String oldEvaluationType = evaluationType;
		evaluationType = newEvaluationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT__EVALUATION_TYPE, oldEvaluationType, evaluationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaturityModel() {
		return maturityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaturityModel(String newMaturityModel) {
		String oldMaturityModel = maturityModel;
		maturityModel = newMaturityModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT__MATURITY_MODEL, oldMaturityModel, maturityModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT__MATURITY_LEVEL, oldMaturityLevel, maturityLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT__PROCESS_AREA, oldProcessArea, processArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessInstance() {
		return processInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessInstance(String newProcessInstance) {
		String oldProcessInstance = processInstance;
		processInstance = newProcessInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT__PROCESS_INSTANCE, oldProcessInstance, processInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportItem> getDetailedBy() {
		if (detailedBy == null) {
			detailedBy = new EObjectContainmentEList<ReportItem>(ReportItem.class, this, ReportPackage.REPORT__DETAILED_BY);
		}
		return detailedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportPackage.REPORT__DETAILED_BY:
				return ((InternalEList<?>)getDetailedBy()).basicRemove(otherEnd, msgs);
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
			case ReportPackage.REPORT__DATE:
				return getDate();
			case ReportPackage.REPORT__EVALUATION_TYPE:
				return getEvaluationType();
			case ReportPackage.REPORT__MATURITY_MODEL:
				return getMaturityModel();
			case ReportPackage.REPORT__MATURITY_LEVEL:
				return getMaturityLevel();
			case ReportPackage.REPORT__PROCESS_AREA:
				return getProcessArea();
			case ReportPackage.REPORT__PROCESS_INSTANCE:
				return getProcessInstance();
			case ReportPackage.REPORT__DETAILED_BY:
				return getDetailedBy();
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
			case ReportPackage.REPORT__DATE:
				setDate((Date)newValue);
				return;
			case ReportPackage.REPORT__EVALUATION_TYPE:
				setEvaluationType((String)newValue);
				return;
			case ReportPackage.REPORT__MATURITY_MODEL:
				setMaturityModel((String)newValue);
				return;
			case ReportPackage.REPORT__MATURITY_LEVEL:
				setMaturityLevel((String)newValue);
				return;
			case ReportPackage.REPORT__PROCESS_AREA:
				setProcessArea((String)newValue);
				return;
			case ReportPackage.REPORT__PROCESS_INSTANCE:
				setProcessInstance((String)newValue);
				return;
			case ReportPackage.REPORT__DETAILED_BY:
				getDetailedBy().clear();
				getDetailedBy().addAll((Collection<? extends ReportItem>)newValue);
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
			case ReportPackage.REPORT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ReportPackage.REPORT__EVALUATION_TYPE:
				setEvaluationType(EVALUATION_TYPE_EDEFAULT);
				return;
			case ReportPackage.REPORT__MATURITY_MODEL:
				setMaturityModel(MATURITY_MODEL_EDEFAULT);
				return;
			case ReportPackage.REPORT__MATURITY_LEVEL:
				setMaturityLevel(MATURITY_LEVEL_EDEFAULT);
				return;
			case ReportPackage.REPORT__PROCESS_AREA:
				setProcessArea(PROCESS_AREA_EDEFAULT);
				return;
			case ReportPackage.REPORT__PROCESS_INSTANCE:
				setProcessInstance(PROCESS_INSTANCE_EDEFAULT);
				return;
			case ReportPackage.REPORT__DETAILED_BY:
				getDetailedBy().clear();
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
			case ReportPackage.REPORT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ReportPackage.REPORT__EVALUATION_TYPE:
				return EVALUATION_TYPE_EDEFAULT == null ? evaluationType != null : !EVALUATION_TYPE_EDEFAULT.equals(evaluationType);
			case ReportPackage.REPORT__MATURITY_MODEL:
				return MATURITY_MODEL_EDEFAULT == null ? maturityModel != null : !MATURITY_MODEL_EDEFAULT.equals(maturityModel);
			case ReportPackage.REPORT__MATURITY_LEVEL:
				return MATURITY_LEVEL_EDEFAULT == null ? maturityLevel != null : !MATURITY_LEVEL_EDEFAULT.equals(maturityLevel);
			case ReportPackage.REPORT__PROCESS_AREA:
				return PROCESS_AREA_EDEFAULT == null ? processArea != null : !PROCESS_AREA_EDEFAULT.equals(processArea);
			case ReportPackage.REPORT__PROCESS_INSTANCE:
				return PROCESS_INSTANCE_EDEFAULT == null ? processInstance != null : !PROCESS_INSTANCE_EDEFAULT.equals(processInstance);
			case ReportPackage.REPORT__DETAILED_BY:
				return detailedBy != null && !detailedBy.isEmpty();
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
		result.append(" (date: ");
		result.append(date);
		result.append(", evaluationType: ");
		result.append(evaluationType);
		result.append(", maturityModel: ");
		result.append(maturityModel);
		result.append(", maturityLevel: ");
		result.append(maturityLevel);
		result.append(", processArea: ");
		result.append(processArea);
		result.append(", processInstance: ");
		result.append(processInstance);
		result.append(')');
		return result.toString();
	}

} //ReportImpl
