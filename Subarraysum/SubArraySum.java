package Subarraysum;

public class SubArraySum {
	public void SubarraySum(int[] arr, int N, int sum) {
		for (int i = 0; i < arr.length; i++) {
			int currentSum = arr[i];
			if (currentSum == sum) {
				System.out.println("current sum found at index " + i);
				return;
			} else {
				for (int j = i + 1; j < arr.length; j++) {
					currentSum += arr[j];
					if (currentSum == sum) {
						System.out.println("current sum found between index " + i + " and " + j);
						return;
					}

				}
			}
		}
		System.out.println("no sum found");
		return;
	}

	public static void main(String[] args) {
		SubArraySum arraySum = new SubArraySum();
		int[] arr = { 1, 5, 3, 6, 8, 9, 6, 2, 5, 7, 1, 5, 6, 2, 3, 5, 9, 1, 2, 3, 5, 9, 2, 5 };
		int N = arr.length;
		int sum = 15;
		arraySum.SubarraySum(arr, N, sum);

	}

}
