/**
 */
package project.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import project.ProjectFactory;
import project.ProjectFeedback;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectFeedbackTest extends TestCase {

	/**
	 * The fixture for this Feedback test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectFeedback fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProjectFeedbackTest.class);
	}

	/**
	 * Constructs a new Feedback test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectFeedbackTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Feedback test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProjectFeedback fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Feedback test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectFeedback getFixture() {
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
		setFixture(ProjectFactory.eINSTANCE.createProjectFeedback());
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

} //ProjectFeedbackTest
