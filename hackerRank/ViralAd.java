package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ViralAd {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
    	int adLiker=0;
    	int shared=5;
    	int totalLiker=0;
    	for(int i=1;i<=n;i++) {
    		adLiker=shared/2;
    		shared=adLiker*3;
    		totalLiker+=adLiker;
    	}
    	return totalLiker;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
