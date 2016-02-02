/**
 */
package structureAndBehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehavior.Activity#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link structureAndBehavior.Activity#getExecutes <em>Executes</em>}</li>
 *   <li>{@link structureAndBehavior.Activity#getInput <em>Input</em>}</li>
 *   <li>{@link structureAndBehavior.Activity#getOutput <em>Output</em>}</li>
 *   <li>{@link structureAndBehavior.Activity#getPerformedBy <em>Performed By</em>}</li>
 * </ul>
 *
 * @see structureAndBehavior.StructureAndBehaviorPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Element {
	/**
	 * Returns the value of the '<em><b>Activity Type</b></em>' attribute.
	 * The literals are from the enumeration {@link structureAndBehavior.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Type</em>' attribute.
	 * @see structureAndBehavior.ActivityType
	 * @see #setActivityType(ActivityType)
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getActivity_ActivityType()
	 * @model
	 * @generated
	 */
	ActivityType getActivityType();

	/**
	 * Sets the value of the '{@link structureAndBehavior.Activity#getActivityType <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Type</em>' attribute.
	 * @see structureAndBehavior.ActivityType
	 * @see #getActivityType()
	 * @generated
	 */
	void setActivityType(ActivityType value);

	/**
	 * Returns the value of the '<em><b>Executes</b></em>' containment reference list.
	 * The list contents are of type {@link structureAndBehavior.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executes</em>' containment reference list.
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getActivity_Executes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getExecutes();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link structureAndBehavior.WorkProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getActivity_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkProduct> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link structureAndBehavior.WorkProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getActivity_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkProduct> getOutput();

	/**
	 * Returns the value of the '<em><b>Performed By</b></em>' containment reference list.
	 * The list contents are of type {@link structureAndBehavior.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performed By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed By</em>' containment reference list.
	 * @see structureAndBehavior.StructureAndBehaviorPackage#getActivity_PerformedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getPerformedBy();

} // Activity
