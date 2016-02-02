/**
 */
package structureAndBehavior.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import structureAndBehavior.StructureAndBehaviorFactory;
import structureAndBehavior.Tool;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolTest extends TestCase {

	/**
	 * The fixture for this Tool test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tool fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ToolTest.class);
	}

	/**
	 * Constructs a new Tool test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tool test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Tool fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tool test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tool getFixture() {
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
		setFixture(StructureAndBehaviorFactory.eINSTANCE.createTool());
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

} //ToolTest
