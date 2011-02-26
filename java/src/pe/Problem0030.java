package pe;

public class Problem0030 {
	/*
Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

    1634 = 1^(4) + 6^(4) + 3^(4) + 4^(4)
    8208 = 8^(4) + 2^(4) + 0^(4) + 8^(4)
    9474 = 9^(4) + 4^(4) + 7^(4) + 4^(4)

As 1 = 1^(4) is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
	 */
	public static void solve() {
		int[] num = new int[10];
		int bigSum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = i*i*i*i*i;
		}
		
		for (int i = 2; i < 1000000; i++) {
			int sum = 0;
			int val = i;
			while (val > 0) {
				sum += num[val%10];
				val /= 10;
			}
			if (sum == i)
				bigSum += sum;
		}
		System.out.println(bigSum);
	}
}
