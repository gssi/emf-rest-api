/**
 */
package UniversityOrganization.impl;

import UniversityOrganization.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class UniversityOrganizationFactoryImpl extends EFactoryImpl implements UniversityOrganizationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UniversityOrganizationFactory init() {
		try {
			UniversityOrganizationFactory theUniversityOrganizationFactory = (UniversityOrganizationFactory)EPackage.Registry.INSTANCE.getEFactory(UniversityOrganizationPackage.eNS_URI);
			if (theUniversityOrganizationFactory != null) {
				return theUniversityOrganizationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UniversityOrganizationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityOrganizationFactoryImpl() {
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
			case UniversityOrganizationPackage.UNIVERSITY_ORGANIZATION_MODEL: return createUniversityOrganizationModel();
			case UniversityOrganizationPackage.DEPARTMENT: return createDepartment();
			case UniversityOrganizationPackage.RESEARCH_GROUP: return createResearchGroup();
			case UniversityOrganizationPackage.FACULTY_MEMBER: return createFacultyMember();
			case UniversityOrganizationPackage.POSITION: return createPosition();
			case UniversityOrganizationPackage.GUEST: return createGuest();
			case UniversityOrganizationPackage.LECTURE: return createLecture();
			case UniversityOrganizationPackage.SEMINAR: return createSeminar();
			case UniversityOrganizationPackage.RESEARCH_COLLABORATION: return createResearchCollaboration();
			case UniversityOrganizationPackage.REMUNERATION: return createRemuneration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UniversityOrganizationPackage.ACADEMIC_GRADE:
				return createAcademicGradeFromString(eDataType, initialValue);
			case UniversityOrganizationPackage.PAYMENT_STATUS:
				return createPaymentStatusFromString(eDataType, initialValue);
			case UniversityOrganizationPackage.TITLE_PREFIX:
				return createTitlePrefixFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UniversityOrganizationPackage.ACADEMIC_GRADE:
				return convertAcademicGradeToString(eDataType, instanceValue);
			case UniversityOrganizationPackage.PAYMENT_STATUS:
				return convertPaymentStatusToString(eDataType, instanceValue);
			case UniversityOrganizationPackage.TITLE_PREFIX:
				return convertTitlePrefixToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityOrganizationModel createUniversityOrganizationModel() {
		UniversityOrganizationModelImpl universityOrganizationModel = new UniversityOrganizationModelImpl();
		return universityOrganizationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchGroup createResearchGroup() {
		ResearchGroupImpl researchGroup = new ResearchGroupImpl();
		return researchGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacultyMember createFacultyMember() {
		FacultyMemberImpl facultyMember = new FacultyMemberImpl();
		return facultyMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest createGuest() {
		GuestImpl guest = new GuestImpl();
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lecture createLecture() {
		LectureImpl lecture = new LectureImpl();
		return lecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seminar createSeminar() {
		SeminarImpl seminar = new SeminarImpl();
		return seminar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchCollaboration createResearchCollaboration() {
		ResearchCollaborationImpl researchCollaboration = new ResearchCollaborationImpl();
		return researchCollaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Remuneration createRemuneration() {
		RemunerationImpl remuneration = new RemunerationImpl();
		return remuneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcademicGrade createAcademicGradeFromString(EDataType eDataType, String initialValue) {
		AcademicGrade result = AcademicGrade.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAcademicGradeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentStatus createPaymentStatusFromString(EDataType eDataType, String initialValue) {
		PaymentStatus result = PaymentStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitlePrefix createTitlePrefixFromString(EDataType eDataType, String initialValue) {
		TitlePrefix result = TitlePrefix.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTitlePrefixToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityOrganizationPackage getUniversityOrganizationPackage() {
		return (UniversityOrganizationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UniversityOrganizationPackage getPackage() {
		return UniversityOrganizationPackage.eINSTANCE;
	}

} //UniversityOrganizationFactoryImpl
