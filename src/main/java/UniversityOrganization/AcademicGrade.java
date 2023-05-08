/**
 */
package UniversityOrganization;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Academic Grade</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see UniversityOrganization.UniversityOrganizationPackage#getAcademicGrade()
 * @model
 * @generated
 */
public enum AcademicGrade implements Enumerator {
	/**
	 * The '<em><b>Full Professor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_PROFESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_PROFESSOR(0, "FullProfessor", "FullProfessor"),

	/**
	 * The '<em><b>Associate Professor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATE_PROFESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	ASSOCIATE_PROFESSOR(1, "AssociateProfessor", "AssociateProfessor"),

	/**
	 * The '<em><b>Researcher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESEARCHER_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCHER(2, "Researcher", "Researcher");

	/**
	 * The '<em><b>Full Professor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_PROFESSOR
	 * @model name="FullProfessor"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_PROFESSOR_VALUE = 0;

	/**
	 * The '<em><b>Associate Professor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATE_PROFESSOR
	 * @model name="AssociateProfessor"
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATE_PROFESSOR_VALUE = 1;

	/**
	 * The '<em><b>Researcher</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESEARCHER
	 * @model name="Researcher"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCHER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Academic Grade</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AcademicGrade[] VALUES_ARRAY =
		new AcademicGrade[] {
			FULL_PROFESSOR,
			ASSOCIATE_PROFESSOR,
			RESEARCHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Academic Grade</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AcademicGrade> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Academic Grade</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcademicGrade get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AcademicGrade result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Academic Grade</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcademicGrade getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AcademicGrade result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Academic Grade</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcademicGrade get(int value) {
		switch (value) {
			case FULL_PROFESSOR_VALUE: return FULL_PROFESSOR;
			case ASSOCIATE_PROFESSOR_VALUE: return ASSOCIATE_PROFESSOR;
			case RESEARCHER_VALUE: return RESEARCHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AcademicGrade(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AcademicGrade
