/**
 */
package improvement.tests;

import improvement.HintComments;
import improvement.ImprovementFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hint Comments</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HintCommentsTest extends TestCase {

	/**
	 * The fixture for this Hint Comments test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HintComments fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HintCommentsTest.class);
	}

	/**
	 * Constructs a new Hint Comments test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HintCommentsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Hint Comments test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HintComments fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Hint Comments test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HintComments getFixture() {
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
		setFixture(ImprovementFactory.eINSTANCE.createHintComments());
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

} //HintCommentsTest
