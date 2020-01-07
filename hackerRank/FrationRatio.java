package hackerRank;

import java.util.Scanner;

public class FrationRatio {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	//int precision = 1000000;
    	double plus=0,minus=0,zero=0;
    	
    	
    	for(int i:arr) {
    		if(i==0) {
    			zero++;
    		}else if(i<0) {
    			minus++;
    		}else {
    			plus++;
    		}
    	}
    	System.out.printf("%.6f\n", (plus/arr.length));
    	System.out.printf("%.6f%n", (minus/arr.length));
    	System.out.printf("%.6f\n", (zero/arr.length));
    	
    	//System.out.println(Math.floor( ((plus/arr.length)*precision+.5))/precision );
    	//System.out.println(Math.floor( ((minus/arr.length)*precision+.5))/precision);
    	//System.out.println(Math.floor( ((zero/arr.length)*precision+.5))/precision);
    	
    	//DecimalFormat df = new DecimalFormat("#.######");
    	//System.out.println(df.format(plus/arr.length));
    	//System.out.println(df.format(minus/arr.length));
    	//System.out.println(df.format(zero/arr.length));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}