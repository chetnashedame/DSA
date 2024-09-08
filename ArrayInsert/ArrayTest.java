package ArrayInsert;

public class ArrayTest {

	public static void insert(char[] ar, int pos, char val) {
		// Traversing the array from the last position to the position where the element
		// has to be inserted
		for (int i = ar.length - 1; i >= pos - 1; i--) {
			// Moving each element one position to its right
			ar[i] = ar[i - 1];
		}

		// Inserting the data at the specified position
		ar[pos - 1] = val;
	}
}
