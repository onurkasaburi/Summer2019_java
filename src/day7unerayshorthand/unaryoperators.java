package day7unerayshorthand;

public class unaryoperators {
public static void main(String[] args) {
	
	int anum = 100 ;
    System.out.println(++anum);
    
    int anum2 = anum;
    		System.out.println(++anum);
    
    		int bnum = 100;
    System.out.println(bnum ++);
    System.out.println(bnum);
    
    int p = 50;
    p = --p + p++ + p-- + p++ ;
    System.out.println( p );
    
}
}
