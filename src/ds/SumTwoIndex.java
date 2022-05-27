package ds;

public class SumTwoIndex {
	public static void main(String[] args) {
		int[] arr = { 5, 7, -2, 0, 1, 4, 9 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] + arr[j] == 8) {
					System.out.println("Index : - " + i + " " + j);
				}
			}
		}
	}

}
