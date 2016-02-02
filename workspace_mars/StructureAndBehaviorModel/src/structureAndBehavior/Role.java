/**
 */
package structureAndBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehavior.Role#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link structureAndBehavior.Role#getRoleType <em>Role Type</em>}</li>
 * </ul>
 *
 * @see structureAndBehavior.StructureAndBehaviorPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends Element {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' attribute.
	 * @see #setRequirements(String)
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getRole_Requirements()
	 * @model
	 * @generated
	 */
	String getRequirements();

	/**
	 * Sets the value of the '{@link structureAndBehavior.Role#getRequirements <em>Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' attribute.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(String value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' attribute.
	 * The literals are from the enumeration {@link structureAndBehavior.RoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' attribute.
	 * @see structureAndBehavior.RoleType
	 * @see #setRoleType(RoleType)
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getRole_RoleType()
	 * @model
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link structureAndBehavior.Role#getRoleType <em>Role Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' attribute.
	 * @see structureAndBehavior.RoleType
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

} // Role
