/**
 */
package UniversityOrganization.impl;

import UniversityOrganization.Department;
import UniversityOrganization.FacultyMember;
import UniversityOrganization.UniversityOrganizationModel;
import UniversityOrganization.UniversityOrganizationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.impl.UniversityOrganizationModelImpl#getDepartments <em>Departments</em>}</li>
 *   <li>{@link UniversityOrganization.impl.UniversityOrganizationModelImpl#getFacultyMembers <em>Faculty Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversityOrganizationModelImpl extends NamedElementImpl implements UniversityOrganizationModel {
	/**
	 * The cached value of the '{@link #getDepartments() <em>Departments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartments()
	 * @generated
	 * @ordered
	 */
	protected EList<Department> departments;

	/**
	 * The cached value of the '{@link #getFacultyMembers() <em>Faculty Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacultyMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<FacultyMember> facultyMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityOrganizationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityOrganizationPackage.Literals.UNIVERSITY_ORGANIZATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Department> getDepartments() {
		if (departments == null) {
			departments = new EObjectContainmentEList<Department>(Department.class, this, UniversityOrganizationPackage.UNIVERSITY_ORGANIZATION_MODEL__DEPARTMENTS);
		}
		return departments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacultyMember> getFacultyMembers() {
		if (facultyMembers == null) {
			facultyMembers = new EObjectContainmentEList<FacultyMember>(FacultyMember.class, this, UniversityOrganizationPackage.UNIVERSITY_ORGANIZATION_MODEL__FACULTY_MEMBERS);
		}
		return facultyMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityOrganizationPackage.UNIVERSITY_ORGANIZATION_MODEL__DEPARTMENTS:
				return ((InternalEList<?>)getDepartments()).basicRemove(otherEnd, msgs);
			case UniversityOrganizationPackage.UNIVERSITY_ORGANIZATION_MODEL__FACULTY_MEMBERS:
				return ((InternalEList<?>)getFacultyMembers()).basicRemove(otherEnd, msgs);
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
			case UniversityOrganizationPackage.UNIVERSITY_ORGANIZATION_MODEL__DEPARTMENTS:
				return getDepartments();
			case UniversityOrganizationPackage.UNIVERSITY_ORGANIZATION_MODEL__FACULTY_MEMBERS:
				return getFacultyMembers();
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
			case UniversityOrganizationPackage.UNIVERSITY_ORGANIZATION_MODEL__DEPARTMENTS:
				getDepartments().clear();
				getDepartments().addAll((Collection<? extends Department>)newValue);
				return;
			case UniversityOrganizationPackage.UNIVERSITY_ORGANIZATION_MODEL__FACULTY_MEMBERS:
				getFacultyMembers().clear();
				getFacultyMembers().addAll((Collection<? extends FacultyMember>)newValue);
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
			case UniversityOrganizationPackage.UNIVERSITY_ORGANIZATION_MODEL__DEPARTMENTS:
				getDepartments().clear();
				return;
			case UniversityOrganizationPackage.UNIVERSITY_ORGANIZATION_MODEL__FACULTY_MEMBERS:
				getFacultyMembers().clear();
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
			case UniversityOrganizationPackage.UNIVERSITY_ORGANIZATION_MODEL__DEPARTMENTS:
				return departments != null && !departments.isEmpty();
			case UniversityOrganizationPackage.UNIVERSITY_ORGANIZATION_MODEL__FACULTY_MEMBERS:
				return facultyMembers != null && !facultyMembers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UniversityOrganizationModelImpl
