/**
 */
package maturityModel.impl;

import maturityModel.GPSubPractice;
import maturityModel.GenericPractice;
import maturityModel.MaturityLevel;
import maturityModel.MaturityModel;
import maturityModel.MaturityModelFactory;
import maturityModel.MaturityModelPackage;
import maturityModel.ProcessArea;
import maturityModel.SpecificPractice;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaturityModelPackageImpl extends EPackageImpl implements MaturityModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maturityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificPracticeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maturityLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericPracticeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpSubPracticeEClass = null;

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
	 * @see maturityModel.MaturityModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MaturityModelPackageImpl() {
		super(eNS_URI, MaturityModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MaturityModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MaturityModelPackage init() {
		if (isInited) return (MaturityModelPackage)EPackage.Registry.INSTANCE.getEPackage(MaturityModelPackage.eNS_URI);

		// Obtain or create and register package
		MaturityModelPackageImpl theMaturityModelPackage = (MaturityModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MaturityModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MaturityModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMaturityModelPackage.createPackageContents();

		// Initialize created meta-data
		theMaturityModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMaturityModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MaturityModelPackage.eNS_URI, theMaturityModelPackage);
		return theMaturityModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaturityModel() {
		return maturityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaturityModel_Name() {
		return (EAttribute)maturityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaturityModel_Version() {
		return (EAttribute)maturityModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaturityModel_ReleaseDate() {
		return (EAttribute)maturityModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaturityModel_Author() {
		return (EAttribute)maturityModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaturityModel_Description() {
		return (EAttribute)maturityModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaturityModel_Acronym() {
		return (EAttribute)maturityModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaturityModel_Url() {
		return (EAttribute)maturityModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaturityModel_Organizes() {
		return (EReference)maturityModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaturityModel_EvolvesInto() {
		return (EReference)maturityModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessArea() {
		return processAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessArea_Name() {
		return (EAttribute)processAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessArea_ShortDescription() {
		return (EAttribute)processAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessArea_MainDescription() {
		return (EAttribute)processAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessArea_Acronym() {
		return (EAttribute)processAreaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessArea_Defines() {
		return (EReference)processAreaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessArea_Implements() {
		return (EReference)processAreaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificPractice() {
		return specificPracticeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificPractice_Name() {
		return (EAttribute)specificPracticeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificPractice_Description() {
		return (EAttribute)specificPracticeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificPractice_Acronym() {
		return (EAttribute)specificPracticeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificPractice_ComplementaryDescription() {
		return (EAttribute)specificPracticeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaturityLevel() {
		return maturityLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaturityLevel_Name() {
		return (EAttribute)maturityLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaturityLevel_Description() {
		return (EAttribute)maturityLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaturityLevel_Acronym() {
		return (EAttribute)maturityLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaturityLevel_EvolvesInto() {
		return (EReference)maturityLevelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericPractice() {
		return genericPracticeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericPractice_Name() {
		return (EAttribute)genericPracticeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericPractice_Description() {
		return (EAttribute)genericPracticeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericPractice_Acronym() {
		return (EAttribute)genericPracticeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericPractice_ComplementaryDescription() {
		return (EAttribute)genericPracticeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericPractice_Divided() {
		return (EReference)genericPracticeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGPSubPractice() {
		return gpSubPracticeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSubPractice_Name() {
		return (EAttribute)gpSubPracticeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSubPractice_Description() {
		return (EAttribute)gpSubPracticeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGPSubPractice_Acronym() {
		return (EAttribute)gpSubPracticeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaturityModelFactory getMaturityModelFactory() {
		return (MaturityModelFactory)getEFactoryInstance();
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
		maturityModelEClass = createEClass(MATURITY_MODEL);
		createEAttribute(maturityModelEClass, MATURITY_MODEL__NAME);
		createEAttribute(maturityModelEClass, MATURITY_MODEL__VERSION);
		createEAttribute(maturityModelEClass, MATURITY_MODEL__RELEASE_DATE);
		createEAttribute(maturityModelEClass, MATURITY_MODEL__AUTHOR);
		createEAttribute(maturityModelEClass, MATURITY_MODEL__DESCRIPTION);
		createEAttribute(maturityModelEClass, MATURITY_MODEL__ACRONYM);
		createEAttribute(maturityModelEClass, MATURITY_MODEL__URL);
		createEReference(maturityModelEClass, MATURITY_MODEL__ORGANIZES);
		createEReference(maturityModelEClass, MATURITY_MODEL__EVOLVES_INTO);

		processAreaEClass = createEClass(PROCESS_AREA);
		createEAttribute(processAreaEClass, PROCESS_AREA__NAME);
		createEAttribute(processAreaEClass, PROCESS_AREA__SHORT_DESCRIPTION);
		createEAttribute(processAreaEClass, PROCESS_AREA__MAIN_DESCRIPTION);
		createEAttribute(processAreaEClass, PROCESS_AREA__ACRONYM);
		createEReference(processAreaEClass, PROCESS_AREA__DEFINES);
		createEReference(processAreaEClass, PROCESS_AREA__IMPLEMENTS);

		specificPracticeEClass = createEClass(SPECIFIC_PRACTICE);
		createEAttribute(specificPracticeEClass, SPECIFIC_PRACTICE__NAME);
		createEAttribute(specificPracticeEClass, SPECIFIC_PRACTICE__DESCRIPTION);
		createEAttribute(specificPracticeEClass, SPECIFIC_PRACTICE__ACRONYM);
		createEAttribute(specificPracticeEClass, SPECIFIC_PRACTICE__COMPLEMENTARY_DESCRIPTION);

		maturityLevelEClass = createEClass(MATURITY_LEVEL);
		createEAttribute(maturityLevelEClass, MATURITY_LEVEL__NAME);
		createEAttribute(maturityLevelEClass, MATURITY_LEVEL__DESCRIPTION);
		createEAttribute(maturityLevelEClass, MATURITY_LEVEL__ACRONYM);
		createEReference(maturityLevelEClass, MATURITY_LEVEL__EVOLVES_INTO);

		genericPracticeEClass = createEClass(GENERIC_PRACTICE);
		createEAttribute(genericPracticeEClass, GENERIC_PRACTICE__NAME);
		createEAttribute(genericPracticeEClass, GENERIC_PRACTICE__DESCRIPTION);
		createEAttribute(genericPracticeEClass, GENERIC_PRACTICE__ACRONYM);
		createEAttribute(genericPracticeEClass, GENERIC_PRACTICE__COMPLEMENTARY_DESCRIPTION);
		createEReference(genericPracticeEClass, GENERIC_PRACTICE__DIVIDED);

		gpSubPracticeEClass = createEClass(GP_SUB_PRACTICE);
		createEAttribute(gpSubPracticeEClass, GP_SUB_PRACTICE__NAME);
		createEAttribute(gpSubPracticeEClass, GP_SUB_PRACTICE__DESCRIPTION);
		createEAttribute(gpSubPracticeEClass, GP_SUB_PRACTICE__ACRONYM);
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
		initEClass(maturityModelEClass, MaturityModel.class, "MaturityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaturityModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, MaturityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaturityModel_Version(), ecorePackage.getEString(), "version", null, 0, 1, MaturityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaturityModel_ReleaseDate(), ecorePackage.getEDate(), "releaseDate", null, 0, 1, MaturityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaturityModel_Author(), ecorePackage.getEString(), "author", null, 0, 1, MaturityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaturityModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, MaturityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaturityModel_Acronym(), ecorePackage.getEString(), "acronym", null, 0, 1, MaturityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaturityModel_Url(), ecorePackage.getEString(), "url", null, 0, 1, MaturityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaturityModel_Organizes(), this.getProcessArea(), null, "organizes", null, 0, -1, MaturityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaturityModel_EvolvesInto(), this.getMaturityLevel(), null, "evolvesInto", null, 0, -1, MaturityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processAreaEClass, ProcessArea.class, "ProcessArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessArea_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcessArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessArea_ShortDescription(), ecorePackage.getEString(), "shortDescription", null, 0, 1, ProcessArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessArea_MainDescription(), ecorePackage.getEString(), "mainDescription", null, 0, 1, ProcessArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessArea_Acronym(), ecorePackage.getEString(), "acronym", null, 0, 1, ProcessArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessArea_Defines(), this.getSpecificPractice(), null, "defines", null, 0, -1, ProcessArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessArea_Implements(), this.getMaturityLevel(), null, "implements", null, 0, 1, ProcessArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificPracticeEClass, SpecificPractice.class, "SpecificPractice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecificPractice_Name(), ecorePackage.getEString(), "name", null, 0, 1, SpecificPractice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecificPractice_Description(), ecorePackage.getEString(), "description", null, 0, 1, SpecificPractice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecificPractice_Acronym(), ecorePackage.getEString(), "acronym", null, 0, 1, SpecificPractice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecificPractice_ComplementaryDescription(), ecorePackage.getEString(), "complementaryDescription", null, 0, 1, SpecificPractice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maturityLevelEClass, MaturityLevel.class, "MaturityLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaturityLevel_Name(), ecorePackage.getEString(), "name", null, 0, 1, MaturityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaturityLevel_Description(), ecorePackage.getEString(), "description", null, 0, 1, MaturityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaturityLevel_Acronym(), ecorePackage.getEString(), "acronym", null, 0, 1, MaturityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaturityLevel_EvolvesInto(), this.getGenericPractice(), null, "evolvesInto", null, 0, -1, MaturityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericPracticeEClass, GenericPractice.class, "GenericPractice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericPractice_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenericPractice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericPractice_Description(), ecorePackage.getEString(), "description", null, 0, 1, GenericPractice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericPractice_Acronym(), ecorePackage.getEString(), "acronym", null, 0, 1, GenericPractice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericPractice_ComplementaryDescription(), ecorePackage.getEString(), "complementaryDescription", null, 0, 1, GenericPractice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericPractice_Divided(), this.getGPSubPractice(), null, "divided", null, 0, -1, GenericPractice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gpSubPracticeEClass, GPSubPractice.class, "GPSubPractice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGPSubPractice_Name(), ecorePackage.getEString(), "name", null, 0, 1, GPSubPractice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSubPractice_Description(), ecorePackage.getEString(), "description", null, 0, 1, GPSubPractice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGPSubPractice_Acronym(), ecorePackage.getEString(), "acronym", null, 0, 1, GPSubPractice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MaturityModelPackageImpl
