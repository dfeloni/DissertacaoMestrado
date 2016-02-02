/**
 */
package assessment.tests;

import assessment.AssessmentFactory;
import assessment.ObjectiveAssessment;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Objective Assessment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectiveAssessmentTest extends TestCase {

	/**
	 * The fixture for this Objective Assessment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveAssessment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObjectiveAssessmentTest.class);
	}

	/**
	 * Constructs a new Objective Assessment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveAssessmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Objective Assessment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ObjectiveAssessment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Objective Assessment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveAssessment getFixture() {
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
		setFixture(AssessmentFactory.eINSTANCE.createObjectiveAssessment());
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

} //ObjectiveAssessmentTest
