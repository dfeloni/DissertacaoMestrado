/**
 */
package taxonomy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Taxonomy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taxonomy.Taxonomy#getName <em>Name</em>}</li>
 *   <li>{@link taxonomy.Taxonomy#getDescription <em>Description</em>}</li>
 *   <li>{@link taxonomy.Taxonomy#getDefinedBy <em>Defined By</em>}</li>
 * </ul>
 *
 * @see taxonomy.TaxonomyPackage#getTaxonomy()
 * @model
 * @generated
 */
public interface Taxonomy extends EObject {
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
	 * @see taxonomy.TaxonomyPackage#getTaxonomy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link taxonomy.Taxonomy#getName <em>Name</em>}' attribute.
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
	 * @see taxonomy.TaxonomyPackage#getTaxonomy_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link taxonomy.Taxonomy#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Defined By</b></em>' containment reference list.
	 * The list contents are of type {@link taxonomy.TaxonomyElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined By</em>' containment reference list.
	 * @see taxonomy.TaxonomyPackage#getTaxonomy_DefinedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaxonomyElement> getDefinedBy();

} // Taxonomy
