package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class BirthdayCandles {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
       int max=0,countMax=0;
    	for(int i:ar) {
    		if(max<i)
    			max=i;
    	}
    	for(int i:ar) {
    		if(max==i)
    			countMax++;
    	}
    	
        return countMax;

    	//List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
    	//return (int) list.stream().filter(i -> i > i.compareTo(i)).count();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
    	//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}