package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SherlockAndValidString {

    // Complete the isValid function below.
    static String isValid(String s) {

    	List<Character> lch = s.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
    	int flag=0;
    	Collections.sort(lch);
    	int count = Collections.frequency(lch, lch.get(0));
    	char prev = lch.get(0);
    	for(int i=1;i<lch.size();i++) {
    		if(lch.get(i)==prev) {
    			continue;
    		}
    		prev=lch.get(i);
    		if(Collections.frequency(lch, lch.get(i))!=count) {
    			flag++;
    		}
    		if(flag==2)
    			break;
    	}
    	return (flag==2)?"NO":"YES";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
