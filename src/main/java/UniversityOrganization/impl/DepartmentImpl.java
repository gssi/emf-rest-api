/**
 */
package UniversityOrganization.impl;

import UniversityOrganization.Department;
import UniversityOrganization.ResearchGroup;
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
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.impl.DepartmentImpl#getResearchGroups <em>Research Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends NamedElementImpl implements Department {
	/**
	 * The cached value of the '{@link #getResearchGroups() <em>Research Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResearchGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ResearchGroup> researchGroups;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityOrganizationPackage.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResearchGroup> getResearchGroups() {
		if (researchGroups == null) {
			researchGroups = new EObjectContainmentEList<ResearchGroup>(ResearchGroup.class, this, UniversityOrganizationPackage.DEPARTMENT__RESEARCH_GROUPS);
		}
		return researchGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityOrganizationPackage.DEPARTMENT__RESEARCH_GROUPS:
				return ((InternalEList<?>)getResearchGroups()).basicRemove(otherEnd, msgs);
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
			case UniversityOrganizationPackage.DEPARTMENT__RESEARCH_GROUPS:
				return getResearchGroups();
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
			case UniversityOrganizationPackage.DEPARTMENT__RESEARCH_GROUPS:
				getResearchGroups().clear();
				getResearchGroups().addAll((Collection<? extends ResearchGroup>)newValue);
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
			case UniversityOrganizationPackage.DEPARTMENT__RESEARCH_GROUPS:
				getResearchGroups().clear();
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
			case UniversityOrganizationPackage.DEPARTMENT__RESEARCH_GROUPS:
				return researchGroups != null && !researchGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DepartmentImpl
