package pe;

import util.PrimeSieve;
public class Problem0035 {
	/*
The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

How many circular primes are there below one million?

	 */
	public static void solve() {
		int count = 0;
		PrimeSieve p = new PrimeSieve(1000000);
		for (int i = 2; i < 1000000; i++) {
			if (p.isPrime(i)) {
				String str = Integer.toString(i);
				boolean isCircPrime = true;
				for (int rot = 1; rot < str.length(); rot++) {
					str = str.substring(1) + str.charAt(0);
					if (!p.isPrime(Integer.parseInt(str))) {
						isCircPrime = false;
						break;
					}
				}
				if (isCircPrime) {
					//System.out.println(i);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
