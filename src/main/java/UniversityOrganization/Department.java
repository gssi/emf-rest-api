/**
 */
package UniversityOrganization;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.Department#getResearchGroups <em>Research Groups</em>}</li>
 *   <li>{@link UniversityOrganization.Department#getDirector <em>Director</em>}</li>
 * </ul>
 *
 * @see UniversityOrganization.UniversityOrganizationPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Research Groups</b></em>' containment reference list.
	 * The list contents are of type {@link UniversityOrganization.ResearchGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Research Groups</em>' containment reference list.
	 * @see UniversityOrganization.UniversityOrganizationPackage#getDepartment_ResearchGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResearchGroup> getResearchGroups();

	/**
	 * Returns the value of the '<em><b>Director</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Director</em>' reference.
	 * @see #setDirector(FacultyMember)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getDepartment_Director()
	 * @model required="true"
	 * @generated
	 */
	FacultyMember getDirector();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Department#getDirector <em>Director</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Director</em>' reference.
	 * @see #getDirector()
	 * @generated
	 */
	void setDirector(FacultyMember value);

} // Department
