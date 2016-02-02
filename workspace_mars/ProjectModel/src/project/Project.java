/**
 */
package project;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project.Project#getName <em>Name</em>}</li>
 *   <li>{@link project.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link project.Project#getExpectedStartDate <em>Expected Start Date</em>}</li>
 *   <li>{@link project.Project#getExpectedEndDate <em>Expected End Date</em>}</li>
 *   <li>{@link project.Project#getEstimatedCost <em>Estimated Cost</em>}</li>
 *   <li>{@link project.Project#getEstimatedEffort <em>Estimated Effort</em>}</li>
 *   <li>{@link project.Project#getHasToSatisfy <em>Has To Satisfy</em>}</li>
 *   <li>{@link project.Project#getEvaluatesPerformance <em>Evaluates Performance</em>}</li>
 *   <li>{@link project.Project#getExecutes <em>Executes</em>}</li>
 *   <li>{@link project.Project#getRealStartDate <em>Real Start Date</em>}</li>
 *   <li>{@link project.Project#getRealEndDate <em>Real End Date</em>}</li>
 *   <li>{@link project.Project#getRealCost <em>Real Cost</em>}</li>
 *   <li>{@link project.Project#getRealEffort <em>Real Effort</em>}</li>
 * </ul>
 *
 * @see project.ProjectPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
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
	 * @see project.ProjectPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link project.Project#getName <em>Name</em>}' attribute.
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
	 * @see project.ProjectPackage#getProject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link project.Project#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Expected Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Start Date</em>' attribute.
	 * @see #setExpectedStartDate(Date)
	 * @see project.ProjectPackage#getProject_ExpectedStartDate()
	 * @model
	 * @generated
	 */
	Date getExpectedStartDate();

	/**
	 * Sets the value of the '{@link project.Project#getExpectedStartDate <em>Expected Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Start Date</em>' attribute.
	 * @see #getExpectedStartDate()
	 * @generated
	 */
	void setExpectedStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Expected End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected End Date</em>' attribute.
	 * @see #setExpectedEndDate(Date)
	 * @see project.ProjectPackage#getProject_ExpectedEndDate()
	 * @model
	 * @generated
	 */
	Date getExpectedEndDate();

	/**
	 * Sets the value of the '{@link project.Project#getExpectedEndDate <em>Expected End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected End Date</em>' attribute.
	 * @see #getExpectedEndDate()
	 * @generated
	 */
	void setExpectedEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Cost</em>' attribute.
	 * @see #setEstimatedCost(float)
	 * @see project.ProjectPackage#getProject_EstimatedCost()
	 * @model
	 * @generated
	 */
	float getEstimatedCost();

	/**
	 * Sets the value of the '{@link project.Project#getEstimatedCost <em>Estimated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Cost</em>' attribute.
	 * @see #getEstimatedCost()
	 * @generated
	 */
	void setEstimatedCost(float value);

	/**
	 * Returns the value of the '<em><b>Estimated Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Effort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Effort</em>' attribute.
	 * @see #setEstimatedEffort(float)
	 * @see project.ProjectPackage#getProject_EstimatedEffort()
	 * @model
	 * @generated
	 */
	float getEstimatedEffort();

	/**
	 * Sets the value of the '{@link project.Project#getEstimatedEffort <em>Estimated Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Effort</em>' attribute.
	 * @see #getEstimatedEffort()
	 * @generated
	 */
	void setEstimatedEffort(float value);

	/**
	 * Returns the value of the '<em><b>Has To Satisfy</b></em>' containment reference list.
	 * The list contents are of type {@link project.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has To Satisfy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has To Satisfy</em>' containment reference list.
	 * @see project.ProjectPackage#getProject_HasToSatisfy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal> getHasToSatisfy();

	/**
	 * Returns the value of the '<em><b>Evaluates Performance</b></em>' containment reference list.
	 * The list contents are of type {@link project.ProjectFeedback}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluates Performance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluates Performance</em>' containment reference list.
	 * @see project.ProjectPackage#getProject_EvaluatesPerformance()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectFeedback> getEvaluatesPerformance();

	/**
	 * Returns the value of the '<em><b>Executes</b></em>' containment reference list.
	 * The list contents are of type {@link project.ProcessElementExecution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executes</em>' containment reference list.
	 * @see project.ProjectPackage#getProject_Executes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessElementExecution> getExecutes();

	/**
	 * Returns the value of the '<em><b>Real Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Start Date</em>' attribute.
	 * @see #setRealStartDate(Date)
	 * @see project.ProjectPackage#getProject_RealStartDate()
	 * @model
	 * @generated
	 */
	Date getRealStartDate();

	/**
	 * Sets the value of the '{@link project.Project#getRealStartDate <em>Real Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Start Date</em>' attribute.
	 * @see #getRealStartDate()
	 * @generated
	 */
	void setRealStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Real End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real End Date</em>' attribute.
	 * @see #setRealEndDate(Date)
	 * @see project.ProjectPackage#getProject_RealEndDate()
	 * @model
	 * @generated
	 */
	Date getRealEndDate();

	/**
	 * Sets the value of the '{@link project.Project#getRealEndDate <em>Real End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real End Date</em>' attribute.
	 * @see #getRealEndDate()
	 * @generated
	 */
	void setRealEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Real Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Cost</em>' attribute.
	 * @see #setRealCost(float)
	 * @see project.ProjectPackage#getProject_RealCost()
	 * @model
	 * @generated
	 */
	float getRealCost();

	/**
	 * Sets the value of the '{@link project.Project#getRealCost <em>Real Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Cost</em>' attribute.
	 * @see #getRealCost()
	 * @generated
	 */
	void setRealCost(float value);

	/**
	 * Returns the value of the '<em><b>Real Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Effort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Effort</em>' attribute.
	 * @see #setRealEffort(float)
	 * @see project.ProjectPackage#getProject_RealEffort()
	 * @model
	 * @generated
	 */
	float getRealEffort();

	/**
	 * Sets the value of the '{@link project.Project#getRealEffort <em>Real Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Effort</em>' attribute.
	 * @see #getRealEffort()
	 * @generated
	 */
	void setRealEffort(float value);

} // Project
