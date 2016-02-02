/**
 */
package process;

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
 * @see process.ProcessFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "process";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/ProcessModel/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessPackage eINSTANCE = process.impl.ProcessPackageImpl.init();

	/**
	 * The meta object id for the '{@link process.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.impl.ProcessImpl
	 * @see process.impl.ProcessPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PURPOSE = 2;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__BACKGROUND = 3;

	/**
	 * The feature id for the '<em><b>Process Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__HAS = 5;

	/**
	 * The feature id for the '<em><b>Follows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FOLLOWS = 6;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link process.impl.PhaseImpl <em>Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.impl.PhaseImpl
	 * @see process.impl.ProcessPackageImpl#getPhase()
	 * @generated
	 */
	int PHASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__EXECUTION_ORDER = 2;

	/**
	 * The number of structural features of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link process.ProcessType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see process.ProcessType
	 * @see process.impl.ProcessPackageImpl#getProcessType()
	 * @generated
	 */
	int PROCESS_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link process.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see process.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link process.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see process.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the attribute '{@link process.Process#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see process.Process#getDescription()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Description();

	/**
	 * Returns the meta object for the attribute '{@link process.Process#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see process.Process#getPurpose()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link process.Process#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see process.Process#getBackground()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Background();

	/**
	 * Returns the meta object for the attribute '{@link process.Process#getProcessType <em>Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Type</em>'.
	 * @see process.Process#getProcessType()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ProcessType();

	/**
	 * Returns the meta object for the containment reference list '{@link process.Process#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see process.Process#getHas()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Has();

	/**
	 * Returns the meta object for the reference list '{@link process.Process#getFollows <em>Follows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Follows</em>'.
	 * @see process.Process#getFollows()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Follows();

	/**
	 * Returns the meta object for class '{@link process.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase</em>'.
	 * @see process.Phase
	 * @generated
	 */
	EClass getPhase();

	/**
	 * Returns the meta object for the attribute '{@link process.Phase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see process.Phase#getName()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Name();

	/**
	 * Returns the meta object for the attribute '{@link process.Phase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see process.Phase#getDescription()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Description();

	/**
	 * Returns the meta object for the attribute '{@link process.Phase#getExecutionOrder <em>Execution Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order</em>'.
	 * @see process.Phase#getExecutionOrder()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_ExecutionOrder();

	/**
	 * Returns the meta object for enum '{@link process.ProcessType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see process.ProcessType
	 * @generated
	 */
	EEnum getProcessType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessFactory getProcessFactory();

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
		 * The meta object literal for the '{@link process.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.impl.ProcessImpl
		 * @see process.impl.ProcessPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__DESCRIPTION = eINSTANCE.getProcess_Description();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__PURPOSE = eINSTANCE.getProcess_Purpose();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__BACKGROUND = eINSTANCE.getProcess_Background();

		/**
		 * The meta object literal for the '<em><b>Process Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__PROCESS_TYPE = eINSTANCE.getProcess_ProcessType();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__HAS = eINSTANCE.getProcess_Has();

		/**
		 * The meta object literal for the '<em><b>Follows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__FOLLOWS = eINSTANCE.getProcess_Follows();

		/**
		 * The meta object literal for the '{@link process.impl.PhaseImpl <em>Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.impl.PhaseImpl
		 * @see process.impl.ProcessPackageImpl#getPhase()
		 * @generated
		 */
		EClass PHASE = eINSTANCE.getPhase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__NAME = eINSTANCE.getPhase_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__DESCRIPTION = eINSTANCE.getPhase_Description();

		/**
		 * The meta object literal for the '<em><b>Execution Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__EXECUTION_ORDER = eINSTANCE.getPhase_ExecutionOrder();

		/**
		 * The meta object literal for the '{@link process.ProcessType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see process.ProcessType
		 * @see process.impl.ProcessPackageImpl#getProcessType()
		 * @generated
		 */
		EEnum PROCESS_TYPE = eINSTANCE.getProcessType();

	}

} //ProcessPackage
