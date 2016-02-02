/**
 */
package assessment.tests;

import assessment.AssessmentFactory;
import assessment.ExecutedAssessment;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Executed Assessment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutedAssessmentTest extends TestCase {

	/**
	 * The fixture for this Executed Assessment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutedAssessment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExecutedAssessmentTest.class);
	}

	/**
	 * Constructs a new Executed Assessment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutedAssessmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Executed Assessment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ExecutedAssessment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Executed Assessment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutedAssessment getFixture() {
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
		setFixture(AssessmentFactory.eINSTANCE.createExecutedAssessment());
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

} //ExecutedAssessmentTest
