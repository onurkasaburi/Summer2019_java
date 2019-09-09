package day9review;

public class if_statement {
	public static void main(String[] args) {
		if(true) {
			System.out.println("Argentine Tango");
			System.out.println("is the best");
		}
		
		int x = 98765320;
		if (x%2 == 0) {
			System.out.println(x);
			System.out.println("it's an even number"
					+ "");
		}
		
		int b = 2345678;
		if (b%5 == 0) {
			System.out.println( b+"divided by 5" );
		}
		
		
			
			
			
		byte age = 78;
		byte voteage = 18;
		if( age >= voteage ) {
			System.out.println("\n\n yes, you are eligible to vote");
			System.out.println("so you can enjoy");
		}
		
	}

}
