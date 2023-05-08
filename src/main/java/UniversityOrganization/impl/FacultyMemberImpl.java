/**
 */
package UniversityOrganization.impl;

import UniversityOrganization.Department;
import UniversityOrganization.FacultyMember;
import UniversityOrganization.Position;
import UniversityOrganization.ResearchGroup;
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
 * An implementation of the model object '<em><b>Faculty Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.impl.FacultyMemberImpl#getPositions <em>Positions</em>}</li>
 *   <li>{@link UniversityOrganization.impl.FacultyMemberImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link UniversityOrganization.impl.FacultyMemberImpl#getResearchGroup <em>Research Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacultyMemberImpl extends AcademicPeopleImpl implements FacultyMember {
	/**
	 * The cached value of the '{@link #getPositions() <em>Positions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Position> positions;

	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected Department department;

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
	protected FacultyMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityOrganizationPackage.Literals.FACULTY_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Position> getPositions() {
		if (positions == null) {
			positions = new EObjectContainmentEList<Position>(Position.class, this, UniversityOrganizationPackage.FACULTY_MEMBER__POSITIONS);
		}
		return positions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department getDepartment() {
		if (department != null && department.eIsProxy()) {
			InternalEObject oldDepartment = (InternalEObject)department;
			department = (Department)eResolveProxy(oldDepartment);
			if (department != oldDepartment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityOrganizationPackage.FACULTY_MEMBER__DEPARTMENT, oldDepartment, department));
			}
		}
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department basicGetDepartment() {
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartment(Department newDepartment) {
		Department oldDepartment = department;
		department = newDepartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.FACULTY_MEMBER__DEPARTMENT, oldDepartment, department));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityOrganizationPackage.FACULTY_MEMBER__RESEARCH_GROUP, oldResearchGroup, researchGroup));
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
	public void setResearchGroup(ResearchGroup newResearchGroup) {
		ResearchGroup oldResearchGroup = researchGroup;
		researchGroup = newResearchGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityOrganizationPackage.FACULTY_MEMBER__RESEARCH_GROUP, oldResearchGroup, researchGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityOrganizationPackage.FACULTY_MEMBER__POSITIONS:
				return ((InternalEList<?>)getPositions()).basicRemove(otherEnd, msgs);
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
			case UniversityOrganizationPackage.FACULTY_MEMBER__POSITIONS:
				return getPositions();
			case UniversityOrganizationPackage.FACULTY_MEMBER__DEPARTMENT:
				if (resolve) return getDepartment();
				return basicGetDepartment();
			case UniversityOrganizationPackage.FACULTY_MEMBER__RESEARCH_GROUP:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversityOrganizationPackage.FACULTY_MEMBER__POSITIONS:
				getPositions().clear();
				getPositions().addAll((Collection<? extends Position>)newValue);
				return;
			case UniversityOrganizationPackage.FACULTY_MEMBER__DEPARTMENT:
				setDepartment((Department)newValue);
				return;
			case UniversityOrganizationPackage.FACULTY_MEMBER__RESEARCH_GROUP:
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
			case UniversityOrganizationPackage.FACULTY_MEMBER__POSITIONS:
				getPositions().clear();
				return;
			case UniversityOrganizationPackage.FACULTY_MEMBER__DEPARTMENT:
				setDepartment((Department)null);
				return;
			case UniversityOrganizationPackage.FACULTY_MEMBER__RESEARCH_GROUP:
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
			case UniversityOrganizationPackage.FACULTY_MEMBER__POSITIONS:
				return positions != null && !positions.isEmpty();
			case UniversityOrganizationPackage.FACULTY_MEMBER__DEPARTMENT:
				return department != null;
			case UniversityOrganizationPackage.FACULTY_MEMBER__RESEARCH_GROUP:
				return researchGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //FacultyMemberImpl
