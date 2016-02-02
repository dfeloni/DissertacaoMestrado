/**
 */
package taxonomy.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import taxonomy.Synonym;
import taxonomy.TaxonomyFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Synonym</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SynonymTest extends TestCase {

	/**
	 * The fixture for this Synonym test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Synonym fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SynonymTest.class);
	}

	/**
	 * Constructs a new Synonym test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynonymTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Synonym test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Synonym fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Synonym test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Synonym getFixture() {
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
		setFixture(TaxonomyFactory.eINSTANCE.createSynonym());
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

} //SynonymTest
