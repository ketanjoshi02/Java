package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.security.acl.LastOwnerException;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class ClimbingLeaderBoard {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
    	
    	int[] ranks = new int[alice.length];
        int count = 0,r=1;
        Map<Integer,Integer> m = new HashMap<>();
        
        for(int s:scores) {
        	if(!m.containsValue(s)) {
        		m.put(r,s);
        		r++;
        	}
        }
        System.out.println(m);
        int j=m.size();
        for(int i=0;i<alice.length;i++) {

        	
        }
        return ranks;
    	
    	
    	/*
    	 * int[] ranks = new int[alice.length];
        int count = 0,r=1;
        Map<Integer,Integer> m = new HashMap<>();
        
        for(int s:scores) {
        	if(!m.containsValue(s)) {
        		m.put(r,s);
        		r++;
        	}
        }
        System.out.println(m);
       
        for(int i=0;i<alice.length;i++) {
        	        	
        	for(int j=1;j<=m.size();j++) {
        		System.out.println(alice[i]+">="+m.get(j));
        		if(alice[i] >= m.get(j) ) {
        			ranks[count]= j;
        			break;
        		}
        		if(j==m.size()) {
        			ranks[count]=j+1;
        			break;
        		}
        		//System.out.println(ranks);
        	}
        	count++;
        	//System.out.println(ranks);
        }
        return ranks;

    	 * 
    	 * 
    	int[] ranks = new int[alice.length];
        int count = 0;
        TreeSet<Integer> scoreAfterAlice = new TreeSet<Integer>(Arrays.stream(scores).boxed().collect(Collectors.toSet()));        
        for(int i:alice) {
            scoreAfterAlice.add(i);
            ranks[count]= ( scoreAfterAlice.size() - scoreAfterAlice.headSet(alice[count]).size() );
            count++; 
            scoreAfterAlice.remove(i);
        }
        return ranks;
    	*/
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            
        	System.out.println(result[i]);
            
        	//bufferedWriter.write(String.valueOf(result[i]));
        	//if (i != result.length - 1) {
                //bufferedWriter.write("\n");
            //}
        }

        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
