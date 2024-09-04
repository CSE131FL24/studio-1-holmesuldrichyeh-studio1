package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please give me two integers to be averaged");
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		double Average = ((n1 + n2)/2.0);
		System.out.println("Average of " + n1 + " and " + n2 + " is " + Average);

	}

}
