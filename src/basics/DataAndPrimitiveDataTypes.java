/* Primitive Data Types*/
package basics;

public class DataAndPrimitiveDataTypes {

	public static void main(String[] args) {
		/*
		 * The primitive data types in java are byte, short, int, long, float,
		 * double, char, boolean
		 */

		/* byte (takes 8 bits and value ranges from -128 to 127) */
		byte myByteValue = 127;
		System.out.println(myByteValue);

		/* short (takes 16 bits and value ranges from -32768 to 32767) */
		short myShortValue = 32767;
		System.out.println(myShortValue);

		/*
		 * int (takes 32 bits and value ranges from -2,147,483,648 to 2,147,483,
		 * 647)
		 */
		int myIntValue = 37728892;
		System.out.println(myIntValue);

		/*
		 * long (takes 64 bits and value ranges from -9,223,372,036,854,775,808
		 * to 9,223,372,036,854,775,807)
		 */
		long myLongValue = 332238487574374L;
		System.out.println(myLongValue);

		/*
		 * float (takes 32 bits, need to put "f" at the end, 6 to 7 significant
		 * decimal digits)
		 */
		float myFloatValue = 24.346436f;
		System.out.println(myFloatValue);

		/*
		 * double (takes 64 bits, putting "d" at the end is optional, 15
		 * significant decimal digits)
		 */
		double myDoubleValue = 422.5552643337774;
		System.out.println(myDoubleValue);

		/* char (takes 16 bits, 0 to 65536(unsigned)) */
		char myChar1 = 's';
		// Refer to the unicode-character table for below
		char myChar2 = '\u00A9';
		System.out.println("My sample char example contains: " + myChar2 + myChar1);
		System.out.println((char) ('s' + 1));

		/* boolean (value can be "true" or "false" only) */
		boolean myBooleanValue = true;
		System.out.println(myBooleanValue);

		// Difference between float and double primitive data type
		float diffFloatValue = 5f / 3f;
		double diffDoubleValue = 5d / 3d;
		System.out.println("The variable of type float gives: " + diffFloatValue);
		System.out.println("The variable of type double gives: " + diffDoubleValue);

		// Conversion of double to float with 3 significant digits after decimal
		double doubleValueToConvert = 41.746380532;
		System.out.println(String.format("%.3f", doubleValueToConvert));

	}

}
