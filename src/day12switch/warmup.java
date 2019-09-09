package day12switch;

public class warmup {
public static void main(String[] args) {
	
	int n1 = 10;
	int n2 = 11;
	char n3 = 'A';
	
	if ( n1 == n2 ) {
		System.out.println("n1 and n2 are equal");
	}
	else if ( n2 == n3 ) {
		System.out.println("n2 and n3 are equal");
	}
	else if ( n1 == n2 && n1 == n3 ) {
		System.out.println("they all are equal");
	}
	else  {
		System.out.println("none of them are \nequal");
	}
	
	
	int a1 = 10;
	int a2 = 20;
	int a3 = 30;
	if ( a1 == a2 && a2 == a3 ) {
		System.out.println("all equal");
	}
	else if ( a1 == a2 && a1 == a3 ) {
		System.out.println(" they are equal");
		
	} else {
		
	}
	 if (  a1 == a2 ) {
		 System.out.println("a1 and a2 are equal");
	 }
	 else if ( a1 == a3 ) {
		System.out.println(" a1 and a3 are equal");
	}
	else if ( a2 == a3 ) {
		System.out.println("a2 and a3 are equal");
	}
	else {
		System.out.println(" none of them is equal");
	}
	
}
}
