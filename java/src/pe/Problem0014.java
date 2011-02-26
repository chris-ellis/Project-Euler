package pe;

public class Problem0014 {
	/*
	The following iterative sequence is defined for the set of positive integers:

	n → n/2 (n is even)
	n → 3n + 1 (n is odd)

	Using the rule above and starting with 13, we generate the following sequence:
	13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

	It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

	Which starting number, under one million, produces the longest chain?
	 */
	
	public static void solve() {
		int maxLen = 0;
		long num = 1;
		int len = 1;
		for (long i = 1; i < 1000000; i++) {
			len = seqLength(i);
			if (len > maxLen) {
				num = i;
				maxLen = len;
				//System.out.println("New max: " + num + " >> " + maxLen);
			}
		}
		System.out.println(num);
	}
	
	static int seqLength(long n) {
		int size = 1;
		//System.out.print(n);
		while (n > 1) {
			if (n % 2 == 0) {
				n >>= 1;
			}
			else {
				n = 3*n + 1;
			}
			//System.out.print(" -> "+n);
			size++;		
		}
		//System.out.println(" >> " + size);
		return size;
	}
}
