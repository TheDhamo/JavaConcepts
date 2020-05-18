package unique;

public class UniqueFeatures1 {

	public static void main(String[] args) {

		// 1
		// This will compile because "http" acts as a label and the rest of the
		// statement is comment due to //
		http: // www.sumondey.com
		System.out.println("The above will throw warning but not compilation error");

		// 2
		// The comment below is not a typo. The java compiler parses the unicode
		// character \u000d
		// as a new line. Unicode decoding takes place before any other lexical
		// translation. The key benefit of this is that it makes it trivial to go back
		// and forth between ASCII and any other encoding. You don't even need to figure
		// out where comments begin and end.
		int value = 22;
		// \u000d value = 23;
		System.out.println("Value: " + value);

		// 3
		// The "+" operator does an implicit type conversion from short to int because
		// of 32-bit operand stack used by JVM
		short a, b, c;
		a = 22;
		b = 23;
		// c=a+b; -> "c" cannot hold an int value, that is, 45

		// 4
		// You can revive a dead object in finalize method of that object. But you can
		// only do it once since finalize
		// is only invoked once for an object. So, you can only live twice in Java

		// 5
		// An interface can have an inner class. One great pattern is to put a factory
		// for implementations of that interface
		// in the inner class, check the source code for Apache XMLBeans

		// 6
		// you can read private variables and directly allocate memory in the OS.

		// 7
		// empty .java source files can be compiled, with no .class files produced
		// Reason -> Since an empty .java source code technically does not contain any
		// compile-time error nor syntax error, hence it can be compiled.
		// the number of .class files a single .java source file can produce is equal to
		// the number of classes defined inside that source. This means that you can
		// actually have any
		// number of classes defined inside a single .java source file, as long as only
		// one class is public (and its name
		// should match the file name of the source file), and each of those classes
		// will match a produced
		// .class file. Since an empty source contains zero class definitions, compiling
		// it creates zero class files.

		// 8
		// there are different types of references in Java - strong, weak, soft and
		// phantom.
		// These references affect the way garbage collection of variables take place

		// 9
		// We can underscore in numeric literals (since java 7)
		int num1 = 222_42_2;
		int num2 = 42__3;
		double double1 = 4_3.42_4;
		float florat1 = 42.42_2F;
		long long1 = 5452345_55464423__232L;

		// 10
		// the following will not generate syntax error in Java
		if (true) {
			int a1 = 23;
		}
		// but, the following will generate syntax error in Java, because the syntax for
		// if is
		// if (expression) statement; but here "int a2=23;" is actually a
		// LocalVariableDeclarationStatement which can come only inside a block
		// statement
		if (true)
			// int a2=23;
			;

		// 11
		// all of the below are two - dimensional arrays
		int arr1[][] = new int[2][2];
		int[] arr2[] = new int[2][2];
		int[][] arr3 = new int[2][2];
		int[] arr4[] = new int[2][2];
		int[][] arr5 = new int[2][2];

	}

}
