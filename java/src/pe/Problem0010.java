package pe;

import java.util.ArrayList;

public class Problem0010 {
	//Find the sum of all the primes below two million.
	public static void solve() {
		int val = 3;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(new Integer(2));
		while (val < 2000000) {
			boolean isPrime = true;
			for (int i = 0; i < primes.size() && isPrime == true; i++) {
				if (val % primes.get(i) == 0)
					isPrime = false;
			}
			if (isPrime) {
				primes.add(new Integer(val));
				//System.out.println(val);
			}
			val+=2;
		}
		long sum = 0;
		for (int i = 0; i < primes.size(); i++) {
			sum += primes.get(i);
		}
		System.out.println(sum);
	}
}
