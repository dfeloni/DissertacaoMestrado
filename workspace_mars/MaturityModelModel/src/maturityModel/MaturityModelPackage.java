/**
 */
package maturityModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see maturityModel.MaturityModelFactory
 * @model kind="package"
 * @generated
 */
public interface MaturityModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "maturityModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/MaturityModelModel/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "matQlt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaturityModelPackage eINSTANCE = maturityModel.impl.MaturityModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link maturityModel.impl.MaturityModelImpl <em>Maturity Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maturityModel.impl.MaturityModelImpl
	 * @see maturityModel.impl.MaturityModelPackageImpl#getMaturityModel()
	 * @generated
	 */
	int MATURITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_MODEL__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_MODEL__RELEASE_DATE = 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_MODEL__AUTHOR = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_MODEL__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_MODEL__ACRONYM = 5;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_MODEL__URL = 6;

	/**
	 * The feature id for the '<em><b>Organizes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_MODEL__ORGANIZES = 7;

	/**
	 * The feature id for the '<em><b>Evolves Into</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_MODEL__EVOLVES_INTO = 8;

	/**
	 * The number of structural features of the '<em>Maturity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_MODEL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Maturity Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maturityModel.impl.ProcessAreaImpl <em>Process Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maturityModel.impl.ProcessAreaImpl
	 * @see maturityModel.impl.MaturityModelPackageImpl#getProcessArea()
	 * @generated
	 */
	int PROCESS_AREA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_AREA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_AREA__SHORT_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Main Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_AREA__MAIN_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_AREA__ACRONYM = 3;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_AREA__DEFINES = 4;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_AREA__IMPLEMENTS = 5;

	/**
	 * The number of structural features of the '<em>Process Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_AREA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Process Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_AREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maturityModel.impl.SpecificPracticeImpl <em>Specific Practice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maturityModel.impl.SpecificPracticeImpl
	 * @see maturityModel.impl.MaturityModelPackageImpl#getSpecificPractice()
	 * @generated
	 */
	int SPECIFIC_PRACTICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_PRACTICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_PRACTICE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_PRACTICE__ACRONYM = 2;

	/**
	 * The feature id for the '<em><b>Complementary Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_PRACTICE__COMPLEMENTARY_DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Specific Practice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_PRACTICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Specific Practice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_PRACTICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maturityModel.impl.MaturityLevelImpl <em>Maturity Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maturityModel.impl.MaturityLevelImpl
	 * @see maturityModel.impl.MaturityModelPackageImpl#getMaturityLevel()
	 * @generated
	 */
	int MATURITY_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_LEVEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_LEVEL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_LEVEL__ACRONYM = 2;

	/**
	 * The feature id for the '<em><b>Evolves Into</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_LEVEL__EVOLVES_INTO = 3;

	/**
	 * The number of structural features of the '<em>Maturity Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_LEVEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Maturity Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maturityModel.impl.GenericPracticeImpl <em>Generic Practice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maturityModel.impl.GenericPracticeImpl
	 * @see maturityModel.impl.MaturityModelPackageImpl#getGenericPractice()
	 * @generated
	 */
	int GENERIC_PRACTICE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PRACTICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PRACTICE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PRACTICE__ACRONYM = 2;

	/**
	 * The feature id for the '<em><b>Complementary Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PRACTICE__COMPLEMENTARY_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Divided</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PRACTICE__DIVIDED = 4;

	/**
	 * The number of structural features of the '<em>Generic Practice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PRACTICE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Generic Practice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_PRACTICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maturityModel.impl.GPSubPracticeImpl <em>GP Sub Practice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maturityModel.impl.GPSubPracticeImpl
	 * @see maturityModel.impl.MaturityModelPackageImpl#getGPSubPractice()
	 * @generated
	 */
	int GP_SUB_PRACTICE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GP_SUB_PRACTICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GP_SUB_PRACTICE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GP_SUB_PRACTICE__ACRONYM = 2;

	/**
	 * The number of structural features of the '<em>GP Sub Practice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GP_SUB_PRACTICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GP Sub Practice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GP_SUB_PRACTICE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link maturityModel.MaturityModel <em>Maturity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maturity Model</em>'.
	 * @see maturityModel.MaturityModel
	 * @generated
	 */
	EClass getMaturityModel();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.MaturityModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maturityModel.MaturityModel#getName()
	 * @see #getMaturityModel()
	 * @generated
	 */
	EAttribute getMaturityModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.MaturityModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see maturityModel.MaturityModel#getVersion()
	 * @see #getMaturityModel()
	 * @generated
	 */
	EAttribute getMaturityModel_Version();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.MaturityModel#getReleaseDate <em>Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Date</em>'.
	 * @see maturityModel.MaturityModel#getReleaseDate()
	 * @see #getMaturityModel()
	 * @generated
	 */
	EAttribute getMaturityModel_ReleaseDate();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.MaturityModel#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see maturityModel.MaturityModel#getAuthor()
	 * @see #getMaturityModel()
	 * @generated
	 */
	EAttribute getMaturityModel_Author();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.MaturityModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see maturityModel.MaturityModel#getDescription()
	 * @see #getMaturityModel()
	 * @generated
	 */
	EAttribute getMaturityModel_Description();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.MaturityModel#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acronym</em>'.
	 * @see maturityModel.MaturityModel#getAcronym()
	 * @see #getMaturityModel()
	 * @generated
	 */
	EAttribute getMaturityModel_Acronym();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.MaturityModel#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see maturityModel.MaturityModel#getUrl()
	 * @see #getMaturityModel()
	 * @generated
	 */
	EAttribute getMaturityModel_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link maturityModel.MaturityModel#getOrganizes <em>Organizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizes</em>'.
	 * @see maturityModel.MaturityModel#getOrganizes()
	 * @see #getMaturityModel()
	 * @generated
	 */
	EReference getMaturityModel_Organizes();

	/**
	 * Returns the meta object for the containment reference list '{@link maturityModel.MaturityModel#getEvolvesInto <em>Evolves Into</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evolves Into</em>'.
	 * @see maturityModel.MaturityModel#getEvolvesInto()
	 * @see #getMaturityModel()
	 * @generated
	 */
	EReference getMaturityModel_EvolvesInto();

	/**
	 * Returns the meta object for class '{@link maturityModel.ProcessArea <em>Process Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Area</em>'.
	 * @see maturityModel.ProcessArea
	 * @generated
	 */
	EClass getProcessArea();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.ProcessArea#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maturityModel.ProcessArea#getName()
	 * @see #getProcessArea()
	 * @generated
	 */
	EAttribute getProcessArea_Name();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.ProcessArea#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Description</em>'.
	 * @see maturityModel.ProcessArea#getShortDescription()
	 * @see #getProcessArea()
	 * @generated
	 */
	EAttribute getProcessArea_ShortDescription();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.ProcessArea#getMainDescription <em>Main Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Description</em>'.
	 * @see maturityModel.ProcessArea#getMainDescription()
	 * @see #getProcessArea()
	 * @generated
	 */
	EAttribute getProcessArea_MainDescription();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.ProcessArea#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acronym</em>'.
	 * @see maturityModel.ProcessArea#getAcronym()
	 * @see #getProcessArea()
	 * @generated
	 */
	EAttribute getProcessArea_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link maturityModel.ProcessArea#getDefines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defines</em>'.
	 * @see maturityModel.ProcessArea#getDefines()
	 * @see #getProcessArea()
	 * @generated
	 */
	EReference getProcessArea_Defines();

	/**
	 * Returns the meta object for the reference '{@link maturityModel.ProcessArea#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see maturityModel.ProcessArea#getImplements()
	 * @see #getProcessArea()
	 * @generated
	 */
	EReference getProcessArea_Implements();

	/**
	 * Returns the meta object for class '{@link maturityModel.SpecificPractice <em>Specific Practice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Practice</em>'.
	 * @see maturityModel.SpecificPractice
	 * @generated
	 */
	EClass getSpecificPractice();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.SpecificPractice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maturityModel.SpecificPractice#getName()
	 * @see #getSpecificPractice()
	 * @generated
	 */
	EAttribute getSpecificPractice_Name();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.SpecificPractice#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see maturityModel.SpecificPractice#getDescription()
	 * @see #getSpecificPractice()
	 * @generated
	 */
	EAttribute getSpecificPractice_Description();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.SpecificPractice#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acronym</em>'.
	 * @see maturityModel.SpecificPractice#getAcronym()
	 * @see #getSpecificPractice()
	 * @generated
	 */
	EAttribute getSpecificPractice_Acronym();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.SpecificPractice#getComplementaryDescription <em>Complementary Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complementary Description</em>'.
	 * @see maturityModel.SpecificPractice#getComplementaryDescription()
	 * @see #getSpecificPractice()
	 * @generated
	 */
	EAttribute getSpecificPractice_ComplementaryDescription();

	/**
	 * Returns the meta object for class '{@link maturityModel.MaturityLevel <em>Maturity Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maturity Level</em>'.
	 * @see maturityModel.MaturityLevel
	 * @generated
	 */
	EClass getMaturityLevel();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.MaturityLevel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maturityModel.MaturityLevel#getName()
	 * @see #getMaturityLevel()
	 * @generated
	 */
	EAttribute getMaturityLevel_Name();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.MaturityLevel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see maturityModel.MaturityLevel#getDescription()
	 * @see #getMaturityLevel()
	 * @generated
	 */
	EAttribute getMaturityLevel_Description();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.MaturityLevel#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acronym</em>'.
	 * @see maturityModel.MaturityLevel#getAcronym()
	 * @see #getMaturityLevel()
	 * @generated
	 */
	EAttribute getMaturityLevel_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link maturityModel.MaturityLevel#getEvolvesInto <em>Evolves Into</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evolves Into</em>'.
	 * @see maturityModel.MaturityLevel#getEvolvesInto()
	 * @see #getMaturityLevel()
	 * @generated
	 */
	EReference getMaturityLevel_EvolvesInto();

	/**
	 * Returns the meta object for class '{@link maturityModel.GenericPractice <em>Generic Practice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Practice</em>'.
	 * @see maturityModel.GenericPractice
	 * @generated
	 */
	EClass getGenericPractice();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.GenericPractice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maturityModel.GenericPractice#getName()
	 * @see #getGenericPractice()
	 * @generated
	 */
	EAttribute getGenericPractice_Name();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.GenericPractice#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see maturityModel.GenericPractice#getDescription()
	 * @see #getGenericPractice()
	 * @generated
	 */
	EAttribute getGenericPractice_Description();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.GenericPractice#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acronym</em>'.
	 * @see maturityModel.GenericPractice#getAcronym()
	 * @see #getGenericPractice()
	 * @generated
	 */
	EAttribute getGenericPractice_Acronym();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.GenericPractice#getComplementaryDescription <em>Complementary Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complementary Description</em>'.
	 * @see maturityModel.GenericPractice#getComplementaryDescription()
	 * @see #getGenericPractice()
	 * @generated
	 */
	EAttribute getGenericPractice_ComplementaryDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link maturityModel.GenericPractice#getDivided <em>Divided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Divided</em>'.
	 * @see maturityModel.GenericPractice#getDivided()
	 * @see #getGenericPractice()
	 * @generated
	 */
	EReference getGenericPractice_Divided();

	/**
	 * Returns the meta object for class '{@link maturityModel.GPSubPractice <em>GP Sub Practice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GP Sub Practice</em>'.
	 * @see maturityModel.GPSubPractice
	 * @generated
	 */
	EClass getGPSubPractice();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.GPSubPractice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maturityModel.GPSubPractice#getName()
	 * @see #getGPSubPractice()
	 * @generated
	 */
	EAttribute getGPSubPractice_Name();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.GPSubPractice#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see maturityModel.GPSubPractice#getDescription()
	 * @see #getGPSubPractice()
	 * @generated
	 */
	EAttribute getGPSubPractice_Description();

	/**
	 * Returns the meta object for the attribute '{@link maturityModel.GPSubPractice#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acronym</em>'.
	 * @see maturityModel.GPSubPractice#getAcronym()
	 * @see #getGPSubPractice()
	 * @generated
	 */
	EAttribute getGPSubPractice_Acronym();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MaturityModelFactory getMaturityModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link maturityModel.impl.MaturityModelImpl <em>Maturity Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maturityModel.impl.MaturityModelImpl
		 * @see maturityModel.impl.MaturityModelPackageImpl#getMaturityModel()
		 * @generated
		 */
		EClass MATURITY_MODEL = eINSTANCE.getMaturityModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATURITY_MODEL__NAME = eINSTANCE.getMaturityModel_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATURITY_MODEL__VERSION = eINSTANCE.getMaturityModel_Version();

		/**
		 * The meta object literal for the '<em><b>Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATURITY_MODEL__RELEASE_DATE = eINSTANCE.getMaturityModel_ReleaseDate();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATURITY_MODEL__AUTHOR = eINSTANCE.getMaturityModel_Author();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATURITY_MODEL__DESCRIPTION = eINSTANCE.getMaturityModel_Description();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATURITY_MODEL__ACRONYM = eINSTANCE.getMaturityModel_Acronym();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATURITY_MODEL__URL = eINSTANCE.getMaturityModel_Url();

		/**
		 * The meta object literal for the '<em><b>Organizes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATURITY_MODEL__ORGANIZES = eINSTANCE.getMaturityModel_Organizes();

		/**
		 * The meta object literal for the '<em><b>Evolves Into</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATURITY_MODEL__EVOLVES_INTO = eINSTANCE.getMaturityModel_EvolvesInto();

		/**
		 * The meta object literal for the '{@link maturityModel.impl.ProcessAreaImpl <em>Process Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maturityModel.impl.ProcessAreaImpl
		 * @see maturityModel.impl.MaturityModelPackageImpl#getProcessArea()
		 * @generated
		 */
		EClass PROCESS_AREA = eINSTANCE.getProcessArea();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_AREA__NAME = eINSTANCE.getProcessArea_Name();

		/**
		 * The meta object literal for the '<em><b>Short Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_AREA__SHORT_DESCRIPTION = eINSTANCE.getProcessArea_ShortDescription();

		/**
		 * The meta object literal for the '<em><b>Main Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_AREA__MAIN_DESCRIPTION = eINSTANCE.getProcessArea_MainDescription();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_AREA__ACRONYM = eINSTANCE.getProcessArea_Acronym();

		/**
		 * The meta object literal for the '<em><b>Defines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_AREA__DEFINES = eINSTANCE.getProcessArea_Defines();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_AREA__IMPLEMENTS = eINSTANCE.getProcessArea_Implements();

		/**
		 * The meta object literal for the '{@link maturityModel.impl.SpecificPracticeImpl <em>Specific Practice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maturityModel.impl.SpecificPracticeImpl
		 * @see maturityModel.impl.MaturityModelPackageImpl#getSpecificPractice()
		 * @generated
		 */
		EClass SPECIFIC_PRACTICE = eINSTANCE.getSpecificPractice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_PRACTICE__NAME = eINSTANCE.getSpecificPractice_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_PRACTICE__DESCRIPTION = eINSTANCE.getSpecificPractice_Description();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_PRACTICE__ACRONYM = eINSTANCE.getSpecificPractice_Acronym();

		/**
		 * The meta object literal for the '<em><b>Complementary Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_PRACTICE__COMPLEMENTARY_DESCRIPTION = eINSTANCE.getSpecificPractice_ComplementaryDescription();

		/**
		 * The meta object literal for the '{@link maturityModel.impl.MaturityLevelImpl <em>Maturity Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maturityModel.impl.MaturityLevelImpl
		 * @see maturityModel.impl.MaturityModelPackageImpl#getMaturityLevel()
		 * @generated
		 */
		EClass MATURITY_LEVEL = eINSTANCE.getMaturityLevel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATURITY_LEVEL__NAME = eINSTANCE.getMaturityLevel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATURITY_LEVEL__DESCRIPTION = eINSTANCE.getMaturityLevel_Description();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATURITY_LEVEL__ACRONYM = eINSTANCE.getMaturityLevel_Acronym();

		/**
		 * The meta object literal for the '<em><b>Evolves Into</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATURITY_LEVEL__EVOLVES_INTO = eINSTANCE.getMaturityLevel_EvolvesInto();

		/**
		 * The meta object literal for the '{@link maturityModel.impl.GenericPracticeImpl <em>Generic Practice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maturityModel.impl.GenericPracticeImpl
		 * @see maturityModel.impl.MaturityModelPackageImpl#getGenericPractice()
		 * @generated
		 */
		EClass GENERIC_PRACTICE = eINSTANCE.getGenericPractice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_PRACTICE__NAME = eINSTANCE.getGenericPractice_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_PRACTICE__DESCRIPTION = eINSTANCE.getGenericPractice_Description();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_PRACTICE__ACRONYM = eINSTANCE.getGenericPractice_Acronym();

		/**
		 * The meta object literal for the '<em><b>Complementary Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_PRACTICE__COMPLEMENTARY_DESCRIPTION = eINSTANCE.getGenericPractice_ComplementaryDescription();

		/**
		 * The meta object literal for the '<em><b>Divided</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_PRACTICE__DIVIDED = eINSTANCE.getGenericPractice_Divided();

		/**
		 * The meta object literal for the '{@link maturityModel.impl.GPSubPracticeImpl <em>GP Sub Practice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maturityModel.impl.GPSubPracticeImpl
		 * @see maturityModel.impl.MaturityModelPackageImpl#getGPSubPractice()
		 * @generated
		 */
		EClass GP_SUB_PRACTICE = eINSTANCE.getGPSubPractice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GP_SUB_PRACTICE__NAME = eINSTANCE.getGPSubPractice_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GP_SUB_PRACTICE__DESCRIPTION = eINSTANCE.getGPSubPractice_Description();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GP_SUB_PRACTICE__ACRONYM = eINSTANCE.getGPSubPractice_Acronym();

	}

} //MaturityModelPackage
