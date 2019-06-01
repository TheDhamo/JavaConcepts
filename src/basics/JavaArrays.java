/*Java Arrays*/
package basics;

import java.util.Arrays;

public class JavaArrays {
	/*
	 * "Arrays" in Java is a type of data structure that can store elements of
	 * similar data types (primitive OR non- primitive). Arrays in java are
	 * objects.
	 */
	public static void main(String[] args) {
		/* Four ways to initialize an array */
		initializeArray1();
		initializeArray2();
		initializeArray3();
		initializeArray4();
		/*
		 * Multidimensional arrays are "arrays of arrays" with each element of
		 * the array holding the reference of other array.
		 */
		array2DExample();
		array3DExample();
		pyramid();
	}

	private static void initializeArray1() {
		String[] daysInWeek = new String[7];
		daysInWeek[0] = "Sunday";
		daysInWeek[1] = "Monday";
		daysInWeek[2] = "Tuesday";
		daysInWeek[3] = "Wednesday";
		daysInWeek[4] = "Thursday";
		daysInWeek[5] = "Friday";
		daysInWeek[6] = "Saturday";
		System.out.println(Arrays.toString(daysInWeek));
		System.out.println(daysInWeek.getClass());
		System.out.println(daysInWeek.getClass().getSuperclass());
		System.out.println("***************************************************************");
	}

	private static void initializeArray2() {
		String[] myFriends = { "Sam", "Harry", "Tom", "Richard", "Peter", "Mike" };
		System.out.println(Arrays.toString(myFriends));
		System.out.println(myFriends.getClass());
		System.out.println(myFriends.getClass().getSuperclass());
		System.out.println("***************************************************************");
	}

	private static void initializeArray3() {
		double[] studentHeights = new double[] { 166.2, 182.0, 173.4, 175.6, 168.9, 190.2 };
		System.out.println(Arrays.toString(studentHeights));
		System.out.println(studentHeights.getClass());
		System.out.println(studentHeights.getClass().getSuperclass());
		System.out.println("***************************************************************");
	}

	private static void initializeArray4() {
		int myNumberTable[] = new int[9];
		for (int counter = 0; counter < myNumberTable.length; counter++) {
			myNumberTable[counter] = counter * 2;
		}
		System.out.println(Arrays.toString(myNumberTable));
		System.out.println("***************************************************************");
	}

	private static void array2DExample() {
		/*
		 * Data is stored in row and column based index (in matrix form).
		 */
		int[][] my2DArray = { { 12, 4, 6 }, { 66, 33, 2 }, { 6, 1, 5 } };
		for (int row = 0; row < my2DArray.length; row++) {
			for (int column = 0; column < my2DArray.length; column++) {
				System.out.print(my2DArray[row][column] + "\t");
			}
			System.out.println("");
		}
		System.out.println("***************************************************************");
	}

	private static void array3DExample() {
		/* Store */
		int[][][] my3DIntArray = new int[3][4][2];
		int x, y, z, num = 1;
		for (x = 0; x < 3; x++) {
			for (y = 0; y < 4; y++) {
				for (z = 0; z < 2; z++) {
					my3DIntArray[x][y][z] = num;
					num++;
				}
			}
		}
		/* Display */
		for (x = 0; x < 3; x++) {
			for (y = 0; y < 4; y++) {
				for (z = 0; z < 2; z++) {
					System.out.print("my3DIntArray[" + x + "][" + y + "][" + z + "]=" + my3DIntArray[x][y][z] + "\t");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		System.out.println("***************************************************************");
	}

	private static void pyramid() {
		/* Outer loop to handle number of rows (n in this case) */
		int n = 8;
		for (int i = 0; i < n; i++) {
			/*
			 * Inner loop to handle number spaces (values can be changed
			 * according to requirement)
			 */
			for (int j = n - i; j > 1; j--) {
				// printing spaces
				System.out.print(" ");
			}
			/*
			 * Inner loop to handle number of columns (values change according
			 * to outer loop)
			 */
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("***************************************************************");
	}
}
