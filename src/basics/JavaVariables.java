/*Java Variables*/
package basics;

public class JavaVariables {
	/*
	 * A Java Variable is the name of a reserved area allocated in memory to
	 * hold the value while the Java program is executed. Java variables are of
	 * 3 types - 1) Instance (Member) Variables 2) Static (Class) Variables 3)
	 * Local Variables.
	 */
	private static int heightOfPerson = 173;
	/* Here, "heightOfPerson" is a static (class) variable. */
	private int weightOfPerson;
	/* Here, "weightOfPerson" is an instance (member) variable. */

	public static void main(String[] args) {
		JavaVariables obj1 = new JavaVariables();
		obj1.setWeightOfPerson(210);
		obj1.biometrics(true);
		System.out.println("***************************************************************");
		JavaVariables obj2 = new JavaVariables();
		obj2.setWeightOfPerson(192);
		obj2.biometrics(false);
	}

	public void biometrics(boolean overThirty) {
		int age; /* Here, "age" and "overThirty" are local variables. */
		age = overThirty ? 31 : 29;
		System.out.println("Height of the person is: " + heightOfPerson + " cm.(static)");
		System.out.println("Weight of the person is: " + weightOfPerson + " lbs.(instance)");
		System.out.println("Age of the person is: " + age + " years.(local)");
	}

	public int getWeightOfPerson() {
		return weightOfPerson;
	}

	public void setWeightOfPerson(int weightOfPerson) {
		this.weightOfPerson = weightOfPerson;
	}

}
