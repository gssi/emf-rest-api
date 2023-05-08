/**
 */
package UniversityOrganization.impl;

import UniversityOrganization.Activity;
import UniversityOrganization.UniversityOrganizationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.impl.ActivityImpl#getEventDate <em>Event Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
	/**
	 * The default value of the '{@link #getEventDate() <em>Event Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventDate() <em>Event Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDate()
	 * @generated
	 * @ordered
	 */
	protected String eventDate = EVENT_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityOrganizationPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventDate() {
		return eventDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventDate(String newEventDate) {
		String oldEventDate = eventDate;
		eventDate = newEventDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.ACTIVITY__EVENT_DATE, oldEventDate, eventDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityOrganizationPackage.ACTIVITY__EVENT_DATE:
				return getEventDate();
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
			case UniversityOrganizationPackage.ACTIVITY__EVENT_DATE:
				setEventDate((String)newValue);
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
			case UniversityOrganizationPackage.ACTIVITY__EVENT_DATE:
				setEventDate(EVENT_DATE_EDEFAULT);
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
			case UniversityOrganizationPackage.ACTIVITY__EVENT_DATE:
				return EVENT_DATE_EDEFAULT == null ? eventDate != null : !EVENT_DATE_EDEFAULT.equals(eventDate);
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
		result.append(" (eventDate: ");
		result.append(eventDate);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
