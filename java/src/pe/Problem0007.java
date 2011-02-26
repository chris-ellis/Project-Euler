package pe;

import java.util.ArrayList;

public class Problem0007 {
	//What is the 10001st prime number?
	public static void solve() {
		int primeCount = 1;
		int val = 3;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(new Integer(2));
		while (primeCount < 10001) {
			boolean isPrime = true;
			for (int i = 0; i < primes.size() && isPrime == true; i++) {
				if (val % primes.get(i) == 0)
					isPrime = false;
			}
			if (isPrime) {
				primes.add(new Integer(val));
				primeCount++;
				//System.out.println(val);
			}
			val++;
		}
		System.out.println(primes.get(primes.size()-1));
	}
}
