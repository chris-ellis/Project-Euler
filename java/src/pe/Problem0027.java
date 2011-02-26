package pe;

public class Problem0027 {
	/*
	 * Considering quadratics of the form:

    n² + an + b, where |a| < 1000 and |b| < 1000

    where |n| is the modulus/absolute value of n
    e.g. |11| = 11 and |−4| = 4

Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of primes for consecutive values of n, starting with n = 0.
	 */
	public static void solve() {
		boolean[] isPrime = primeSieve(100000);
		int bestA = -999;
		int bestB = -999;
		int best = 0;
		for (int a = -999; a < 1000; a++) {
			for (int b = -999; b < 1000; b++) {
				int n = 0;
				long idx = n*n + a*n + b;
				while (idx >= 0 && idx <= 100000 && isPrime[(int)idx]) {
					n++;
					idx = n*n + a*n + b;
				}
				if (n > best) {
					best = n;
					bestA = a;
					bestB = b;
				}
			}
		}
		System.out.println(bestA*bestB);
	}
	
	public static boolean[] primeSieve(int max) {
		boolean[] array = new boolean[max+1];
		for (int i = 1; i <= max; i+=2)
			array[i] = true;
		int newMax = (int)Math.sqrt(max);
		for (int i = 3; i <= newMax; i+=2) {
			if (array[i]) {
				for (int j = 2*i; j <= max; j+=i) {
					array[j] = false;
				}
			}
		}
		
		return array;
	}
}
