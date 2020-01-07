package hackerRank;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	int min=arr[0],max=0;
    	long sum=0;
    	for(int i:arr) {
    		if(min>i)
    			min=i;
    		if(max<i)
    			max=i;
    		
    		sum+=i;
    	}
    	System.out.println((sum-max)+" "+(sum-min));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

