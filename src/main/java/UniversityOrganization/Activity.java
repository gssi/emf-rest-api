/**
 */
package UniversityOrganization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.Activity#getEventDate <em>Event Date</em>}</li>
 * </ul>
 *
 * @see UniversityOrganization.UniversityOrganizationPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Date</em>' attribute.
	 * @see #setEventDate(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getActivity_EventDate()
	 * @model required="true"
	 * @generated
	 */
	String getEventDate();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Activity#getEventDate <em>Event Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Date</em>' attribute.
	 * @see #getEventDate()
	 * @generated
	 */
	void setEventDate(String value);

} // Activity
