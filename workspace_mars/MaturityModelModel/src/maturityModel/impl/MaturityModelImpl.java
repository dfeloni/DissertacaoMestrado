/**
 */
package maturityModel.impl;

import java.util.Collection;
import java.util.Date;

import maturityModel.MaturityLevel;
import maturityModel.MaturityModel;
import maturityModel.MaturityModelPackage;
import maturityModel.ProcessArea;

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
 * An implementation of the model object '<em><b>Maturity Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maturityModel.impl.MaturityModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link maturityModel.impl.MaturityModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link maturityModel.impl.MaturityModelImpl#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link maturityModel.impl.MaturityModelImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link maturityModel.impl.MaturityModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link maturityModel.impl.MaturityModelImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link maturityModel.impl.MaturityModelImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link maturityModel.impl.MaturityModelImpl#getOrganizes <em>Organizes</em>}</li>
 *   <li>{@link maturityModel.impl.MaturityModelImpl#getEvolvesInto <em>Evolves Into</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaturityModelImpl extends MinimalEObjectImpl.Container implements MaturityModel {
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
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected Date releaseDate = RELEASE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

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
	 * The default value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcronym()
	 * @generated
	 * @ordered
	 */
	protected static final String ACRONYM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcronym()
	 * @generated
	 * @ordered
	 */
	protected String acronym = ACRONYM_EDEFAULT;

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
	 * The cached value of the '{@link #getOrganizes() <em>Organizes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizes()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessArea> organizes;

	/**
	 * The cached value of the '{@link #getEvolvesInto() <em>Evolves Into</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolvesInto()
	 * @generated
	 * @ordered
	 */
	protected EList<MaturityLevel> evolvesInto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaturityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaturityModelPackage.Literals.MATURITY_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.MATURITY_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.MATURITY_MODEL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseDate(Date newReleaseDate) {
		Date oldReleaseDate = releaseDate;
		releaseDate = newReleaseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.MATURITY_MODEL__RELEASE_DATE, oldReleaseDate, releaseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.MATURITY_MODEL__AUTHOR, oldAuthor, author));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.MATURITY_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcronym() {
		return acronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcronym(String newAcronym) {
		String oldAcronym = acronym;
		acronym = newAcronym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.MATURITY_MODEL__ACRONYM, oldAcronym, acronym));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaturityModelPackage.MATURITY_MODEL__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessArea> getOrganizes() {
		if (organizes == null) {
			organizes = new EObjectContainmentEList<ProcessArea>(ProcessArea.class, this, MaturityModelPackage.MATURITY_MODEL__ORGANIZES);
		}
		return organizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaturityLevel> getEvolvesInto() {
		if (evolvesInto == null) {
			evolvesInto = new EObjectContainmentEList<MaturityLevel>(MaturityLevel.class, this, MaturityModelPackage.MATURITY_MODEL__EVOLVES_INTO);
		}
		return evolvesInto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MaturityModelPackage.MATURITY_MODEL__ORGANIZES:
				return ((InternalEList<?>)getOrganizes()).basicRemove(otherEnd, msgs);
			case MaturityModelPackage.MATURITY_MODEL__EVOLVES_INTO:
				return ((InternalEList<?>)getEvolvesInto()).basicRemove(otherEnd, msgs);
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
			case MaturityModelPackage.MATURITY_MODEL__NAME:
				return getName();
			case MaturityModelPackage.MATURITY_MODEL__VERSION:
				return getVersion();
			case MaturityModelPackage.MATURITY_MODEL__RELEASE_DATE:
				return getReleaseDate();
			case MaturityModelPackage.MATURITY_MODEL__AUTHOR:
				return getAuthor();
			case MaturityModelPackage.MATURITY_MODEL__DESCRIPTION:
				return getDescription();
			case MaturityModelPackage.MATURITY_MODEL__ACRONYM:
				return getAcronym();
			case MaturityModelPackage.MATURITY_MODEL__URL:
				return getUrl();
			case MaturityModelPackage.MATURITY_MODEL__ORGANIZES:
				return getOrganizes();
			case MaturityModelPackage.MATURITY_MODEL__EVOLVES_INTO:
				return getEvolvesInto();
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
			case MaturityModelPackage.MATURITY_MODEL__NAME:
				setName((String)newValue);
				return;
			case MaturityModelPackage.MATURITY_MODEL__VERSION:
				setVersion((String)newValue);
				return;
			case MaturityModelPackage.MATURITY_MODEL__RELEASE_DATE:
				setReleaseDate((Date)newValue);
				return;
			case MaturityModelPackage.MATURITY_MODEL__AUTHOR:
				setAuthor((String)newValue);
				return;
			case MaturityModelPackage.MATURITY_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MaturityModelPackage.MATURITY_MODEL__ACRONYM:
				setAcronym((String)newValue);
				return;
			case MaturityModelPackage.MATURITY_MODEL__URL:
				setUrl((String)newValue);
				return;
			case MaturityModelPackage.MATURITY_MODEL__ORGANIZES:
				getOrganizes().clear();
				getOrganizes().addAll((Collection<? extends ProcessArea>)newValue);
				return;
			case MaturityModelPackage.MATURITY_MODEL__EVOLVES_INTO:
				getEvolvesInto().clear();
				getEvolvesInto().addAll((Collection<? extends MaturityLevel>)newValue);
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
			case MaturityModelPackage.MATURITY_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MaturityModelPackage.MATURITY_MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case MaturityModelPackage.MATURITY_MODEL__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
				return;
			case MaturityModelPackage.MATURITY_MODEL__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case MaturityModelPackage.MATURITY_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MaturityModelPackage.MATURITY_MODEL__ACRONYM:
				setAcronym(ACRONYM_EDEFAULT);
				return;
			case MaturityModelPackage.MATURITY_MODEL__URL:
				setUrl(URL_EDEFAULT);
				return;
			case MaturityModelPackage.MATURITY_MODEL__ORGANIZES:
				getOrganizes().clear();
				return;
			case MaturityModelPackage.MATURITY_MODEL__EVOLVES_INTO:
				getEvolvesInto().clear();
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
			case MaturityModelPackage.MATURITY_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MaturityModelPackage.MATURITY_MODEL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case MaturityModelPackage.MATURITY_MODEL__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null ? releaseDate != null : !RELEASE_DATE_EDEFAULT.equals(releaseDate);
			case MaturityModelPackage.MATURITY_MODEL__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case MaturityModelPackage.MATURITY_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MaturityModelPackage.MATURITY_MODEL__ACRONYM:
				return ACRONYM_EDEFAULT == null ? acronym != null : !ACRONYM_EDEFAULT.equals(acronym);
			case MaturityModelPackage.MATURITY_MODEL__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case MaturityModelPackage.MATURITY_MODEL__ORGANIZES:
				return organizes != null && !organizes.isEmpty();
			case MaturityModelPackage.MATURITY_MODEL__EVOLVES_INTO:
				return evolvesInto != null && !evolvesInto.isEmpty();
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
		result.append(", releaseDate: ");
		result.append(releaseDate);
		result.append(", author: ");
		result.append(author);
		result.append(", description: ");
		result.append(description);
		result.append(", acronym: ");
		result.append(acronym);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //MaturityModelImpl
