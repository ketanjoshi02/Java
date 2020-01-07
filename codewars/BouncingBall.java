package codewars;

public class BouncingBall {

	public static int ballPassed = 0;
	
	public static void main(String[] args) {
		System.out.println("Times, Ball Mommy can see from window is: "+bouncingBall(30.0,0.66 ,1.5));

	}
	public static int bouncingBall(double h, double bounce, double window) {
		if (h > 0 && window < h && (bounce < 1 && bounce > 0)) {
			while (window < h ) {
				ballPassed+=2;
				h=h*bounce;
			}
			return ballPassed - 1;
		} else {
			return -1;
		}
	}
}