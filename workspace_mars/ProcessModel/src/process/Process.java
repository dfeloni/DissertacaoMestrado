/**
 */
package process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import project.Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link process.Process#getName <em>Name</em>}</li>
 *   <li>{@link process.Process#getDescription <em>Description</em>}</li>
 *   <li>{@link process.Process#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link process.Process#getBackground <em>Background</em>}</li>
 *   <li>{@link process.Process#getProcessType <em>Process Type</em>}</li>
 *   <li>{@link process.Process#getHas <em>Has</em>}</li>
 *   <li>{@link process.Process#getFollows <em>Follows</em>}</li>
 * </ul>
 *
 * @see process.ProcessPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
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
	 * @see process.ProcessPackage#getProcess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link process.Process#getName <em>Name</em>}' attribute.
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
	 * @see process.ProcessPackage#getProcess_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link process.Process#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see process.ProcessPackage#getProcess_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link process.Process#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(String)
	 * @see process.ProcessPackage#getProcess_Background()
	 * @model
	 * @generated
	 */
	String getBackground();

	/**
	 * Sets the value of the '{@link process.Process#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(String value);

	/**
	 * Returns the value of the '<em><b>Process Type</b></em>' attribute.
	 * The literals are from the enumeration {@link process.ProcessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Type</em>' attribute.
	 * @see process.ProcessType
	 * @see #setProcessType(ProcessType)
	 * @see process.ProcessPackage#getProcess_ProcessType()
	 * @model
	 * @generated
	 */
	ProcessType getProcessType();

	/**
	 * Sets the value of the '{@link process.Process#getProcessType <em>Process Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Type</em>' attribute.
	 * @see process.ProcessType
	 * @see #getProcessType()
	 * @generated
	 */
	void setProcessType(ProcessType value);

	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link process.Phase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see process.ProcessPackage#getProcess_Has()
	 * @model containment="true"
	 * @generated
	 */
	EList<Phase> getHas();

	/**
	 * Returns the value of the '<em><b>Follows</b></em>' reference list.
	 * The list contents are of type {@link project.Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Follows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Follows</em>' reference list.
	 * @see process.ProcessPackage#getProcess_Follows()
	 * @model
	 * @generated
	 */
	EList<Project> getFollows();

} // Process
