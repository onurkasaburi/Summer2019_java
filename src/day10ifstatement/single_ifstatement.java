package day10ifstatement;

public class single_ifstatement {
public static void main(String[] args) {
	if ( 9 > 8 ) {
		System.out.println("9 is greater then 8")	
		
	}
	
	if ( 9 < 8 ) {
		System.out.println("9 is smaller then 8");
	}
	
	int hours = 12;
	int minutes = 45;
	int seconds = 30;
	String amorpm ="am";
	System.out.println( hours + ":" +minutes + ":" +seconds+ "" +amorpm );
			
	
	int n1 = 1000,  n2 = 5000,  n3 = 900;
	int max = 0;
	if (n1 > n2 && n1 > n3) {
		max = n1;
	}
	if (n2 > n1 && n2 > n3) {
		max = n2;
	}
	if (n3 > n1 && n3 > n2) {
		max = n3;
	}
	String result = "maximum number between  1000 5000 and 900 is 500";
	System.out.println( result );
	
	System.out.println(" maximum number between" "+n1" +, "+n2 " +, "+n3+" "is" +result );
	
}
}
