package unique;

public class UniqueFeatures3 extends Parent<String> {
	@Override
	String x() {
		return "abc";
	}
	// 13
	// The class public Method getMethod(String name,
	// Class<?>... parameterTypes)
	// throws NoSuchMethodException,
	// SecurityException says
	// We can have method overloads differing only in return types
	// There may be more than one matching method in a class because while the Java
	// language forbids a class to declare multiple methods with the same signature
	// but different return types, the Java virtual machine does not. This increased
	// flexibility in the virtual machine can be used to implement various language
	// features. For example, covariant returns can be implemented with bridge
	// methods; the bridge method and the method being overridden would have the
	// same signature but different return types.

}

abstract class Parent<T> {
	abstract T x();
}
