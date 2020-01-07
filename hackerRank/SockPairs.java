package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class SockPairs {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

    	int countPairs=0,makePair=0;
    	
    	List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
    	
    	Collections.sort(list);
    	
    	while(list.isEmpty()==false) {
    		makePair=Collections.frequency(list, list.get(0));
    		countPairs+=(makePair/2);
    		list.removeAll(Collections.singleton(list.get(0)));
    	}
    	return countPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
