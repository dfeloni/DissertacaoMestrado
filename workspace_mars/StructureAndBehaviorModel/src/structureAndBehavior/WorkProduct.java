/**
 */
package structureAndBehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehavior.WorkProduct#getUrl <em>Url</em>}</li>
 *   <li>{@link structureAndBehavior.WorkProduct#getFileName <em>File Name</em>}</li>
 *   <li>{@link structureAndBehavior.WorkProduct#getTemplate <em>Template</em>}</li>
 *   <li>{@link structureAndBehavior.WorkProduct#getWorkProductType <em>Work Product Type</em>}</li>
 *   <li>{@link structureAndBehavior.WorkProduct#getEvidenceType <em>Evidence Type</em>}</li>
 *   <li>{@link structureAndBehavior.WorkProduct#getCreatedOn <em>Created On</em>}</li>
 * </ul>
 *
 * @see structureAndBehavior.StructureAndBehaviorPackage#getWorkProduct()
 * @model
 * @generated
 */
public interface WorkProduct extends Element {
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
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getWorkProduct_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link structureAndBehavior.WorkProduct#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getWorkProduct_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link structureAndBehavior.WorkProduct#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

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
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getWorkProduct_Template()
	 * @model
	 * @generated
	 */
	String getTemplate();

	/**
	 * Sets the value of the '{@link structureAndBehavior.WorkProduct#getTemplate <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' attribute.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Work Product Type</b></em>' attribute.
	 * The literals are from the enumeration {@link structureAndBehavior.WorkProductType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Product Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Product Type</em>' attribute.
	 * @see structureAndBehavior.WorkProductType
	 * @see #setWorkProductType(WorkProductType)
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getWorkProduct_WorkProductType()
	 * @model
	 * @generated
	 */
	WorkProductType getWorkProductType();

	/**
	 * Sets the value of the '{@link structureAndBehavior.WorkProduct#getWorkProductType <em>Work Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Product Type</em>' attribute.
	 * @see structureAndBehavior.WorkProductType
	 * @see #getWorkProductType()
	 * @generated
	 */
	void setWorkProductType(WorkProductType value);

	/**
	 * Returns the value of the '<em><b>Created On</b></em>' containment reference list.
	 * The list contents are of type {@link structureAndBehavior.Tool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created On</em>' containment reference list.
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getWorkProduct_CreatedOn()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool> getCreatedOn();

	/**
	 * Returns the value of the '<em><b>Evidence Type</b></em>' attribute.
	 * The literals are from the enumeration {@link structureAndBehavior.EvidenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence Type</em>' attribute.
	 * @see structureAndBehavior.EvidenceType
	 * @see #setEvidenceType(EvidenceType)
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getWorkProduct_EvidenceType()
	 * @model
	 * @generated
	 */
	EvidenceType getEvidenceType();

	/**
	 * Sets the value of the '{@link structureAndBehavior.WorkProduct#getEvidenceType <em>Evidence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence Type</em>' attribute.
	 * @see structureAndBehavior.EvidenceType
	 * @see #getEvidenceType()
	 * @generated
	 */
	void setEvidenceType(EvidenceType value);

} // WorkProduct