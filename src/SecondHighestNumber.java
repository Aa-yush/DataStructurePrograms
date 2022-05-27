
public class SecondHighestNumber {

	public static void main(String[] args) {
		int [] arr = {2,9,3,12,57};
		int largest_number =0;
		int secondlargest_number = 0;
		for(int array : arr){								//2  	9  	56		3 		12		57
			if(largest_number < array){						//0<2	2<9	9<56	56<3	56<12	56<57
			secondlargest_number = largest_number;			//0		2	9						56
			largest_number = array;							//2		9	56						57
			}else{
				secondlargest_number = array;									
			}
		}
		System.out.println(largest_number);
		System.out.println(secondlargest_number);
		}

}
