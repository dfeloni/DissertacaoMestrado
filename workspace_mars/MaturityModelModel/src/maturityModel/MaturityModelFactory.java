/**
 */
package maturityModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see maturityModel.MaturityModelPackage
 * @generated
 */
public interface MaturityModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaturityModelFactory eINSTANCE = maturityModel.impl.MaturityModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Maturity Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maturity Model</em>'.
	 * @generated
	 */
	MaturityModel createMaturityModel();

	/**
	 * Returns a new object of class '<em>Process Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Area</em>'.
	 * @generated
	 */
	ProcessArea createProcessArea();

	/**
	 * Returns a new object of class '<em>Specific Practice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific Practice</em>'.
	 * @generated
	 */
	SpecificPractice createSpecificPractice();

	/**
	 * Returns a new object of class '<em>Maturity Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maturity Level</em>'.
	 * @generated
	 */
	MaturityLevel createMaturityLevel();

	/**
	 * Returns a new object of class '<em>Generic Practice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Practice</em>'.
	 * @generated
	 */
	GenericPractice createGenericPractice();

	/**
	 * Returns a new object of class '<em>GP Sub Practice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GP Sub Practice</em>'.
	 * @generated
	 */
	GPSubPractice createGPSubPractice();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MaturityModelPackage getMaturityModelPackage();

} //MaturityModelFactory
