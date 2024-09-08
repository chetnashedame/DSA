//FIND THE KTH SMALLEST AND LARGEST ELEMENT OF THE ARRAY//
package LargestSmallestNum;

import java.util.Arrays;

public class KthSmallestLargest {
	public static int kthsmallest(int[] arr, int K) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		return arr[K - 1];
	}

	public static int kthlargest(int[] arr, int K, int N) {
		return arr[N - K];

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 6, 2, 3, 7, 8, 4, 1, 9 };
		int N = arr.length;
		int K = 2;

		System.out.println("Kth Smallest number of an array is : " + kthsmallest(arr, K));
		System.out.println("Kth Lmallest number of an array is : " + kthlargest(arr, K, N));
	}

}
