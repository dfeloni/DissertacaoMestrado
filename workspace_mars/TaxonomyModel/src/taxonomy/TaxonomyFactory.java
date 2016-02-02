/**
 */
package taxonomy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see taxonomy.TaxonomyPackage
 * @generated
 */
public interface TaxonomyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaxonomyFactory eINSTANCE = taxonomy.impl.TaxonomyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Taxonomy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Taxonomy</em>'.
	 * @generated
	 */
	Taxonomy createTaxonomy();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	TaxonomyElement createTaxonomyElement();

	/**
	 * Returns a new object of class '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Type</em>'.
	 * @generated
	 */
	ElementType createElementType();

	/**
	 * Returns a new object of class '<em>Synonym</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synonym</em>'.
	 * @generated
	 */
	Synonym createSynonym();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaxonomyPackage getTaxonomyPackage();

} //TaxonomyFactory
