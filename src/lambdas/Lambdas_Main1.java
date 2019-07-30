/*Java Lambdas Demo*/
package lambdas;

public class Lambdas_Main1 {
	/*
	 * Lambdas are used to provide implementation to the method of a Functional
	 * interface. Some common Functional Interfaces in Java are Comparator,
	 * Runnable,Comparable,ActionListener etc.
	 */
	public static void main(String[] args) {
		System.out.println("This is the first statement from the main thread.");

		// Creating a Thread Without using Lambda Expression
		Runnable rc1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("This is statement1 from Runnable without Lambda Expression");
				System.out.println("This is statement2 from Runnable without Lambda Expression");
			}
		};
		new Thread(rc1).start();

		// Creating a Thread by using Lambda Expression
		// For single statement within the Lambda Expression it is optional to
		// use curly braces
		// Below since we are using two print statements,we have to keep them
		// inside the curly braces
		Runnable rc2 = () -> {
			System.out.println("This is statement1 from Runnable with Lambda Expression");
			System.out.println("This is statement2 from Runnable with Lambda Expression");
		};
		new Thread(rc2).start();
	}

}
