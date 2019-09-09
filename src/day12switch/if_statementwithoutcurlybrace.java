package day12switch;

public class if_statementwithoutcurlybrace {
public static void main(String[] args) {
	if (true)
		System.out.println("hello");
	else
	System.out.println("world");
	
	System.out.println("========");
	
	
	if (true)
		if(true)
			System.out.println("hello world");
		else
			System.out.println("hi");
	else 
		System.out.println("invalid entry");
	System.out.println("= = = = = =");
	
	if ( grade <= 100 && grade >= 0 )
	if ( grade >= 90) System.out.println("A");
	else if ( grade >= 80) System.out.println("B");
}
}
