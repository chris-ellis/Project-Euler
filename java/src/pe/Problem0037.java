package pe;

import util.PrimeSieve;
public class Problem0037 {
	/*
The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.

	 */
	public static void solve() {
		int sum = 0;
		PrimeSieve p = new PrimeSieve(1000000);
		for (int num = 11; num < 1000000; num++) {
			if (p.isPrime(num)) {
				String str = Integer.toString(num);
				boolean isTruncatable = true;
				for (int i = 1; i < str.length(); i++) {
					if (!p.isPrime(Integer.parseInt(str.substring(i, str.length()))) ||
					    !p.isPrime(Integer.parseInt(str.substring(0, str.length()-i)))) {
						isTruncatable = false;
						break;
					}
				}
				if (isTruncatable) {
					sum += num;
					//System.out.println(num);
				}
			}
		}
		System.out.println(sum);
	}
}
