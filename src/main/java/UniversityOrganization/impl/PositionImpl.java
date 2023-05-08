/**
 */
package UniversityOrganization.impl;

import UniversityOrganization.Guest;
import UniversityOrganization.Position;
import UniversityOrganization.ResearchGroup;
import UniversityOrganization.UniversityOrganizationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.impl.PositionImpl#getProjectTitle <em>Project Title</em>}</li>
 *   <li>{@link UniversityOrganization.impl.PositionImpl#getGuest <em>Guest</em>}</li>
 *   <li>{@link UniversityOrganization.impl.PositionImpl#getResearchGroup <em>Research Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends MinimalEObjectImpl.Container implements Position {
	/**
	 * The default value of the '{@link #getProjectTitle() <em>Project Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectTitle() <em>Project Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectTitle()
	 * @generated
	 * @ordered
	 */
	protected String projectTitle = PROJECT_TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGuest() <em>Guest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuest()
	 * @generated
	 * @ordered
	 */
	protected Guest guest;

	/**
	 * The cached value of the '{@link #getResearchGroup() <em>Research Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResearchGroup()
	 * @generated
	 * @ordered
	 */
	protected ResearchGroup researchGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityOrganizationPackage.Literals.POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectTitle() {
		return projectTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectTitle(String newProjectTitle) {
		String oldProjectTitle = projectTitle;
		projectTitle = newProjectTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.POSITION__PROJECT_TITLE, oldProjectTitle, projectTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest getGuest() {
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuest(Guest newGuest, NotificationChain msgs) {
		Guest oldGuest = guest;
		guest = newGuest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.POSITION__GUEST, oldGuest, newGuest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuest(Guest newGuest) {
		if (newGuest != guest) {
			NotificationChain msgs = null;
			if (guest != null)
				msgs = ((InternalEObject)guest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniversityOrganizationPackage.POSITION__GUEST, null, msgs);
			if (newGuest != null)
				msgs = ((InternalEObject)newGuest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniversityOrganizationPackage.POSITION__GUEST, null, msgs);
			msgs = basicSetGuest(newGuest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.POSITION__GUEST, newGuest, newGuest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchGroup getResearchGroup() {
		if (researchGroup != null && researchGroup.eIsProxy()) {
			InternalEObject oldResearchGroup = (InternalEObject)researchGroup;
			researchGroup = (ResearchGroup)eResolveProxy(oldResearchGroup);
			if (researchGroup != oldResearchGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityOrganizationPackage.POSITION__RESEARCH_GROUP, oldResearchGroup, researchGroup));
			}
		}
		return researchGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResearchGroup basicGetResearchGroup() {
		return researchGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResearchGroup(ResearchGroup newResearchGroup, NotificationChain msgs) {
		ResearchGroup oldResearchGroup = researchGroup;
		researchGroup = newResearchGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.POSITION__RESEARCH_GROUP, oldResearchGroup, newResearchGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResearchGroup(ResearchGroup newResearchGroup) {
		if (newResearchGroup != researchGroup) {
			NotificationChain msgs = null;
			if (researchGroup != null)
				msgs = ((InternalEObject)researchGroup).eInverseRemove(this, UniversityOrganizationPackage.RESEARCH_GROUP__OPEN_POSITION, ResearchGroup.class, msgs);
			if (newResearchGroup != null)
				msgs = ((InternalEObject)newResearchGroup).eInverseAdd(this, UniversityOrganizationPackage.RESEARCH_GROUP__OPEN_POSITION, ResearchGroup.class, msgs);
			msgs = basicSetResearchGroup(newResearchGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.POSITION__RESEARCH_GROUP, newResearchGroup, newResearchGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityOrganizationPackage.POSITION__RESEARCH_GROUP:
				if (researchGroup != null)
					msgs = ((InternalEObject)researchGroup).eInverseRemove(this, UniversityOrganizationPackage.RESEARCH_GROUP__OPEN_POSITION, ResearchGroup.class, msgs);
				return basicSetResearchGroup((ResearchGroup)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityOrganizationPackage.POSITION__GUEST:
				return basicSetGuest(null, msgs);
			case UniversityOrganizationPackage.POSITION__RESEARCH_GROUP:
				return basicSetResearchGroup(null, msgs);
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
			case UniversityOrganizationPackage.POSITION__PROJECT_TITLE:
				return getProjectTitle();
			case UniversityOrganizationPackage.POSITION__GUEST:
				return getGuest();
			case UniversityOrganizationPackage.POSITION__RESEARCH_GROUP:
				if (resolve) return getResearchGroup();
				return basicGetResearchGroup();
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
			case UniversityOrganizationPackage.POSITION__PROJECT_TITLE:
				setProjectTitle((String)newValue);
				return;
			case UniversityOrganizationPackage.POSITION__GUEST:
				setGuest((Guest)newValue);
				return;
			case UniversityOrganizationPackage.POSITION__RESEARCH_GROUP:
				setResearchGroup((ResearchGroup)newValue);
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
			case UniversityOrganizationPackage.POSITION__PROJECT_TITLE:
				setProjectTitle(PROJECT_TITLE_EDEFAULT);
				return;
			case UniversityOrganizationPackage.POSITION__GUEST:
				setGuest((Guest)null);
				return;
			case UniversityOrganizationPackage.POSITION__RESEARCH_GROUP:
				setResearchGroup((ResearchGroup)null);
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
			case UniversityOrganizationPackage.POSITION__PROJECT_TITLE:
				return PROJECT_TITLE_EDEFAULT == null ? projectTitle != null : !PROJECT_TITLE_EDEFAULT.equals(projectTitle);
			case UniversityOrganizationPackage.POSITION__GUEST:
				return guest != null;
			case UniversityOrganizationPackage.POSITION__RESEARCH_GROUP:
				return researchGroup != null;
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
		result.append(" (projectTitle: ");
		result.append(projectTitle);
		result.append(')');
		return result.toString();
	}

} //PositionImpl
