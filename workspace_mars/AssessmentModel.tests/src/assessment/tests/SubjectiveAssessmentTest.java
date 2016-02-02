/**
 */
package assessment.tests;

import assessment.AssessmentFactory;
import assessment.SubjectiveAssessment;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subjective Assessment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubjectiveAssessmentTest extends TestCase {

	/**
	 * The fixture for this Subjective Assessment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectiveAssessment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubjectiveAssessmentTest.class);
	}

	/**
	 * Constructs a new Subjective Assessment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectiveAssessmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Subjective Assessment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SubjectiveAssessment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Subjective Assessment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectiveAssessment getFixture() {
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
		setFixture(AssessmentFactory.eINSTANCE.createSubjectiveAssessment());
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

} //SubjectiveAssessmentTest
