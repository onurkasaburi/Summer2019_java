package day8;

public class logicaloperators {
public static void main(String[] args) {
	boolean b1 = 8 >5 && 7 == (8-2+1);
	System.out.println(b1);
	
	boolean day = "monday" == "Funday" || 6==6;
	System.out.println(day);
	boolean b2 = true || false;
	System.out.println(b2);
	
	boolean b3 = ! (7 >5 && 6 != 5) && ( 9 >5 || 10 >4);
	System.out.println(b3);
}
}
