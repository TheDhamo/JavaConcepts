package unique;

public class UniqueFeatures1 {

	public static void main(String[] args) {

		// 1
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
		// The "+" operator does an implicit type conversion from short to int
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

	}

}
