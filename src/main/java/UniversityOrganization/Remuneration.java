/**
 */
package UniversityOrganization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remuneration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.Remuneration#getTravelRefund <em>Travel Refund</em>}</li>
 *   <li>{@link UniversityOrganization.Remuneration#getPerDiems <em>Per Diems</em>}</li>
 *   <li>{@link UniversityOrganization.Remuneration#isHotelPrepaid <em>Hotel Prepaid</em>}</li>
 *   <li>{@link UniversityOrganization.Remuneration#getNotes <em>Notes</em>}</li>
 *   <li>{@link UniversityOrganization.Remuneration#getRemunerationTotal <em>Remuneration Total</em>}</li>
 * </ul>
 *
 * @see UniversityOrganization.UniversityOrganizationPackage#getRemuneration()
 * @model
 * @generated
 */
public interface Remuneration extends EObject {
	/**
	 * Returns the value of the '<em><b>Travel Refund</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Refund</em>' attribute.
	 * @see #setTravelRefund(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getRemuneration_TravelRefund()
	 * @model
	 * @generated
	 */
	String getTravelRefund();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Remuneration#getTravelRefund <em>Travel Refund</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Refund</em>' attribute.
	 * @see #getTravelRefund()
	 * @generated
	 */
	void setTravelRefund(String value);

	/**
	 * Returns the value of the '<em><b>Per Diems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Per Diems</em>' attribute.
	 * @see #setPerDiems(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getRemuneration_PerDiems()
	 * @model
	 * @generated
	 */
	String getPerDiems();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Remuneration#getPerDiems <em>Per Diems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Per Diems</em>' attribute.
	 * @see #getPerDiems()
	 * @generated
	 */
	void setPerDiems(String value);

	/**
	 * Returns the value of the '<em><b>Hotel Prepaid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hotel Prepaid</em>' attribute.
	 * @see #setHotelPrepaid(boolean)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getRemuneration_HotelPrepaid()
	 * @model
	 * @generated
	 */
	boolean isHotelPrepaid();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Remuneration#isHotelPrepaid <em>Hotel Prepaid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hotel Prepaid</em>' attribute.
	 * @see #isHotelPrepaid()
	 * @generated
	 */
	void setHotelPrepaid(boolean value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getRemuneration_Notes()
	 * @model
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Remuneration#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Remuneration Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remuneration Total</em>' attribute.
	 * @see #setRemunerationTotal(String)
	 * @see UniversityOrganization.UniversityOrganizationPackage#getRemuneration_RemunerationTotal()
	 * @model
	 * @generated
	 */
	String getRemunerationTotal();

	/**
	 * Sets the value of the '{@link UniversityOrganization.Remuneration#getRemunerationTotal <em>Remuneration Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remuneration Total</em>' attribute.
	 * @see #getRemunerationTotal()
	 * @generated
	 */
	void setRemunerationTotal(String value);

} // Remuneration
