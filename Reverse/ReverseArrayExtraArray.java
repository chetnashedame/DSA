//WRITE A PROGRAM TO REVERSE THE ARRAY://  
package Reverse;

public class ReverseArrayExtraArray {
	public static void reverseArrayExtraArray(int[] arr) {
		int[] reversedArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reversedArr[i] = arr[arr.length - i - 1];
		}
		System.out.print("ReversedArray : ");
		for (int i : reversedArr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] originalArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		reverseArrayExtraArray(originalArr);

	}
}
