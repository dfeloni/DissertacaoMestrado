/**
 */
package improvement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see improvement.ImprovementFactory
 * @model kind="package"
 * @generated
 */
public interface ImprovementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "improvement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/ImprovementModel/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "imp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImprovementPackage eINSTANCE = improvement.impl.ImprovementPackageImpl.init();

	/**
	 * The meta object id for the '{@link improvement.impl.ImprovementHintImpl <em>Hint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see improvement.impl.ImprovementHintImpl
	 * @see improvement.impl.ImprovementPackageImpl#getImprovementHint()
	 * @generated
	 */
	int IMPROVEMENT_HINT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_HINT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_HINT__EXAMPLE = 1;

	/**
	 * The feature id for the '<em><b>Example File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_HINT__EXAMPLE_FILE = 2;

	/**
	 * The feature id for the '<em><b>Commented</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_HINT__COMMENTED = 3;

	/**
	 * The number of structural features of the '<em>Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_HINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_HINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link improvement.impl.HintCommentsImpl <em>Hint Comments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see improvement.impl.HintCommentsImpl
	 * @see improvement.impl.ImprovementPackageImpl#getHintComments()
	 * @generated
	 */
	int HINT_COMMENTS = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINT_COMMENTS__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Feedback Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINT_COMMENTS__FEEDBACK_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Hint Comments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINT_COMMENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hint Comments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINT_COMMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link improvement.FeedbackType <em>Feedback Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see improvement.FeedbackType
	 * @see improvement.impl.ImprovementPackageImpl#getFeedbackType()
	 * @generated
	 */
	int FEEDBACK_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link improvement.ImprovementHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hint</em>'.
	 * @see improvement.ImprovementHint
	 * @generated
	 */
	EClass getImprovementHint();

	/**
	 * Returns the meta object for the attribute '{@link improvement.ImprovementHint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see improvement.ImprovementHint#getDescription()
	 * @see #getImprovementHint()
	 * @generated
	 */
	EAttribute getImprovementHint_Description();

	/**
	 * Returns the meta object for the attribute '{@link improvement.ImprovementHint#getExample <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Example</em>'.
	 * @see improvement.ImprovementHint#getExample()
	 * @see #getImprovementHint()
	 * @generated
	 */
	EAttribute getImprovementHint_Example();

	/**
	 * Returns the meta object for the attribute '{@link improvement.ImprovementHint#getExampleFile <em>Example File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Example File</em>'.
	 * @see improvement.ImprovementHint#getExampleFile()
	 * @see #getImprovementHint()
	 * @generated
	 */
	EAttribute getImprovementHint_ExampleFile();

	/**
	 * Returns the meta object for the containment reference list '{@link improvement.ImprovementHint#getCommented <em>Commented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commented</em>'.
	 * @see improvement.ImprovementHint#getCommented()
	 * @see #getImprovementHint()
	 * @generated
	 */
	EReference getImprovementHint_Commented();

	/**
	 * Returns the meta object for class '{@link improvement.HintComments <em>Hint Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hint Comments</em>'.
	 * @see improvement.HintComments
	 * @generated
	 */
	EClass getHintComments();

	/**
	 * Returns the meta object for the attribute '{@link improvement.HintComments#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see improvement.HintComments#getDescription()
	 * @see #getHintComments()
	 * @generated
	 */
	EAttribute getHintComments_Description();

	/**
	 * Returns the meta object for the attribute '{@link improvement.HintComments#getFeedbackType <em>Feedback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback Type</em>'.
	 * @see improvement.HintComments#getFeedbackType()
	 * @see #getHintComments()
	 * @generated
	 */
	EAttribute getHintComments_FeedbackType();

	/**
	 * Returns the meta object for enum '{@link improvement.FeedbackType <em>Feedback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feedback Type</em>'.
	 * @see improvement.FeedbackType
	 * @generated
	 */
	EEnum getFeedbackType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImprovementFactory getImprovementFactory();

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
		 * The meta object literal for the '{@link improvement.impl.ImprovementHintImpl <em>Hint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see improvement.impl.ImprovementHintImpl
		 * @see improvement.impl.ImprovementPackageImpl#getImprovementHint()
		 * @generated
		 */
		EClass IMPROVEMENT_HINT = eINSTANCE.getImprovementHint();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPROVEMENT_HINT__DESCRIPTION = eINSTANCE.getImprovementHint_Description();

		/**
		 * The meta object literal for the '<em><b>Example</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPROVEMENT_HINT__EXAMPLE = eINSTANCE.getImprovementHint_Example();

		/**
		 * The meta object literal for the '<em><b>Example File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPROVEMENT_HINT__EXAMPLE_FILE = eINSTANCE.getImprovementHint_ExampleFile();

		/**
		 * The meta object literal for the '<em><b>Commented</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPROVEMENT_HINT__COMMENTED = eINSTANCE.getImprovementHint_Commented();

		/**
		 * The meta object literal for the '{@link improvement.impl.HintCommentsImpl <em>Hint Comments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see improvement.impl.HintCommentsImpl
		 * @see improvement.impl.ImprovementPackageImpl#getHintComments()
		 * @generated
		 */
		EClass HINT_COMMENTS = eINSTANCE.getHintComments();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HINT_COMMENTS__DESCRIPTION = eINSTANCE.getHintComments_Description();

		/**
		 * The meta object literal for the '<em><b>Feedback Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HINT_COMMENTS__FEEDBACK_TYPE = eINSTANCE.getHintComments_FeedbackType();

		/**
		 * The meta object literal for the '{@link improvement.FeedbackType <em>Feedback Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see improvement.FeedbackType
		 * @see improvement.impl.ImprovementPackageImpl#getFeedbackType()
		 * @generated
		 */
		EEnum FEEDBACK_TYPE = eINSTANCE.getFeedbackType();

	}

} //ImprovementPackage
