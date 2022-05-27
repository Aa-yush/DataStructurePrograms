import java.util.Scanner;


class PrimeNumberClass{
	public static boolean isPrime(int checknum){
		for(int i = 2; i <= checknum/2; i++){
			if(checknum%i==0)
				return false;
		}
		return true;
	}
}


public class ListPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();				
		int count = 1;
		int startnumber = 1;
		
		while(count <= num){					
			startnumber++;
			if(PrimeNumberClass.isPrime(startnumber)){
				System.out.println(startnumber + " ");
				count++;
			}
			
			
		}

	}

}
