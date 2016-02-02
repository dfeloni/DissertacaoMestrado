/**
 */
package structureAndBehavior.tests;

import junit.textui.TestRunner;

import structureAndBehavior.StructureAndBehaviorFactory;
import structureAndBehavior.WorkProduct;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Product</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkProductTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkProductTest.class);
	}

	/**
	 * Constructs a new Work Product test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Product test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WorkProduct getFixture() {
		return (WorkProduct)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StructureAndBehaviorFactory.eINSTANCE.createWorkProduct());
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

} //WorkProductTest
