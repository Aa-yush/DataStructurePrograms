package Algorithms;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 12, 10, 23, 26, 15 };
		int temp = 0;
		int j = 0;

		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
