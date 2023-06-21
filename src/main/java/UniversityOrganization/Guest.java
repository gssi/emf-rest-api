/**
 */
package UniversityOrganization;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.Guest#getActivity <em>Activity</em>}</li>
 *   <li>{@link UniversityOrganization.Guest#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link UniversityOrganization.Guest#getInDate <em>In Date</em>}</li>
 *   <li>{@link UniversityOrganization.Guest#getOutDate <em>Out Date</em>}</li>
 *   <li>{@link UniversityOrganization.Guest#getRemuneration <em>Remuneration</em>}</li>
 *   <li>{@link UniversityOrganization.Guest#getInvitingPerson <em>Inviting Person</em>}</li>
 *   <li>{@link UniversityOrganization.Guest#getDepartmentDirector <em>Department Director</em>}</li>
 * </ul>
 *
 * @see UniversityOrganization.UniversityOrganizationPackage#getGuest()
 * @model
 * @generated
 */
public interface Guest extends AcademicPeople {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link UniversityOrganization.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see UniversityOrganization.UniversityOrganizationPackage#getGuest_Activity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivity();

	/**
	 * Returns the value of the '<em><b>Affiliation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affiliation</em>' attribute.
	 * @see #setAffiliation(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getGuest_Affiliation()
	 * @model required="true"
	 * @generated
	 */
	String getAffiliation();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Guest#getAffiliation <em>Affiliation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affiliation</em>' attribute.
	 * @see #getAffiliation()
	 * @generated
	 */
	void setAffiliation(String value);

	/**
	 * Returns the value of the '<em><b>In Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Date</em>' attribute.
	 * @see #setInDate(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getGuest_InDate()
	 * @model
	 * @generated
	 */
	String getInDate();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Guest#getInDate <em>In Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Date</em>' attribute.
	 * @see #getInDate()
	 * @generated
	 */
	void setInDate(String value);

	/**
	 * Returns the value of the '<em><b>Out Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Date</em>' attribute.
	 * @see #setOutDate(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getGuest_OutDate()
	 * @model
	 * @generated
	 */
	String getOutDate();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Guest#getOutDate <em>Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Date</em>' attribute.
	 * @see #getOutDate()
	 * @generated
	 */
	void setOutDate(String value);

	/**
	 * Returns the value of the '<em><b>Remuneration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remuneration</em>' containment reference.
	 * @see #setRemuneration(Remuneration)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getGuest_Remuneration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Remuneration getRemuneration();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Guest#getRemuneration <em>Remuneration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remuneration</em>' containment reference.
	 * @see #getRemuneration()
	 * @generated
	 */
	void setRemuneration(Remuneration value);

	/**
	 * Returns the value of the '<em><b>Inviting Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inviting Person</em>' reference.
	 * @see #setInvitingPerson(FacultyMember)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getGuest_InvitingPerson()
	 * @model
	 * @generated
	 */
	FacultyMember getInvitingPerson();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Guest#getInvitingPerson <em>Inviting Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inviting Person</em>' reference.
	 * @see #getInvitingPerson()
	 * @generated
	 */
	void setInvitingPerson(FacultyMember value);

	/**
	 * Returns the value of the '<em><b>Department Director</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department Director</em>' reference.
	 * @see #setDepartmentDirector(FacultyMember)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getGuest_DepartmentDirector()
	 * @model
	 * @generated
	 */
	FacultyMember getDepartmentDirector();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Guest#getDepartmentDirector <em>Department Director</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department Director</em>' reference.
	 * @see #getDepartmentDirector()
	 * @generated
	 */
	void setDepartmentDirector(FacultyMember value);

} // Guest
