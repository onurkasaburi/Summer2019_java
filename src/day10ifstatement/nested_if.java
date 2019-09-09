package day10ifstatement;

public class nested_if {

	public static void main(String[] args) {
		if ( true ) {
			System.out.println("hello cybertek");
			if ( false) {
				System.out.println("hello world");
			}
		}
		
		if ( true ) {
			System.out.println("hello team");
			if ( false) {
				System.out.println("hello world");
			} else {
				System.out.println("hi everyone");
			}
		}
		
		int grade = 70;
		if ( grade >60 ) {
			System.out.println("passed");
		}
		if ( grade >= 90 && grade <= 100 ) {
			System.out.println("\nwith grade A");
		}
		else if (grade >= 80 && grade <= 90 ) {
			System.out.println("with grade B");
		}
		else if (grade >= 70 && grade <= 80 ) {
			System.out.println("with grade C");
		}
		else {
			System.out.println("with grade D");
		}
		
		
		int score = 22;
		if ( score >= 30 && score <= 40) {
			System.out.println("with grade E");
		}
		if ( score >= 20 && score <= 30) {
			System.out.println("with grade F");
		}
		
	}
}
