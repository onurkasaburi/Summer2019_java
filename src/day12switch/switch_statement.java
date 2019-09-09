package day12switch;

public class switch_statement {
public static void main(String[] args) {
	int score = 1;
	if ( score == 1 ) {
		System.out.println("1");
	}
	else if ( score == 2) {
		System.out.println("2");
	}
	
	switch (score) {
	case 1:
		System.out.println("1");
		break;
		
	case 2:
		System.out.println("2");
		break;
		default:
		System.out.println("invalid");
		break;
	}
	System.out.println("----");
	
	String str = "java";
	switch (str) {
	
	case "C#":
		System.out.println("C# programming language");
		break;
	case "Python":
		System.out.println("Python programming language");
	default:
		System.out.println("invalid");
	}
	
	System.out.println("$$$$$");
	
	char cw ='A';
	switch (cw) {
	case 'B':
		System.out.println("passed with B");
	case 'C':
		System.out.println("passed with C");
		default:
			System.out.println("failed");
	
			System.out.println("===");
			
			
			
			char grade ='A';

			boolean Passed = grade == 'A' || grade =='B';

			boolean Passed2 =grade == 'C' || grade =='D';

			 

			if( Passed || Passed2) {

			System.out.println("You've passed the exam");

			}

			else {

			System.out.println("You failed");
			}
}
}
