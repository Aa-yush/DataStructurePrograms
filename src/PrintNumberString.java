/*
 *
Input : 3
Output : 3+33+333

Input : 5
Output: 5+55+555+5555+55555

*/

import java.util.Scanner;
public class PrintNumberString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(num);
			}
			if(i == num){
				return;
			}
			System.out.print("+");
		}
		
		
	}

}
