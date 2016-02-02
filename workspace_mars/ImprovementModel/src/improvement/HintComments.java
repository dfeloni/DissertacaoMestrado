/**
 */
package improvement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hint Comments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link improvement.HintComments#getDescription <em>Description</em>}</li>
 *   <li>{@link improvement.HintComments#getFeedbackType <em>Feedback Type</em>}</li>
 * </ul>
 *
 * @see improvement.ImprovementPackage#getHintComments()
 * @model
 * @generated
 */
public interface HintComments extends EObject {
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
	 * @see improvement.ImprovementPackage#getHintComments_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link improvement.HintComments#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Feedback Type</b></em>' attribute.
	 * The literals are from the enumeration {@link improvement.FeedbackType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Type</em>' attribute.
	 * @see improvement.FeedbackType
	 * @see #setFeedbackType(FeedbackType)
	 * @see improvement.ImprovementPackage#getHintComments_FeedbackType()
	 * @model
	 * @generated
	 */
	FeedbackType getFeedbackType();

	/**
	 * Sets the value of the '{@link improvement.HintComments#getFeedbackType <em>Feedback Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Type</em>' attribute.
	 * @see improvement.FeedbackType
	 * @see #getFeedbackType()
	 * @generated
	 */
	void setFeedbackType(FeedbackType value);

} // HintComments
