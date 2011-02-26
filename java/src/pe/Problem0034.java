package pe;

public class Problem0034 {
	/*
145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

Find the sum of all numbers which are equal to the sum of the factorial of their digits.

Note: as 1! = 1 and 2! = 2 are not sums they are not included.
	 */
	public static void solve() {
		int sum = 0;
		int[] fact = new int[10];
		fact[0] = 1;
		for (int i = 1; i < fact.length; i++)
			fact[i] = fact[i-1] * i;
		
		for (long i = 10; i < 1000000; i++) {
			String str = Long.toString(i);
			long factSum = 0;
			for (int s = 0; s < str.length(); s++) {
				factSum += fact[str.charAt(s)-'0'];
			}
			if (factSum == i)
				sum += factSum;
		}
		System.out.println(sum);
	}
}
