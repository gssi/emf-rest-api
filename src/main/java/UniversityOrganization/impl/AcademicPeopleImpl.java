/**
 */
package UniversityOrganization.impl;

import UniversityOrganization.AcademicGrade;
import UniversityOrganization.AcademicPeople;
import UniversityOrganization.TitlePrefix;
import UniversityOrganization.UniversityOrganizationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Academic People</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.impl.AcademicPeopleImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link UniversityOrganization.impl.AcademicPeopleImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link UniversityOrganization.impl.AcademicPeopleImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link UniversityOrganization.impl.AcademicPeopleImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link UniversityOrganization.impl.AcademicPeopleImpl#getShortBio <em>Short Bio</em>}</li>
 *   <li>{@link UniversityOrganization.impl.AcademicPeopleImpl#getTitlePrefix <em>Title Prefix</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AcademicPeopleImpl extends MinimalEObjectImpl.Container implements AcademicPeople {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final AcademicGrade GRADE_EDEFAULT = AcademicGrade.FULL_PROFESSOR;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected AcademicGrade grade = GRADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortBio() <em>Short Bio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortBio()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_BIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortBio() <em>Short Bio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortBio()
	 * @generated
	 * @ordered
	 */
	protected String shortBio = SHORT_BIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitlePrefix() <em>Title Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitlePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final TitlePrefix TITLE_PREFIX_EDEFAULT = TitlePrefix.PROF;

	/**
	 * The cached value of the '{@link #getTitlePrefix() <em>Title Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitlePrefix()
	 * @generated
	 * @ordered
	 */
	protected TitlePrefix titlePrefix = TITLE_PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcademicPeopleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityOrganizationPackage.Literals.ACADEMIC_PEOPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.ACADEMIC_PEOPLE__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.ACADEMIC_PEOPLE__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.ACADEMIC_PEOPLE__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcademicGrade getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrade(AcademicGrade newGrade) {
		AcademicGrade oldGrade = grade;
		grade = newGrade == null ? GRADE_EDEFAULT : newGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.ACADEMIC_PEOPLE__GRADE, oldGrade, grade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortBio() {
		return shortBio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortBio(String newShortBio) {
		String oldShortBio = shortBio;
		shortBio = newShortBio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.ACADEMIC_PEOPLE__SHORT_BIO, oldShortBio, shortBio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitlePrefix getTitlePrefix() {
		return titlePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitlePrefix(TitlePrefix newTitlePrefix) {
		TitlePrefix oldTitlePrefix = titlePrefix;
		titlePrefix = newTitlePrefix == null ? TITLE_PREFIX_EDEFAULT : newTitlePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.ACADEMIC_PEOPLE__TITLE_PREFIX, oldTitlePrefix, titlePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__FIRST_NAME:
				return getFirstName();
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__LAST_NAME:
				return getLastName();
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__EMAIL:
				return getEmail();
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__GRADE:
				return getGrade();
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__SHORT_BIO:
				return getShortBio();
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__TITLE_PREFIX:
				return getTitlePrefix();
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
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__LAST_NAME:
				setLastName((String)newValue);
				return;
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__EMAIL:
				setEmail((String)newValue);
				return;
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__GRADE:
				setGrade((AcademicGrade)newValue);
				return;
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__SHORT_BIO:
				setShortBio((String)newValue);
				return;
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__TITLE_PREFIX:
				setTitlePrefix((TitlePrefix)newValue);
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
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__GRADE:
				setGrade(GRADE_EDEFAULT);
				return;
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__SHORT_BIO:
				setShortBio(SHORT_BIO_EDEFAULT);
				return;
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__TITLE_PREFIX:
				setTitlePrefix(TITLE_PREFIX_EDEFAULT);
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
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__GRADE:
				return grade != GRADE_EDEFAULT;
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__SHORT_BIO:
				return SHORT_BIO_EDEFAULT == null ? shortBio != null : !SHORT_BIO_EDEFAULT.equals(shortBio);
			case UniversityOrganizationPackage.ACADEMIC_PEOPLE__TITLE_PREFIX:
				return titlePrefix != TITLE_PREFIX_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", email: ");
		result.append(email);
		result.append(", grade: ");
		result.append(grade);
		result.append(", shortBio: ");
		result.append(shortBio);
		result.append(", titlePrefix: ");
		result.append(titlePrefix);
		result.append(')');
		return result.toString();
	}

} //AcademicPeopleImpl
