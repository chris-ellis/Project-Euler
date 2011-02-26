package pe;

public class Problem0004 {
	// Find the largest palindrome made from the product of two 3-digit numbers.
	
	
	public static int solve() {
		int palin = 0;
		Integer currVal;
		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				currVal = i*j;
				if (isPalindrome(currVal.toString()) && currVal > palin)
					palin = currVal;
			}
		}
		return palin;
	}
	
	static boolean isPalindrome(String s) {
		boolean palindrome = true;
		for (int i = 0; i < s.length()/2 && palindrome == true; i++) {
			if (s.charAt(i) != s.charAt(s.length()-1-i)) {
				palindrome = false;
			}
		}
		return palindrome;
	}
	
	
}
