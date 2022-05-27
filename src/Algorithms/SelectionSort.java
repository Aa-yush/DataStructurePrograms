package Algorithms;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 12, 10, 23, 26, 15 };
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			int temp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
