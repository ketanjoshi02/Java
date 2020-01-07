package hackerRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) throws ParseException {
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
        
        Date date = inputFormat.parse(s);
        
    	return outputFormat.format(date);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ParseException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
        /*
         * bw.write(result);
        bw.newLine();

        bw.close();
         */
        }
}
