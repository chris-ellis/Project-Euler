package pe;

import java.math.BigInteger;
public class Problem0025 {
	/*
	 * What is the first term in the Fibonacci sequence to contain 1000 digits?
	 */
	public static void solve() {
		int count = 1;
		BigInteger prev = BigInteger.ZERO;
		BigInteger curr = BigInteger.ONE;
		BigInteger next;
		while (curr.toString().length() < 1000) {
			next = curr.add(prev);
			prev = curr;
			curr = next;
			count++;
		}
		System.out.println(count);
	}
}
