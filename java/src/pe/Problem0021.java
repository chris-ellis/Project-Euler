package pe;

public class Problem0021 {
	/*
	 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
	 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
	 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
	 * Evaluate the sum of all the amicable numbers under 10000.
	 */
	
	public static void solve() {
		int[] d = new int[10000];
		for (int i = 1; i < 10000; i++) {
			for (int div = 1; div < i; div++) {
				if (i % div == 0) {
					d[i] += div;
				}
			}
		}
		int sum = 0;
		for (int i = 1; i < 10000; i++) {
			if (d[i] < 10000 && i != d[i] && i == d[d[i]])
				sum += i;
		}
		System.out.println(sum);                
	}
}
