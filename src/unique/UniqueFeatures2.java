package unique;

import java.sql.SQLException;

public class UniqueFeatures2 {

	// 12
	// there is no such thing as a Checked Exception to the JVM, only the Java
	// language knows this. Not only does this compile, this also actually throws
	// the SQLException

	// No throws clause here
	public static void main(String[] args) {
		doThrow(new SQLException());
	}

	public static void doThrow(Exception e) {
		doThrow0(e);
	}

	@SuppressWarnings("unchecked")
	public static <E extends Exception> void doThrow0(Exception e) throws E {
		throw (E) e;
	}

}
