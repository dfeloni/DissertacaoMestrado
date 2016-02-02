/**
 */
package report.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import report.ReportFactory;
import report.ReportItem;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportItemTest extends TestCase {

	/**
	 * The fixture for this Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportItem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReportItemTest.class);
	}

	/**
	 * Constructs a new Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportItemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReportItem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportItem getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReportFactory.eINSTANCE.createReportItem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ReportItemTest
