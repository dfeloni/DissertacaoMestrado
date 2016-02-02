/**
 */
package improvement.impl;

import improvement.FeedbackType;
import improvement.HintComments;
import improvement.ImprovementFactory;
import improvement.ImprovementHint;
import improvement.ImprovementPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImprovementPackageImpl extends EPackageImpl implements ImprovementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass improvementHintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hintCommentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum feedbackTypeEEnum = null;

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
	 * @see improvement.ImprovementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImprovementPackageImpl() {
		super(eNS_URI, ImprovementFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ImprovementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImprovementPackage init() {
		if (isInited) return (ImprovementPackage)EPackage.Registry.INSTANCE.getEPackage(ImprovementPackage.eNS_URI);

		// Obtain or create and register package
		ImprovementPackageImpl theImprovementPackage = (ImprovementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ImprovementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ImprovementPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theImprovementPackage.createPackageContents();

		// Initialize created meta-data
		theImprovementPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImprovementPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImprovementPackage.eNS_URI, theImprovementPackage);
		return theImprovementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImprovementHint() {
		return improvementHintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImprovementHint_Description() {
		return (EAttribute)improvementHintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImprovementHint_Example() {
		return (EAttribute)improvementHintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImprovementHint_ExampleFile() {
		return (EAttribute)improvementHintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImprovementHint_Commented() {
		return (EReference)improvementHintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHintComments() {
		return hintCommentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHintComments_Description() {
		return (EAttribute)hintCommentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHintComments_FeedbackType() {
		return (EAttribute)hintCommentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFeedbackType() {
		return feedbackTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImprovementFactory getImprovementFactory() {
		return (ImprovementFactory)getEFactoryInstance();
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
		improvementHintEClass = createEClass(IMPROVEMENT_HINT);
		createEAttribute(improvementHintEClass, IMPROVEMENT_HINT__DESCRIPTION);
		createEAttribute(improvementHintEClass, IMPROVEMENT_HINT__EXAMPLE);
		createEAttribute(improvementHintEClass, IMPROVEMENT_HINT__EXAMPLE_FILE);
		createEReference(improvementHintEClass, IMPROVEMENT_HINT__COMMENTED);

		hintCommentsEClass = createEClass(HINT_COMMENTS);
		createEAttribute(hintCommentsEClass, HINT_COMMENTS__DESCRIPTION);
		createEAttribute(hintCommentsEClass, HINT_COMMENTS__FEEDBACK_TYPE);

		// Create enums
		feedbackTypeEEnum = createEEnum(FEEDBACK_TYPE);
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
		initEClass(improvementHintEClass, ImprovementHint.class, "ImprovementHint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImprovementHint_Description(), ecorePackage.getEString(), "description", null, 0, 1, ImprovementHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImprovementHint_Example(), ecorePackage.getEString(), "example", null, 0, 1, ImprovementHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImprovementHint_ExampleFile(), ecorePackage.getEString(), "exampleFile", null, 0, 1, ImprovementHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImprovementHint_Commented(), this.getHintComments(), null, "commented", null, 0, -1, ImprovementHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hintCommentsEClass, HintComments.class, "HintComments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHintComments_Description(), ecorePackage.getEString(), "description", null, 0, 1, HintComments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHintComments_FeedbackType(), this.getFeedbackType(), "feedbackType", null, 0, 1, HintComments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(feedbackTypeEEnum, FeedbackType.class, "FeedbackType");
		addEEnumLiteral(feedbackTypeEEnum, FeedbackType.NEGATIVE);
		addEEnumLiteral(feedbackTypeEEnum, FeedbackType.NEUTRAL);
		addEEnumLiteral(feedbackTypeEEnum, FeedbackType.POSITIVE);

		// Create resource
		createResource(eNS_URI);
	}

} //ImprovementPackageImpl
