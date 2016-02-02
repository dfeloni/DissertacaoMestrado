/**
 */
package structureAndBehavior.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import structureAndBehavior.StructureAndBehaviorPackage;
import structureAndBehavior.Tool;
import structureAndBehavior.ToolType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehavior.impl.ToolImpl#getName <em>Name</em>}</li>
 *   <li>{@link structureAndBehavior.impl.ToolImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link structureAndBehavior.impl.ToolImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link structureAndBehavior.impl.ToolImpl#getToolType <em>Tool Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToolImpl extends MinimalEObjectImpl.Container implements Tool {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getToolType() <em>Tool Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolType()
	 * @generated
	 * @ordered
	 */
	protected static final ToolType TOOL_TYPE_EDEFAULT = ToolType.OPEN_SOURCE;

	/**
	 * The cached value of the '{@link #getToolType() <em>Tool Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolType()
	 * @generated
	 * @ordered
	 */
	protected ToolType toolType = TOOL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureAndBehaviorPackage.Literals.TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.TOOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.TOOL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.TOOL__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolType getToolType() {
		return toolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolType(ToolType newToolType) {
		ToolType oldToolType = toolType;
		toolType = newToolType == null ? TOOL_TYPE_EDEFAULT : newToolType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviorPackage.TOOL__TOOL_TYPE, oldToolType, toolType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructureAndBehaviorPackage.TOOL__NAME:
				return getName();
			case StructureAndBehaviorPackage.TOOL__VERSION:
				return getVersion();
			case StructureAndBehaviorPackage.TOOL__URL:
				return getUrl();
			case StructureAndBehaviorPackage.TOOL__TOOL_TYPE:
				return getToolType();
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
			case StructureAndBehaviorPackage.TOOL__NAME:
				setName((String)newValue);
				return;
			case StructureAndBehaviorPackage.TOOL__VERSION:
				setVersion((String)newValue);
				return;
			case StructureAndBehaviorPackage.TOOL__URL:
				setUrl((String)newValue);
				return;
			case StructureAndBehaviorPackage.TOOL__TOOL_TYPE:
				setToolType((ToolType)newValue);
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
			case StructureAndBehaviorPackage.TOOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructureAndBehaviorPackage.TOOL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case StructureAndBehaviorPackage.TOOL__URL:
				setUrl(URL_EDEFAULT);
				return;
			case StructureAndBehaviorPackage.TOOL__TOOL_TYPE:
				setToolType(TOOL_TYPE_EDEFAULT);
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
			case StructureAndBehaviorPackage.TOOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructureAndBehaviorPackage.TOOL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case StructureAndBehaviorPackage.TOOL__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case StructureAndBehaviorPackage.TOOL__TOOL_TYPE:
				return toolType != TOOL_TYPE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", url: ");
		result.append(url);
		result.append(", toolType: ");
		result.append(toolType);
		result.append(')');
		return result.toString();
	}

} //ToolImpl
