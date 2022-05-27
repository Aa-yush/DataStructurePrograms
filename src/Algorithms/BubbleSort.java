package Algorithms;

/*
 In bubble sort, we had compare first array element index with second array element index. 
 If first array element is greater than other then, perform swap.
 We need to perform number_of_element - 1 round times pass
 */

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 12, 10, 23, 26, 15 };
		int num = arr.length;

		for (int pass = 1; pass <= num - 1; pass++) {
			int temp = 0;
			for (int i = 0; i < num - pass; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
