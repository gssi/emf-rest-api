/**
 */
package UniversityOrganization.impl;

import UniversityOrganization.Lecture;
import UniversityOrganization.UniversityOrganizationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.impl.LectureImpl#getHours <em>Hours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LectureImpl extends ActivityImpl implements Lecture {
	/**
	 * The default value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
	protected static final int HOURS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
	protected int hours = HOURS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityOrganizationPackage.Literals.LECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHours(int newHours) {
		int oldHours = hours;
		hours = newHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.LECTURE__HOURS, oldHours, hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityOrganizationPackage.LECTURE__HOURS:
				return getHours();
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
			case UniversityOrganizationPackage.LECTURE__HOURS:
				setHours((Integer)newValue);
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
			case UniversityOrganizationPackage.LECTURE__HOURS:
				setHours(HOURS_EDEFAULT);
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
			case UniversityOrganizationPackage.LECTURE__HOURS:
				return hours != HOURS_EDEFAULT;
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
		result.append(" (hours: ");
		result.append(hours);
		result.append(')');
		return result.toString();
	}

} //LectureImpl
