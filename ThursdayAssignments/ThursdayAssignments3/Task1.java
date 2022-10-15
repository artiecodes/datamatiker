class Task1 {

	
	public static void printIfPalindrome(String check) {
		String checkLower = check.toLowerCase();
		String reverse = "";
		String revLower = reverse.toLowerCase();
		boolean palindrome;

		for (int i = checkLower.length() - 1; i >= 0; i--) {
			revLower += checkLower.charAt(i);
		}

		// System.out.println(checkLower);
		// System.out.println(revLower);

		if (checkLower.contains(revLower)) {
			palindrome = true;
			System.out.println(check+" is a palindrome.");
		} else {
			palindrome = false;
			System.out.println(check+" is not a palindrome.");
		}

	}

	public static void main(String[] args) {
		 printIfPalindrome("banana");
		 printIfPalindrome("Den laks skal ned");

	}
}