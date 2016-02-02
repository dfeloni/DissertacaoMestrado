/**
 */
package maturityModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import maturityModel.MaturityModel;
import maturityModel.MaturityModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Maturity Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaturityModelTest extends TestCase {

	/**
	 * The fixture for this Maturity Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaturityModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MaturityModelTest.class);
	}

	/**
	 * Constructs a new Maturity Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaturityModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Maturity Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MaturityModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Maturity Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaturityModel getFixture() {
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
		setFixture(MaturityModelFactory.eINSTANCE.createMaturityModel());
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

} //MaturityModelTest
