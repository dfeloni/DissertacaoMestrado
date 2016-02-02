/**
 */
package assessment.tests;

import assessment.AssessmentFactory;
import assessment.ScriptTemplate;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Script Template</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptTemplateTest extends TestCase {

	/**
	 * The fixture for this Script Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptTemplate fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScriptTemplateTest.class);
	}

	/**
	 * Constructs a new Script Template test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptTemplateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Script Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ScriptTemplate fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Script Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptTemplate getFixture() {
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
		setFixture(AssessmentFactory.eINSTANCE.createScriptTemplate());
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

} //ScriptTemplateTest
