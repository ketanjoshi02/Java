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

public class DayOfProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
    	//Julian Calender
    	if(year<1918){
    		if(year%4==0) {
    			return "12.09."+year;
    		}else {
    			return "13.09."+year;
    		}
    	// Gregorian Calender
    	}else if(year>1918){
    		if(year%4!=0) {return "13.09."+year;}
    		else if(year%100!=0) {return "12.09."+year;}
    		else if(year%400!=0) {return "13.09."+year;}
    		else {return "12.09."+year;}
    	//Russian adaption year of Gregorian form Julian 1918
    	}else {
    		return "26.09.1918";
    	}

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        System.out.println(result);
        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
