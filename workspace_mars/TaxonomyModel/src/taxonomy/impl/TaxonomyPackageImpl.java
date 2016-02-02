/**
 */
package taxonomy.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import taxonomy.ElementType;
import taxonomy.Synonym;
import taxonomy.Taxonomy;
import taxonomy.TaxonomyElement;
import taxonomy.TaxonomyFactory;
import taxonomy.TaxonomyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaxonomyPackageImpl extends EPackageImpl implements TaxonomyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taxonomyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taxonomyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synonymEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see taxonomy.TaxonomyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TaxonomyPackageImpl() {
		super(eNS_URI, TaxonomyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TaxonomyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TaxonomyPackage init() {
		if (isInited) return (TaxonomyPackage)EPackage.Registry.INSTANCE.getEPackage(TaxonomyPackage.eNS_URI);

		// Obtain or create and register package
		TaxonomyPackageImpl theTaxonomyPackage = (TaxonomyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TaxonomyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TaxonomyPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTaxonomyPackage.createPackageContents();

		// Initialize created meta-data
		theTaxonomyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTaxonomyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TaxonomyPackage.eNS_URI, theTaxonomyPackage);
		return theTaxonomyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaxonomy() {
		return taxonomyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxonomy_Name() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxonomy_Description() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaxonomy_DefinedBy() {
		return (EReference)taxonomyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaxonomyElement() {
		return taxonomyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxonomyElement_Name() {
		return (EAttribute)taxonomyElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxonomyElement_Description() {
		return (EAttribute)taxonomyElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaxonomyElement_CategorizedBy() {
		return (EReference)taxonomyElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaxonomyElement_AppliesTo() {
		return (EReference)taxonomyElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementType() {
		return elementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_Name() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_Description() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynonym() {
		return synonymEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynonym_Name() {
		return (EAttribute)synonymEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynonym_Description() {
		return (EAttribute)synonymEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxonomyFactory getTaxonomyFactory() {
		return (TaxonomyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		taxonomyEClass = createEClass(TAXONOMY);
		createEAttribute(taxonomyEClass, TAXONOMY__NAME);
		createEAttribute(taxonomyEClass, TAXONOMY__DESCRIPTION);
		createEReference(taxonomyEClass, TAXONOMY__DEFINED_BY);

		taxonomyElementEClass = createEClass(TAXONOMY_ELEMENT);
		createEAttribute(taxonomyElementEClass, TAXONOMY_ELEMENT__NAME);
		createEAttribute(taxonomyElementEClass, TAXONOMY_ELEMENT__DESCRIPTION);
		createEReference(taxonomyElementEClass, TAXONOMY_ELEMENT__CATEGORIZED_BY);
		createEReference(taxonomyElementEClass, TAXONOMY_ELEMENT__APPLIES_TO);

		elementTypeEClass = createEClass(ELEMENT_TYPE);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__NAME);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__DESCRIPTION);

		synonymEClass = createEClass(SYNONYM);
		createEAttribute(synonymEClass, SYNONYM__NAME);
		createEAttribute(synonymEClass, SYNONYM__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(taxonomyEClass, Taxonomy.class, "Taxonomy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaxonomy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxonomy_Description(), ecorePackage.getEString(), "description", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaxonomy_DefinedBy(), this.getTaxonomyElement(), null, "definedBy", null, 0, -1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taxonomyElementEClass, TaxonomyElement.class, "TaxonomyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaxonomyElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, TaxonomyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxonomyElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, TaxonomyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaxonomyElement_CategorizedBy(), this.getElementType(), null, "categorizedBy", null, 0, -1, TaxonomyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaxonomyElement_AppliesTo(), this.getSynonym(), null, "appliesTo", null, 0, -1, TaxonomyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementTypeEClass, ElementType.class, "ElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synonymEClass, Synonym.class, "Synonym", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynonym_Name(), ecorePackage.getEString(), "name", null, 0, 1, Synonym.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynonym_Description(), ecorePackage.getEString(), "description", null, 0, 1, Synonym.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TaxonomyPackageImpl
