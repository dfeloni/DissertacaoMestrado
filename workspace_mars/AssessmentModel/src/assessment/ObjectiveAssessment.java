/**
 */
package assessment;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assessment.ObjectiveAssessment#getName <em>Name</em>}</li>
 *   <li>{@link assessment.ObjectiveAssessment#getDescription <em>Description</em>}</li>
 *   <li>{@link assessment.ObjectiveAssessment#getDefinesEvaluationRules <em>Defines Evaluation Rules</em>}</li>
 * </ul>
 *
 * @see assessment.AssessmentPackage#getObjectiveAssessment()
 * @model
 * @generated
 */
public interface ObjectiveAssessment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assessment.AssessmentPackage#getObjectiveAssessment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assessment.ObjectiveAssessment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see assessment.AssessmentPackage#getObjectiveAssessment_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link assessment.ObjectiveAssessment#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Defines Evaluation Rules</b></em>' containment reference list.
	 * The list contents are of type {@link assessment.ScriptTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defines Evaluation Rules</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines Evaluation Rules</em>' containment reference list.
	 * @see assessment.AssessmentPackage#getObjectiveAssessment_DefinesEvaluationRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScriptTemplate> getDefinesEvaluationRules();

} // ObjectiveAssessment
