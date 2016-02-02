/**
 */
package improvement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see improvement.ImprovementPackage
 * @generated
 */
public interface ImprovementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImprovementFactory eINSTANCE = improvement.impl.ImprovementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hint</em>'.
	 * @generated
	 */
	ImprovementHint createImprovementHint();

	/**
	 * Returns a new object of class '<em>Hint Comments</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hint Comments</em>'.
	 * @generated
	 */
	HintComments createHintComments();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImprovementPackage getImprovementPackage();

} //ImprovementFactory
