package day_15scannerscreen;

public class string_methods {
public static void main(String[] args) {
	String st ="cybertek";
	//index num 01234567
	System.out.println(st.charAt(4));
	char ch = st.charAt(4);
	System.out.println(ch);
	
	String st2 = "On ur";
	//index       01234
	System.out.println(st.charAt(3));
	char ch2 = st2.charAt(3);
	System.out.println(ch2);
	
	
     String lg ="John f kennedy";
	 int Length = lg.length();
	 System.out.println(Length);
	 int totalletters = lg.length()-1;
	 System.out.println(totalletters);
	
	String k1 ="cybertek";
	k1.concat("school");
	System.out.println(k1);
	k1 = k1.concat(" school");
	System.out.println(k1);
	
	String n = "the izmir";
	n.toUpperCase();
	System.out.println(n);
	n = n.toUpperCase();
	System.out.println(n);
	
	String m = "THE IZMIR";
	m.toLowerCase();
	m = m.toLowerCase();
	System.out.println(m);

	
}
}
