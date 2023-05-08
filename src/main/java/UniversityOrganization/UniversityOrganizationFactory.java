/**
 */
package UniversityOrganization;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see UniversityOrganization.UniversityOrganizationPackage
 * @generated
 */
public interface UniversityOrganizationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniversityOrganizationFactory eINSTANCE = UniversityOrganization.impl.UniversityOrganizationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	UniversityOrganizationModel createUniversityOrganizationModel();

	/**
	 * Returns a new object of class '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Department</em>'.
	 * @generated
	 */
	Department createDepartment();

	/**
	 * Returns a new object of class '<em>Research Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Research Group</em>'.
	 * @generated
	 */
	ResearchGroup createResearchGroup();

	/**
	 * Returns a new object of class '<em>Faculty Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Faculty Member</em>'.
	 * @generated
	 */
	FacultyMember createFacultyMember();

	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Guest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guest</em>'.
	 * @generated
	 */
	Guest createGuest();

	/**
	 * Returns a new object of class '<em>Lecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lecture</em>'.
	 * @generated
	 */
	Lecture createLecture();

	/**
	 * Returns a new object of class '<em>Seminar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seminar</em>'.
	 * @generated
	 */
	Seminar createSeminar();

	/**
	 * Returns a new object of class '<em>Research Collaboration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Research Collaboration</em>'.
	 * @generated
	 */
	ResearchCollaboration createResearchCollaboration();

	/**
	 * Returns a new object of class '<em>Remuneration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remuneration</em>'.
	 * @generated
	 */
	Remuneration createRemuneration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UniversityOrganizationPackage getUniversityOrganizationPackage();

} //UniversityOrganizationFactory
