package codewars;

public class DuplicateEncoder {

	public static void main(String[] args) {
		System.out.println("Encoded string [ '(' <- one ')' <- duplicate] is : "+encode("Success"));
	}
	static String encode(String word){
	    int count=0;
	    char[] wordArr = word.toLowerCase().toCharArray();
	    word="";
	    for(char c: wordArr)
	    {
	      for(int i=0;i<wordArr.length;i++) 
	      {
	    	 count = (c==wordArr[i])? ++count : count; 
	      }
	      word = (count>1)?word.concat(")"):word.concat("(");
	      count=0;
	    }
	    return word.trim();
	  }
}
