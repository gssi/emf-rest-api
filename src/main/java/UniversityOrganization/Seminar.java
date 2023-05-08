/**
 */
package UniversityOrganization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seminar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.Seminar#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @see UniversityOrganization.UniversityOrganizationPackage#getSeminar()
 * @model
 * @generated
 */
public interface Seminar extends Activity {
	/**
	 * Returns the value of the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' attribute.
	 * @see #setTopic(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getSeminar_Topic()
	 * @model
	 * @generated
	 */
	String getTopic();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Seminar#getTopic <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' attribute.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(String value);

} // Seminar
