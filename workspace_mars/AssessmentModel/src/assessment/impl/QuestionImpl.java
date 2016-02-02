/**
 */
package assessment.impl;

import assessment.AnswerOption;
import assessment.AssessmentPackage;
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
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assessment.impl.QuestionImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link assessment.impl.QuestionImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link assessment.impl.QuestionImpl#getEvaluatesBy <em>Evaluates By</em>}</li>
 *   <li>{@link assessment.impl.QuestionImpl#getUserAnswer <em>User Answer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
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
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final float WEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected float weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvaluatesBy() <em>Evaluates By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluatesBy()
	 * @generated
	 * @ordered
	 */
	protected EList<AnswerOption> evaluatesBy;

	/**
	 * The cached value of the '{@link #getUserAnswer() <em>User Answer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAnswer()
	 * @generated
	 * @ordered
	 */
	protected AnswerOption userAnswer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.QUESTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.QUESTION__QUESTION, oldQuestion, question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(float newWeight) {
		float oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.QUESTION__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnswerOption> getEvaluatesBy() {
		if (evaluatesBy == null) {
			evaluatesBy = new EObjectContainmentEList<AnswerOption>(AnswerOption.class, this, AssessmentPackage.QUESTION__EVALUATES_BY);
		}
		return evaluatesBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerOption getUserAnswer() {
		if (userAnswer != null && userAnswer.eIsProxy()) {
			InternalEObject oldUserAnswer = (InternalEObject)userAnswer;
			userAnswer = (AnswerOption)eResolveProxy(oldUserAnswer);
			if (userAnswer != oldUserAnswer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssessmentPackage.QUESTION__USER_ANSWER, oldUserAnswer, userAnswer));
			}
		}
		return userAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerOption basicGetUserAnswer() {
		return userAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserAnswer(AnswerOption newUserAnswer) {
		AnswerOption oldUserAnswer = userAnswer;
		userAnswer = newUserAnswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.QUESTION__USER_ANSWER, oldUserAnswer, userAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.QUESTION__EVALUATES_BY:
				return ((InternalEList<?>)getEvaluatesBy()).basicRemove(otherEnd, msgs);
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
			case AssessmentPackage.QUESTION__QUESTION:
				return getQuestion();
			case AssessmentPackage.QUESTION__WEIGHT:
				return getWeight();
			case AssessmentPackage.QUESTION__EVALUATES_BY:
				return getEvaluatesBy();
			case AssessmentPackage.QUESTION__USER_ANSWER:
				if (resolve) return getUserAnswer();
				return basicGetUserAnswer();
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
			case AssessmentPackage.QUESTION__QUESTION:
				setQuestion((String)newValue);
				return;
			case AssessmentPackage.QUESTION__WEIGHT:
				setWeight((Float)newValue);
				return;
			case AssessmentPackage.QUESTION__EVALUATES_BY:
				getEvaluatesBy().clear();
				getEvaluatesBy().addAll((Collection<? extends AnswerOption>)newValue);
				return;
			case AssessmentPackage.QUESTION__USER_ANSWER:
				setUserAnswer((AnswerOption)newValue);
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
			case AssessmentPackage.QUESTION__QUESTION:
				setQuestion(QUESTION_EDEFAULT);
				return;
			case AssessmentPackage.QUESTION__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case AssessmentPackage.QUESTION__EVALUATES_BY:
				getEvaluatesBy().clear();
				return;
			case AssessmentPackage.QUESTION__USER_ANSWER:
				setUserAnswer((AnswerOption)null);
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
			case AssessmentPackage.QUESTION__QUESTION:
				return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
			case AssessmentPackage.QUESTION__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case AssessmentPackage.QUESTION__EVALUATES_BY:
				return evaluatesBy != null && !evaluatesBy.isEmpty();
			case AssessmentPackage.QUESTION__USER_ANSWER:
				return userAnswer != null;
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
		result.append(" (question: ");
		result.append(question);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
