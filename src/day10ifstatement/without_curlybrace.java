package day10ifstatement;

public class without_curlybrace {
public static void main(String[] args) {
	if ( false) {
		System.out.println("today is friday");
		System.out.println("tomorrow no class");
	}
	// without curly brace system recognize only without curly brace line 
	System.out.println("we have a class ");
	
	
	if ( true )
		System.out.println("art wins");
	if ( true )
		System.out.println("if block");
	else if ( true )
		System.out.println("else if block");
	else 
		System.out.println("else block");
	
}
}
