package day10ifstatement;

public class if_elsestatement {
public static void main(String[] args) {
	if ( 9 > 8 ) {
		System.out.println("9 is gretaer then 8");
	}
	if ( 9 < 8 ) {
		System.out.println("9 is smaller then 8");
	}
	if ( 9 == 8 ) {
		System.out.println("9 is equal to 8");
	}
	if ( 9 <= 8 ) {
		System.out.println("9 is less or equal to 8");
	}
	else {
		System.out.println("9 is greater then 8");
	}
	
	

	}
	
	
	
	
	int angle1 = 50;
	int angle2 = 60;
	int angle3 = 70;
	boolean valid = (angle1+angle2+angle3) == 180;
	if (valid) {
			System.out.println("it is a valid triangle");
	}
	else {
		System.out.println("it is not a triangle");
	}
	
}
}
