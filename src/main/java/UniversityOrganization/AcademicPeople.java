/**
 */
package UniversityOrganization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Academic People</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.AcademicPeople#getFirstName <em>First Name</em>}</li>
 *   <li>{@link UniversityOrganization.AcademicPeople#getLastName <em>Last Name</em>}</li>
 *   <li>{@link UniversityOrganization.AcademicPeople#getEmail <em>Email</em>}</li>
 *   <li>{@link UniversityOrganization.AcademicPeople#getGrade <em>Grade</em>}</li>
 *   <li>{@link UniversityOrganization.AcademicPeople#getShortBio <em>Short Bio</em>}</li>
 *   <li>{@link UniversityOrganization.AcademicPeople#getTitlePrefix <em>Title Prefix</em>}</li>
 * </ul>
 *
 * @see UniversityOrganization.UniversityOrganizationPackage#getAcademicPeople()
 * @model abstract="true"
 * @generated
 */
public interface AcademicPeople extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getAcademicPeople_FirstName()
	 * @model required="true"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link UniversityOrganization.AcademicPeople#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getAcademicPeople_LastName()
	 * @model required="true"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link UniversityOrganization.AcademicPeople#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getAcademicPeople_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link UniversityOrganization.AcademicPeople#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * The literals are from the enumeration {@link UniversityOrganization.AcademicGrade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see UniversityOrganization.AcademicGrade
	 * @see #setGrade(AcademicGrade)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getAcademicPeople_Grade()
	 * @model
	 * @generated
	 */
	AcademicGrade getGrade();

	/**
	 * Sets the value of the '{@link UniversityOrganization.AcademicPeople#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see UniversityOrganization.AcademicGrade
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(AcademicGrade value);

	/**
	 * Returns the value of the '<em><b>Short Bio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Bio</em>' attribute.
	 * @see #setShortBio(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getAcademicPeople_ShortBio()
	 * @model
	 * @generated
	 */
	String getShortBio();

	/**
	 * Sets the value of the '{@link UniversityOrganization.AcademicPeople#getShortBio <em>Short Bio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Bio</em>' attribute.
	 * @see #getShortBio()
	 * @generated
	 */
	void setShortBio(String value);

	/**
	 * Returns the value of the '<em><b>Title Prefix</b></em>' attribute.
	 * The literals are from the enumeration {@link UniversityOrganization.TitlePrefix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Prefix</em>' attribute.
	 * @see UniversityOrganization.TitlePrefix
	 * @see #setTitlePrefix(TitlePrefix)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getAcademicPeople_TitlePrefix()
	 * @model
	 * @generated
	 */
	TitlePrefix getTitlePrefix();

	/**
	 * Sets the value of the '{@link UniversityOrganization.AcademicPeople#getTitlePrefix <em>Title Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Prefix</em>' attribute.
	 * @see UniversityOrganization.TitlePrefix
	 * @see #getTitlePrefix()
	 * @generated
	 */
	void setTitlePrefix(TitlePrefix value);

} // AcademicPeople
