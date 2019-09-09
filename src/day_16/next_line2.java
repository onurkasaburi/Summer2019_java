package day_16;

import java.util.Scanner;

public class next_line2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("what is your zip code?");
	int zip = input.nextInt();
	input.nextLine();
	System.out.println("what city?");
	String city = input.nextLine();
	System.out.println("zip code is: "+zip);
	System.out.println("city is: "+city);
	System.out.println("enter phone number");
	int phone = input.nextInt();
	input.nextLine();
	System.out.println("enter state name");
	String state = input.nextLine();
}
}
