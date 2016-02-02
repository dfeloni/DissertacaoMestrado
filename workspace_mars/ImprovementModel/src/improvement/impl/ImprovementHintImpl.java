/**
 */
package improvement.impl;

import improvement.HintComments;
import improvement.ImprovementHint;
import improvement.ImprovementPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link improvement.impl.ImprovementHintImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link improvement.impl.ImprovementHintImpl#getExample <em>Example</em>}</li>
 *   <li>{@link improvement.impl.ImprovementHintImpl#getExampleFile <em>Example File</em>}</li>
 *   <li>{@link improvement.impl.ImprovementHintImpl#getCommented <em>Commented</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImprovementHintImpl extends MinimalEObjectImpl.Container implements ImprovementHint {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected String example = EXAMPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExampleFile() <em>Example File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleFile()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExampleFile() <em>Example File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleFile()
	 * @generated
	 * @ordered
	 */
	protected String exampleFile = EXAMPLE_FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommented() <em>Commented</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommented()
	 * @generated
	 * @ordered
	 */
	protected EList<HintComments> commented;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImprovementHintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImprovementPackage.Literals.IMPROVEMENT_HINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImprovementPackage.IMPROVEMENT_HINT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExample() {
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExample(String newExample) {
		String oldExample = example;
		example = newExample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImprovementPackage.IMPROVEMENT_HINT__EXAMPLE, oldExample, example));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExampleFile() {
		return exampleFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleFile(String newExampleFile) {
		String oldExampleFile = exampleFile;
		exampleFile = newExampleFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImprovementPackage.IMPROVEMENT_HINT__EXAMPLE_FILE, oldExampleFile, exampleFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HintComments> getCommented() {
		if (commented == null) {
			commented = new EObjectContainmentEList<HintComments>(HintComments.class, this, ImprovementPackage.IMPROVEMENT_HINT__COMMENTED);
		}
		return commented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImprovementPackage.IMPROVEMENT_HINT__COMMENTED:
				return ((InternalEList<?>)getCommented()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImprovementPackage.IMPROVEMENT_HINT__DESCRIPTION:
				return getDescription();
			case ImprovementPackage.IMPROVEMENT_HINT__EXAMPLE:
				return getExample();
			case ImprovementPackage.IMPROVEMENT_HINT__EXAMPLE_FILE:
				return getExampleFile();
			case ImprovementPackage.IMPROVEMENT_HINT__COMMENTED:
				return getCommented();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImprovementPackage.IMPROVEMENT_HINT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ImprovementPackage.IMPROVEMENT_HINT__EXAMPLE:
				setExample((String)newValue);
				return;
			case ImprovementPackage.IMPROVEMENT_HINT__EXAMPLE_FILE:
				setExampleFile((String)newValue);
				return;
			case ImprovementPackage.IMPROVEMENT_HINT__COMMENTED:
				getCommented().clear();
				getCommented().addAll((Collection<? extends HintComments>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImprovementPackage.IMPROVEMENT_HINT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ImprovementPackage.IMPROVEMENT_HINT__EXAMPLE:
				setExample(EXAMPLE_EDEFAULT);
				return;
			case ImprovementPackage.IMPROVEMENT_HINT__EXAMPLE_FILE:
				setExampleFile(EXAMPLE_FILE_EDEFAULT);
				return;
			case ImprovementPackage.IMPROVEMENT_HINT__COMMENTED:
				getCommented().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImprovementPackage.IMPROVEMENT_HINT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ImprovementPackage.IMPROVEMENT_HINT__EXAMPLE:
				return EXAMPLE_EDEFAULT == null ? example != null : !EXAMPLE_EDEFAULT.equals(example);
			case ImprovementPackage.IMPROVEMENT_HINT__EXAMPLE_FILE:
				return EXAMPLE_FILE_EDEFAULT == null ? exampleFile != null : !EXAMPLE_FILE_EDEFAULT.equals(exampleFile);
			case ImprovementPackage.IMPROVEMENT_HINT__COMMENTED:
				return commented != null && !commented.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", example: ");
		result.append(example);
		result.append(", exampleFile: ");
		result.append(exampleFile);
		result.append(')');
		return result.toString();
	}

} //ImprovementHintImpl
