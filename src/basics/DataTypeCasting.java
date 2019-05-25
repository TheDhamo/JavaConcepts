/*Data Type Casting*/
package basics;

public class DataTypeCasting {

	public static void main(String[] args) {
		/*
		 * Widening Type Casting or Automatic Type Conversion or Implicit Type
		 * Casting. This casting does not require to declare casting explicitly.
		 * byte -> short -> int -> long -> float -> double
		 */
		byte myByteValue1 = 114;
		short myShortValue1 = myByteValue1;
		int myIntValue1 = myShortValue1;
		long myLongValue1 = myIntValue1;
		float myFloatValue1 = myLongValue1;
		double myDoubleValue1 = myFloatValue1;
		System.out.println("***Widening Type Casting***");
		System.out.println("The variable of type byte has value of: " + myByteValue1);
		System.out.println("The variable of type short has value of: " + myShortValue1);
		System.out.println("The variable of type int has value of: " + myIntValue1);
		System.out.println("The variable of type long has value of: " + myLongValue1);
		System.out.println("The variable of type float has value of: " + myFloatValue1);
		System.out.println("The variable of type double has value of: " + myDoubleValue1);
		System.out.println("***************************************************************");

		/*
		 * Narrowing Type Casting or Explicit Type Casting. In this type of
		 * casting it mandatorily requires you to declare casting explicitly.
		 * byte <- short <- int <- long <- float <- double
		 */
		double myDoubleValue2 = 34.34633355632;
		float myFloatValue2 = (float) myDoubleValue2;
		long myLongValue2 = (long) myFloatValue2;
		int myIntValue2 = (int) myLongValue2;
		short myShortValue2 = (short) myIntValue2;
		byte myByteValue2 = (byte) myShortValue2;

		System.out.println("***Narrowing Type Casting***");
		System.out.println("The variable of type double has value of: " + myDoubleValue2);
		System.out.println("The variable of type float has value of: " + myFloatValue2);
		System.out.println("The variable of type long has value of: " + myLongValue2);
		System.out.println("The variable of type int has value of: " + myIntValue2);
		System.out.println("The variable of type short has value of: " + myShortValue2);
		System.out.println("The variable of type byte has value of: " + myByteValue2);
		System.out.println("***************************************************************");

	}

}
