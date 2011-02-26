package pe;

public class Problem0040 {
	/*
An irrational decimal fraction is created by concatenating the positive integers:

0.123456789101112131415161718192021...

It can be seen that the 12^(th) digit of the fractional part is 1.

If d_(n) represents the n^(th) digit of the fractional part, find the value of the following expression.

d_(1) × d_(10) × d_(100) × d_(1000) × d_(10000) × d_(100000) × d_(1000000
	 */
	public static void solve() {
		System.out.println(
				nthDigit(1)*
				nthDigit(10)*
				nthDigit(100)*
				nthDigit(1000)*
				nthDigit(10000)*
				nthDigit(100000)*
				nthDigit(1000000));
	}
	
	public static int nthDigit(int n) {
		// d = 0: ones place, d = 1: tens place, etc
		int[] digits = new int[]{0, 9, 90, 900, 9000, 90000, 900000};
		int d = 0;
		while (d+1 < digits.length && (n - digits[d+1]) > 0) {
			n -= digits[d+1];
		    d++;
		}
		
		return 0;
	}
}
