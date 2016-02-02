/**
 */
package structureAndBehavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehavior.Tool#getName <em>Name</em>}</li>
 *   <li>{@link structureAndBehavior.Tool#getVersion <em>Version</em>}</li>
 *   <li>{@link structureAndBehavior.Tool#getUrl <em>Url</em>}</li>
 *   <li>{@link structureAndBehavior.Tool#getToolType <em>Tool Type</em>}</li>
 * </ul>
 *
 * @see structureAndBehavior.StructureAndBehaviorPackage#getTool()
 * @model
 * @generated
 */
public interface Tool extends EObject {
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
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getTool_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link structureAndBehavior.Tool#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getTool_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link structureAndBehavior.Tool#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getTool_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link structureAndBehavior.Tool#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Tool Type</b></em>' attribute.
	 * The literals are from the enumeration {@link structureAndBehavior.ToolType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Type</em>' attribute.
	 * @see structureAndBehavior.ToolType
	 * @see #setToolType(ToolType)
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getTool_ToolType()
	 * @model
	 * @generated
	 */
	ToolType getToolType();

	/**
	 * Sets the value of the '{@link structureAndBehavior.Tool#getToolType <em>Tool Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Type</em>' attribute.
	 * @see structureAndBehavior.ToolType
	 * @see #getToolType()
	 * @generated
	 */
	void setToolType(ToolType value);

} // Tool
