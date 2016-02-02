/**
 */
package taxonomy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taxonomy.TaxonomyElement#getName <em>Name</em>}</li>
 *   <li>{@link taxonomy.TaxonomyElement#getDescription <em>Description</em>}</li>
 *   <li>{@link taxonomy.TaxonomyElement#getCategorizedBy <em>Categorized By</em>}</li>
 *   <li>{@link taxonomy.TaxonomyElement#getAppliesTo <em>Applies To</em>}</li>
 * </ul>
 *
 * @see taxonomy.TaxonomyPackage#getTaxonomyElement()
 * @model
 * @generated
 */
public interface TaxonomyElement extends EObject {
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
	 * @see taxonomy.TaxonomyPackage#getTaxonomyElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link taxonomy.TaxonomyElement#getName <em>Name</em>}' attribute.
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
	 * @see taxonomy.TaxonomyPackage#getTaxonomyElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link taxonomy.TaxonomyElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Categorized By</b></em>' containment reference list.
	 * The list contents are of type {@link taxonomy.ElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorized By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorized By</em>' containment reference list.
	 * @see taxonomy.TaxonomyPackage#getTaxonomyElement_CategorizedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementType> getCategorizedBy();

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' containment reference list.
	 * The list contents are of type {@link taxonomy.Synonym}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' containment reference list.
	 * @see taxonomy.TaxonomyPackage#getTaxonomyElement_AppliesTo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Synonym> getAppliesTo();

} // TaxonomyElement
