package day11;

public class review {
public static void main(String[] args) {
	
	int grade = 105;
	boolean A = grade >= 90 && grade <= 100;
	boolean B = grade >= 80 && grade <= 89;
	boolean C = grade >= 70 && grade <= 79;
	boolean D = grade >= 60 && grade <= 69;
	boolean validgrade = grade >= 0 && grade <= 100;
	if ( validgrade ) {
		
	if ( A ) {
		System.out.println("you made A");
	}
	else if ( B ) {
		System.out.println("you made B");
	}
	else if ( C ) {
		System.out.println("you made C");
	}
	else if ( D ) {
		System.out.println("you made D");
	}
	else {
		System.out.println("you made F");
	}
	}
	else {
		System.out.println("invalid grade");
	}
	
	int age = 30;
	boolean healthy = true;
	if ( age >= 18 ) {
		System.out.println("alcohol is dangerous for you");
	}
	else {
		System.out.println(" you can get poisoned");
		if ( age <= 21) {
			System.out.println("you can buy cigarette");
		}
		if ( age >= 21 ) {
			System.out.println("you can buy cigarette and alcohol");
		}
		else { // age 25 or up
			System.out.println("buy some milk");
		}
	}
	
 
	
	/* 28 = 2
	  30 = 4, 6, 9, 11
	  31 = 1, 3, 5, 7,8,10,12
	  
	 */
	
	int month = 13;
	if ( month > 2 && month < 13 ) {
		if ( month ==1 ) {
			System.out.println("31 days");
		}
			if ( month ==2) {
				System.out.println("28 days");
			}
			if ( month ==4 || month ==6 ) {
				System.out.println("30 days");
			}
			if ( month ==9 || month ==11 ) {
				System.out.println(" 30 days");
			}
			else {
				System.out.println("31 days");
			}
	} else {
		System.out.println("invalid entry");
	}
	
			
	
	int x = 10;
	if ( x > 10 ) {
		System.out.println("greater than 0");
	}
	if ( x > 5 ) {
		System.out.println("greater than 5");
	}
	if ( x >= 10 ) {
		System.out.println("equal to 10");
	}
}
}
