package codewars;

public class GrowingPlant {
	
	public static void main(String[] args) {
		System.out.println("Number of days plant will reach to desired Height is: "+growingPlant(88, 2, 99));
	}

	public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int days=1;
        int growth = upSpeed;
		if( (upSpeed < 5 || upSpeed > 100) || (downSpeed < 2 || downSpeed >= upSpeed) || (desiredHeight < 4 || desiredHeight > 1000) ){
        	return 1;
        }else 
        {
        	while(growth < desiredHeight){
        		days++;
        		growth -= downSpeed;
        		growth += upSpeed;
        	} 	
        	return days;
        }
    }
}