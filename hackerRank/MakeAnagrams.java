package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class MakeAnagrams {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

    	int countRemovable = 0;
    	List<Character> arrA = a.chars().mapToObj(c->(char)c).collect(Collectors.toList());
    	List<Character> arrB = b.chars().mapToObj(e ->(char)e).collect(Collectors.toList());
    	
    	for(char ch='a';ch<='z';ch++) {
    		countRemovable+=Math.abs( Collections.frequency(arrA, ch) - Collections.frequency(arrB, ch) ) ;
    	}
    	
    	return countRemovable;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
