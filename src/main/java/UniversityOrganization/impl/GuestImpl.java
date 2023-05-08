/**
 */
package UniversityOrganization.impl;

import UniversityOrganization.Activity;
import UniversityOrganization.Guest;
import UniversityOrganization.Remuneration;
import UniversityOrganization.UniversityOrganizationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.impl.GuestImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link UniversityOrganization.impl.GuestImpl#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link UniversityOrganization.impl.GuestImpl#getInDate <em>In Date</em>}</li>
 *   <li>{@link UniversityOrganization.impl.GuestImpl#getOutDate <em>Out Date</em>}</li>
 *   <li>{@link UniversityOrganization.impl.GuestImpl#getRemuneration <em>Remuneration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuestImpl extends AcademicPeopleImpl implements Guest {
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activity;

	/**
	 * The default value of the '{@link #getAffiliation() <em>Affiliation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliation()
	 * @generated
	 * @ordered
	 */
	protected static final String AFFILIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAffiliation() <em>Affiliation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliation()
	 * @generated
	 * @ordered
	 */
	protected String affiliation = AFFILIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInDate() <em>In Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInDate()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInDate() <em>In Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInDate()
	 * @generated
	 * @ordered
	 */
	protected String inDate = IN_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutDate() <em>Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutDate()
	 * @generated
	 * @ordered
	 */
	protected static final String OUT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutDate() <em>Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutDate()
	 * @generated
	 * @ordered
	 */
	protected String outDate = OUT_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRemuneration() <em>Remuneration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemuneration()
	 * @generated
	 * @ordered
	 */
	protected Remuneration remuneration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityOrganizationPackage.Literals.GUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<Activity>(Activity.class, this, UniversityOrganizationPackage.GUEST__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAffiliation() {
		return affiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffiliation(String newAffiliation) {
		String oldAffiliation = affiliation;
		affiliation = newAffiliation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.GUEST__AFFILIATION, oldAffiliation, affiliation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInDate() {
		return inDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInDate(String newInDate) {
		String oldInDate = inDate;
		inDate = newInDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.GUEST__IN_DATE, oldInDate, inDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutDate() {
		return outDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutDate(String newOutDate) {
		String oldOutDate = outDate;
		outDate = newOutDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.GUEST__OUT_DATE, oldOutDate, outDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Remuneration getRemuneration() {
		return remuneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemuneration(Remuneration newRemuneration, NotificationChain msgs) {
		Remuneration oldRemuneration = remuneration;
		remuneration = newRemuneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.GUEST__REMUNERATION, oldRemuneration, newRemuneration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemuneration(Remuneration newRemuneration) {
		if (newRemuneration != remuneration) {
			NotificationChain msgs = null;
			if (remuneration != null)
				msgs = ((InternalEObject)remuneration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniversityOrganizationPackage.GUEST__REMUNERATION, null, msgs);
			if (newRemuneration != null)
				msgs = ((InternalEObject)newRemuneration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniversityOrganizationPackage.GUEST__REMUNERATION, null, msgs);
			msgs = basicSetRemuneration(newRemuneration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.GUEST__REMUNERATION, newRemuneration, newRemuneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityOrganizationPackage.GUEST__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case UniversityOrganizationPackage.GUEST__REMUNERATION:
				return basicSetRemuneration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityOrganizationPackage.GUEST__ACTIVITY:
				return getActivity();
			case UniversityOrganizationPackage.GUEST__AFFILIATION:
				return getAffiliation();
			case UniversityOrganizationPackage.GUEST__IN_DATE:
				return getInDate();
			case UniversityOrganizationPackage.GUEST__OUT_DATE:
				return getOutDate();
			case UniversityOrganizationPackage.GUEST__REMUNERATION:
				return getRemuneration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversityOrganizationPackage.GUEST__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case UniversityOrganizationPackage.GUEST__AFFILIATION:
				setAffiliation((String)newValue);
				return;
			case UniversityOrganizationPackage.GUEST__IN_DATE:
				setInDate((String)newValue);
				return;
			case UniversityOrganizationPackage.GUEST__OUT_DATE:
				setOutDate((String)newValue);
				return;
			case UniversityOrganizationPackage.GUEST__REMUNERATION:
				setRemuneration((Remuneration)newValue);
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
			case UniversityOrganizationPackage.GUEST__ACTIVITY:
				getActivity().clear();
				return;
			case UniversityOrganizationPackage.GUEST__AFFILIATION:
				setAffiliation(AFFILIATION_EDEFAULT);
				return;
			case UniversityOrganizationPackage.GUEST__IN_DATE:
				setInDate(IN_DATE_EDEFAULT);
				return;
			case UniversityOrganizationPackage.GUEST__OUT_DATE:
				setOutDate(OUT_DATE_EDEFAULT);
				return;
			case UniversityOrganizationPackage.GUEST__REMUNERATION:
				setRemuneration((Remuneration)null);
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
			case UniversityOrganizationPackage.GUEST__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case UniversityOrganizationPackage.GUEST__AFFILIATION:
				return AFFILIATION_EDEFAULT == null ? affiliation != null : !AFFILIATION_EDEFAULT.equals(affiliation);
			case UniversityOrganizationPackage.GUEST__IN_DATE:
				return IN_DATE_EDEFAULT == null ? inDate != null : !IN_DATE_EDEFAULT.equals(inDate);
			case UniversityOrganizationPackage.GUEST__OUT_DATE:
				return OUT_DATE_EDEFAULT == null ? outDate != null : !OUT_DATE_EDEFAULT.equals(outDate);
			case UniversityOrganizationPackage.GUEST__REMUNERATION:
				return remuneration != null;
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
		result.append(" (affiliation: ");
		result.append(affiliation);
		result.append(", inDate: ");
		result.append(inDate);
		result.append(", outDate: ");
		result.append(outDate);
		result.append(')');
		return result.toString();
	}

} //GuestImpl
