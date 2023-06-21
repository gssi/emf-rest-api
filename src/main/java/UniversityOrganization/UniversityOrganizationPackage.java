/**
 */
package UniversityOrganization;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see UniversityOrganization.UniversityOrganizationFactory
 * @model kind="package"
 * @generated
 */
public interface UniversityOrganizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UniversityOrganization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.gssi/university_organization/v1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UniversityOrganization";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniversityOrganizationPackage eINSTANCE = UniversityOrganization.impl.UniversityOrganizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link UniversityOrganization.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.impl.NamedElementImpl
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UniversityOrganization.impl.UniversityOrganizationModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.impl.UniversityOrganizationModelImpl
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getUniversityOrganizationModel()
	 * @generated
	 */
	int UNIVERSITY_ORGANIZATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_ORGANIZATION_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Departments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_ORGANIZATION_MODEL__DEPARTMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Faculty Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_ORGANIZATION_MODEL__FACULTY_MEMBERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_ORGANIZATION_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_ORGANIZATION_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityOrganization.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.impl.DepartmentImpl
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Research Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__RESEARCH_GROUPS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Director</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__DIRECTOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityOrganization.impl.ResearchGroupImpl <em>Research Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.impl.ResearchGroupImpl
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getResearchGroup()
	 * @generated
	 */
	int RESEARCH_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_GROUP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Open Position</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_GROUP__OPEN_POSITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Research Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_GROUP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Research Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_GROUP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityOrganization.impl.AcademicPeopleImpl <em>Academic People</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.impl.AcademicPeopleImpl
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getAcademicPeople()
	 * @generated
	 */
	int ACADEMIC_PEOPLE = 6;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_PEOPLE__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_PEOPLE__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_PEOPLE__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_PEOPLE__GRADE = 3;

	/**
	 * The feature id for the '<em><b>Short Bio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_PEOPLE__SHORT_BIO = 4;

	/**
	 * The feature id for the '<em><b>Title Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_PEOPLE__TITLE_PREFIX = 5;

	/**
	 * The number of structural features of the '<em>Academic People</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_PEOPLE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Academic People</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMIC_PEOPLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UniversityOrganization.impl.FacultyMemberImpl <em>Faculty Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.impl.FacultyMemberImpl
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getFacultyMember()
	 * @generated
	 */
	int FACULTY_MEMBER = 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_MEMBER__FIRST_NAME = ACADEMIC_PEOPLE__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_MEMBER__LAST_NAME = ACADEMIC_PEOPLE__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_MEMBER__EMAIL = ACADEMIC_PEOPLE__EMAIL;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_MEMBER__GRADE = ACADEMIC_PEOPLE__GRADE;

	/**
	 * The feature id for the '<em><b>Short Bio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_MEMBER__SHORT_BIO = ACADEMIC_PEOPLE__SHORT_BIO;

	/**
	 * The feature id for the '<em><b>Title Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_MEMBER__TITLE_PREFIX = ACADEMIC_PEOPLE__TITLE_PREFIX;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_MEMBER__POSITIONS = ACADEMIC_PEOPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Department</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_MEMBER__DEPARTMENT = ACADEMIC_PEOPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Research Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_MEMBER__RESEARCH_GROUP = ACADEMIC_PEOPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Faculty Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_MEMBER_FEATURE_COUNT = ACADEMIC_PEOPLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Faculty Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_MEMBER_OPERATION_COUNT = ACADEMIC_PEOPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityOrganization.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.impl.PositionImpl
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 4;

	/**
	 * The feature id for the '<em><b>Project Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__PROJECT_TITLE = 0;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__GUEST = 1;

	/**
	 * The feature id for the '<em><b>Research Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__RESEARCH_GROUP = 2;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UniversityOrganization.impl.GuestImpl <em>Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.impl.GuestImpl
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getGuest()
	 * @generated
	 */
	int GUEST = 5;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__FIRST_NAME = ACADEMIC_PEOPLE__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__LAST_NAME = ACADEMIC_PEOPLE__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__EMAIL = ACADEMIC_PEOPLE__EMAIL;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__GRADE = ACADEMIC_PEOPLE__GRADE;

	/**
	 * The feature id for the '<em><b>Short Bio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__SHORT_BIO = ACADEMIC_PEOPLE__SHORT_BIO;

	/**
	 * The feature id for the '<em><b>Title Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__TITLE_PREFIX = ACADEMIC_PEOPLE__TITLE_PREFIX;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__ACTIVITY = ACADEMIC_PEOPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affiliation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__AFFILIATION = ACADEMIC_PEOPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__IN_DATE = ACADEMIC_PEOPLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Out Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__OUT_DATE = ACADEMIC_PEOPLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Remuneration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__REMUNERATION = ACADEMIC_PEOPLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inviting Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__INVITING_PERSON = ACADEMIC_PEOPLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Department Director</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__DEPARTMENT_DIRECTOR = ACADEMIC_PEOPLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_FEATURE_COUNT = ACADEMIC_PEOPLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_OPERATION_COUNT = ACADEMIC_PEOPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityOrganization.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.impl.ActivityImpl
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 7;

	/**
	 * The feature id for the '<em><b>Event Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EVENT_DATE = 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UniversityOrganization.impl.LectureImpl <em>Lecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.impl.LectureImpl
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getLecture()
	 * @generated
	 */
	int LECTURE = 8;

	/**
	 * The feature id for the '<em><b>Event Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE__EVENT_DATE = ACTIVITY__EVENT_DATE;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE__HOURS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityOrganization.impl.SeminarImpl <em>Seminar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.impl.SeminarImpl
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getSeminar()
	 * @generated
	 */
	int SEMINAR = 9;

	/**
	 * The feature id for the '<em><b>Event Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMINAR__EVENT_DATE = ACTIVITY__EVENT_DATE;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMINAR__TOPIC = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Venue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMINAR__VENUE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMINAR__TIME = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remote Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMINAR__REMOTE_LINK = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMINAR__ABSTRACT = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Seminar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMINAR_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Seminar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMINAR_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityOrganization.impl.ResearchCollaborationImpl <em>Research Collaboration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.impl.ResearchCollaborationImpl
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getResearchCollaboration()
	 * @generated
	 */
	int RESEARCH_COLLABORATION = 10;

	/**
	 * The feature id for the '<em><b>Event Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_COLLABORATION__EVENT_DATE = ACTIVITY__EVENT_DATE;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_COLLABORATION__NOTE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Research Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_COLLABORATION_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Research Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCH_COLLABORATION_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversityOrganization.impl.RemunerationImpl <em>Remuneration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.impl.RemunerationImpl
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getRemuneration()
	 * @generated
	 */
	int REMUNERATION = 12;

	/**
	 * The feature id for the '<em><b>Travel Refund</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMUNERATION__TRAVEL_REFUND = 0;

	/**
	 * The feature id for the '<em><b>Per Diems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMUNERATION__PER_DIEMS = 1;

	/**
	 * The feature id for the '<em><b>Hotel Prepaid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMUNERATION__HOTEL_PREPAID = 2;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMUNERATION__NOTES = 3;

	/**
	 * The feature id for the '<em><b>Remuneration Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMUNERATION__REMUNERATION_TOTAL = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMUNERATION__STATUS = 5;

	/**
	 * The number of structural features of the '<em>Remuneration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMUNERATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Remuneration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMUNERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UniversityOrganization.AcademicGrade <em>Academic Grade</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.AcademicGrade
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getAcademicGrade()
	 * @generated
	 */
	int ACADEMIC_GRADE = 13;

	/**
	 * The meta object id for the '{@link UniversityOrganization.PaymentStatus <em>Payment Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.PaymentStatus
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getPaymentStatus()
	 * @generated
	 */
	int PAYMENT_STATUS = 14;

	/**
	 * The meta object id for the '{@link UniversityOrganization.TitlePrefix <em>Title Prefix</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversityOrganization.TitlePrefix
	 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getTitlePrefix()
	 * @generated
	 */
	int TITLE_PREFIX = 15;


	/**
	 * Returns the meta object for class '{@link UniversityOrganization.UniversityOrganizationModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see UniversityOrganization.UniversityOrganizationModel
	 * @generated
	 */
	EClass getUniversityOrganizationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversityOrganization.UniversityOrganizationModel#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departments</em>'.
	 * @see UniversityOrganization.UniversityOrganizationModel#getDepartments()
	 * @see #getUniversityOrganizationModel()
	 * @generated
	 */
	EReference getUniversityOrganizationModel_Departments();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversityOrganization.UniversityOrganizationModel#getFacultyMembers <em>Faculty Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Faculty Members</em>'.
	 * @see UniversityOrganization.UniversityOrganizationModel#getFacultyMembers()
	 * @see #getUniversityOrganizationModel()
	 * @generated
	 */
	EReference getUniversityOrganizationModel_FacultyMembers();

	/**
	 * Returns the meta object for class '{@link UniversityOrganization.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see UniversityOrganization.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversityOrganization.Department#getResearchGroups <em>Research Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Research Groups</em>'.
	 * @see UniversityOrganization.Department#getResearchGroups()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_ResearchGroups();

	/**
	 * Returns the meta object for the reference '{@link UniversityOrganization.Department#getDirector <em>Director</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Director</em>'.
	 * @see UniversityOrganization.Department#getDirector()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Director();

	/**
	 * Returns the meta object for class '{@link UniversityOrganization.ResearchGroup <em>Research Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Research Group</em>'.
	 * @see UniversityOrganization.ResearchGroup
	 * @generated
	 */
	EClass getResearchGroup();

	/**
	 * Returns the meta object for the reference list '{@link UniversityOrganization.ResearchGroup#getOpenPosition <em>Open Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Open Position</em>'.
	 * @see UniversityOrganization.ResearchGroup#getOpenPosition()
	 * @see #getResearchGroup()
	 * @generated
	 */
	EReference getResearchGroup_OpenPosition();

	/**
	 * Returns the meta object for class '{@link UniversityOrganization.FacultyMember <em>Faculty Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Faculty Member</em>'.
	 * @see UniversityOrganization.FacultyMember
	 * @generated
	 */
	EClass getFacultyMember();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversityOrganization.FacultyMember#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Positions</em>'.
	 * @see UniversityOrganization.FacultyMember#getPositions()
	 * @see #getFacultyMember()
	 * @generated
	 */
	EReference getFacultyMember_Positions();

	/**
	 * Returns the meta object for the reference '{@link UniversityOrganization.FacultyMember#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Department</em>'.
	 * @see UniversityOrganization.FacultyMember#getDepartment()
	 * @see #getFacultyMember()
	 * @generated
	 */
	EReference getFacultyMember_Department();

	/**
	 * Returns the meta object for the reference '{@link UniversityOrganization.FacultyMember#getResearchGroup <em>Research Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Research Group</em>'.
	 * @see UniversityOrganization.FacultyMember#getResearchGroup()
	 * @see #getFacultyMember()
	 * @generated
	 */
	EReference getFacultyMember_ResearchGroup();

	/**
	 * Returns the meta object for class '{@link UniversityOrganization.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see UniversityOrganization.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Position#getProjectTitle <em>Project Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Title</em>'.
	 * @see UniversityOrganization.Position#getProjectTitle()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_ProjectTitle();

	/**
	 * Returns the meta object for the containment reference '{@link UniversityOrganization.Position#getGuest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guest</em>'.
	 * @see UniversityOrganization.Position#getGuest()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_Guest();

	/**
	 * Returns the meta object for the reference '{@link UniversityOrganization.Position#getResearchGroup <em>Research Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Research Group</em>'.
	 * @see UniversityOrganization.Position#getResearchGroup()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_ResearchGroup();

	/**
	 * Returns the meta object for class '{@link UniversityOrganization.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest</em>'.
	 * @see UniversityOrganization.Guest
	 * @generated
	 */
	EClass getGuest();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversityOrganization.Guest#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see UniversityOrganization.Guest#getActivity()
	 * @see #getGuest()
	 * @generated
	 */
	EReference getGuest_Activity();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Guest#getAffiliation <em>Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affiliation</em>'.
	 * @see UniversityOrganization.Guest#getAffiliation()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Affiliation();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Guest#getInDate <em>In Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Date</em>'.
	 * @see UniversityOrganization.Guest#getInDate()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_InDate();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Guest#getOutDate <em>Out Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Date</em>'.
	 * @see UniversityOrganization.Guest#getOutDate()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_OutDate();

	/**
	 * Returns the meta object for the containment reference '{@link UniversityOrganization.Guest#getRemuneration <em>Remuneration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remuneration</em>'.
	 * @see UniversityOrganization.Guest#getRemuneration()
	 * @see #getGuest()
	 * @generated
	 */
	EReference getGuest_Remuneration();

	/**
	 * Returns the meta object for the reference '{@link UniversityOrganization.Guest#getInvitingPerson <em>Inviting Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inviting Person</em>'.
	 * @see UniversityOrganization.Guest#getInvitingPerson()
	 * @see #getGuest()
	 * @generated
	 */
	EReference getGuest_InvitingPerson();

	/**
	 * Returns the meta object for the reference '{@link UniversityOrganization.Guest#getDepartmentDirector <em>Department Director</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Department Director</em>'.
	 * @see UniversityOrganization.Guest#getDepartmentDirector()
	 * @see #getGuest()
	 * @generated
	 */
	EReference getGuest_DepartmentDirector();

	/**
	 * Returns the meta object for class '{@link UniversityOrganization.AcademicPeople <em>Academic People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Academic People</em>'.
	 * @see UniversityOrganization.AcademicPeople
	 * @generated
	 */
	EClass getAcademicPeople();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.AcademicPeople#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see UniversityOrganization.AcademicPeople#getFirstName()
	 * @see #getAcademicPeople()
	 * @generated
	 */
	EAttribute getAcademicPeople_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.AcademicPeople#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see UniversityOrganization.AcademicPeople#getLastName()
	 * @see #getAcademicPeople()
	 * @generated
	 */
	EAttribute getAcademicPeople_LastName();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.AcademicPeople#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see UniversityOrganization.AcademicPeople#getEmail()
	 * @see #getAcademicPeople()
	 * @generated
	 */
	EAttribute getAcademicPeople_Email();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.AcademicPeople#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see UniversityOrganization.AcademicPeople#getGrade()
	 * @see #getAcademicPeople()
	 * @generated
	 */
	EAttribute getAcademicPeople_Grade();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.AcademicPeople#getShortBio <em>Short Bio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Bio</em>'.
	 * @see UniversityOrganization.AcademicPeople#getShortBio()
	 * @see #getAcademicPeople()
	 * @generated
	 */
	EAttribute getAcademicPeople_ShortBio();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.AcademicPeople#getTitlePrefix <em>Title Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Prefix</em>'.
	 * @see UniversityOrganization.AcademicPeople#getTitlePrefix()
	 * @see #getAcademicPeople()
	 * @generated
	 */
	EAttribute getAcademicPeople_TitlePrefix();

	/**
	 * Returns the meta object for class '{@link UniversityOrganization.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see UniversityOrganization.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Activity#getEventDate <em>Event Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Date</em>'.
	 * @see UniversityOrganization.Activity#getEventDate()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_EventDate();

	/**
	 * Returns the meta object for class '{@link UniversityOrganization.Lecture <em>Lecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lecture</em>'.
	 * @see UniversityOrganization.Lecture
	 * @generated
	 */
	EClass getLecture();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Lecture#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see UniversityOrganization.Lecture#getHours()
	 * @see #getLecture()
	 * @generated
	 */
	EAttribute getLecture_Hours();

	/**
	 * Returns the meta object for class '{@link UniversityOrganization.Seminar <em>Seminar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seminar</em>'.
	 * @see UniversityOrganization.Seminar
	 * @generated
	 */
	EClass getSeminar();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Seminar#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see UniversityOrganization.Seminar#getTopic()
	 * @see #getSeminar()
	 * @generated
	 */
	EAttribute getSeminar_Topic();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Seminar#getVenue <em>Venue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Venue</em>'.
	 * @see UniversityOrganization.Seminar#getVenue()
	 * @see #getSeminar()
	 * @generated
	 */
	EAttribute getSeminar_Venue();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Seminar#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see UniversityOrganization.Seminar#getTime()
	 * @see #getSeminar()
	 * @generated
	 */
	EAttribute getSeminar_Time();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Seminar#getRemoteLink <em>Remote Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Link</em>'.
	 * @see UniversityOrganization.Seminar#getRemoteLink()
	 * @see #getSeminar()
	 * @generated
	 */
	EAttribute getSeminar_RemoteLink();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Seminar#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see UniversityOrganization.Seminar#getAbstract()
	 * @see #getSeminar()
	 * @generated
	 */
	EAttribute getSeminar_Abstract();

	/**
	 * Returns the meta object for class '{@link UniversityOrganization.ResearchCollaboration <em>Research Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Research Collaboration</em>'.
	 * @see UniversityOrganization.ResearchCollaboration
	 * @generated
	 */
	EClass getResearchCollaboration();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.ResearchCollaboration#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see UniversityOrganization.ResearchCollaboration#getNote()
	 * @see #getResearchCollaboration()
	 * @generated
	 */
	EAttribute getResearchCollaboration_Note();

	/**
	 * Returns the meta object for class '{@link UniversityOrganization.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see UniversityOrganization.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UniversityOrganization.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link UniversityOrganization.Remuneration <em>Remuneration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remuneration</em>'.
	 * @see UniversityOrganization.Remuneration
	 * @generated
	 */
	EClass getRemuneration();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Remuneration#getTravelRefund <em>Travel Refund</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Refund</em>'.
	 * @see UniversityOrganization.Remuneration#getTravelRefund()
	 * @see #getRemuneration()
	 * @generated
	 */
	EAttribute getRemuneration_TravelRefund();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Remuneration#getPerDiems <em>Per Diems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Per Diems</em>'.
	 * @see UniversityOrganization.Remuneration#getPerDiems()
	 * @see #getRemuneration()
	 * @generated
	 */
	EAttribute getRemuneration_PerDiems();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Remuneration#isHotelPrepaid <em>Hotel Prepaid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hotel Prepaid</em>'.
	 * @see UniversityOrganization.Remuneration#isHotelPrepaid()
	 * @see #getRemuneration()
	 * @generated
	 */
	EAttribute getRemuneration_HotelPrepaid();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Remuneration#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see UniversityOrganization.Remuneration#getNotes()
	 * @see #getRemuneration()
	 * @generated
	 */
	EAttribute getRemuneration_Notes();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Remuneration#getRemunerationTotal <em>Remuneration Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remuneration Total</em>'.
	 * @see UniversityOrganization.Remuneration#getRemunerationTotal()
	 * @see #getRemuneration()
	 * @generated
	 */
	EAttribute getRemuneration_RemunerationTotal();

	/**
	 * Returns the meta object for the attribute '{@link UniversityOrganization.Remuneration#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see UniversityOrganization.Remuneration#getStatus()
	 * @see #getRemuneration()
	 * @generated
	 */
	EAttribute getRemuneration_Status();

	/**
	 * Returns the meta object for enum '{@link UniversityOrganization.AcademicGrade <em>Academic Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Academic Grade</em>'.
	 * @see UniversityOrganization.AcademicGrade
	 * @generated
	 */
	EEnum getAcademicGrade();

	/**
	 * Returns the meta object for enum '{@link UniversityOrganization.PaymentStatus <em>Payment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Status</em>'.
	 * @see UniversityOrganization.PaymentStatus
	 * @generated
	 */
	EEnum getPaymentStatus();

	/**
	 * Returns the meta object for enum '{@link UniversityOrganization.TitlePrefix <em>Title Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Title Prefix</em>'.
	 * @see UniversityOrganization.TitlePrefix
	 * @generated
	 */
	EEnum getTitlePrefix();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UniversityOrganizationFactory getUniversityOrganizationFactory();

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
		 * The meta object literal for the '{@link UniversityOrganization.impl.UniversityOrganizationModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.impl.UniversityOrganizationModelImpl
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getUniversityOrganizationModel()
		 * @generated
		 */
		EClass UNIVERSITY_ORGANIZATION_MODEL = eINSTANCE.getUniversityOrganizationModel();

		/**
		 * The meta object literal for the '<em><b>Departments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY_ORGANIZATION_MODEL__DEPARTMENTS = eINSTANCE.getUniversityOrganizationModel_Departments();

		/**
		 * The meta object literal for the '<em><b>Faculty Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY_ORGANIZATION_MODEL__FACULTY_MEMBERS = eINSTANCE.getUniversityOrganizationModel_FacultyMembers();

		/**
		 * The meta object literal for the '{@link UniversityOrganization.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.impl.DepartmentImpl
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Research Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__RESEARCH_GROUPS = eINSTANCE.getDepartment_ResearchGroups();

		/**
		 * The meta object literal for the '<em><b>Director</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__DIRECTOR = eINSTANCE.getDepartment_Director();

		/**
		 * The meta object literal for the '{@link UniversityOrganization.impl.ResearchGroupImpl <em>Research Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.impl.ResearchGroupImpl
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getResearchGroup()
		 * @generated
		 */
		EClass RESEARCH_GROUP = eINSTANCE.getResearchGroup();

		/**
		 * The meta object literal for the '<em><b>Open Position</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESEARCH_GROUP__OPEN_POSITION = eINSTANCE.getResearchGroup_OpenPosition();

		/**
		 * The meta object literal for the '{@link UniversityOrganization.impl.FacultyMemberImpl <em>Faculty Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.impl.FacultyMemberImpl
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getFacultyMember()
		 * @generated
		 */
		EClass FACULTY_MEMBER = eINSTANCE.getFacultyMember();

		/**
		 * The meta object literal for the '<em><b>Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACULTY_MEMBER__POSITIONS = eINSTANCE.getFacultyMember_Positions();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACULTY_MEMBER__DEPARTMENT = eINSTANCE.getFacultyMember_Department();

		/**
		 * The meta object literal for the '<em><b>Research Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACULTY_MEMBER__RESEARCH_GROUP = eINSTANCE.getFacultyMember_ResearchGroup();

		/**
		 * The meta object literal for the '{@link UniversityOrganization.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.impl.PositionImpl
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Project Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__PROJECT_TITLE = eINSTANCE.getPosition_ProjectTitle();

		/**
		 * The meta object literal for the '<em><b>Guest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__GUEST = eINSTANCE.getPosition_Guest();

		/**
		 * The meta object literal for the '<em><b>Research Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__RESEARCH_GROUP = eINSTANCE.getPosition_ResearchGroup();

		/**
		 * The meta object literal for the '{@link UniversityOrganization.impl.GuestImpl <em>Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.impl.GuestImpl
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getGuest()
		 * @generated
		 */
		EClass GUEST = eINSTANCE.getGuest();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUEST__ACTIVITY = eINSTANCE.getGuest_Activity();

		/**
		 * The meta object literal for the '<em><b>Affiliation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__AFFILIATION = eINSTANCE.getGuest_Affiliation();

		/**
		 * The meta object literal for the '<em><b>In Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__IN_DATE = eINSTANCE.getGuest_InDate();

		/**
		 * The meta object literal for the '<em><b>Out Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__OUT_DATE = eINSTANCE.getGuest_OutDate();

		/**
		 * The meta object literal for the '<em><b>Remuneration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUEST__REMUNERATION = eINSTANCE.getGuest_Remuneration();

		/**
		 * The meta object literal for the '<em><b>Inviting Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUEST__INVITING_PERSON = eINSTANCE.getGuest_InvitingPerson();

		/**
		 * The meta object literal for the '<em><b>Department Director</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUEST__DEPARTMENT_DIRECTOR = eINSTANCE.getGuest_DepartmentDirector();

		/**
		 * The meta object literal for the '{@link UniversityOrganization.impl.AcademicPeopleImpl <em>Academic People</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.impl.AcademicPeopleImpl
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getAcademicPeople()
		 * @generated
		 */
		EClass ACADEMIC_PEOPLE = eINSTANCE.getAcademicPeople();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACADEMIC_PEOPLE__FIRST_NAME = eINSTANCE.getAcademicPeople_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACADEMIC_PEOPLE__LAST_NAME = eINSTANCE.getAcademicPeople_LastName();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACADEMIC_PEOPLE__EMAIL = eINSTANCE.getAcademicPeople_Email();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACADEMIC_PEOPLE__GRADE = eINSTANCE.getAcademicPeople_Grade();

		/**
		 * The meta object literal for the '<em><b>Short Bio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACADEMIC_PEOPLE__SHORT_BIO = eINSTANCE.getAcademicPeople_ShortBio();

		/**
		 * The meta object literal for the '<em><b>Title Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACADEMIC_PEOPLE__TITLE_PREFIX = eINSTANCE.getAcademicPeople_TitlePrefix();

		/**
		 * The meta object literal for the '{@link UniversityOrganization.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.impl.ActivityImpl
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Event Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__EVENT_DATE = eINSTANCE.getActivity_EventDate();

		/**
		 * The meta object literal for the '{@link UniversityOrganization.impl.LectureImpl <em>Lecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.impl.LectureImpl
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getLecture()
		 * @generated
		 */
		EClass LECTURE = eINSTANCE.getLecture();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LECTURE__HOURS = eINSTANCE.getLecture_Hours();

		/**
		 * The meta object literal for the '{@link UniversityOrganization.impl.SeminarImpl <em>Seminar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.impl.SeminarImpl
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getSeminar()
		 * @generated
		 */
		EClass SEMINAR = eINSTANCE.getSeminar();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMINAR__TOPIC = eINSTANCE.getSeminar_Topic();

		/**
		 * The meta object literal for the '<em><b>Venue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMINAR__VENUE = eINSTANCE.getSeminar_Venue();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMINAR__TIME = eINSTANCE.getSeminar_Time();

		/**
		 * The meta object literal for the '<em><b>Remote Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMINAR__REMOTE_LINK = eINSTANCE.getSeminar_RemoteLink();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMINAR__ABSTRACT = eINSTANCE.getSeminar_Abstract();

		/**
		 * The meta object literal for the '{@link UniversityOrganization.impl.ResearchCollaborationImpl <em>Research Collaboration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.impl.ResearchCollaborationImpl
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getResearchCollaboration()
		 * @generated
		 */
		EClass RESEARCH_COLLABORATION = eINSTANCE.getResearchCollaboration();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESEARCH_COLLABORATION__NOTE = eINSTANCE.getResearchCollaboration_Note();

		/**
		 * The meta object literal for the '{@link UniversityOrganization.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.impl.NamedElementImpl
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link UniversityOrganization.impl.RemunerationImpl <em>Remuneration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.impl.RemunerationImpl
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getRemuneration()
		 * @generated
		 */
		EClass REMUNERATION = eINSTANCE.getRemuneration();

		/**
		 * The meta object literal for the '<em><b>Travel Refund</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMUNERATION__TRAVEL_REFUND = eINSTANCE.getRemuneration_TravelRefund();

		/**
		 * The meta object literal for the '<em><b>Per Diems</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMUNERATION__PER_DIEMS = eINSTANCE.getRemuneration_PerDiems();

		/**
		 * The meta object literal for the '<em><b>Hotel Prepaid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMUNERATION__HOTEL_PREPAID = eINSTANCE.getRemuneration_HotelPrepaid();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMUNERATION__NOTES = eINSTANCE.getRemuneration_Notes();

		/**
		 * The meta object literal for the '<em><b>Remuneration Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMUNERATION__REMUNERATION_TOTAL = eINSTANCE.getRemuneration_RemunerationTotal();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMUNERATION__STATUS = eINSTANCE.getRemuneration_Status();

		/**
		 * The meta object literal for the '{@link UniversityOrganization.AcademicGrade <em>Academic Grade</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.AcademicGrade
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getAcademicGrade()
		 * @generated
		 */
		EEnum ACADEMIC_GRADE = eINSTANCE.getAcademicGrade();

		/**
		 * The meta object literal for the '{@link UniversityOrganization.PaymentStatus <em>Payment Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.PaymentStatus
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getPaymentStatus()
		 * @generated
		 */
		EEnum PAYMENT_STATUS = eINSTANCE.getPaymentStatus();

		/**
		 * The meta object literal for the '{@link UniversityOrganization.TitlePrefix <em>Title Prefix</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversityOrganization.TitlePrefix
		 * @see UniversityOrganization.impl.UniversityOrganizationPackageImpl#getTitlePrefix()
		 * @generated
		 */
		EEnum TITLE_PREFIX = eINSTANCE.getTitlePrefix();

	}

} //UniversityOrganizationPackage
