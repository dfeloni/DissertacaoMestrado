/**
 */
package project;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Process Element Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see project.ProjectPackage#getProcessElementType()
 * @model
 * @generated
 */
public enum ProcessElementType implements Enumerator {
	/**
	 * The '<em><b>GENERIC PRACTICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_PRACTICE_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC_PRACTICE(0, "GENERIC_PRACTICE", "GENERIC_PRACTICE"),

	/**
	 * The '<em><b>SPECIFIC PRACTICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIFIC_PRACTICE_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIFIC_PRACTICE(1, "SPECIFIC_PRACTICE", "SPECIFIC_PRACTICE");

	/**
	 * The '<em><b>GENERIC PRACTICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GENERIC PRACTICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERIC_PRACTICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_PRACTICE_VALUE = 0;

	/**
	 * The '<em><b>SPECIFIC PRACTICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPECIFIC PRACTICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIFIC_PRACTICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFIC_PRACTICE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Process Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcessElementType[] VALUES_ARRAY =
		new ProcessElementType[] {
			GENERIC_PRACTICE,
			SPECIFIC_PRACTICE,
		};

	/**
	 * A public read-only list of all the '<em><b>Process Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProcessElementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Process Element Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessElementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessElementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Process Element Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessElementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessElementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Process Element Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessElementType get(int value) {
		switch (value) {
			case GENERIC_PRACTICE_VALUE: return GENERIC_PRACTICE;
			case SPECIFIC_PRACTICE_VALUE: return SPECIFIC_PRACTICE;
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
	private ProcessElementType(int value, String name, String literal) {
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
	
} //ProcessElementType
