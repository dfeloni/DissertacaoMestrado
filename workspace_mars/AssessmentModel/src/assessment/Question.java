/**
 */
package assessment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assessment.Question#getQuestion <em>Question</em>}</li>
 *   <li>{@link assessment.Question#getWeight <em>Weight</em>}</li>
 *   <li>{@link assessment.Question#getEvaluatesBy <em>Evaluates By</em>}</li>
 *   <li>{@link assessment.Question#getUserAnswer <em>User Answer</em>}</li>
 * </ul>
 *
 * @see assessment.AssessmentPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see assessment.AssessmentPackage#getQuestion_Question()
	 * @model
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link assessment.Question#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(float)
	 * @see assessment.AssessmentPackage#getQuestion_Weight()
	 * @model
	 * @generated
	 */
	float getWeight();

	/**
	 * Sets the value of the '{@link assessment.Question#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(float value);

	/**
	 * Returns the value of the '<em><b>Evaluates By</b></em>' containment reference list.
	 * The list contents are of type {@link assessment.AnswerOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluates By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluates By</em>' containment reference list.
	 * @see assessment.AssessmentPackage#getQuestion_EvaluatesBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnswerOption> getEvaluatesBy();

	/**
	 * Returns the value of the '<em><b>User Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Answer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Answer</em>' reference.
	 * @see #setUserAnswer(AnswerOption)
	 * @see assessment.AssessmentPackage#getQuestion_UserAnswer()
	 * @model
	 * @generated
	 */
	AnswerOption getUserAnswer();

	/**
	 * Sets the value of the '{@link assessment.Question#getUserAnswer <em>User Answer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Answer</em>' reference.
	 * @see #getUserAnswer()
	 * @generated
	 */
	void setUserAnswer(AnswerOption value);

} // Question
