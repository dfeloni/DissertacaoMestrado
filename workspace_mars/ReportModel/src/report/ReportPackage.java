/**
 */
package report;

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
 * @see report.ReportFactory
 * @model kind="package"
 * @generated
 */
public interface ReportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "report";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/ReportModel/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rpt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReportPackage eINSTANCE = report.impl.ReportPackageImpl.init();

	/**
	 * The meta object id for the '{@link report.impl.ReportImpl <em>Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see report.impl.ReportImpl
	 * @see report.impl.ReportPackageImpl#getReport()
	 * @generated
	 */
	int REPORT = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__DATE = 0;

	/**
	 * The feature id for the '<em><b>Evaluation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__EVALUATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Maturity Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__MATURITY_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Maturity Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__MATURITY_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Process Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__PROCESS_AREA = 4;

	/**
	 * The feature id for the '<em><b>Process Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__PROCESS_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Detailed By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__DETAILED_BY = 6;

	/**
	 * The number of structural features of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link report.impl.ReportItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see report.impl.ReportItemImpl
	 * @see report.impl.ReportPackageImpl#getReportItem()
	 * @generated
	 */
	int REPORT_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Compliance Item Evaluated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ITEM__COMPLIANCE_ITEM_EVALUATED = 0;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ITEM__QUESTION = 1;

	/**
	 * The feature id for the '<em><b>User Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ITEM__USER_ANSWER = 2;

	/**
	 * The feature id for the '<em><b>Compliance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ITEM__COMPLIANCE_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Item Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ITEM__ITEM_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Evaluation Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ITEM__EVALUATION_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Evaluation Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ITEM__EVALUATION_RESULT = 6;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ITEM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ITEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link report.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report</em>'.
	 * @see report.Report
	 * @generated
	 */
	EClass getReport();

	/**
	 * Returns the meta object for the attribute '{@link report.Report#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see report.Report#getDate()
	 * @see #getReport()
	 * @generated
	 */
	EAttribute getReport_Date();

	/**
	 * Returns the meta object for the attribute '{@link report.Report#getEvaluationType <em>Evaluation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluation Type</em>'.
	 * @see report.Report#getEvaluationType()
	 * @see #getReport()
	 * @generated
	 */
	EAttribute getReport_EvaluationType();

	/**
	 * Returns the meta object for the attribute '{@link report.Report#getMaturityModel <em>Maturity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maturity Model</em>'.
	 * @see report.Report#getMaturityModel()
	 * @see #getReport()
	 * @generated
	 */
	EAttribute getReport_MaturityModel();

	/**
	 * Returns the meta object for the attribute '{@link report.Report#getMaturityLevel <em>Maturity Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maturity Level</em>'.
	 * @see report.Report#getMaturityLevel()
	 * @see #getReport()
	 * @generated
	 */
	EAttribute getReport_MaturityLevel();

	/**
	 * Returns the meta object for the attribute '{@link report.Report#getProcessArea <em>Process Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Area</em>'.
	 * @see report.Report#getProcessArea()
	 * @see #getReport()
	 * @generated
	 */
	EAttribute getReport_ProcessArea();

	/**
	 * Returns the meta object for the attribute '{@link report.Report#getProcessInstance <em>Process Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Instance</em>'.
	 * @see report.Report#getProcessInstance()
	 * @see #getReport()
	 * @generated
	 */
	EAttribute getReport_ProcessInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link report.Report#getDetailedBy <em>Detailed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Detailed By</em>'.
	 * @see report.Report#getDetailedBy()
	 * @see #getReport()
	 * @generated
	 */
	EReference getReport_DetailedBy();

	/**
	 * Returns the meta object for class '{@link report.ReportItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see report.ReportItem
	 * @generated
	 */
	EClass getReportItem();

	/**
	 * Returns the meta object for the attribute '{@link report.ReportItem#getComplianceItemEvaluated <em>Compliance Item Evaluated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compliance Item Evaluated</em>'.
	 * @see report.ReportItem#getComplianceItemEvaluated()
	 * @see #getReportItem()
	 * @generated
	 */
	EAttribute getReportItem_ComplianceItemEvaluated();

	/**
	 * Returns the meta object for the attribute '{@link report.ReportItem#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see report.ReportItem#getQuestion()
	 * @see #getReportItem()
	 * @generated
	 */
	EAttribute getReportItem_Question();

	/**
	 * Returns the meta object for the attribute '{@link report.ReportItem#getUserAnswer <em>User Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Answer</em>'.
	 * @see report.ReportItem#getUserAnswer()
	 * @see #getReportItem()
	 * @generated
	 */
	EAttribute getReportItem_UserAnswer();

	/**
	 * Returns the meta object for the attribute '{@link report.ReportItem#getComplianceLevel <em>Compliance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compliance Level</em>'.
	 * @see report.ReportItem#getComplianceLevel()
	 * @see #getReportItem()
	 * @generated
	 */
	EAttribute getReportItem_ComplianceLevel();

	/**
	 * Returns the meta object for the attribute '{@link report.ReportItem#getItemDescription <em>Item Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Description</em>'.
	 * @see report.ReportItem#getItemDescription()
	 * @see #getReportItem()
	 * @generated
	 */
	EAttribute getReportItem_ItemDescription();

	/**
	 * Returns the meta object for the attribute '{@link report.ReportItem#getEvaluationDescription <em>Evaluation Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluation Description</em>'.
	 * @see report.ReportItem#getEvaluationDescription()
	 * @see #getReportItem()
	 * @generated
	 */
	EAttribute getReportItem_EvaluationDescription();

	/**
	 * Returns the meta object for the attribute '{@link report.ReportItem#getEvaluationResult <em>Evaluation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluation Result</em>'.
	 * @see report.ReportItem#getEvaluationResult()
	 * @see #getReportItem()
	 * @generated
	 */
	EAttribute getReportItem_EvaluationResult();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReportFactory getReportFactory();

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
		 * The meta object literal for the '{@link report.impl.ReportImpl <em>Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see report.impl.ReportImpl
		 * @see report.impl.ReportPackageImpl#getReport()
		 * @generated
		 */
		EClass REPORT = eINSTANCE.getReport();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT__DATE = eINSTANCE.getReport_Date();

		/**
		 * The meta object literal for the '<em><b>Evaluation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT__EVALUATION_TYPE = eINSTANCE.getReport_EvaluationType();

		/**
		 * The meta object literal for the '<em><b>Maturity Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT__MATURITY_MODEL = eINSTANCE.getReport_MaturityModel();

		/**
		 * The meta object literal for the '<em><b>Maturity Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT__MATURITY_LEVEL = eINSTANCE.getReport_MaturityLevel();

		/**
		 * The meta object literal for the '<em><b>Process Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT__PROCESS_AREA = eINSTANCE.getReport_ProcessArea();

		/**
		 * The meta object literal for the '<em><b>Process Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT__PROCESS_INSTANCE = eINSTANCE.getReport_ProcessInstance();

		/**
		 * The meta object literal for the '<em><b>Detailed By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT__DETAILED_BY = eINSTANCE.getReport_DetailedBy();

		/**
		 * The meta object literal for the '{@link report.impl.ReportItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see report.impl.ReportItemImpl
		 * @see report.impl.ReportPackageImpl#getReportItem()
		 * @generated
		 */
		EClass REPORT_ITEM = eINSTANCE.getReportItem();

		/**
		 * The meta object literal for the '<em><b>Compliance Item Evaluated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ITEM__COMPLIANCE_ITEM_EVALUATED = eINSTANCE.getReportItem_ComplianceItemEvaluated();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ITEM__QUESTION = eINSTANCE.getReportItem_Question();

		/**
		 * The meta object literal for the '<em><b>User Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ITEM__USER_ANSWER = eINSTANCE.getReportItem_UserAnswer();

		/**
		 * The meta object literal for the '<em><b>Compliance Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ITEM__COMPLIANCE_LEVEL = eINSTANCE.getReportItem_ComplianceLevel();

		/**
		 * The meta object literal for the '<em><b>Item Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ITEM__ITEM_DESCRIPTION = eINSTANCE.getReportItem_ItemDescription();

		/**
		 * The meta object literal for the '<em><b>Evaluation Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ITEM__EVALUATION_DESCRIPTION = eINSTANCE.getReportItem_EvaluationDescription();

		/**
		 * The meta object literal for the '<em><b>Evaluation Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ITEM__EVALUATION_RESULT = eINSTANCE.getReportItem_EvaluationResult();

	}

} //ReportPackage
