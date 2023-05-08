/**
 */
package UniversityOrganization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.Lecture#getHours <em>Hours</em>}</li>
 * </ul>
 *
 * @see UniversityOrganization.UniversityOrganizationPackage#getLecture()
 * @model
 * @generated
 */
public interface Lecture extends Activity {
	/**
	 * Returns the value of the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours</em>' attribute.
	 * @see #setHours(int)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getLecture_Hours()
	 * @model
	 * @generated
	 */
	int getHours();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Lecture#getHours <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours</em>' attribute.
	 * @see #getHours()
	 * @generated
	 */
	void setHours(int value);

} // Lecture
