/**
 */
package UniversityOrganization.impl;

import UniversityOrganization.Position;
import UniversityOrganization.ResearchGroup;
import UniversityOrganization.UniversityOrganizationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Research Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversityOrganization.impl.ResearchGroupImpl#getOpenPosition <em>Open Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResearchGroupImpl extends NamedElementImpl implements ResearchGroup {
	/**
	 * The cached value of the '{@link #getOpenPosition() <em>Open Position</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<Position> openPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearchGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityOrganizationPackage.Literals.RESEARCH_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Position> getOpenPosition() {
		if (openPosition == null) {
			openPosition = new EObjectWithInverseResolvingEList<Position>(Position.class, this, UniversityOrganizationPackage.RESEARCH_GROUP__OPEN_POSITION, UniversityOrganizationPackage.POSITION__RESEARCH_GROUP);
		}
		return openPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityOrganizationPackage.RESEARCH_GROUP__OPEN_POSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOpenPosition()).basicAdd(otherEnd, msgs);
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
			case UniversityOrganizationPackage.RESEARCH_GROUP__OPEN_POSITION:
				return ((InternalEList<?>)getOpenPosition()).basicRemove(otherEnd, msgs);
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
			case UniversityOrganizationPackage.RESEARCH_GROUP__OPEN_POSITION:
				return getOpenPosition();
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
			case UniversityOrganizationPackage.RESEARCH_GROUP__OPEN_POSITION:
				getOpenPosition().clear();
				getOpenPosition().addAll((Collection<? extends Position>)newValue);
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
			case UniversityOrganizationPackage.RESEARCH_GROUP__OPEN_POSITION:
				getOpenPosition().clear();
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
			case UniversityOrganizationPackage.RESEARCH_GROUP__OPEN_POSITION:
				return openPosition != null && !openPosition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResearchGroupImpl
