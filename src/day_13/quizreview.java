package day_13;

public class quizreview {
	public static void main(String[] args) {
		
		int num = 1;
		int num2 = 0;
		if ( num++ < ++num2 ) {
			System.out.println("hello");
		}
		else {
			System.out.println("hi");
		}
		System.out.println("log"+num+":"+num2 );
		
		
		if ( true ) {
			System.out.println("1");
		}
		else if ( true ) {
			System.out.println("2");
		}
		
		boolean r = true;

		if ( r == false ) {
			System.out.println("yes");
			
		} else if ( r == false != true ) {
			System.out.println("no");
		}
		
		int  t = 'B';
		System.out.println(t);
		if ( t > 128 || t <= 129 ) {
			System.out.println('B');
		}
		
	}
}
