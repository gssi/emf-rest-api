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
 *   <li>{@link UniversityOrganization.Seminar#getVenue <em>Venue</em>}</li>
 *   <li>{@link UniversityOrganization.Seminar#getTime <em>Time</em>}</li>
 *   <li>{@link UniversityOrganization.Seminar#getRemoteLink <em>Remote Link</em>}</li>
 *   <li>{@link UniversityOrganization.Seminar#getAbstract <em>Abstract</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Venue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Venue</em>' attribute.
	 * @see #setVenue(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getSeminar_Venue()
	 * @model
	 * @generated
	 */
	String getVenue();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Seminar#getVenue <em>Venue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Venue</em>' attribute.
	 * @see #getVenue()
	 * @generated
	 */
	void setVenue(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getSeminar_Time()
	 * @model
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Seminar#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

	/**
	 * Returns the value of the '<em><b>Remote Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Link</em>' attribute.
	 * @see #setRemoteLink(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getSeminar_RemoteLink()
	 * @model
	 * @generated
	 */
	String getRemoteLink();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Seminar#getRemoteLink <em>Remote Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Link</em>' attribute.
	 * @see #getRemoteLink()
	 * @generated
	 */
	void setRemoteLink(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getSeminar_Abstract()
	 * @model
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Seminar#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

} // Seminar
