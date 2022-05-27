
public class CountNumberOfVowels {

	public static void main(String[] args) {
		String str = "umbrella".toLowerCase();
		char ch[] = str.toCharArray();
		int vowels = 0; 
		for(char c : ch){
			if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
				vowels = vowels + 1;
			}
		}
		System.out.println("Vowels : "+ vowels);
	}

}
