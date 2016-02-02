/**
 */
package assessment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assessment.ScriptTemplate#getName <em>Name</em>}</li>
 *   <li>{@link assessment.ScriptTemplate#getDescription <em>Description</em>}</li>
 *   <li>{@link assessment.ScriptTemplate#getTemplate <em>Template</em>}</li>
 *   <li>{@link assessment.ScriptTemplate#getScriptType <em>Script Type</em>}</li>
 * </ul>
 *
 * @see assessment.AssessmentPackage#getScriptTemplate()
 * @model
 * @generated
 */
public interface ScriptTemplate extends EObject {
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
	 * @see assessment.AssessmentPackage#getScriptTemplate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assessment.ScriptTemplate#getName <em>Name</em>}' attribute.
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
	 * @see assessment.AssessmentPackage#getScriptTemplate_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link assessment.ScriptTemplate#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' attribute.
	 * @see #setTemplate(String)
	 * @see assessment.AssessmentPackage#getScriptTemplate_Template()
	 * @model
	 * @generated
	 */
	String getTemplate();

	/**
	 * Sets the value of the '{@link assessment.ScriptTemplate#getTemplate <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' attribute.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Script Type</b></em>' attribute.
	 * The literals are from the enumeration {@link assessment.ScriptType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Type</em>' attribute.
	 * @see assessment.ScriptType
	 * @see #setScriptType(ScriptType)
	 * @see assessment.AssessmentPackage#getScriptTemplate_ScriptType()
	 * @model
	 * @generated
	 */
	ScriptType getScriptType();

	/**
	 * Sets the value of the '{@link assessment.ScriptTemplate#getScriptType <em>Script Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Type</em>' attribute.
	 * @see assessment.ScriptType
	 * @see #getScriptType()
	 * @generated
	 */
	void setScriptType(ScriptType value);

} // ScriptTemplate
