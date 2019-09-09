package day_13;

public class assestmentquiz3 {
public static void main(String[] args) {
	int num =9;

	if(num++ == 10) {  // line 1

	System.out.println("Hello World "+num);    // line 2

	}

	else {

	System.out.println("Hello Universe "+num);  // line 3

	}
	
	int score=0;

	if(score == 0) {

	score += 50;

	}

	if(score !=0 ) {

	score +=50;

	}

	System.out.println(score);

	
	char grade ='A';
	boolean Passed = grade == 'A' || grade =='B';
	boolean Passed2 =grade == 'C' || grade =='D';
	if( Passed || Passed2) {
	System.out.println("You've passed the exam");
	}
	else {
	System.out.println("You failed");
	}
	
	
	
	boolean A = true, B =  !false;

	
	if(B) {

	System.out.println("B");
	}
	else if(A) {
	System.out.println("A");
	}
	else {
	System.out.println("C");

	}
	
	
	boolean An = true;
	boolean Bn = !An;
	if(An) {
	if(Bn) {
	System.out.println("Monday");
	} else {
	System.out.println("Tuesday");
	}
	}
	else {
	if(An) {
	System.out.println("Thursday");
	}else {
	System.out.println("Friday");
	}
	}
	
	int number = 10;

	if(--number > 10) {

	System.out.println("Hello Cybertek "+number);

	}else if(number ==9) {

	System.out.println("Hello World "+number);
	}
	
	boolean X = true;

	boolean Y = !X==false;

	boolean Z = Y;

	 

	if( X ) {

	System.out.println("Hello Everyone");

	} if( Y ) {

	System.out.println("Today is great day");

	} if( Z ) {

	System.out.println("We have picnic on Saturday");
	}
	
	
	System.out.println("========");
	
	int age = 300;
	if ( age > 0 && age <= 150) {
		if ( age > 70 ) {
			System.out.println("can vote three times");
		} else if ( age >= 50) {
			System.out.println("can vote two times");
		}
		else {
			System.out.println("not eligible to vote");
		}
		
	}
	else {
		System.out.println("invalid input");
	}
	
	int rr = 5;
	switch ( rr ) {
	case 7 :
		System.out.println("sunday");
		break;
		default:
			System.out.println("invalid entry");
	}
}
	}
	
	


