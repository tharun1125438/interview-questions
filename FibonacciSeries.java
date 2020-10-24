package practice;

import java.util.Scanner;

public class FibonacciSeries {

	static int n1=0, n2=1, n3=0;
	public static void main(String[] args) {

		System.out.println("Provide the count of numbers you need in series:");
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		s.close();
		System.out.println(n1);
		System.out.println(n2);
		printFibonacci(count-2);
		

	}
	private static void printFibonacci(int i) {
		if(i > 0) {
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			printFibonacci(i-1);
		}
	}

}
