package ArrayDelete;

public class ArrayTest {

	public static void delete(char[] ar, int pos) {
		for (int i = pos - 1; i < ar.length - 1; i++) {
			// Traversing the array from the last position to the position where the element
			// has to be inserted<ar.length-1; i++) {
			ar[i] = ar[i + 1];
		}

		// Inserting the data at the specified position
		ar[ar.length - 1] = '0';
	}
}
