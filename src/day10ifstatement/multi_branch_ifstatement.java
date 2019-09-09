package day10ifstatement;

public class multi_branch_ifstatement {

/*
 * if-else:
 if(condition) {
 // A = condition is true
  
   
 */

public static void main(String[] args) {
 if ( false) {
	 System.out.println("if block");
 }
 else if (false) {
	 System.out.println("else if block");
 }
 else {
	 System.out.println("else block");
 }
	
 
 int grade = 85;
 if ( grade > 90 ) {
	 System.out.println("you made A");
 }
 else if ( grade <90 && grade >= 80) {
	 System.out.println("you made B");
 }
 else if ( grade <80 && grade >= 70) {
	 System.out.println("you made C");
 }
 else if ( grade <70 && grade >= 60) {
	 System.out.println("you made D");
 }
 
 else { 
	System.out.println("you made F");
 
 }
 
 int StatusCode = 200;
 
 if ( StatusCode == 200 ) { System.out.println (" OK "); }
 else if ( StatusCode == 201 ) { System.out.println (" Created "); }
 else if ( StatusCode == 202 ) { System.out.println (" Accepted "); }
 else if ( StatusCode == 301 ) { System.out.println (" Moved Permanently "); }
 else if ( StatusCode == 303 ) { System.out.println (" See Other "); }
 else if ( StatusCode == 304 ) { System.out.println (" Not Modified "); }
 else if ( StatusCode == 307 ) { System.out.println (" Temporary Redirect "); }
 else if ( StatusCode == 400 ) { System.out.println (" Bad Request "); }
 else if ( StatusCode == 401 ) { System.out.println (" Unauthorized "); }
 else if ( StatusCode == 403 ) { System.out.println (" Forbidden "); }
 else if ( StatusCode == 404 ) { System.out.println (" Not Found "); }
 else if ( StatusCode == 410 ) { System.out.println (" Gone "); }
 else if ( StatusCode == 500 ) { System.out.println (" Internal Server Error "); }
 else if ( StatusCode == 503 ) { System.out.println (" Service unavailable "); }

 int hour = 23;
 if ( hour >= 0 && hour < 12) {
	 System.out.println("good morning");
 }
 else if ( hour > 12 && hour <= 15) {
	 System.out.println("good afternoon");
 }
 else if ( hour > 15 && hour <= 23) {
	 System.out.println("good evening");
 }
 else {
	System.out.println("noon");
 }
 
 
 
 int s1 = 200, s2 = 300, s3 = 50;
 if ( s1 > s2 && s1 > s3) {
	 System.out.println(s1+"s1 is bigger number");
 }
 else if ( s2 > s1 && s2 > s3) {
	 System.out.println(s2+"s2 is bigger number");
 }
 else if ( s3 > s1 && s3 > s2) {
	 System.out.println(s3+" is bigger number");
 }
 else if (s3 == s2 && s3 > s1) {
     System.out.println(s3+" and "+s2+" are the bigger number");
 }

 else if(s3==s1 && s3 > s2) {
     System.out.println(s3+" and "+s1+" are the bigger number");
 }
 else if(s2 == s1 && s2 > s3) {
     System.out.println(s2+" and "+s1+" are the bigger number");
 }
 else {
     System.out.println("all of them are equal");
 }
 
 
 
}
}


