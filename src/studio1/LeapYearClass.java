package studio1;

import java.util.Scanner;

public class LeapYearClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Give me a year");
		int year = in.nextInt();
		int n1 = 4;
		int n2 = 100;
		int n3 = 400;
		System.out.println("Remainder of " + year + "/" + n1 + " is " + (year % n1) );
		boolean b1 = (year % n1) == 0;  
		System.out.println (b1);
		System.out.println ("Remainder of " + year + "/" + n2 + " is " + (year % n2));
		boolean b2 = (year % n2) != 0; 
		System.out.println (b2);
		System.out.println ("Remainder of " + year + "/" + n3 + " is " + (year % n3));
		boolean b3 = (year % n3) == 0;
		System.out.println (b3);
		boolean b4 = b1 && b2 || b3;
		System.out.println(b4);
		

		
	}

}
