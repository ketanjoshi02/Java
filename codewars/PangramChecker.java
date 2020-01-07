package codewars;

public class PangramChecker {

	public static void main(String[] args) {
		
		System.out.println("The sentence is Pangram = "+check("The quick brown fox jumps over the lazy dog"));

	}

	public static boolean check(String sentence){

		char ch = 'A',ch2='a';
		
		while(sentence.indexOf(ch)!=-1 || sentence.indexOf(ch2)!=-1){
			ch++;ch2++;
			System.out.println(ch+" "+ch2);
		}
		ch--;ch2--;
		
		return (ch=='Z')?true:false;
	}
}
