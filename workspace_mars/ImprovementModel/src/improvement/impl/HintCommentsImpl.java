/**
 */
package improvement.impl;

import improvement.FeedbackType;
import improvement.HintComments;
import improvement.ImprovementPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hint Comments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link improvement.impl.HintCommentsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link improvement.impl.HintCommentsImpl#getFeedbackType <em>Feedback Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HintCommentsImpl extends MinimalEObjectImpl.Container implements HintComments {
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
	 * The default value of the '{@link #getFeedbackType() <em>Feedback Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackType()
	 * @generated
	 * @ordered
	 */
	protected static final FeedbackType FEEDBACK_TYPE_EDEFAULT = FeedbackType.NEGATIVE;

	/**
	 * The cached value of the '{@link #getFeedbackType() <em>Feedback Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackType()
	 * @generated
	 * @ordered
	 */
	protected FeedbackType feedbackType = FEEDBACK_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HintCommentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImprovementPackage.Literals.HINT_COMMENTS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImprovementPackage.HINT_COMMENTS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackType getFeedbackType() {
		return feedbackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedbackType(FeedbackType newFeedbackType) {
		FeedbackType oldFeedbackType = feedbackType;
		feedbackType = newFeedbackType == null ? FEEDBACK_TYPE_EDEFAULT : newFeedbackType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImprovementPackage.HINT_COMMENTS__FEEDBACK_TYPE, oldFeedbackType, feedbackType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImprovementPackage.HINT_COMMENTS__DESCRIPTION:
				return getDescription();
			case ImprovementPackage.HINT_COMMENTS__FEEDBACK_TYPE:
				return getFeedbackType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImprovementPackage.HINT_COMMENTS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ImprovementPackage.HINT_COMMENTS__FEEDBACK_TYPE:
				setFeedbackType((FeedbackType)newValue);
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
			case ImprovementPackage.HINT_COMMENTS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ImprovementPackage.HINT_COMMENTS__FEEDBACK_TYPE:
				setFeedbackType(FEEDBACK_TYPE_EDEFAULT);
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
			case ImprovementPackage.HINT_COMMENTS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ImprovementPackage.HINT_COMMENTS__FEEDBACK_TYPE:
				return feedbackType != FEEDBACK_TYPE_EDEFAULT;
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
		result.append(", feedbackType: ");
		result.append(feedbackType);
		result.append(')');
		return result.toString();
	}

} //HintCommentsImpl
