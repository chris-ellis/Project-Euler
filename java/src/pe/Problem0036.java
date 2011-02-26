package pe;

public class Problem0036 {
	/*
The decimal number, 585 = 1001001001_(2) (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include leading zeros.)
	 */
	public static void solve() {
		int sum = 0;
		for (int num = 1; num < 1000000; num++) {
			String binary = Integer.toBinaryString(num);
			String base10 = Integer.toString(num);
			
			boolean palindromic = true;
			for (int i = 0; i < (base10.length()>>1); i++) {
				if (base10.charAt(i) != base10.charAt(base10.length()-1-i)) {
					palindromic = false;
					break;
				}
			}
			if (palindromic) {
				for (int i = 0; i < (binary.length()>>1); i++) {
					if (binary.charAt(i) != binary.charAt(binary.length()-1-i)) {
						palindromic = false;
						break;
					}
				}
			}
			if (palindromic) {
				sum += num;
			}
		}
		System.out.println(sum);
	}

}