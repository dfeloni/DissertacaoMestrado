/**
 */
package report.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import report.ReportItem;
import report.ReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link report.impl.ReportItemImpl#getComplianceItemEvaluated <em>Compliance Item Evaluated</em>}</li>
 *   <li>{@link report.impl.ReportItemImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link report.impl.ReportItemImpl#getUserAnswer <em>User Answer</em>}</li>
 *   <li>{@link report.impl.ReportItemImpl#getComplianceLevel <em>Compliance Level</em>}</li>
 *   <li>{@link report.impl.ReportItemImpl#getItemDescription <em>Item Description</em>}</li>
 *   <li>{@link report.impl.ReportItemImpl#getEvaluationDescription <em>Evaluation Description</em>}</li>
 *   <li>{@link report.impl.ReportItemImpl#getEvaluationResult <em>Evaluation Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportItemImpl extends MinimalEObjectImpl.Container implements ReportItem {
	/**
	 * The default value of the '{@link #getComplianceItemEvaluated() <em>Compliance Item Evaluated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceItemEvaluated()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLIANCE_ITEM_EVALUATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplianceItemEvaluated() <em>Compliance Item Evaluated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceItemEvaluated()
	 * @generated
	 * @ordered
	 */
	protected String complianceItemEvaluated = COMPLIANCE_ITEM_EVALUATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected String question = QUESTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserAnswer() <em>User Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAnswer()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ANSWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserAnswer() <em>User Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAnswer()
	 * @generated
	 * @ordered
	 */
	protected String userAnswer = USER_ANSWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getComplianceLevel() <em>Compliance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLIANCE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplianceLevel() <em>Compliance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceLevel()
	 * @generated
	 * @ordered
	 */
	protected String complianceLevel = COMPLIANCE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemDescription() <em>Item Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemDescription() <em>Item Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDescription()
	 * @generated
	 * @ordered
	 */
	protected String itemDescription = ITEM_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvaluationDescription() <em>Evaluation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String EVALUATION_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvaluationDescription() <em>Evaluation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationDescription()
	 * @generated
	 * @ordered
	 */
	protected String evaluationDescription = EVALUATION_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvaluationResult() <em>Evaluation Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationResult()
	 * @generated
	 * @ordered
	 */
	protected static final String EVALUATION_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvaluationResult() <em>Evaluation Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationResult()
	 * @generated
	 * @ordered
	 */
	protected String evaluationResult = EVALUATION_RESULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportPackage.Literals.REPORT_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplianceItemEvaluated() {
		return complianceItemEvaluated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplianceItemEvaluated(String newComplianceItemEvaluated) {
		String oldComplianceItemEvaluated = complianceItemEvaluated;
		complianceItemEvaluated = newComplianceItemEvaluated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT_ITEM__COMPLIANCE_ITEM_EVALUATED, oldComplianceItemEvaluated, complianceItemEvaluated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(String newQuestion) {
		String oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT_ITEM__QUESTION, oldQuestion, question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserAnswer() {
		return userAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserAnswer(String newUserAnswer) {
		String oldUserAnswer = userAnswer;
		userAnswer = newUserAnswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT_ITEM__USER_ANSWER, oldUserAnswer, userAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplianceLevel() {
		return complianceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplianceLevel(String newComplianceLevel) {
		String oldComplianceLevel = complianceLevel;
		complianceLevel = newComplianceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT_ITEM__COMPLIANCE_LEVEL, oldComplianceLevel, complianceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemDescription() {
		return itemDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemDescription(String newItemDescription) {
		String oldItemDescription = itemDescription;
		itemDescription = newItemDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT_ITEM__ITEM_DESCRIPTION, oldItemDescription, itemDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvaluationDescription() {
		return evaluationDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationDescription(String newEvaluationDescription) {
		String oldEvaluationDescription = evaluationDescription;
		evaluationDescription = newEvaluationDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT_ITEM__EVALUATION_DESCRIPTION, oldEvaluationDescription, evaluationDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvaluationResult() {
		return evaluationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationResult(String newEvaluationResult) {
		String oldEvaluationResult = evaluationResult;
		evaluationResult = newEvaluationResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REPORT_ITEM__EVALUATION_RESULT, oldEvaluationResult, evaluationResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.REPORT_ITEM__COMPLIANCE_ITEM_EVALUATED:
				return getComplianceItemEvaluated();
			case ReportPackage.REPORT_ITEM__QUESTION:
				return getQuestion();
			case ReportPackage.REPORT_ITEM__USER_ANSWER:
				return getUserAnswer();
			case ReportPackage.REPORT_ITEM__COMPLIANCE_LEVEL:
				return getComplianceLevel();
			case ReportPackage.REPORT_ITEM__ITEM_DESCRIPTION:
				return getItemDescription();
			case ReportPackage.REPORT_ITEM__EVALUATION_DESCRIPTION:
				return getEvaluationDescription();
			case ReportPackage.REPORT_ITEM__EVALUATION_RESULT:
				return getEvaluationResult();
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
			case ReportPackage.REPORT_ITEM__COMPLIANCE_ITEM_EVALUATED:
				setComplianceItemEvaluated((String)newValue);
				return;
			case ReportPackage.REPORT_ITEM__QUESTION:
				setQuestion((String)newValue);
				return;
			case ReportPackage.REPORT_ITEM__USER_ANSWER:
				setUserAnswer((String)newValue);
				return;
			case ReportPackage.REPORT_ITEM__COMPLIANCE_LEVEL:
				setComplianceLevel((String)newValue);
				return;
			case ReportPackage.REPORT_ITEM__ITEM_DESCRIPTION:
				setItemDescription((String)newValue);
				return;
			case ReportPackage.REPORT_ITEM__EVALUATION_DESCRIPTION:
				setEvaluationDescription((String)newValue);
				return;
			case ReportPackage.REPORT_ITEM__EVALUATION_RESULT:
				setEvaluationResult((String)newValue);
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
			case ReportPackage.REPORT_ITEM__COMPLIANCE_ITEM_EVALUATED:
				setComplianceItemEvaluated(COMPLIANCE_ITEM_EVALUATED_EDEFAULT);
				return;
			case ReportPackage.REPORT_ITEM__QUESTION:
				setQuestion(QUESTION_EDEFAULT);
				return;
			case ReportPackage.REPORT_ITEM__USER_ANSWER:
				setUserAnswer(USER_ANSWER_EDEFAULT);
				return;
			case ReportPackage.REPORT_ITEM__COMPLIANCE_LEVEL:
				setComplianceLevel(COMPLIANCE_LEVEL_EDEFAULT);
				return;
			case ReportPackage.REPORT_ITEM__ITEM_DESCRIPTION:
				setItemDescription(ITEM_DESCRIPTION_EDEFAULT);
				return;
			case ReportPackage.REPORT_ITEM__EVALUATION_DESCRIPTION:
				setEvaluationDescription(EVALUATION_DESCRIPTION_EDEFAULT);
				return;
			case ReportPackage.REPORT_ITEM__EVALUATION_RESULT:
				setEvaluationResult(EVALUATION_RESULT_EDEFAULT);
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
			case ReportPackage.REPORT_ITEM__COMPLIANCE_ITEM_EVALUATED:
				return COMPLIANCE_ITEM_EVALUATED_EDEFAULT == null ? complianceItemEvaluated != null : !COMPLIANCE_ITEM_EVALUATED_EDEFAULT.equals(complianceItemEvaluated);
			case ReportPackage.REPORT_ITEM__QUESTION:
				return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
			case ReportPackage.REPORT_ITEM__USER_ANSWER:
				return USER_ANSWER_EDEFAULT == null ? userAnswer != null : !USER_ANSWER_EDEFAULT.equals(userAnswer);
			case ReportPackage.REPORT_ITEM__COMPLIANCE_LEVEL:
				return COMPLIANCE_LEVEL_EDEFAULT == null ? complianceLevel != null : !COMPLIANCE_LEVEL_EDEFAULT.equals(complianceLevel);
			case ReportPackage.REPORT_ITEM__ITEM_DESCRIPTION:
				return ITEM_DESCRIPTION_EDEFAULT == null ? itemDescription != null : !ITEM_DESCRIPTION_EDEFAULT.equals(itemDescription);
			case ReportPackage.REPORT_ITEM__EVALUATION_DESCRIPTION:
				return EVALUATION_DESCRIPTION_EDEFAULT == null ? evaluationDescription != null : !EVALUATION_DESCRIPTION_EDEFAULT.equals(evaluationDescription);
			case ReportPackage.REPORT_ITEM__EVALUATION_RESULT:
				return EVALUATION_RESULT_EDEFAULT == null ? evaluationResult != null : !EVALUATION_RESULT_EDEFAULT.equals(evaluationResult);
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
		result.append(" (complianceItemEvaluated: ");
		result.append(complianceItemEvaluated);
		result.append(", question: ");
		result.append(question);
		result.append(", userAnswer: ");
		result.append(userAnswer);
		result.append(", complianceLevel: ");
		result.append(complianceLevel);
		result.append(", itemDescription: ");
		result.append(itemDescription);
		result.append(", evaluationDescription: ");
		result.append(evaluationDescription);
		result.append(", evaluationResult: ");
		result.append(evaluationResult);
		result.append(')');
		return result.toString();
	}

} //ReportItemImpl
