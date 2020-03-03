package annotation;

import java.lang.reflect.Method;
import java.util.List;

// Getting the Annotation Information at runtime
public class CustomAnnotationDemo2 {

	public static void main(String[] args) {
		CustomAnnotationDemo obj1 = new CustomAnnotationDemo();
		// get the Class
		Class<?> annotationClass = obj1.getClass();
		// get the Method
		try {
			Method annotationMethod = annotationClass.getMethod("addVehicleNameToList", List.class);
			CustomAnnotation1 customAnnotation1 = annotationMethod.getAnnotation(CustomAnnotation1.class);
			System.out.println("customAnnotation1.value() -> " + customAnnotation1.value());
			System.out.println("customAnnotation1.name() -> " + customAnnotation1.name());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

	}
}
