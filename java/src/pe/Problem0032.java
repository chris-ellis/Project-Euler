package pe;

import util.MinHeap;

public class Problem0032 {
	/*
We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.
HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.
	 */
	
	public static void solve() {
		int sum = 0;
		MinHeap h = new MinHeap(100);
		for (int i = 1; i < 100000; i++) {
			int max = (int)Math.pow(10, 5-Integer.toString(i).length());
			for (int j = i+1; j < max; j++) {
				int k = i*j;
				if (isPandigital(Integer.toString(i) + 
						Integer.toString(j) + 
						Integer.toString(k))) {
					h.insert(new Integer(k));
				}
			}
		}
		int last = (Integer)h.removeRoot();
		int curr;
		sum += last;
		while (h.length() > 0) {
			curr = (Integer)h.removeRoot();
			if (curr != last)
				sum += curr;
			last = curr;
		}
			
		System.out.println(sum);
	}
	
	public static boolean isPandigital(String str) {
		if (str.length() != 9)
			return false;
			
		boolean[] hasDigit = new boolean[10];
			
		for (int i = 0; i < str.length(); i++) {
			int digit = str.charAt(i)-'0';
			if (hasDigit[digit])
				return false;
			else
				hasDigit[digit] = true;
		}
		for (int i = 1; i < hasDigit.length; i++) {
			if (!hasDigit[i])
				return false;
		}
		return true;
	}
}
