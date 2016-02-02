/**
 */
package report;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link report.Report#getDate <em>Date</em>}</li>
 *   <li>{@link report.Report#getEvaluationType <em>Evaluation Type</em>}</li>
 *   <li>{@link report.Report#getMaturityModel <em>Maturity Model</em>}</li>
 *   <li>{@link report.Report#getMaturityLevel <em>Maturity Level</em>}</li>
 *   <li>{@link report.Report#getProcessArea <em>Process Area</em>}</li>
 *   <li>{@link report.Report#getProcessInstance <em>Process Instance</em>}</li>
 *   <li>{@link report.Report#getDetailedBy <em>Detailed By</em>}</li>
 * </ul>
 *
 * @see report.ReportPackage#getReport()
 * @model
 * @generated
 */
public interface Report extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see report.ReportPackage#getReport_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link report.Report#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Evaluation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Type</em>' attribute.
	 * @see #setEvaluationType(String)
	 * @see report.ReportPackage#getReport_EvaluationType()
	 * @model
	 * @generated
	 */
	String getEvaluationType();

	/**
	 * Sets the value of the '{@link report.Report#getEvaluationType <em>Evaluation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Type</em>' attribute.
	 * @see #getEvaluationType()
	 * @generated
	 */
	void setEvaluationType(String value);

	/**
	 * Returns the value of the '<em><b>Maturity Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maturity Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maturity Model</em>' attribute.
	 * @see #setMaturityModel(String)
	 * @see report.ReportPackage#getReport_MaturityModel()
	 * @model
	 * @generated
	 */
	String getMaturityModel();

	/**
	 * Sets the value of the '{@link report.Report#getMaturityModel <em>Maturity Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maturity Model</em>' attribute.
	 * @see #getMaturityModel()
	 * @generated
	 */
	void setMaturityModel(String value);

	/**
	 * Returns the value of the '<em><b>Maturity Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maturity Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maturity Level</em>' attribute.
	 * @see #setMaturityLevel(String)
	 * @see report.ReportPackage#getReport_MaturityLevel()
	 * @model
	 * @generated
	 */
	String getMaturityLevel();

	/**
	 * Sets the value of the '{@link report.Report#getMaturityLevel <em>Maturity Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maturity Level</em>' attribute.
	 * @see #getMaturityLevel()
	 * @generated
	 */
	void setMaturityLevel(String value);

	/**
	 * Returns the value of the '<em><b>Process Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Area</em>' attribute.
	 * @see #setProcessArea(String)
	 * @see report.ReportPackage#getReport_ProcessArea()
	 * @model
	 * @generated
	 */
	String getProcessArea();

	/**
	 * Sets the value of the '{@link report.Report#getProcessArea <em>Process Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Area</em>' attribute.
	 * @see #getProcessArea()
	 * @generated
	 */
	void setProcessArea(String value);

	/**
	 * Returns the value of the '<em><b>Process Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Instance</em>' attribute.
	 * @see #setProcessInstance(String)
	 * @see report.ReportPackage#getReport_ProcessInstance()
	 * @model
	 * @generated
	 */
	String getProcessInstance();

	/**
	 * Sets the value of the '{@link report.Report#getProcessInstance <em>Process Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Instance</em>' attribute.
	 * @see #getProcessInstance()
	 * @generated
	 */
	void setProcessInstance(String value);

	/**
	 * Returns the value of the '<em><b>Detailed By</b></em>' containment reference list.
	 * The list contents are of type {@link report.ReportItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detailed By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detailed By</em>' containment reference list.
	 * @see report.ReportPackage#getReport_DetailedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReportItem> getDetailedBy();

} // Report
