/*Java Reflection allows us to inspect or/and modify runtime attributes of classes, interfaces, fields and methods*/
package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Reflection_Main {

	/*
	 * Extracting information about the Person class and its constructor at
	 * runtime
	 */
	@Test
	public void extractClassInfo() {
		Object person = new Person("Sam", 30, 1.72);
		System.out.println("Class name is: " + person.getClass().getName());
		System.out.println("Class name is: " + person.getClass().getSimpleName());
		System.out.println("Class name is: " + person.getClass().getCanonicalName());
		Constructor<?>[] constructors = person.getClass().getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println("Constructor: " + constructor);
		}
		System.out.println("**************************************************************************");
	}

	/* Extracting information about the fields of the Person class at runtime */
	@Test
	public void extractFieldnfo() {
		Object person = new Person("Sam", 30, 1.72);
		Field[] declaredFieldNames = person.getClass().getDeclaredFields();
		for (Field declaredFieldName : declaredFieldNames) {
			System.out.println("Field: " + declaredFieldName.getName());
		}
		System.out.println("**************************************************************************");
	}

	/*
	 * Extracting information about the methods of the Person class at runtime
	 */
	@Test
	public void extractMethodnfo() {
		Object person = new Person("Sam", 30, 1.72);
		Method[] declaredMethodNames = person.getClass().getDeclaredMethods();
		for (Method declaredMethodName : declaredMethodNames) {
			System.out.println("Method: " + declaredMethodName.getName());
		}
		System.out.println("**************************************************************************");
	}

}

/* Person Class */
class Person {
	private String name;
	private int age;
	private double height;

	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public void hobby() {
		System.out.println("The hobby of the person is coding.");
	}

	public void ethnicity() {
		System.out.println("The ethnicity of the person is Indian.");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

}
