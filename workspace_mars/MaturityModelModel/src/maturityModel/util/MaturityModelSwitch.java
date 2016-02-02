/**
 */
package maturityModel.util;

import maturityModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see maturityModel.MaturityModelPackage
 * @generated
 */
public class MaturityModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MaturityModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaturityModelSwitch() {
		if (modelPackage == null) {
			modelPackage = MaturityModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MaturityModelPackage.MATURITY_MODEL: {
				MaturityModel maturityModel = (MaturityModel)theEObject;
				T result = caseMaturityModel(maturityModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaturityModelPackage.PROCESS_AREA: {
				ProcessArea processArea = (ProcessArea)theEObject;
				T result = caseProcessArea(processArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaturityModelPackage.SPECIFIC_PRACTICE: {
				SpecificPractice specificPractice = (SpecificPractice)theEObject;
				T result = caseSpecificPractice(specificPractice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaturityModelPackage.MATURITY_LEVEL: {
				MaturityLevel maturityLevel = (MaturityLevel)theEObject;
				T result = caseMaturityLevel(maturityLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaturityModelPackage.GENERIC_PRACTICE: {
				GenericPractice genericPractice = (GenericPractice)theEObject;
				T result = caseGenericPractice(genericPractice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MaturityModelPackage.GP_SUB_PRACTICE: {
				GPSubPractice gpSubPractice = (GPSubPractice)theEObject;
				T result = caseGPSubPractice(gpSubPractice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maturity Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maturity Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaturityModel(MaturityModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessArea(ProcessArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Practice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Practice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificPractice(SpecificPractice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maturity Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maturity Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaturityLevel(MaturityLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Practice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Practice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericPractice(GenericPractice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GP Sub Practice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GP Sub Practice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGPSubPractice(GPSubPractice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MaturityModelSwitch
