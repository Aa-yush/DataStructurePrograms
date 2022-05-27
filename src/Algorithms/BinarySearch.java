package Algorithms;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 6, 8, 12, 15, 16, 17, 22, 28, 35 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item you want to search : ");
		int item = sc.nextInt();
		int li = 0;
		int hi = a.length - 1;
		int mi = (li + hi) / 2;

		for (int i = li; i <= hi; i++) {
			mi = (li + hi) / 2;
			if (a[mi] == item) {
				System.out.println("Item is found at " + mi + " index");
				return;
			} else if (a[mi] < item) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
		}
	}
}
