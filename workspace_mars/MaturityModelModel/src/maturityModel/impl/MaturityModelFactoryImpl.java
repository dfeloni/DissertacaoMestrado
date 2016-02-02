/**
 */
package maturityModel.impl;

import maturityModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaturityModelFactoryImpl extends EFactoryImpl implements MaturityModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MaturityModelFactory init() {
		try {
			MaturityModelFactory theMaturityModelFactory = (MaturityModelFactory)EPackage.Registry.INSTANCE.getEFactory(MaturityModelPackage.eNS_URI);
			if (theMaturityModelFactory != null) {
				return theMaturityModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MaturityModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaturityModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MaturityModelPackage.MATURITY_MODEL: return createMaturityModel();
			case MaturityModelPackage.PROCESS_AREA: return createProcessArea();
			case MaturityModelPackage.SPECIFIC_PRACTICE: return createSpecificPractice();
			case MaturityModelPackage.MATURITY_LEVEL: return createMaturityLevel();
			case MaturityModelPackage.GENERIC_PRACTICE: return createGenericPractice();
			case MaturityModelPackage.GP_SUB_PRACTICE: return createGPSubPractice();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaturityModel createMaturityModel() {
		MaturityModelImpl maturityModel = new MaturityModelImpl();
		return maturityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessArea createProcessArea() {
		ProcessAreaImpl processArea = new ProcessAreaImpl();
		return processArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificPractice createSpecificPractice() {
		SpecificPracticeImpl specificPractice = new SpecificPracticeImpl();
		return specificPractice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaturityLevel createMaturityLevel() {
		MaturityLevelImpl maturityLevel = new MaturityLevelImpl();
		return maturityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericPractice createGenericPractice() {
		GenericPracticeImpl genericPractice = new GenericPracticeImpl();
		return genericPractice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPSubPractice createGPSubPractice() {
		GPSubPracticeImpl gpSubPractice = new GPSubPracticeImpl();
		return gpSubPractice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaturityModelPackage getMaturityModelPackage() {
		return (MaturityModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MaturityModelPackage getPackage() {
		return MaturityModelPackage.eINSTANCE;
	}

} //MaturityModelFactoryImpl
