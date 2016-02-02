/**
 */
package maturityModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import maturityModel.MaturityLevel;
import maturityModel.MaturityModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Maturity Level</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaturityLevelTest extends TestCase {

	/**
	 * The fixture for this Maturity Level test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaturityLevel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MaturityLevelTest.class);
	}

	/**
	 * Constructs a new Maturity Level test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaturityLevelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Maturity Level test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MaturityLevel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Maturity Level test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaturityLevel getFixture() {
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
		setFixture(MaturityModelFactory.eINSTANCE.createMaturityLevel());
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

} //MaturityLevelTest
