/**
 */
package project.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import project.ProcessElementExecution;
import project.ProjectFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Element Execution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessElementExecutionTest extends TestCase {

	/**
	 * The fixture for this Process Element Execution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessElementExecution fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessElementExecutionTest.class);
	}

	/**
	 * Constructs a new Process Element Execution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessElementExecutionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Process Element Execution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProcessElementExecution fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Process Element Execution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessElementExecution getFixture() {
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
		setFixture(ProjectFactory.eINSTANCE.createProcessElementExecution());
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

} //ProcessElementExecutionTest
