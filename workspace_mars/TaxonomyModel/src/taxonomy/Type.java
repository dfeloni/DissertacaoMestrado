/**
 */
package taxonomy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see taxonomy.TaxonomyPackage#getType()
 * @model
 * @generated
 */
public enum Type implements Enumerator {
	/**
	 * The '<em><b>MATURITY MODEL AREA DEFINITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATURITY_MODEL_AREA_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	MATURITY_MODEL_AREA_DEFINITION(0, "MATURITY_MODEL_AREA_DEFINITION", "MATURITY_MODEL_AREA_DEFINITION"),

	/**
	 * The '<em><b>PROCESS ELEMENT DEFINITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_ELEMENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS_ELEMENT_DEFINITION(1, "PROCESS_ELEMENT_DEFINITION", "PROCESS_ELEMENT_DEFINITION");

	/**
	 * The '<em><b>MATURITY MODEL AREA DEFINITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MATURITY MODEL AREA DEFINITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MATURITY_MODEL_AREA_DEFINITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MATURITY_MODEL_AREA_DEFINITION_VALUE = 0;

	/**
	 * The '<em><b>PROCESS ELEMENT DEFINITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROCESS ELEMENT DEFINITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESS_ELEMENT_DEFINITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_ELEMENT_DEFINITION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Type[] VALUES_ARRAY =
		new Type[] {
			MATURITY_MODEL_AREA_DEFINITION,
			PROCESS_ELEMENT_DEFINITION,
		};

	/**
	 * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type get(int value) {
		switch (value) {
			case MATURITY_MODEL_AREA_DEFINITION_VALUE: return MATURITY_MODEL_AREA_DEFINITION;
			case PROCESS_ELEMENT_DEFINITION_VALUE: return PROCESS_ELEMENT_DEFINITION;
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
	private Type(int value, String name, String literal) {
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
	
} //Type
