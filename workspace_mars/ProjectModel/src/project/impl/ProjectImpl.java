/**
 */
package project.impl;

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

import project.Goal;
import project.ProcessElementExecution;
import project.Project;
import project.ProjectFeedback;
import project.ProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link project.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link project.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link project.impl.ProjectImpl#getExpectedStartDate <em>Expected Start Date</em>}</li>
 *   <li>{@link project.impl.ProjectImpl#getExpectedEndDate <em>Expected End Date</em>}</li>
 *   <li>{@link project.impl.ProjectImpl#getEstimatedCost <em>Estimated Cost</em>}</li>
 *   <li>{@link project.impl.ProjectImpl#getEstimatedEffort <em>Estimated Effort</em>}</li>
 *   <li>{@link project.impl.ProjectImpl#getHasToSatisfy <em>Has To Satisfy</em>}</li>
 *   <li>{@link project.impl.ProjectImpl#getEvaluatesPerformance <em>Evaluates Performance</em>}</li>
 *   <li>{@link project.impl.ProjectImpl#getExecutes <em>Executes</em>}</li>
 *   <li>{@link project.impl.ProjectImpl#getRealStartDate <em>Real Start Date</em>}</li>
 *   <li>{@link project.impl.ProjectImpl#getRealEndDate <em>Real End Date</em>}</li>
 *   <li>{@link project.impl.ProjectImpl#getRealCost <em>Real Cost</em>}</li>
 *   <li>{@link project.impl.ProjectImpl#getRealEffort <em>Real Effort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
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
	 * The default value of the '{@link #getExpectedStartDate() <em>Expected Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPECTED_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectedStartDate() <em>Expected Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date expectedStartDate = EXPECTED_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectedEndDate() <em>Expected End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPECTED_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectedEndDate() <em>Expected End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date expectedEndDate = EXPECTED_END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedCost() <em>Estimated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedCost()
	 * @generated
	 * @ordered
	 */
	protected static final float ESTIMATED_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEstimatedCost() <em>Estimated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedCost()
	 * @generated
	 * @ordered
	 */
	protected float estimatedCost = ESTIMATED_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedEffort() <em>Estimated Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedEffort()
	 * @generated
	 * @ordered
	 */
	protected static final float ESTIMATED_EFFORT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEstimatedEffort() <em>Estimated Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedEffort()
	 * @generated
	 * @ordered
	 */
	protected float estimatedEffort = ESTIMATED_EFFORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasToSatisfy() <em>Has To Satisfy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasToSatisfy()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> hasToSatisfy;

	/**
	 * The cached value of the '{@link #getEvaluatesPerformance() <em>Evaluates Performance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluatesPerformance()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectFeedback> evaluatesPerformance;

	/**
	 * The cached value of the '{@link #getExecutes() <em>Executes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutes()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessElementExecution> executes;

	/**
	 * The default value of the '{@link #getRealStartDate() <em>Real Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REAL_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealStartDate() <em>Real Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date realStartDate = REAL_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRealEndDate() <em>Real End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REAL_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealEndDate() <em>Real End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date realEndDate = REAL_END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRealCost() <em>Real Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealCost()
	 * @generated
	 * @ordered
	 */
	protected static final float REAL_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRealCost() <em>Real Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealCost()
	 * @generated
	 * @ordered
	 */
	protected float realCost = REAL_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRealEffort() <em>Real Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealEffort()
	 * @generated
	 * @ordered
	 */
	protected static final float REAL_EFFORT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRealEffort() <em>Real Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealEffort()
	 * @generated
	 * @ordered
	 */
	protected float realEffort = REAL_EFFORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectPackage.Literals.PROJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExpectedStartDate() {
		return expectedStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedStartDate(Date newExpectedStartDate) {
		Date oldExpectedStartDate = expectedStartDate;
		expectedStartDate = newExpectedStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT__EXPECTED_START_DATE, oldExpectedStartDate, expectedStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExpectedEndDate() {
		return expectedEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedEndDate(Date newExpectedEndDate) {
		Date oldExpectedEndDate = expectedEndDate;
		expectedEndDate = newExpectedEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT__EXPECTED_END_DATE, oldExpectedEndDate, expectedEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEstimatedCost() {
		return estimatedCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedCost(float newEstimatedCost) {
		float oldEstimatedCost = estimatedCost;
		estimatedCost = newEstimatedCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT__ESTIMATED_COST, oldEstimatedCost, estimatedCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEstimatedEffort() {
		return estimatedEffort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedEffort(float newEstimatedEffort) {
		float oldEstimatedEffort = estimatedEffort;
		estimatedEffort = newEstimatedEffort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT__ESTIMATED_EFFORT, oldEstimatedEffort, estimatedEffort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getHasToSatisfy() {
		if (hasToSatisfy == null) {
			hasToSatisfy = new EObjectContainmentEList<Goal>(Goal.class, this, ProjectPackage.PROJECT__HAS_TO_SATISFY);
		}
		return hasToSatisfy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectFeedback> getEvaluatesPerformance() {
		if (evaluatesPerformance == null) {
			evaluatesPerformance = new EObjectContainmentEList<ProjectFeedback>(ProjectFeedback.class, this, ProjectPackage.PROJECT__EVALUATES_PERFORMANCE);
		}
		return evaluatesPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessElementExecution> getExecutes() {
		if (executes == null) {
			executes = new EObjectContainmentEList<ProcessElementExecution>(ProcessElementExecution.class, this, ProjectPackage.PROJECT__EXECUTES);
		}
		return executes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRealStartDate() {
		return realStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealStartDate(Date newRealStartDate) {
		Date oldRealStartDate = realStartDate;
		realStartDate = newRealStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT__REAL_START_DATE, oldRealStartDate, realStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRealEndDate() {
		return realEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealEndDate(Date newRealEndDate) {
		Date oldRealEndDate = realEndDate;
		realEndDate = newRealEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT__REAL_END_DATE, oldRealEndDate, realEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRealCost() {
		return realCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealCost(float newRealCost) {
		float oldRealCost = realCost;
		realCost = newRealCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT__REAL_COST, oldRealCost, realCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRealEffort() {
		return realEffort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealEffort(float newRealEffort) {
		float oldRealEffort = realEffort;
		realEffort = newRealEffort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT__REAL_EFFORT, oldRealEffort, realEffort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjectPackage.PROJECT__HAS_TO_SATISFY:
				return ((InternalEList<?>)getHasToSatisfy()).basicRemove(otherEnd, msgs);
			case ProjectPackage.PROJECT__EVALUATES_PERFORMANCE:
				return ((InternalEList<?>)getEvaluatesPerformance()).basicRemove(otherEnd, msgs);
			case ProjectPackage.PROJECT__EXECUTES:
				return ((InternalEList<?>)getExecutes()).basicRemove(otherEnd, msgs);
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
			case ProjectPackage.PROJECT__NAME:
				return getName();
			case ProjectPackage.PROJECT__DESCRIPTION:
				return getDescription();
			case ProjectPackage.PROJECT__EXPECTED_START_DATE:
				return getExpectedStartDate();
			case ProjectPackage.PROJECT__EXPECTED_END_DATE:
				return getExpectedEndDate();
			case ProjectPackage.PROJECT__ESTIMATED_COST:
				return getEstimatedCost();
			case ProjectPackage.PROJECT__ESTIMATED_EFFORT:
				return getEstimatedEffort();
			case ProjectPackage.PROJECT__HAS_TO_SATISFY:
				return getHasToSatisfy();
			case ProjectPackage.PROJECT__EVALUATES_PERFORMANCE:
				return getEvaluatesPerformance();
			case ProjectPackage.PROJECT__EXECUTES:
				return getExecutes();
			case ProjectPackage.PROJECT__REAL_START_DATE:
				return getRealStartDate();
			case ProjectPackage.PROJECT__REAL_END_DATE:
				return getRealEndDate();
			case ProjectPackage.PROJECT__REAL_COST:
				return getRealCost();
			case ProjectPackage.PROJECT__REAL_EFFORT:
				return getRealEffort();
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
			case ProjectPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case ProjectPackage.PROJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProjectPackage.PROJECT__EXPECTED_START_DATE:
				setExpectedStartDate((Date)newValue);
				return;
			case ProjectPackage.PROJECT__EXPECTED_END_DATE:
				setExpectedEndDate((Date)newValue);
				return;
			case ProjectPackage.PROJECT__ESTIMATED_COST:
				setEstimatedCost((Float)newValue);
				return;
			case ProjectPackage.PROJECT__ESTIMATED_EFFORT:
				setEstimatedEffort((Float)newValue);
				return;
			case ProjectPackage.PROJECT__HAS_TO_SATISFY:
				getHasToSatisfy().clear();
				getHasToSatisfy().addAll((Collection<? extends Goal>)newValue);
				return;
			case ProjectPackage.PROJECT__EVALUATES_PERFORMANCE:
				getEvaluatesPerformance().clear();
				getEvaluatesPerformance().addAll((Collection<? extends ProjectFeedback>)newValue);
				return;
			case ProjectPackage.PROJECT__EXECUTES:
				getExecutes().clear();
				getExecutes().addAll((Collection<? extends ProcessElementExecution>)newValue);
				return;
			case ProjectPackage.PROJECT__REAL_START_DATE:
				setRealStartDate((Date)newValue);
				return;
			case ProjectPackage.PROJECT__REAL_END_DATE:
				setRealEndDate((Date)newValue);
				return;
			case ProjectPackage.PROJECT__REAL_COST:
				setRealCost((Float)newValue);
				return;
			case ProjectPackage.PROJECT__REAL_EFFORT:
				setRealEffort((Float)newValue);
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
			case ProjectPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProjectPackage.PROJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProjectPackage.PROJECT__EXPECTED_START_DATE:
				setExpectedStartDate(EXPECTED_START_DATE_EDEFAULT);
				return;
			case ProjectPackage.PROJECT__EXPECTED_END_DATE:
				setExpectedEndDate(EXPECTED_END_DATE_EDEFAULT);
				return;
			case ProjectPackage.PROJECT__ESTIMATED_COST:
				setEstimatedCost(ESTIMATED_COST_EDEFAULT);
				return;
			case ProjectPackage.PROJECT__ESTIMATED_EFFORT:
				setEstimatedEffort(ESTIMATED_EFFORT_EDEFAULT);
				return;
			case ProjectPackage.PROJECT__HAS_TO_SATISFY:
				getHasToSatisfy().clear();
				return;
			case ProjectPackage.PROJECT__EVALUATES_PERFORMANCE:
				getEvaluatesPerformance().clear();
				return;
			case ProjectPackage.PROJECT__EXECUTES:
				getExecutes().clear();
				return;
			case ProjectPackage.PROJECT__REAL_START_DATE:
				setRealStartDate(REAL_START_DATE_EDEFAULT);
				return;
			case ProjectPackage.PROJECT__REAL_END_DATE:
				setRealEndDate(REAL_END_DATE_EDEFAULT);
				return;
			case ProjectPackage.PROJECT__REAL_COST:
				setRealCost(REAL_COST_EDEFAULT);
				return;
			case ProjectPackage.PROJECT__REAL_EFFORT:
				setRealEffort(REAL_EFFORT_EDEFAULT);
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
			case ProjectPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProjectPackage.PROJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProjectPackage.PROJECT__EXPECTED_START_DATE:
				return EXPECTED_START_DATE_EDEFAULT == null ? expectedStartDate != null : !EXPECTED_START_DATE_EDEFAULT.equals(expectedStartDate);
			case ProjectPackage.PROJECT__EXPECTED_END_DATE:
				return EXPECTED_END_DATE_EDEFAULT == null ? expectedEndDate != null : !EXPECTED_END_DATE_EDEFAULT.equals(expectedEndDate);
			case ProjectPackage.PROJECT__ESTIMATED_COST:
				return estimatedCost != ESTIMATED_COST_EDEFAULT;
			case ProjectPackage.PROJECT__ESTIMATED_EFFORT:
				return estimatedEffort != ESTIMATED_EFFORT_EDEFAULT;
			case ProjectPackage.PROJECT__HAS_TO_SATISFY:
				return hasToSatisfy != null && !hasToSatisfy.isEmpty();
			case ProjectPackage.PROJECT__EVALUATES_PERFORMANCE:
				return evaluatesPerformance != null && !evaluatesPerformance.isEmpty();
			case ProjectPackage.PROJECT__EXECUTES:
				return executes != null && !executes.isEmpty();
			case ProjectPackage.PROJECT__REAL_START_DATE:
				return REAL_START_DATE_EDEFAULT == null ? realStartDate != null : !REAL_START_DATE_EDEFAULT.equals(realStartDate);
			case ProjectPackage.PROJECT__REAL_END_DATE:
				return REAL_END_DATE_EDEFAULT == null ? realEndDate != null : !REAL_END_DATE_EDEFAULT.equals(realEndDate);
			case ProjectPackage.PROJECT__REAL_COST:
				return realCost != REAL_COST_EDEFAULT;
			case ProjectPackage.PROJECT__REAL_EFFORT:
				return realEffort != REAL_EFFORT_EDEFAULT;
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
		result.append(", expectedStartDate: ");
		result.append(expectedStartDate);
		result.append(", expectedEndDate: ");
		result.append(expectedEndDate);
		result.append(", estimatedCost: ");
		result.append(estimatedCost);
		result.append(", estimatedEffort: ");
		result.append(estimatedEffort);
		result.append(", realStartDate: ");
		result.append(realStartDate);
		result.append(", realEndDate: ");
		result.append(realEndDate);
		result.append(", realCost: ");
		result.append(realCost);
		result.append(", realEffort: ");
		result.append(realEffort);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
