package Rearrangenegpos;

import java.util.Arrays;

public class Rearrange {
	public static void reArrange(int[] arr, int N) {
		int j = 0, temp;
		for (int i = 0; i < N; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;

			}
		}
	}

	public static void printArray(int[] arr, int N) {
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { -2, 5, 9, 7, -5, -7, 1, 6, -3 };
		int N = arr.length;
		reArrange(arr, N);
		Arrays.sort(arr);
		printArray(arr, N);

	}

}
