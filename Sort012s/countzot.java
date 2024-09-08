package Sort012s;

public class countzot {
	public static void sort012(int[] arr, int N) {
		int lo = 0;
		int hi = N - 1;
		int mid = 0;
		int temp = 0;
		while (mid <= hi) {
			switch (arr[mid]) {

			case 0: {
				temp = arr[lo];
				arr[lo] = arr[mid];
				arr[mid] = temp;
				lo++;
				mid++;
				break;
			}

			case 1:
				mid++;
				break;

			case 2: {
				temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = temp;
				hi--;
				break;
			}

			}
		}
	}

	public static void printArray(int[] arr, int N) {
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");

		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 1, 0, 2, 1, 0, 2, 1, 0, 1, 1, 0, 2, 1, 2, 0, 1, 0, 2 };
		int N = arr.length;
		sort012(arr, N);
		printArray(arr, N);
	}

}
