/**
 */
package assessment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Script Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see assessment.AssessmentPackage#getScriptType()
 * @model
 * @generated
 */
public enum ScriptType implements Enumerator {
	/**
	 * The '<em><b>MODEL TO MODEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_TO_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL_TO_MODEL(0, "MODEL_TO_MODEL", "MODEL_TO_MODEL"),

	/**
	 * The '<em><b>MODEL TO TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_TO_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL_TO_TEXT(1, "MODEL_TO_TEXT", "MODEL_TO_TEXT");

	/**
	 * The '<em><b>MODEL TO MODEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODEL TO MODEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODEL_TO_MODEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_TO_MODEL_VALUE = 0;

	/**
	 * The '<em><b>MODEL TO TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODEL TO TEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODEL_TO_TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_TO_TEXT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Script Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ScriptType[] VALUES_ARRAY =
		new ScriptType[] {
			MODEL_TO_MODEL,
			MODEL_TO_TEXT,
		};

	/**
	 * A public read-only list of all the '<em><b>Script Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ScriptType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Script Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScriptType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScriptType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Script Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScriptType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScriptType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Script Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScriptType get(int value) {
		switch (value) {
			case MODEL_TO_MODEL_VALUE: return MODEL_TO_MODEL;
			case MODEL_TO_TEXT_VALUE: return MODEL_TO_TEXT;
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
	private ScriptType(int value, String name, String literal) {
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
	
} //ScriptType
