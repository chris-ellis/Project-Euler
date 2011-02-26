package pe;

import java.math.BigInteger;

public class Problem0016 {
	//What is the sum of the digits of the number 2^(1000)?
	
	public static void solve() {
		BigInteger n = new BigInteger("2");
		n = n.pow(1000);
		String s = n.toString();
		long sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i)-48;
		}
		System.out.println(sum);
	}
}
