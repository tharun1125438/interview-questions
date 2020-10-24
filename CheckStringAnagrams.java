package practice;

import java.util.Arrays;

public class CheckStringAnagrams {

	public static void main(String[] args) {

		String input1 = "abcdsads";
		String input2 = "dcbaasds";
		
		System.out.println(checkForAnagrams(input1,input2));

	}

	private static boolean checkForAnagrams(String input1, String input2) {
		if(input1.length() != input2.length()) return false;
		char[] inputArr1 = input1.toCharArray();
		char[] inputArr2 = input2.toCharArray();
		
		Arrays.sort(inputArr1);
		Arrays.sort(inputArr2);
		
		for(int i=0; i< inputArr1.length-1 ; i++) {
			if(inputArr1[i] != inputArr2[i]) return false;
		}
		
		return true;
	}

}
