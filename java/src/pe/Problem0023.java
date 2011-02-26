package pe;

public class Problem0023 {
	/*
A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
	 */
	public static void solve() {
		boolean[] abundant = new boolean[28124];
		boolean[] sumAbundant = new boolean[28124];
		for (int num = 1; num < abundant.length; num++) {
			int sumProperDivisors = 0;
			for (int i = 1; i < num; i++) {
				if (num % i == 0)
					sumProperDivisors += i;
			}
			if (num < sumProperDivisors)
				abundant[num] = true;
		}
		
		long sum = 0;
		for (int i = 1; i < abundant.length; i++) {
			for (int j = 1; j < abundant.length-i; j++) {
				if (abundant[i] && abundant[j])
					sumAbundant[i+j] = true;
			}
		}
		
		for (int i = 1; i < sumAbundant.length; i++) {
			if (!sumAbundant[i])
				sum += i;
		}
		System.out.println(sum);
	}
}
