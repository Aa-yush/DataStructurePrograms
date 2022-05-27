
public class PalindromeString {
	public static void main(String [] args){
		String str = "aca";
		String strReverse = "";
		char ch[] = str.toCharArray();
		for(int i = ch.length-1; i >=0; i--){
		strReverse = strReverse + ch[i];	
		}
		System.out.println(strReverse);
		if(str.equals(strReverse))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}

}
