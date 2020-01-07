package codewars;

public class Tribonacci {

	public static void main(String[] args) {
		
		double[] s = {12.0,5.0,4.0};
		double[] d = tribonacci(s,10);
		//System.out.println(d);
		
		for(double a : d) 
		{
			System.out.println(a);
		}
		
	}

	public static double[] tribonacci(double[] s, int n) {
	      double[] result = new double[n];
	      
	      if(n==0)
	      {
	        return result;
	      }
	      else
	      {
	        for(int i=0; i<n ; i++)
	        {
	          if(i < 3)
	          {
	            result[i]=s[i];
	          }
	          else
	          {
	            result[i]=(result[i-1]+result[i-2]+result[i-3]);
	          }
	          
	        }
	      }
	      return result;
	  }
}
