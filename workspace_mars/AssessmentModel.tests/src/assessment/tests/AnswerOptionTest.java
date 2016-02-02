/**
 */
package assessment.tests;

import assessment.AnswerOption;
import assessment.AssessmentFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Answer Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnswerOptionTest extends TestCase {

	/**
	 * The fixture for this Answer Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnswerOption fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnswerOptionTest.class);
	}

	/**
	 * Constructs a new Answer Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerOptionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Answer Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AnswerOption fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Answer Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnswerOption getFixture() {
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
		setFixture(AssessmentFactory.eINSTANCE.createAnswerOption());
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

} //AnswerOptionTest
