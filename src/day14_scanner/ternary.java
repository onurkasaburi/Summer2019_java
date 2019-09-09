package day14_scanner;

public class ternary {
public static void main(String[] args) {
	
	int num = 0;
	if (true) {
		num = 100;
	} 
	else {
		num = 50;
	}
		System.out.println( num );


	int n = (true) ? 100 : 50	;		
	int y = (false) ? 100 : 50	;		
	System.out.println(num);
	
	
	String schoolname ="";
	boolean batch12 = true;
	if (batch12) {
		schoolname = "cybertek";
	} else {
		schoolname = "invalid";
	}
		System.out.println( batch12 ? "cybertek" : "invalid" );
		
		
		System.out.println("------");
		
		double interest = 0;
		boolean goodcredit = true;
		interest =( goodcredit == true ) ? 0.5 : 0.9 ; 
		System.out.println(interest);
		
		
		
		int score = 80;
	
		finalsc = (score >= 80 && score <= 100) ? 'A'
				: (score >= 70 && score <= 80) ? 'B'
				: (score >= 60 && score <= 70) ? 'C'
				: (score >= 50 && score <=60) ? 'D'	
				: (score >= 0 && score <= 59) ? 'F'
				: ' ';
		System.out.println(finalsc);

				}
}

