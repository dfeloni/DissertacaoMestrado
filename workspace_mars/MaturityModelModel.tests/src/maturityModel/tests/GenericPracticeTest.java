/**
 */
package maturityModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import maturityModel.GenericPractice;
import maturityModel.MaturityModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generic Practice</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericPracticeTest extends TestCase {

	/**
	 * The fixture for this Generic Practice test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericPractice fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GenericPracticeTest.class);
	}

	/**
	 * Constructs a new Generic Practice test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericPracticeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Generic Practice test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GenericPractice fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Generic Practice test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericPractice getFixture() {
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
		setFixture(MaturityModelFactory.eINSTANCE.createGenericPractice());
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

} //GenericPracticeTest
