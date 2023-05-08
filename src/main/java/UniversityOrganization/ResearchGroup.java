/**
 */
package UniversityOrganization;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Research Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.ResearchGroup#getOpenPosition <em>Open Position</em>}</li>
 * </ul>
 *
 * @see UniversityOrganization.UniversityOrganizationPackage#getResearchGroup()
 * @model
 * @generated
 */
public interface ResearchGroup extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Open Position</b></em>' reference list.
	 * The list contents are of type {@link UniversityOrganization.Position}.
	 * It is bidirectional and its opposite is '{@link UniversityOrganization.Position#getResearchGroup <em>Research Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Position</em>' reference list.
	 * @see UniversityOrganization.UniversityOrganizationPackage#getResearchGroup_OpenPosition()
	 * @see UniversityOrganization.Position#getResearchGroup
	 * @model opposite="researchGroup"
	 * @generated
	 */
	EList<Position> getOpenPosition();

} // ResearchGroup
