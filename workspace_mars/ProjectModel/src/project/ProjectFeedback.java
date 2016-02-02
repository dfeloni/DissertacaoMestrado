/**
 */
package project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project.ProjectFeedback#getName <em>Name</em>}</li>
 *   <li>{@link project.ProjectFeedback#getDescription <em>Description</em>}</li>
 *   <li>{@link project.ProjectFeedback#getObservations <em>Observations</em>}</li>
 *   <li>{@link project.ProjectFeedback#getProjectFeedbackType <em>Project Feedback Type</em>}</li>
 * </ul>
 *
 * @see project.ProjectPackage#getProjectFeedback()
 * @model
 * @generated
 */
public interface ProjectFeedback extends EObject {
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
	 * @see project.ProjectPackage#getProjectFeedback_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link project.ProjectFeedback#getName <em>Name</em>}' attribute.
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
	 * @see project.ProjectPackage#getProjectFeedback_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link project.ProjectFeedback#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Observations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observations</em>' attribute.
	 * @see #setObservations(String)
	 * @see project.ProjectPackage#getProjectFeedback_Observations()
	 * @model
	 * @generated
	 */
	String getObservations();

	/**
	 * Sets the value of the '{@link project.ProjectFeedback#getObservations <em>Observations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observations</em>' attribute.
	 * @see #getObservations()
	 * @generated
	 */
	void setObservations(String value);

	/**
	 * Returns the value of the '<em><b>Project Feedback Type</b></em>' attribute.
	 * The literals are from the enumeration {@link project.ProjectFeedbackType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Feedback Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Feedback Type</em>' attribute.
	 * @see project.ProjectFeedbackType
	 * @see #setProjectFeedbackType(ProjectFeedbackType)
	 * @see project.ProjectPackage#getProjectFeedback_ProjectFeedbackType()
	 * @model
	 * @generated
	 */
	ProjectFeedbackType getProjectFeedbackType();

	/**
	 * Sets the value of the '{@link project.ProjectFeedback#getProjectFeedbackType <em>Project Feedback Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Feedback Type</em>' attribute.
	 * @see project.ProjectFeedbackType
	 * @see #getProjectFeedbackType()
	 * @generated
	 */
	void setProjectFeedbackType(ProjectFeedbackType value);

} // ProjectFeedback
