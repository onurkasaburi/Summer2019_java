package day10ifstatement;

public class practice {
public static void main(String[] args) {
	
	
		int num = 10;
		String str = "zero";
		if ( num > 0 
				) {
			str = "positive";
		}
		if ( num < 0 ) {
			str = "negative";
		}
		System.out.println(str);
}
}
