package codewars;

public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		int f=1000;

		System.out.println("Trailing zeros in factorial of "+f+" is: "+ zeros(f));
	}

	public static int zeros(int n) {
	    int trailingZeros = 0; 
		int div = 5;
		while(div<=n) {
			trailingZeros += (n/div);
			div *= 5;
			System.out.println(div);
		}
	      return trailingZeros;
	  }
}
