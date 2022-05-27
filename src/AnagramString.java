import java.util.Arrays;


public class AnagramString {
	public static void main(String [] args){
		String first = "aman".toLowerCase();
		String second = "mann".toLowerCase();
		char f_ch [] = first.toCharArray();
		char s_ch [] = second.toCharArray();
		
		Arrays.sort(f_ch);
		System.out.println(f_ch);
		Arrays.sort(s_ch);
		System.out.println(s_ch);
		
		boolean check = Arrays.equals(f_ch, s_ch);
		
//		String f_str_ch = new String(f_ch);
//		String s_str_ch = new String(s_ch);
		
		if(check == true) {
			System.out.println("String is Anagram");
		}else{
			System.out.println("String is not Anagram");
		}
	}
}
