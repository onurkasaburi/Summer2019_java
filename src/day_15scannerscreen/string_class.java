package day_15scannerscreen;

public class string_class {
public static void main(String[] args) {
	
	String str ="cybertek";
	String a = "cybertek";
	String b ="cybertek";
	System.out.println();
	String str2 = new String("cybertek");
	System.out.println( str == str2 );
	String str3 = new String("cybertek");
	System.out.println(str2 == str3);
	String s1 = "cat";
	String s2 = "cat";
	System.out.println(s1 == s2);
	String s3 = new String("cat");
	String s4 = new String("cat");
	System.out.println(s3 == s4);
	System.out.println(s1 == s4);
	
	String aw = "batch";
	String bw = "batch";
	System.out.println( aw == bw );
	String sw = new String ("batch");
	String dw = new String ("batch");
	System.out.println(sw == dw);
}
}
