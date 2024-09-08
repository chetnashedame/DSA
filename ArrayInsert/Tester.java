package ArrayInsert;

public class Tester {

	public static void main(String args[]) {
		char arr[] = new char[6];
		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
		arr[3] = 'D';
		arr[4] = 'E';

		// Make changes and try to insert elements at different positions
		ArrayTest.insert(arr, 3, 'J');
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
