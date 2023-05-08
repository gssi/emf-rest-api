/**
 */
package UniversityOrganization.util;

import UniversityOrganization.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see UniversityOrganization.UniversityOrganizationPackage
 * @generated
 */
public class UniversityOrganizationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UniversityOrganizationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityOrganizationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UniversityOrganizationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityOrganizationSwitch<Adapter> modelSwitch =
		new UniversityOrganizationSwitch<Adapter>() {
			@Override
			public Adapter caseUniversityOrganizationModel(UniversityOrganizationModel object) {
				return createUniversityOrganizationModelAdapter();
			}
			@Override
			public Adapter caseDepartment(Department object) {
				return createDepartmentAdapter();
			}
			@Override
			public Adapter caseResearchGroup(ResearchGroup object) {
				return createResearchGroupAdapter();
			}
			@Override
			public Adapter caseFacultyMember(FacultyMember object) {
				return createFacultyMemberAdapter();
			}
			@Override
			public Adapter casePosition(Position object) {
				return createPositionAdapter();
			}
			@Override
			public Adapter caseGuest(Guest object) {
				return createGuestAdapter();
			}
			@Override
			public Adapter caseAcademicPeople(AcademicPeople object) {
				return createAcademicPeopleAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseLecture(Lecture object) {
				return createLectureAdapter();
			}
			@Override
			public Adapter caseSeminar(Seminar object) {
				return createSeminarAdapter();
			}
			@Override
			public Adapter caseResearchCollaboration(ResearchCollaboration object) {
				return createResearchCollaborationAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseRemuneration(Remuneration object) {
				return createRemunerationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link UniversityOrganization.UniversityOrganizationModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UniversityOrganization.UniversityOrganizationModel
	 * @generated
	 */
	public Adapter createUniversityOrganizationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UniversityOrganization.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UniversityOrganization.Department
	 * @generated
	 */
	public Adapter createDepartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UniversityOrganization.ResearchGroup <em>Research Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UniversityOrganization.ResearchGroup
	 * @generated
	 */
	public Adapter createResearchGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UniversityOrganization.FacultyMember <em>Faculty Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UniversityOrganization.FacultyMember
	 * @generated
	 */
	public Adapter createFacultyMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UniversityOrganization.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UniversityOrganization.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UniversityOrganization.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UniversityOrganization.Guest
	 * @generated
	 */
	public Adapter createGuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UniversityOrganization.AcademicPeople <em>Academic People</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UniversityOrganization.AcademicPeople
	 * @generated
	 */
	public Adapter createAcademicPeopleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UniversityOrganization.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UniversityOrganization.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UniversityOrganization.Lecture <em>Lecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UniversityOrganization.Lecture
	 * @generated
	 */
	public Adapter createLectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UniversityOrganization.Seminar <em>Seminar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UniversityOrganization.Seminar
	 * @generated
	 */
	public Adapter createSeminarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UniversityOrganization.ResearchCollaboration <em>Research Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UniversityOrganization.ResearchCollaboration
	 * @generated
	 */
	public Adapter createResearchCollaborationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UniversityOrganization.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UniversityOrganization.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UniversityOrganization.Remuneration <em>Remuneration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UniversityOrganization.Remuneration
	 * @generated
	 */
	public Adapter createRemunerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UniversityOrganizationAdapterFactory
