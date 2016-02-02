/**
 */
package improvement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link improvement.ImprovementHint#getDescription <em>Description</em>}</li>
 *   <li>{@link improvement.ImprovementHint#getExample <em>Example</em>}</li>
 *   <li>{@link improvement.ImprovementHint#getExampleFile <em>Example File</em>}</li>
 *   <li>{@link improvement.ImprovementHint#getCommented <em>Commented</em>}</li>
 * </ul>
 *
 * @see improvement.ImprovementPackage#getImprovementHint()
 * @model
 * @generated
 */
public interface ImprovementHint extends EObject {
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
	 * @see improvement.ImprovementPackage#getImprovementHint_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link improvement.ImprovementHint#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' attribute.
	 * @see #setExample(String)
	 * @see improvement.ImprovementPackage#getImprovementHint_Example()
	 * @model
	 * @generated
	 */
	String getExample();

	/**
	 * Sets the value of the '{@link improvement.ImprovementHint#getExample <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example</em>' attribute.
	 * @see #getExample()
	 * @generated
	 */
	void setExample(String value);

	/**
	 * Returns the value of the '<em><b>Example File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example File</em>' attribute.
	 * @see #setExampleFile(String)
	 * @see improvement.ImprovementPackage#getImprovementHint_ExampleFile()
	 * @model
	 * @generated
	 */
	String getExampleFile();

	/**
	 * Sets the value of the '{@link improvement.ImprovementHint#getExampleFile <em>Example File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example File</em>' attribute.
	 * @see #getExampleFile()
	 * @generated
	 */
	void setExampleFile(String value);

	/**
	 * Returns the value of the '<em><b>Commented</b></em>' containment reference list.
	 * The list contents are of type {@link improvement.HintComments}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commented</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commented</em>' containment reference list.
	 * @see improvement.ImprovementPackage#getImprovementHint_Commented()
	 * @model containment="true"
	 * @generated
	 */
	EList<HintComments> getCommented();

} // ImprovementHint
