/**
 */
package UniversityOrganization.impl;

import UniversityOrganization.PaymentStatus;
import UniversityOrganization.Remuneration;
import UniversityOrganization.UniversityOrganizationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remuneration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.impl.RemunerationImpl#getTravelRefund <em>Travel Refund</em>}</li>
 *   <li>{@link UniversityOrganization.impl.RemunerationImpl#getPerDiems <em>Per Diems</em>}</li>
 *   <li>{@link UniversityOrganization.impl.RemunerationImpl#isHotelPrepaid <em>Hotel Prepaid</em>}</li>
 *   <li>{@link UniversityOrganization.impl.RemunerationImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link UniversityOrganization.impl.RemunerationImpl#getRemunerationTotal <em>Remuneration Total</em>}</li>
 *   <li>{@link UniversityOrganization.impl.RemunerationImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemunerationImpl extends MinimalEObjectImpl.Container implements Remuneration {
	/**
	 * The default value of the '{@link #getTravelRefund() <em>Travel Refund</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelRefund()
	 * @generated
	 * @ordered
	 */
	protected static final int TRAVEL_REFUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTravelRefund() <em>Travel Refund</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelRefund()
	 * @generated
	 * @ordered
	 */
	protected int travelRefund = TRAVEL_REFUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerDiems() <em>Per Diems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerDiems()
	 * @generated
	 * @ordered
	 */
	protected static final int PER_DIEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPerDiems() <em>Per Diems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerDiems()
	 * @generated
	 * @ordered
	 */
	protected int perDiems = PER_DIEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #isHotelPrepaid() <em>Hotel Prepaid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHotelPrepaid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HOTEL_PREPAID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHotelPrepaid() <em>Hotel Prepaid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHotelPrepaid()
	 * @generated
	 * @ordered
	 */
	protected boolean hotelPrepaid = HOTEL_PREPAID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemunerationTotal() <em>Remuneration Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemunerationTotal()
	 * @generated
	 * @ordered
	 */
	protected static final int REMUNERATION_TOTAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRemunerationTotal() <em>Remuneration Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemunerationTotal()
	 * @generated
	 * @ordered
	 */
	protected int remunerationTotal = REMUNERATION_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentStatus STATUS_EDEFAULT = PaymentStatus.TODO;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PaymentStatus status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemunerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityOrganizationPackage.Literals.REMUNERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTravelRefund() {
		return travelRefund;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelRefund(int newTravelRefund) {
		int oldTravelRefund = travelRefund;
		travelRefund = newTravelRefund;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.REMUNERATION__TRAVEL_REFUND, oldTravelRefund, travelRefund));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPerDiems() {
		return perDiems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerDiems(int newPerDiems) {
		int oldPerDiems = perDiems;
		perDiems = newPerDiems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.REMUNERATION__PER_DIEMS, oldPerDiems, perDiems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHotelPrepaid() {
		return hotelPrepaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHotelPrepaid(boolean newHotelPrepaid) {
		boolean oldHotelPrepaid = hotelPrepaid;
		hotelPrepaid = newHotelPrepaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.REMUNERATION__HOTEL_PREPAID, oldHotelPrepaid, hotelPrepaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.REMUNERATION__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRemunerationTotal() {
		return remunerationTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemunerationTotal(int newRemunerationTotal) {
		int oldRemunerationTotal = remunerationTotal;
		remunerationTotal = newRemunerationTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.REMUNERATION__REMUNERATION_TOTAL, oldRemunerationTotal, remunerationTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(PaymentStatus newStatus) {
		PaymentStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.REMUNERATION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityOrganizationPackage.REMUNERATION__TRAVEL_REFUND:
				return getTravelRefund();
			case UniversityOrganizationPackage.REMUNERATION__PER_DIEMS:
				return getPerDiems();
			case UniversityOrganizationPackage.REMUNERATION__HOTEL_PREPAID:
				return isHotelPrepaid();
			case UniversityOrganizationPackage.REMUNERATION__NOTES:
				return getNotes();
			case UniversityOrganizationPackage.REMUNERATION__REMUNERATION_TOTAL:
				return getRemunerationTotal();
			case UniversityOrganizationPackage.REMUNERATION__STATUS:
				return getStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversityOrganizationPackage.REMUNERATION__TRAVEL_REFUND:
				setTravelRefund((Integer)newValue);
				return;
			case UniversityOrganizationPackage.REMUNERATION__PER_DIEMS:
				setPerDiems((Integer)newValue);
				return;
			case UniversityOrganizationPackage.REMUNERATION__HOTEL_PREPAID:
				setHotelPrepaid((Boolean)newValue);
				return;
			case UniversityOrganizationPackage.REMUNERATION__NOTES:
				setNotes((String)newValue);
				return;
			case UniversityOrganizationPackage.REMUNERATION__REMUNERATION_TOTAL:
				setRemunerationTotal((Integer)newValue);
				return;
			case UniversityOrganizationPackage.REMUNERATION__STATUS:
				setStatus((PaymentStatus)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UniversityOrganizationPackage.REMUNERATION__TRAVEL_REFUND:
				setTravelRefund(TRAVEL_REFUND_EDEFAULT);
				return;
			case UniversityOrganizationPackage.REMUNERATION__PER_DIEMS:
				setPerDiems(PER_DIEMS_EDEFAULT);
				return;
			case UniversityOrganizationPackage.REMUNERATION__HOTEL_PREPAID:
				setHotelPrepaid(HOTEL_PREPAID_EDEFAULT);
				return;
			case UniversityOrganizationPackage.REMUNERATION__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case UniversityOrganizationPackage.REMUNERATION__REMUNERATION_TOTAL:
				setRemunerationTotal(REMUNERATION_TOTAL_EDEFAULT);
				return;
			case UniversityOrganizationPackage.REMUNERATION__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UniversityOrganizationPackage.REMUNERATION__TRAVEL_REFUND:
				return travelRefund != TRAVEL_REFUND_EDEFAULT;
			case UniversityOrganizationPackage.REMUNERATION__PER_DIEMS:
				return perDiems != PER_DIEMS_EDEFAULT;
			case UniversityOrganizationPackage.REMUNERATION__HOTEL_PREPAID:
				return hotelPrepaid != HOTEL_PREPAID_EDEFAULT;
			case UniversityOrganizationPackage.REMUNERATION__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case UniversityOrganizationPackage.REMUNERATION__REMUNERATION_TOTAL:
				return remunerationTotal != REMUNERATION_TOTAL_EDEFAULT;
			case UniversityOrganizationPackage.REMUNERATION__STATUS:
				return status != STATUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (travelRefund: ");
		result.append(travelRefund);
		result.append(", perDiems: ");
		result.append(perDiems);
		result.append(", hotelPrepaid: ");
		result.append(hotelPrepaid);
		result.append(", notes: ");
		result.append(notes);
		result.append(", remunerationTotal: ");
		result.append(remunerationTotal);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //RemunerationImpl
