package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RotateLeftArray {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
//12345 -> 23451 <= leftShift 1
    	int[] result = new int[a.length];
    	
    	int temp=0;
    	//d=a.length-d;
        for(int i=0 ;i<a.length ;i++) {
        
        	if(i+d>=a.length) {
        		temp=i-d;
        	}else {
        		temp=a.length-i-d;
        	}
        	System.out.println(temp);
        	result[temp]=a[i];
            
        }
        
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            //bufferedWriter.write(String.valueOf(result[i]));
        	System.out.println(result[i]);
            if (i != result.length - 1) {
              //  bufferedWriter.write(" ");
            }
        }

       // bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
