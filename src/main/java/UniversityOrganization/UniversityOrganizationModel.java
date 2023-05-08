/**
 */
package UniversityOrganization;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.UniversityOrganizationModel#getDepartments <em>Departments</em>}</li>
 *   <li>{@link UniversityOrganization.UniversityOrganizationModel#getFacultyMembers <em>Faculty Members</em>}</li>
 * </ul>
 *
 * @see UniversityOrganization.UniversityOrganizationPackage#getUniversityOrganizationModel()
 * @model
 * @generated
 */
public interface UniversityOrganizationModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Departments</b></em>' containment reference list.
	 * The list contents are of type {@link UniversityOrganization.Department}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departments</em>' containment reference list.
	 * @see UniversityOrganization.UniversityOrganizationPackage#getUniversityOrganizationModel_Departments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Department> getDepartments();

	/**
	 * Returns the value of the '<em><b>Faculty Members</b></em>' containment reference list.
	 * The list contents are of type {@link UniversityOrganization.FacultyMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faculty Members</em>' containment reference list.
	 * @see UniversityOrganization.UniversityOrganizationPackage#getUniversityOrganizationModel_FacultyMembers()
	 * @model containment="true"
	 * @generated
	 */
	EList<FacultyMember> getFacultyMembers();

} // UniversityOrganizationModel
