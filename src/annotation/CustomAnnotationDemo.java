/*Annotation - Java feature that enables us to embed supplemental information into a source file*/
/*All annotation automatically extend the "Annotation" interface*/
/*Annotations can be applied to classes, methods, fields, parameters and enum constants*/
/*Java Build-in Annotations
 * Override
 * Deprecated
 * SuppressWarnings*/
package annotation;

import java.util.ArrayList;
import java.util.List;

@CustomAnnotation2
public class CustomAnnotationDemo {

	@CustomAnnotation3
	protected String vehicleName;

	@Deprecated
	public String getVehicleName() {
		return this.vehicleName;
	}

	public void setVehicleName(@CustomAnnotation4 String vehicleName) {
		this.vehicleName = vehicleName;
	}

	@CustomAnnotation1(value = "123", name = "Modified Name")
	@SuppressWarnings(value = { "rawtypes" })
	public List addVehicleNameToList(List names) {

		@CustomAnnotation5
		List localNames = names;
		if (localNames == null) {
			localNames = new ArrayList<>();
		}
		localNames.add(getVehicleName());
		return localNames;
	}

}
