package day8;

public class relationofoperators {
public static void main(String[] args) {
	System.out.println( 10 > 9 );
	boolean resulta = 10 > 9;
	System.out.println(resulta);
	boolean result2 = 10 >= 9;
	System.out.println(result2);
	boolean result3 = 10 <= 9;
	System.out.println(result3);
	boolean result4 = 20 !=20;
	System.out.println(result4);
	boolean result5 = !false != !true;
			System.out.println(result5);
	
			System.out.println("5+2 =" + 3 + 4);
	System.out.println("5+2 -" + (3+4));
	
	long bn = 3_000L;
	double bn2 = (short) bn;
	int bn3 = (short) bn2;
	System.out.println(bn3);
	
	float fk = 100.987_6543f;
			short fkk = (byte) fk;
			byte fk2 = (byte) fkk;
			System.out.println(fk2);
			
			
			int as = 9;
			int as1 = 0;
			long as3 = as/as1;
			System.out.println(as3*as1);
				
			System.out.println(10.0/3);
					
}
}
