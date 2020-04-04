package collection;

import java.util.HashSet;

public class HashSetDemo {
	/*
	 * The "HashSet" class extends the "AbstractSet" class and implements the "Set"
	 * interface. It creates a collection that uses a hash table for storing
	 * elements using the "hashing" technique.
	 */
	/*
	 * Hashing -> "Hashing" is a mechanism in which the informational content of a
	 * key is used to determine a unique value (hashcode). The hashcode is then used
	 * as the index at which the data associated with the key is stored. The
	 * transformation of the key into its hashcode is performed automatically. Our
	 * code cannot directly index the hash table. Advantage of "hashing" is that it
	 * allows the execution time of add(), contains(), remove() and size() to remain
	 * constant even for large sets.
	 */
	/*
	 * HashSet does not guarantee the order of its elements because the "hashing"
	 * process does not usually lend itself to the creation of sorted sets.
	 */
	public static void main(String[] args) {
		HashSet<String> myHashSet = new HashSet<String>();
		myHashSet.add("Cricket");
		myHashSet.add("Football");
		myHashSet.add("Hockey");
		myHashSet.add("Badmintor");
		myHashSet.add("Tennis");
		System.out.println("Contens of myHashSet: " + myHashSet);
	}

}
