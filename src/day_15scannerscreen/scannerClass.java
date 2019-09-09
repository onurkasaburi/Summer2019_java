package day_15scannerscreen;

import java.util.Scanner;

public class scannerClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter byte value");
		input.nextByte ();
		System.out.println("enter short value");
	short num2 = input.nextShort ();
	System.out.println("enter int value");
		int num3 = input.nextInt ();
		System.out.println("enter long value");
		long num4 = input.nextLong();
		System.out.println("enter boolean value");
		boolean result = input.hasNextBoolean();
		System.out.println("enter float value");
		float num5 = input.nextFloat();
		System.out.println("enter double value");
		double num6 = input.nextDouble();
		System.out.println("enter your name");
		String str = input.nextLine ();
		
	}

}
