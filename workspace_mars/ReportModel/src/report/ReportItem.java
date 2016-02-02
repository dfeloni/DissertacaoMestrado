/**
 */
package report;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link report.ReportItem#getComplianceItemEvaluated <em>Compliance Item Evaluated</em>}</li>
 *   <li>{@link report.ReportItem#getQuestion <em>Question</em>}</li>
 *   <li>{@link report.ReportItem#getUserAnswer <em>User Answer</em>}</li>
 *   <li>{@link report.ReportItem#getComplianceLevel <em>Compliance Level</em>}</li>
 *   <li>{@link report.ReportItem#getItemDescription <em>Item Description</em>}</li>
 *   <li>{@link report.ReportItem#getEvaluationDescription <em>Evaluation Description</em>}</li>
 *   <li>{@link report.ReportItem#getEvaluationResult <em>Evaluation Result</em>}</li>
 * </ul>
 *
 * @see report.ReportPackage#getReportItem()
 * @model
 * @generated
 */
public interface ReportItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Compliance Item Evaluated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compliance Item Evaluated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliance Item Evaluated</em>' attribute.
	 * @see #setComplianceItemEvaluated(String)
	 * @see report.ReportPackage#getReportItem_ComplianceItemEvaluated()
	 * @model
	 * @generated
	 */
	String getComplianceItemEvaluated();

	/**
	 * Sets the value of the '{@link report.ReportItem#getComplianceItemEvaluated <em>Compliance Item Evaluated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance Item Evaluated</em>' attribute.
	 * @see #getComplianceItemEvaluated()
	 * @generated
	 */
	void setComplianceItemEvaluated(String value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see report.ReportPackage#getReportItem_Question()
	 * @model
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link report.ReportItem#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>User Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Answer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Answer</em>' attribute.
	 * @see #setUserAnswer(String)
	 * @see report.ReportPackage#getReportItem_UserAnswer()
	 * @model
	 * @generated
	 */
	String getUserAnswer();

	/**
	 * Sets the value of the '{@link report.ReportItem#getUserAnswer <em>User Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Answer</em>' attribute.
	 * @see #getUserAnswer()
	 * @generated
	 */
	void setUserAnswer(String value);

	/**
	 * Returns the value of the '<em><b>Compliance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compliance Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliance Level</em>' attribute.
	 * @see #setComplianceLevel(String)
	 * @see report.ReportPackage#getReportItem_ComplianceLevel()
	 * @model
	 * @generated
	 */
	String getComplianceLevel();

	/**
	 * Sets the value of the '{@link report.ReportItem#getComplianceLevel <em>Compliance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance Level</em>' attribute.
	 * @see #getComplianceLevel()
	 * @generated
	 */
	void setComplianceLevel(String value);

	/**
	 * Returns the value of the '<em><b>Item Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Description</em>' attribute.
	 * @see #setItemDescription(String)
	 * @see report.ReportPackage#getReportItem_ItemDescription()
	 * @model
	 * @generated
	 */
	String getItemDescription();

	/**
	 * Sets the value of the '{@link report.ReportItem#getItemDescription <em>Item Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Description</em>' attribute.
	 * @see #getItemDescription()
	 * @generated
	 */
	void setItemDescription(String value);

	/**
	 * Returns the value of the '<em><b>Evaluation Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Description</em>' attribute.
	 * @see #setEvaluationDescription(String)
	 * @see report.ReportPackage#getReportItem_EvaluationDescription()
	 * @model
	 * @generated
	 */
	String getEvaluationDescription();

	/**
	 * Sets the value of the '{@link report.ReportItem#getEvaluationDescription <em>Evaluation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Description</em>' attribute.
	 * @see #getEvaluationDescription()
	 * @generated
	 */
	void setEvaluationDescription(String value);

	/**
	 * Returns the value of the '<em><b>Evaluation Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Result</em>' attribute.
	 * @see #setEvaluationResult(String)
	 * @see report.ReportPackage#getReportItem_EvaluationResult()
	 * @model
	 * @generated
	 */
	String getEvaluationResult();

	/**
	 * Sets the value of the '{@link report.ReportItem#getEvaluationResult <em>Evaluation Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Result</em>' attribute.
	 * @see #getEvaluationResult()
	 * @generated
	 */
	void setEvaluationResult(String value);

} // ReportItem
