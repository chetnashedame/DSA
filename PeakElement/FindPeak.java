//FIND A PEAK ELEMENT IN AN ARRAY WHICH IS NOT SMALLER THAN ITS NEIGHBOURS; //
package PeakElement;

public class FindPeak {

	public static int findPeak(int arr[], int n) {
		if (n == 1)
			return 0;
		if (arr[0] >= arr[1])
			return 0;
		if (arr[n - 1] >= arr[n - 2])
			return 0;
		for (int i = 1; i < n - 1; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
				return i;
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 20, 4, 0 };
		int n = arr.length;
		System.out.println("index of the peak point is " + findPeak(arr, n));

	}

}
