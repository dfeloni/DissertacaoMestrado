/**
 */
package project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Element Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link project.ProcessElementExecution#getName <em>Name</em>}</li>
 *   <li>{@link project.ProcessElementExecution#getDescription <em>Description</em>}</li>
 *   <li>{@link project.ProcessElementExecution#getObservations <em>Observations</em>}</li>
 *   <li>{@link project.ProcessElementExecution#isExecuted <em>Executed</em>}</li>
 *   <li>{@link project.ProcessElementExecution#getProcessElementType <em>Process Element Type</em>}</li>
 * </ul>
 *
 * @see project.ProjectPackage#getProcessElementExecution()
 * @model
 * @generated
 */
public interface ProcessElementExecution extends EObject {
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
	 * @see project.ProjectPackage#getProcessElementExecution_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link project.ProcessElementExecution#getName <em>Name</em>}' attribute.
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
	 * @see project.ProjectPackage#getProcessElementExecution_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link project.ProcessElementExecution#getDescription <em>Description</em>}' attribute.
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
	 * @see project.ProjectPackage#getProcessElementExecution_Observations()
	 * @model
	 * @generated
	 */
	String getObservations();

	/**
	 * Sets the value of the '{@link project.ProcessElementExecution#getObservations <em>Observations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observations</em>' attribute.
	 * @see #getObservations()
	 * @generated
	 */
	void setObservations(String value);

	/**
	 * Returns the value of the '<em><b>Executed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed</em>' attribute.
	 * @see #setExecuted(boolean)
	 * @see project.ProjectPackage#getProcessElementExecution_Executed()
	 * @model
	 * @generated
	 */
	boolean isExecuted();

	/**
	 * Sets the value of the '{@link project.ProcessElementExecution#isExecuted <em>Executed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executed</em>' attribute.
	 * @see #isExecuted()
	 * @generated
	 */
	void setExecuted(boolean value);

	/**
	 * Returns the value of the '<em><b>Process Element Type</b></em>' attribute.
	 * The literals are from the enumeration {@link project.ProcessElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Element Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Element Type</em>' attribute.
	 * @see project.ProcessElementType
	 * @see #setProcessElementType(ProcessElementType)
	 * @see project.ProjectPackage#getProcessElementExecution_ProcessElementType()
	 * @model
	 * @generated
	 */
	ProcessElementType getProcessElementType();

	/**
	 * Sets the value of the '{@link project.ProcessElementExecution#getProcessElementType <em>Process Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Element Type</em>' attribute.
	 * @see project.ProcessElementType
	 * @see #getProcessElementType()
	 * @generated
	 */
	void setProcessElementType(ProcessElementType value);

} // ProcessElementExecution
