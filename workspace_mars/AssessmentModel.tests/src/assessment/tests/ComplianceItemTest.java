/**
 */
package assessment.tests;

import assessment.AssessmentFactory;
import assessment.ComplianceItem;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Compliance Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplianceItemTest extends TestCase {

	/**
	 * The fixture for this Compliance Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplianceItem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComplianceItemTest.class);
	}

	/**
	 * Constructs a new Compliance Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplianceItemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Compliance Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ComplianceItem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Compliance Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplianceItem getFixture() {
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
		setFixture(AssessmentFactory.eINSTANCE.createComplianceItem());
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

} //ComplianceItemTest
