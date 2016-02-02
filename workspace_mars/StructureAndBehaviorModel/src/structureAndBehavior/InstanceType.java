/**
 */
package structureAndBehavior;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Instance Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see structureAndBehavior.StructureAndBehaviorPackage#getInstanceType()
 * @model
 * @generated
 */
public enum InstanceType implements Enumerator {
	/**
	 * The '<em><b>SUGGESTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUGGESTED_VALUE
	 * @generated
	 * @ordered
	 */
	SUGGESTED(0, "SUGGESTED", "SUGGESTED"),

	/**
	 * The '<em><b>TEMPLATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPLATE(1, "TEMPLATE", "TEMPLATE"),

	/**
	 * The '<em><b>EXECUTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTED_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTED(2, "EXECUTED", "EXECUTED");

	/**
	 * The '<em><b>SUGGESTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUGGESTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUGGESTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUGGESTED_VALUE = 0;

	/**
	 * The '<em><b>TEMPLATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEMPLATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPLATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMPLATE_VALUE = 1;

	/**
	 * The '<em><b>EXECUTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXECUTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXECUTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Instance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InstanceType[] VALUES_ARRAY =
		new InstanceType[] {
			SUGGESTED,
			TEMPLATE,
			EXECUTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Instance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InstanceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Instance Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstanceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instance Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstanceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instance Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InstanceType get(int value) {
		switch (value) {
			case SUGGESTED_VALUE: return SUGGESTED;
			case TEMPLATE_VALUE: return TEMPLATE;
			case EXECUTED_VALUE: return EXECUTED;
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
	private InstanceType(int value, String name, String literal) {
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
	
} //InstanceType
