package pe;

import java.util.ArrayList;

public class Problem0012 {
	public static void solve() {
		long triNum = 0;
		int i = 1;
		boolean found = false;
		while (!found) {
			triNum += i;
			if (countDivisors(triNum) > 500) {
				System.out.println(triNum);
				found = true;
			}
			i++;
		}
		
	}
	static int countDivisors(long n) {
		int div = 1;
		int max = (int)Math.sqrt(n);
		for (int i = 2; i <= max; i++) {
			if (n % i == 0)
				div+=2;
		}
		System.out.println(n+": "+div);
		return div;
	}
}
