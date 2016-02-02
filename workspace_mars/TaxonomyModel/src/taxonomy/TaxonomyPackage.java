/**
 */
package taxonomy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see taxonomy.TaxonomyFactory
 * @model kind="package"
 * @generated
 */
public interface TaxonomyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "taxonomy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/TaxonomyModel/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "txn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaxonomyPackage eINSTANCE = taxonomy.impl.TaxonomyPackageImpl.init();

	/**
	 * The meta object id for the '{@link taxonomy.impl.TaxonomyImpl <em>Taxonomy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taxonomy.impl.TaxonomyImpl
	 * @see taxonomy.impl.TaxonomyPackageImpl#getTaxonomy()
	 * @generated
	 */
	int TAXONOMY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Defined By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__DEFINED_BY = 2;

	/**
	 * The number of structural features of the '<em>Taxonomy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Taxonomy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link taxonomy.impl.TaxonomyElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taxonomy.impl.TaxonomyElementImpl
	 * @see taxonomy.impl.TaxonomyPackageImpl#getTaxonomyElement()
	 * @generated
	 */
	int TAXONOMY_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Categorized By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_ELEMENT__CATEGORIZED_BY = 2;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_ELEMENT__APPLIES_TO = 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link taxonomy.impl.ElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taxonomy.impl.ElementTypeImpl
	 * @see taxonomy.impl.TaxonomyPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link taxonomy.impl.SynonymImpl <em>Synonym</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taxonomy.impl.SynonymImpl
	 * @see taxonomy.impl.TaxonomyPackageImpl#getSynonym()
	 * @generated
	 */
	int SYNONYM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Synonym</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Synonym</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNONYM_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link taxonomy.Taxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taxonomy</em>'.
	 * @see taxonomy.Taxonomy
	 * @generated
	 */
	EClass getTaxonomy();

	/**
	 * Returns the meta object for the attribute '{@link taxonomy.Taxonomy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see taxonomy.Taxonomy#getName()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Name();

	/**
	 * Returns the meta object for the attribute '{@link taxonomy.Taxonomy#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see taxonomy.Taxonomy#getDescription()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link taxonomy.Taxonomy#getDefinedBy <em>Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defined By</em>'.
	 * @see taxonomy.Taxonomy#getDefinedBy()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EReference getTaxonomy_DefinedBy();

	/**
	 * Returns the meta object for class '{@link taxonomy.TaxonomyElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see taxonomy.TaxonomyElement
	 * @generated
	 */
	EClass getTaxonomyElement();

	/**
	 * Returns the meta object for the attribute '{@link taxonomy.TaxonomyElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see taxonomy.TaxonomyElement#getName()
	 * @see #getTaxonomyElement()
	 * @generated
	 */
	EAttribute getTaxonomyElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link taxonomy.TaxonomyElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see taxonomy.TaxonomyElement#getDescription()
	 * @see #getTaxonomyElement()
	 * @generated
	 */
	EAttribute getTaxonomyElement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link taxonomy.TaxonomyElement#getCategorizedBy <em>Categorized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categorized By</em>'.
	 * @see taxonomy.TaxonomyElement#getCategorizedBy()
	 * @see #getTaxonomyElement()
	 * @generated
	 */
	EReference getTaxonomyElement_CategorizedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link taxonomy.TaxonomyElement#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applies To</em>'.
	 * @see taxonomy.TaxonomyElement#getAppliesTo()
	 * @see #getTaxonomyElement()
	 * @generated
	 */
	EReference getTaxonomyElement_AppliesTo();

	/**
	 * Returns the meta object for class '{@link taxonomy.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Type</em>'.
	 * @see taxonomy.ElementType
	 * @generated
	 */
	EClass getElementType();

	/**
	 * Returns the meta object for the attribute '{@link taxonomy.ElementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see taxonomy.ElementType#getName()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_Name();

	/**
	 * Returns the meta object for the attribute '{@link taxonomy.ElementType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see taxonomy.ElementType#getDescription()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_Description();

	/**
	 * Returns the meta object for class '{@link taxonomy.Synonym <em>Synonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synonym</em>'.
	 * @see taxonomy.Synonym
	 * @generated
	 */
	EClass getSynonym();

	/**
	 * Returns the meta object for the attribute '{@link taxonomy.Synonym#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see taxonomy.Synonym#getName()
	 * @see #getSynonym()
	 * @generated
	 */
	EAttribute getSynonym_Name();

	/**
	 * Returns the meta object for the attribute '{@link taxonomy.Synonym#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see taxonomy.Synonym#getDescription()
	 * @see #getSynonym()
	 * @generated
	 */
	EAttribute getSynonym_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaxonomyFactory getTaxonomyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link taxonomy.impl.TaxonomyImpl <em>Taxonomy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taxonomy.impl.TaxonomyImpl
		 * @see taxonomy.impl.TaxonomyPackageImpl#getTaxonomy()
		 * @generated
		 */
		EClass TAXONOMY = eINSTANCE.getTaxonomy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__NAME = eINSTANCE.getTaxonomy_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__DESCRIPTION = eINSTANCE.getTaxonomy_Description();

		/**
		 * The meta object literal for the '<em><b>Defined By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAXONOMY__DEFINED_BY = eINSTANCE.getTaxonomy_DefinedBy();

		/**
		 * The meta object literal for the '{@link taxonomy.impl.TaxonomyElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taxonomy.impl.TaxonomyElementImpl
		 * @see taxonomy.impl.TaxonomyPackageImpl#getTaxonomyElement()
		 * @generated
		 */
		EClass TAXONOMY_ELEMENT = eINSTANCE.getTaxonomyElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY_ELEMENT__NAME = eINSTANCE.getTaxonomyElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY_ELEMENT__DESCRIPTION = eINSTANCE.getTaxonomyElement_Description();

		/**
		 * The meta object literal for the '<em><b>Categorized By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAXONOMY_ELEMENT__CATEGORIZED_BY = eINSTANCE.getTaxonomyElement_CategorizedBy();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAXONOMY_ELEMENT__APPLIES_TO = eINSTANCE.getTaxonomyElement_AppliesTo();

		/**
		 * The meta object literal for the '{@link taxonomy.impl.ElementTypeImpl <em>Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taxonomy.impl.ElementTypeImpl
		 * @see taxonomy.impl.TaxonomyPackageImpl#getElementType()
		 * @generated
		 */
		EClass ELEMENT_TYPE = eINSTANCE.getElementType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__NAME = eINSTANCE.getElementType_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__DESCRIPTION = eINSTANCE.getElementType_Description();

		/**
		 * The meta object literal for the '{@link taxonomy.impl.SynonymImpl <em>Synonym</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taxonomy.impl.SynonymImpl
		 * @see taxonomy.impl.TaxonomyPackageImpl#getSynonym()
		 * @generated
		 */
		EClass SYNONYM = eINSTANCE.getSynonym();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNONYM__NAME = eINSTANCE.getSynonym_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNONYM__DESCRIPTION = eINSTANCE.getSynonym_Description();

	}

} //TaxonomyPackage
