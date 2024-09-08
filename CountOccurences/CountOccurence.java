package CountOccurences;

public class CountOccurence {
	public static int countOccurence(int[] arr, int N, int X) {
		int count = 0;
		for (int i = 0; i < N; i++)
			if (X == arr[i])
				count++;
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 4, 8, 9, 55, 5, 6, 5, 5, 3, 7, 4, 5 };
		int N = arr.length;
		int X = 5;

		System.out.println("count occurence of int X=5 in array is : " + countOccurence(arr, N, X));
	}

}
