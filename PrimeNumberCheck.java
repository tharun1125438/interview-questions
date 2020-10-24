package practice;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		System.out.println("Provide a number for checking:  ");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		s.close();
		System.out.println(isPrime(number));

	}

	private static boolean isPrime(int number) {
		int flag = 0;
		for(int n=2;n<number/2; n++) {
			if(number%n == 0) {
				flag =1;
			}
		}
		if(flag == 0) {
			return true;
		} else {
			return false;
		}
	}

}
