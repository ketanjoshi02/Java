package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class PickingNumbers {
	 /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
    	int count=0;
        int x,y;
        Collections.sort(a);
        for(int i=0; i<a.size()-1;i++) {
            x= Collections.frequency(a, a.get(i));
            y= Collections.frequency(a, a.get(i+1));
            if( x == a.size() || ( x > count && a.get(i) == a.get(i+1) ) ){
                count=x;
            }
            if( Math.abs(a.get(i)-a.get(i+1))<=1 && a.get(i) != a.get(i+1) && x+y > count ){
                count=x+y;
            }
        }
        
        return count;
    }
	
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = pickingNumbers(a);

        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
