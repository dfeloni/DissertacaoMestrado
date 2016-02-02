/**
 */
package taxonomy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import taxonomy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaxonomyFactoryImpl extends EFactoryImpl implements TaxonomyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaxonomyFactory init() {
		try {
			TaxonomyFactory theTaxonomyFactory = (TaxonomyFactory)EPackage.Registry.INSTANCE.getEFactory(TaxonomyPackage.eNS_URI);
			if (theTaxonomyFactory != null) {
				return theTaxonomyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaxonomyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxonomyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TaxonomyPackage.TAXONOMY: return createTaxonomy();
			case TaxonomyPackage.TAXONOMY_ELEMENT: return createTaxonomyElement();
			case TaxonomyPackage.ELEMENT_TYPE: return createElementType();
			case TaxonomyPackage.SYNONYM: return createSynonym();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Taxonomy createTaxonomy() {
		TaxonomyImpl taxonomy = new TaxonomyImpl();
		return taxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxonomyElement createTaxonomyElement() {
		TaxonomyElementImpl taxonomyElement = new TaxonomyElementImpl();
		return taxonomyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType createElementType() {
		ElementTypeImpl elementType = new ElementTypeImpl();
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synonym createSynonym() {
		SynonymImpl synonym = new SynonymImpl();
		return synonym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxonomyPackage getTaxonomyPackage() {
		return (TaxonomyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaxonomyPackage getPackage() {
		return TaxonomyPackage.eINSTANCE;
	}

} //TaxonomyFactoryImpl
