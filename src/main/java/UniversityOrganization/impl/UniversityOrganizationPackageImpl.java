/**
 */
package UniversityOrganization.impl;

import UniversityOrganization.AcademicGrade;
import UniversityOrganization.AcademicPeople;
import UniversityOrganization.Activity;
import UniversityOrganization.Department;
import UniversityOrganization.FacultyMember;
import UniversityOrganization.Guest;
import UniversityOrganization.Lecture;
import UniversityOrganization.NamedElement;
import UniversityOrganization.PaymentStatus;
import UniversityOrganization.Position;
import UniversityOrganization.Remuneration;
import UniversityOrganization.ResearchCollaboration;
import UniversityOrganization.ResearchGroup;
import UniversityOrganization.Seminar;
import UniversityOrganization.TitlePrefix;
import UniversityOrganization.UniversityOrganizationFactory;
import UniversityOrganization.UniversityOrganizationModel;
import UniversityOrganization.UniversityOrganizationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniversityOrganizationPackageImpl extends EPackageImpl implements UniversityOrganizationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universityOrganizationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass researchGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facultyMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass academicPeopleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seminarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass researchCollaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remunerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum academicGradeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum titlePrefixEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see UniversityOrganization.UniversityOrganizationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UniversityOrganizationPackageImpl() {
		super(eNS_URI, UniversityOrganizationFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UniversityOrganizationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UniversityOrganizationPackage init() {
		if (isInited) return (UniversityOrganizationPackage)EPackage.Registry.INSTANCE.getEPackage(UniversityOrganizationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUniversityOrganizationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UniversityOrganizationPackageImpl theUniversityOrganizationPackage = registeredUniversityOrganizationPackage instanceof UniversityOrganizationPackageImpl ? (UniversityOrganizationPackageImpl)registeredUniversityOrganizationPackage : new UniversityOrganizationPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUniversityOrganizationPackage.createPackageContents();

		// Initialize created meta-data
		theUniversityOrganizationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUniversityOrganizationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UniversityOrganizationPackage.eNS_URI, theUniversityOrganizationPackage);
		return theUniversityOrganizationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversityOrganizationModel() {
		return universityOrganizationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversityOrganizationModel_Departments() {
		return (EReference)universityOrganizationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversityOrganizationModel_FacultyMembers() {
		return (EReference)universityOrganizationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepartment() {
		return departmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartment_ResearchGroups() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartment_Director() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResearchGroup() {
		return researchGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearchGroup_OpenPosition() {
		return (EReference)researchGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacultyMember() {
		return facultyMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacultyMember_Positions() {
		return (EReference)facultyMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacultyMember_Department() {
		return (EReference)facultyMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacultyMember_ResearchGroup() {
		return (EReference)facultyMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_ProjectTitle() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPosition_Guest() {
		return (EReference)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPosition_ResearchGroup() {
		return (EReference)positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuest() {
		return guestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuest_Activity() {
		return (EReference)guestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_Affiliation() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_InDate() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_OutDate() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuest_Remuneration() {
		return (EReference)guestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuest_InvitingPerson() {
		return (EReference)guestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuest_DepartmentDirector() {
		return (EReference)guestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcademicPeople() {
		return academicPeopleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcademicPeople_FirstName() {
		return (EAttribute)academicPeopleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcademicPeople_LastName() {
		return (EAttribute)academicPeopleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcademicPeople_Email() {
		return (EAttribute)academicPeopleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcademicPeople_Grade() {
		return (EAttribute)academicPeopleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcademicPeople_ShortBio() {
		return (EAttribute)academicPeopleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcademicPeople_TitlePrefix() {
		return (EAttribute)academicPeopleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_EventDate() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLecture() {
		return lectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLecture_Hours() {
		return (EAttribute)lectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeminar() {
		return seminarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeminar_Topic() {
		return (EAttribute)seminarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeminar_Venue() {
		return (EAttribute)seminarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeminar_Time() {
		return (EAttribute)seminarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeminar_RemoteLink() {
		return (EAttribute)seminarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeminar_Abstract() {
		return (EAttribute)seminarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResearchCollaboration() {
		return researchCollaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResearchCollaboration_Note() {
		return (EAttribute)researchCollaborationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemuneration() {
		return remunerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemuneration_TravelRefund() {
		return (EAttribute)remunerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemuneration_PerDiems() {
		return (EAttribute)remunerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemuneration_HotelPrepaid() {
		return (EAttribute)remunerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemuneration_Notes() {
		return (EAttribute)remunerationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemuneration_RemunerationTotal() {
		return (EAttribute)remunerationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemuneration_Status() {
		return (EAttribute)remunerationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAcademicGrade() {
		return academicGradeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPaymentStatus() {
		return paymentStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTitlePrefix() {
		return titlePrefixEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityOrganizationFactory getUniversityOrganizationFactory() {
		return (UniversityOrganizationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		universityOrganizationModelEClass = createEClass(UNIVERSITY_ORGANIZATION_MODEL);
		createEReference(universityOrganizationModelEClass, UNIVERSITY_ORGANIZATION_MODEL__DEPARTMENTS);
		createEReference(universityOrganizationModelEClass, UNIVERSITY_ORGANIZATION_MODEL__FACULTY_MEMBERS);

		departmentEClass = createEClass(DEPARTMENT);
		createEReference(departmentEClass, DEPARTMENT__RESEARCH_GROUPS);
		createEReference(departmentEClass, DEPARTMENT__DIRECTOR);

		researchGroupEClass = createEClass(RESEARCH_GROUP);
		createEReference(researchGroupEClass, RESEARCH_GROUP__OPEN_POSITION);

		facultyMemberEClass = createEClass(FACULTY_MEMBER);
		createEReference(facultyMemberEClass, FACULTY_MEMBER__POSITIONS);
		createEReference(facultyMemberEClass, FACULTY_MEMBER__DEPARTMENT);
		createEReference(facultyMemberEClass, FACULTY_MEMBER__RESEARCH_GROUP);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__PROJECT_TITLE);
		createEReference(positionEClass, POSITION__GUEST);
		createEReference(positionEClass, POSITION__RESEARCH_GROUP);

		guestEClass = createEClass(GUEST);
		createEReference(guestEClass, GUEST__ACTIVITY);
		createEAttribute(guestEClass, GUEST__AFFILIATION);
		createEAttribute(guestEClass, GUEST__IN_DATE);
		createEAttribute(guestEClass, GUEST__OUT_DATE);
		createEReference(guestEClass, GUEST__REMUNERATION);
		createEReference(guestEClass, GUEST__INVITING_PERSON);
		createEReference(guestEClass, GUEST__DEPARTMENT_DIRECTOR);

		academicPeopleEClass = createEClass(ACADEMIC_PEOPLE);
		createEAttribute(academicPeopleEClass, ACADEMIC_PEOPLE__FIRST_NAME);
		createEAttribute(academicPeopleEClass, ACADEMIC_PEOPLE__LAST_NAME);
		createEAttribute(academicPeopleEClass, ACADEMIC_PEOPLE__EMAIL);
		createEAttribute(academicPeopleEClass, ACADEMIC_PEOPLE__GRADE);
		createEAttribute(academicPeopleEClass, ACADEMIC_PEOPLE__SHORT_BIO);
		createEAttribute(academicPeopleEClass, ACADEMIC_PEOPLE__TITLE_PREFIX);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__EVENT_DATE);

		lectureEClass = createEClass(LECTURE);
		createEAttribute(lectureEClass, LECTURE__HOURS);

		seminarEClass = createEClass(SEMINAR);
		createEAttribute(seminarEClass, SEMINAR__TOPIC);
		createEAttribute(seminarEClass, SEMINAR__VENUE);
		createEAttribute(seminarEClass, SEMINAR__TIME);
		createEAttribute(seminarEClass, SEMINAR__REMOTE_LINK);
		createEAttribute(seminarEClass, SEMINAR__ABSTRACT);

		researchCollaborationEClass = createEClass(RESEARCH_COLLABORATION);
		createEAttribute(researchCollaborationEClass, RESEARCH_COLLABORATION__NOTE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		remunerationEClass = createEClass(REMUNERATION);
		createEAttribute(remunerationEClass, REMUNERATION__TRAVEL_REFUND);
		createEAttribute(remunerationEClass, REMUNERATION__PER_DIEMS);
		createEAttribute(remunerationEClass, REMUNERATION__HOTEL_PREPAID);
		createEAttribute(remunerationEClass, REMUNERATION__NOTES);
		createEAttribute(remunerationEClass, REMUNERATION__REMUNERATION_TOTAL);
		createEAttribute(remunerationEClass, REMUNERATION__STATUS);

		// Create enums
		academicGradeEEnum = createEEnum(ACADEMIC_GRADE);
		paymentStatusEEnum = createEEnum(PAYMENT_STATUS);
		titlePrefixEEnum = createEEnum(TITLE_PREFIX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		universityOrganizationModelEClass.getESuperTypes().add(this.getNamedElement());
		departmentEClass.getESuperTypes().add(this.getNamedElement());
		researchGroupEClass.getESuperTypes().add(this.getNamedElement());
		facultyMemberEClass.getESuperTypes().add(this.getAcademicPeople());
		guestEClass.getESuperTypes().add(this.getAcademicPeople());
		lectureEClass.getESuperTypes().add(this.getActivity());
		seminarEClass.getESuperTypes().add(this.getActivity());
		researchCollaborationEClass.getESuperTypes().add(this.getActivity());

		// Initialize classes, features, and operations; add parameters
		initEClass(universityOrganizationModelEClass, UniversityOrganizationModel.class, "UniversityOrganizationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniversityOrganizationModel_Departments(), this.getDepartment(), null, "departments", null, 0, -1, UniversityOrganizationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversityOrganizationModel_FacultyMembers(), this.getFacultyMember(), null, "facultyMembers", null, 0, -1, UniversityOrganizationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(departmentEClass, Department.class, "Department", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepartment_ResearchGroups(), this.getResearchGroup(), null, "researchGroups", null, 0, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_Director(), this.getFacultyMember(), null, "director", null, 1, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(researchGroupEClass, ResearchGroup.class, "ResearchGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResearchGroup_OpenPosition(), this.getPosition(), this.getPosition_ResearchGroup(), "openPosition", null, 0, -1, ResearchGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facultyMemberEClass, FacultyMember.class, "FacultyMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFacultyMember_Positions(), this.getPosition(), null, "positions", null, 0, -1, FacultyMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacultyMember_Department(), this.getDepartment(), null, "department", null, 1, 1, FacultyMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacultyMember_ResearchGroup(), this.getResearchGroup(), null, "researchGroup", null, 0, 1, FacultyMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_ProjectTitle(), ecorePackage.getEString(), "projectTitle", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosition_Guest(), this.getGuest(), null, "guest", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosition_ResearchGroup(), this.getResearchGroup(), this.getResearchGroup_OpenPosition(), "researchGroup", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guestEClass, Guest.class, "Guest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuest_Activity(), this.getActivity(), null, "activity", null, 0, -1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuest_Affiliation(), ecorePackage.getEString(), "affiliation", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuest_InDate(), ecorePackage.getEString(), "inDate", null, 0, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuest_OutDate(), ecorePackage.getEString(), "outDate", null, 0, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuest_Remuneration(), this.getRemuneration(), null, "remuneration", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuest_InvitingPerson(), this.getFacultyMember(), null, "invitingPerson", null, 0, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuest_DepartmentDirector(), this.getFacultyMember(), null, "departmentDirector", null, 0, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(academicPeopleEClass, AcademicPeople.class, "AcademicPeople", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcademicPeople_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, AcademicPeople.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcademicPeople_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, AcademicPeople.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcademicPeople_Email(), ecorePackage.getEString(), "email", null, 0, 1, AcademicPeople.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcademicPeople_Grade(), this.getAcademicGrade(), "grade", null, 0, 1, AcademicPeople.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcademicPeople_ShortBio(), ecorePackage.getEString(), "shortBio", null, 0, 1, AcademicPeople.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcademicPeople_TitlePrefix(), this.getTitlePrefix(), "titlePrefix", null, 0, 1, AcademicPeople.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_EventDate(), ecorePackage.getEString(), "eventDate", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lectureEClass, Lecture.class, "Lecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLecture_Hours(), ecorePackage.getEInt(), "hours", null, 0, 1, Lecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seminarEClass, Seminar.class, "Seminar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeminar_Topic(), ecorePackage.getEString(), "topic", null, 0, 1, Seminar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeminar_Venue(), ecorePackage.getEString(), "venue", null, 0, 1, Seminar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeminar_Time(), ecorePackage.getEString(), "time", null, 0, 1, Seminar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeminar_RemoteLink(), ecorePackage.getEString(), "remoteLink", null, 0, 1, Seminar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeminar_Abstract(), ecorePackage.getEString(), "abstract", null, 0, 1, Seminar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(researchCollaborationEClass, ResearchCollaboration.class, "ResearchCollaboration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResearchCollaboration_Note(), ecorePackage.getEString(), "note", null, 0, 1, ResearchCollaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remunerationEClass, Remuneration.class, "Remuneration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemuneration_TravelRefund(), ecorePackage.getEString(), "travelRefund", null, 0, 1, Remuneration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemuneration_PerDiems(), ecorePackage.getEString(), "perDiems", null, 0, 1, Remuneration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemuneration_HotelPrepaid(), ecorePackage.getEBoolean(), "hotelPrepaid", null, 0, 1, Remuneration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemuneration_Notes(), ecorePackage.getEString(), "notes", null, 0, 1, Remuneration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemuneration_RemunerationTotal(), ecorePackage.getEString(), "remunerationTotal", null, 0, 1, Remuneration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemuneration_Status(), this.getPaymentStatus(), "status", null, 0, 1, Remuneration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(academicGradeEEnum, AcademicGrade.class, "AcademicGrade");
		addEEnumLiteral(academicGradeEEnum, AcademicGrade.FULL_PROFESSOR);
		addEEnumLiteral(academicGradeEEnum, AcademicGrade.ASSOCIATE_PROFESSOR);
		addEEnumLiteral(academicGradeEEnum, AcademicGrade.RESEARCHER);

		initEEnum(paymentStatusEEnum, PaymentStatus.class, "PaymentStatus");
		addEEnumLiteral(paymentStatusEEnum, PaymentStatus.TODO);
		addEEnumLiteral(paymentStatusEEnum, PaymentStatus.IN_PROGRESS);
		addEEnumLiteral(paymentStatusEEnum, PaymentStatus.DONE);

		initEEnum(titlePrefixEEnum, TitlePrefix.class, "TitlePrefix");
		addEEnumLiteral(titlePrefixEEnum, TitlePrefix.PROF);
		addEEnumLiteral(titlePrefixEEnum, TitlePrefix.DR);
		addEEnumLiteral(titlePrefixEEnum, TitlePrefix.MR);
		addEEnumLiteral(titlePrefixEEnum, TitlePrefix.MRS);

		// Create resource
		createResource(eNS_URI);
	}

} //UniversityOrganizationPackageImpl
