package day_16;

import java.util.Scanner;

public class next_line {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("enter your phone number");
	int phone = scan.nextInt();
	scan.nextLine();

	System.out.println("enter your name");
	String name = scan.nextLine();
	
	
	System.out.println("your number");
	int num = scan.nextInt();
	System.out.println(num);
	scan.nextLine();
	System.out.println("your name");
	String nm = scan.nextLine();
	
	
}
}
