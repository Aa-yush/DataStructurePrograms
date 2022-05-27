package Algorithms;

public class QuickSort {

	public static int Partition(int[] arr, int lb, int ub) {
		int pivot = arr[lb];
		int start = lb;
		int end = ub;
		int temp = 0;
		while (start < end) {
			while (arr[start] <= pivot && start < ub) {
				start++;
			}
			while (arr[end] > pivot) {
				end--;
			}
			if (start < end) {
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}

		temp = arr[lb];
		arr[lb] = arr[end];
		arr[end] = temp;

		return end;
	}

	public static void Quick_sort(int[] arr, int lb, int ub) {

		if (lb < ub) {
			int loc = Partition(arr, lb, ub);
			Quick_sort(arr, lb, loc - 1);
			Quick_sort(arr, loc + 1, ub);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 7, 6, 10, 5, 9, 2, 1, 15, 7 };
		Quick_sort(arr, 0, arr.length - 1);

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
