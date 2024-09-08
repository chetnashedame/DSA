//FIND THE MINIMUM AND MAXIMUM ELEMENT OF AN ARRAY//
package MinMax;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int arr[] = { 1, 25, 4, 20, 2, 3, 0, 17, 9, 18, 10 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println("min: " + arr[0] + " max: " + arr[arr.length - 1]);

	}
}
