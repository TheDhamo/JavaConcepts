/*Java Reflection allows us to inspect or/and modify runtime attributes of classes, interfaces, fields and methods*/
package reflections;

import java.lang.reflect.Constructor;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Reflection_Main_2 {

	/* To inspect Constructors and create Class Objects at runtime */
	@Test
	public void createClassObject() throws Exception {
		System.out.println("**************************************************");
		System.out.println("Create Object using Constructor Information");
		System.out.println("**************************************************");
		Constructor<?>[] constructors = Bird.class.getConstructors();
		System.out.println("Number of Constructors of the Bird class is: " + constructors.length);
		Constructor<?> constructor1 = Bird.class.getConstructor();
		Constructor<?> constructor2 = Bird.class.getConstructor(String.class);
		Constructor<?> constructor3 = Bird.class.getConstructor(String.class, boolean.class);
		Bird bird1 = (Bird) constructor1.newInstance();
		Bird bird2 = (Bird) constructor2.newInstance("Pigeon");
		Bird bird3 = (Bird) constructor3.newInstance("Sparrow", true);
		System.out.println(bird1.getName());
		System.out.println(bird2.getName());
		System.out.println(bird3.getName());
	}

	/* To get and set Field values at runtime */

}
