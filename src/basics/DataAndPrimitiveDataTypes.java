/* Primitive Data Types*/
package basics;

public class DataAndPrimitiveDataTypes {

	public static void main(String[] args) {
		/*
		 * The primitive data types in java can be classified into Integers
		 * (byte, short, int, long) Floating-Point Numbers (float, double),
		 * Characters(char)and Boolean (boolean)
		 */

		// Integers - whole valued signed numbers (positive and negative)
		/* byte (takes 8-bits and value ranges from -128 to 127) */
		// useful when working with a stream of data from a network or file
		byte myByteValue = 127;
		System.out.println("byte: " + myByteValue);
		System.out.println("*********************************************");

		/* short (takes 16-bits and value ranges from -32768 to 32767) */
		short myShortValue = 32767;
		System.out.println("short: " + myShortValue);
		System.out.println("*********************************************");
		/*
		 * int (takes 32-bits and value ranges from -2,147,483,648 to 2,147,483,
		 * 647)
		 */
		// The data types "byte" and "short" are promoted to "int" in an
		// expression
		int myIntValue1 = 37728892;
		int myIntValue2 = 123_456_789; // Integer literal using underscores
		int myIntValue3 = 123__456__789; // Integer literal using underscores
		int myIntValue4 = 0b1010; // integer literal using binary
		System.out.println("int: " + myIntValue1);
		System.out.println("int: " + myIntValue2);
		System.out.println("int: " + myIntValue3);
		System.out.println("int: " + myIntValue4);
		System.out.println("*********************************************");

		/*
		 * long (takes 64-bits and value ranges from -9,223,372,036,854,775,808
		 * to 9,223,372,036,854,775,807)
		 */
		long myLongValue = 332238487574374L;
		System.out.println("long: " + myLongValue);
		System.out.println("*********************************************");

		// Floating-Point Numbers - Real Numbers with Fractional Precisions.
		// Java implements the standarad IEEE-754 set of floating point types
		// and operators
		/*
		 * float (specifies a single-precision value, takes 32-bits, need to add
		 * "f" at the end, 6 to 7 significant decimal digits)
		 */
		float myFloatValue = 24.346436F;
		System.out.println("float: " + myFloatValue);
		System.out.println("*********************************************");

		/*
		 * double (specifies a double-precision value, takes 64-bits, putting
		 * "d" at the end is optional, 15 significant decimal digits)
		 */
		double myDoubleValue = 422.5552643337774;
		System.out.println("double: " + myDoubleValue);
		System.out.println("*********************************************");

		// Characters - Java uses Unicode character-set to represent characters
		// (including the ASCII)
		/* char (takes 16-bits, 0 to 65536(unsigned)) */
		char myChar1 = 's';
		char myChar2 = '\u00A9'; // hexadecimal notation of Unicode
		char myChar3 = '\141'; // octal notation of Unicode
		System.out.println("My sample char example contains: " + myChar2 + myChar1);
		System.out.println((char) ('s' + 1));
		// 's' is raised to "int" type and added to 1, the addition is then
		// casted to "char"
		System.out.println("char: " + myChar3);
		System.out.println("*********************************************");

		// Boolean - to represent logical values "true" and "false"
		/* boolean (value can be "true" or "false" only) */
		boolean myBooleanValue = true;
		System.out.println("boolean: " + myBooleanValue);
		System.out.println("boolean: " + !myBooleanValue);
		System.out.println("*********************************************");

		// Difference between float and double primitive data types
		float diffFloatValue = 5f / 3f;
		double diffDoubleValue = 5d / 3d; // 'd' is optional
		System.out.println("The variable of type float gives: " + diffFloatValue);
		System.out.println("The variable of type double gives: " + diffDoubleValue);
		System.out.println("*********************************************");

		// Conversion of double to float with 3 significant digits after decimal
		double doubleValueToConvert = 41.746380532;
		System.out.println(String.format("%.3f", doubleValueToConvert));
		System.out.println("*********************************************");

	}

}
