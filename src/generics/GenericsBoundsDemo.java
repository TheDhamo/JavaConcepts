package generics;

public class GenericsBoundsDemo {

	public static void main(String[] args) {
		// Integer is a subclass of "Number"
		Integer[] iNums = { 1, 2, 3, 4, 5 };
		Stats<Integer> iOb = new Stats<Integer>(iNums);
		System.out.println("Average is: " + iOb.average());

		// Double is also a subclass of "Number"
		Double[] iDums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats<Double> dOb = new Stats<Double>(iDums);
		System.out.println("Average is: " + dOb.average());

		// String is not a subclass of "Number" hence the below will throw Compile Error
		// String[] iSums = { "1", "2", "3", "4", "5" };
		// Stats<String> sOb = new Stats<String>(iSums);
		// System.out.println("Average is: " + sOb.average());

	}

}

class Stats<T extends Number> {
	T[] ob;

	public Stats(T[] ob) {
		this.ob = ob;
	}

	// return average value (in double) for all the cases
	public double average() {
		double sum = 0;
		for (int i = 0; i < ob.length; i++) {
			sum += ob[i].doubleValue();
		}
		return sum / ob.length;
	}
}
