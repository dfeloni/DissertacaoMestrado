/**
 */
package taxonomy.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import taxonomy.Taxonomy;
import taxonomy.TaxonomyFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Taxonomy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaxonomyTest extends TestCase {

	/**
	 * The fixture for this Taxonomy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Taxonomy fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaxonomyTest.class);
	}

	/**
	 * Constructs a new Taxonomy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxonomyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Taxonomy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Taxonomy fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Taxonomy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Taxonomy getFixture() {
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
		setFixture(TaxonomyFactory.eINSTANCE.createTaxonomy());
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

} //TaxonomyTest
