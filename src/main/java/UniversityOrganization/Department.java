/**
 */
package UniversityOrganization;

import org.eclipse.emf.common.util.EList;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@JsonIgnore
	EList<ResearchGroup> getResearchGroups();

} // Department
