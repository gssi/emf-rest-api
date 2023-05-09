/**
 */
package UniversityOrganization;

import org.eclipse.emf.ecore.EObject;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.Position#getProjectTitle <em>Project Title</em>}</li>
 *   <li>{@link UniversityOrganization.Position#getGuest <em>Guest</em>}</li>
 *   <li>{@link UniversityOrganization.Position#getResearchGroup <em>Research Group</em>}</li>
 * </ul>
 *
 * @see UniversityOrganization.UniversityOrganizationPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
	/**
	 * Returns the value of the '<em><b>Project Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Title</em>' attribute.
	 * @see #setProjectTitle(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getPosition_ProjectTitle()
	 * @model
	 * @generated
	 */
	String getProjectTitle();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Position#getProjectTitle <em>Project Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Title</em>' attribute.
	 * @see #getProjectTitle()
	 * @generated
	 */
	void setProjectTitle(String value);

	/**
	 * Returns the value of the '<em><b>Guest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest</em>' containment reference.
	 * @see #setGuest(Guest)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getPosition_Guest()
	 * @model containment="true"
	 * @generated
	 */
	Guest getGuest();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Position#getGuest <em>Guest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest</em>' containment reference.
	 * @see #getGuest()
	 * @generated
	 */
	void setGuest(Guest value);

	/**
	 * Returns the value of the '<em><b>Research Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UniversityOrganization.ResearchGroup#getOpenPosition <em>Open Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Research Group</em>' reference.
	 * @see #setResearchGroup(ResearchGroup)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getPosition_ResearchGroup()
	 * @see UniversityOrganization.ResearchGroup#getOpenPosition
	 * @model opposite="openPosition" required="true"
	 * @generated
	 */
	@JsonIgnore
	ResearchGroup getResearchGroup();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Position#getResearchGroup <em>Research Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Research Group</em>' reference.
	 * @see #getResearchGroup()
	 * @generated
	 */
	void setResearchGroup(ResearchGroup value);

} // Position
