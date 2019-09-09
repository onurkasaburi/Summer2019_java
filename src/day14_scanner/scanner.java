package day14_scanner;

 import java.util.Scanner;

public class scanner {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter a byte value");
	byte bynum = input.nextByte();
	System.out.println("you entered"+bynum);
	System.out.println("enter a byte value 2");
	
	byte bynum2 = input.nextByte();
	System.out.println("you entered"+bynum2);
	
}

}
