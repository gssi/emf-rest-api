/**
 */
package UniversityOrganization.impl;

import UniversityOrganization.Seminar;
import UniversityOrganization.UniversityOrganizationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seminar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.impl.SeminarImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link UniversityOrganization.impl.SeminarImpl#getVenue <em>Venue</em>}</li>
 *   <li>{@link UniversityOrganization.impl.SeminarImpl#getAgenda <em>Agenda</em>}</li>
 *   <li>{@link UniversityOrganization.impl.SeminarImpl#getRemoteLink <em>Remote Link</em>}</li>
 *   <li>{@link UniversityOrganization.impl.SeminarImpl#getAbstract <em>Abstract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeminarImpl extends ActivityImpl implements Seminar {
	/**
	 * The default value of the '{@link #getTopic() <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected String topic = TOPIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getVenue() <em>Venue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVenue()
	 * @generated
	 * @ordered
	 */
	protected static final String VENUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVenue() <em>Venue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVenue()
	 * @generated
	 * @ordered
	 */
	protected String venue = VENUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgenda() <em>Agenda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgenda()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENDA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgenda() <em>Agenda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgenda()
	 * @generated
	 * @ordered
	 */
	protected String agenda = AGENDA_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteLink() <em>Remote Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteLink()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteLink() <em>Remote Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteLink()
	 * @generated
	 * @ordered
	 */
	protected String remoteLink = REMOTE_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected String abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeminarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityOrganizationPackage.Literals.SEMINAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(String newTopic) {
		String oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.SEMINAR__TOPIC, oldTopic, topic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVenue() {
		return venue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVenue(String newVenue) {
		String oldVenue = venue;
		venue = newVenue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.SEMINAR__VENUE, oldVenue, venue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgenda() {
		return agenda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgenda(String newAgenda) {
		String oldAgenda = agenda;
		agenda = newAgenda;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.SEMINAR__AGENDA, oldAgenda, agenda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoteLink() {
		return remoteLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteLink(String newRemoteLink) {
		String oldRemoteLink = remoteLink;
		remoteLink = newRemoteLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.SEMINAR__REMOTE_LINK, oldRemoteLink, remoteLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(String newAbstract) {
		String oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.SEMINAR__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityOrganizationPackage.SEMINAR__TOPIC:
				return getTopic();
			case UniversityOrganizationPackage.SEMINAR__VENUE:
				return getVenue();
			case UniversityOrganizationPackage.SEMINAR__AGENDA:
				return getAgenda();
			case UniversityOrganizationPackage.SEMINAR__REMOTE_LINK:
				return getRemoteLink();
			case UniversityOrganizationPackage.SEMINAR__ABSTRACT:
				return getAbstract();
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
			case UniversityOrganizationPackage.SEMINAR__TOPIC:
				setTopic((String)newValue);
				return;
			case UniversityOrganizationPackage.SEMINAR__VENUE:
				setVenue((String)newValue);
				return;
			case UniversityOrganizationPackage.SEMINAR__AGENDA:
				setAgenda((String)newValue);
				return;
			case UniversityOrganizationPackage.SEMINAR__REMOTE_LINK:
				setRemoteLink((String)newValue);
				return;
			case UniversityOrganizationPackage.SEMINAR__ABSTRACT:
				setAbstract((String)newValue);
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
			case UniversityOrganizationPackage.SEMINAR__TOPIC:
				setTopic(TOPIC_EDEFAULT);
				return;
			case UniversityOrganizationPackage.SEMINAR__VENUE:
				setVenue(VENUE_EDEFAULT);
				return;
			case UniversityOrganizationPackage.SEMINAR__AGENDA:
				setAgenda(AGENDA_EDEFAULT);
				return;
			case UniversityOrganizationPackage.SEMINAR__REMOTE_LINK:
				setRemoteLink(REMOTE_LINK_EDEFAULT);
				return;
			case UniversityOrganizationPackage.SEMINAR__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
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
			case UniversityOrganizationPackage.SEMINAR__TOPIC:
				return TOPIC_EDEFAULT == null ? topic != null : !TOPIC_EDEFAULT.equals(topic);
			case UniversityOrganizationPackage.SEMINAR__VENUE:
				return VENUE_EDEFAULT == null ? venue != null : !VENUE_EDEFAULT.equals(venue);
			case UniversityOrganizationPackage.SEMINAR__AGENDA:
				return AGENDA_EDEFAULT == null ? agenda != null : !AGENDA_EDEFAULT.equals(agenda);
			case UniversityOrganizationPackage.SEMINAR__REMOTE_LINK:
				return REMOTE_LINK_EDEFAULT == null ? remoteLink != null : !REMOTE_LINK_EDEFAULT.equals(remoteLink);
			case UniversityOrganizationPackage.SEMINAR__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
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
		result.append(" (topic: ");
		result.append(topic);
		result.append(", venue: ");
		result.append(venue);
		result.append(", agenda: ");
		result.append(agenda);
		result.append(", remoteLink: ");
		result.append(remoteLink);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //SeminarImpl
