package Algorithms;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 10, 12, 13, 55, 75, 24, 64, 22, 65 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element : ");
		int search = sc.nextInt();
		boolean flag = false;
		for (int a : arr) {
			if (a == search) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("Number is found");
		} else {
			System.out.println("Number is not found");
		}
	}
}
