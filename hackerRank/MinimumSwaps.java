package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	int count=0;
    	Map<Integer,Integer> hashArr = new HashMap<Integer,Integer>();
    	int oldVal = 0;
    	for(int i=0;i<arr.length;i++) {
    		hashArr.put(i, arr[i]);
    	}
    	
    	for(int j=0;j<arr.length;j++) {
    		
    		if(hashArr.get(j)==j+1) {
    			continue;
    		}
    		else {
    			oldVal = hashArr.replace(j,j+1);
    			int x= hashArr.keySet()
						.stream()
						.filter(key -> value.equals(map.get(key)))
						.findFirst().get();
    		}
    	}

    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
