/**
 */
package UniversityOrganization;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Faculty Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.FacultyMember#getPositions <em>Positions</em>}</li>
 *   <li>{@link UniversityOrganization.FacultyMember#getDepartment <em>Department</em>}</li>
 *   <li>{@link UniversityOrganization.FacultyMember#getResearchGroup <em>Research Group</em>}</li>
 * </ul>
 *
 * @see UniversityOrganization.UniversityOrganizationPackage#getFacultyMember()
 * @model
 * @generated
 */
public interface FacultyMember extends AcademicPeople {
	/**
	 * Returns the value of the '<em><b>Positions</b></em>' containment reference list.
	 * The list contents are of type {@link UniversityOrganization.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positions</em>' containment reference list.
	 * @see UniversityOrganization.UniversityOrganizationPackage#getFacultyMember_Positions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Position> getPositions();

	/**
	 * Returns the value of the '<em><b>Department</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' reference.
	 * @see #setDepartment(Department)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getFacultyMember_Department()
	 * @model required="true"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link UniversityOrganization.FacultyMember#getDepartment <em>Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

	/**
	 * Returns the value of the '<em><b>Research Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Research Group</em>' reference.
	 * @see #setResearchGroup(ResearchGroup)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getFacultyMember_ResearchGroup()
	 * @model
	 * @generated
	 */
	ResearchGroup getResearchGroup();

	/**
	 * Sets the value of the '{@link UniversityOrganization.FacultyMember#getResearchGroup <em>Research Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Research Group</em>' reference.
	 * @see #getResearchGroup()
	 * @generated
	 */
	void setResearchGroup(ResearchGroup value);

} // FacultyMember
