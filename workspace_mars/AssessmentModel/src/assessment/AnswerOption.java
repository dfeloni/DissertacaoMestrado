/**
 */
package assessment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assessment.AnswerOption#getOption <em>Option</em>}</li>
 *   <li>{@link assessment.AnswerOption#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @see assessment.AssessmentPackage#getAnswerOption()
 * @model
 * @generated
 */
public interface AnswerOption extends EObject {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' attribute.
	 * @see #setOption(String)
	 * @see assessment.AssessmentPackage#getAnswerOption_Option()
	 * @model
	 * @generated
	 */
	String getOption();

	/**
	 * Sets the value of the '{@link assessment.AnswerOption#getOption <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' attribute.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(String value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(float)
	 * @see assessment.AssessmentPackage#getAnswerOption_Score()
	 * @model
	 * @generated
	 */
	float getScore();

	/**
	 * Sets the value of the '{@link assessment.AnswerOption#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(float value);

} // AnswerOption
