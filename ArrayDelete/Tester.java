package ArrayDelete;

public class Tester {

	public static void main(String args[]) {
		char arr[] = new char[6];
		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'J';
		arr[3] = 'C';
		arr[4] = 'D';
		arr[5] = 'E';

		// Make changes and try to insert elements at different positions
		ArrayTest.delete(arr, 3);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
