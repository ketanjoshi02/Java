package hackerRank;

import java.awt.datatransfer.StringSelection;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	if(s.length()==1 && s=="a")
    		return n;
    	
    	long occOfA =0;
    	int lenofs = s.length();
    	int ains = s.length()- s.replaceAll("a", "").length();
    	long rpts = n/lenofs;    	
    	
    	long substrlen = n%lenofs;
    	//System.out.println("s:"+lenofs+",sub:"+substrlen);
    	//abaabaabaa
    	String subs = s.substring(0, (int)substrlen);
    	int ainsubs = subs.length() - subs.replaceAll("a", "").length();
    	
    	occOfA = ains*rpts+ainsubs;
    	return occOfA;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
