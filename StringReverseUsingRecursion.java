package practice;

public class StringReverseUsingRecursion {

	public static void main(String[] args) {
		String input = "aacaadasdafdjfhaskcjh";
		
		String output = reverseUsingRecursion(input);
		
		System.out.println(output);

	}

	private static String reverseUsingRecursion(String input) {
		String output = "";
		if (input.isEmpty())
            return input;
		output = reverseUsingRecursion(input.substring(1))+input.charAt(0);
		return output;
	}

}
