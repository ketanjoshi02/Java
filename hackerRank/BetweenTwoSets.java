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

public class BetweenTwoSets {
    
    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        List<Integer> betweenSet = new ArrayList<Integer>();
        List<Integer> betweenSet2 = new ArrayList<Integer>();
        int count=0;
        
        
        Collections.sort(a);
        Collections.sort(b);
        for(int i=a.get(a.size()-1); i<=b.get(0) ; i++){
            
            for(int x:a){
                if(i%x==0) {
                    count++;
                    continue;
                }else{
                    break;
                }
            }
            if(count==a.size()) betweenSet.add(i);
            count=0;    
        }
        
        for(int j=0;j<betweenSet.size();j++){
            
            for(int y:b){
                if(y%betweenSet.get(j)==0){
                     count++;
                     continue;
                }else{
                    break;
                }
            }
            if(count==b.size()) betweenSet2.add(j);
            count=0;
        }
        return betweenSet2.size();
    }
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
