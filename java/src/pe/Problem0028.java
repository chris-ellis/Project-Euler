package pe;

public class Problem0028 {
	/*
Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

21 22 23 24 25
20  7  8  9 10
19  6  1  2 11
18  5  4  3 12
17 16 15 14 13

It can be verified that the sum of the numbers on the diagonals is 101.

What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
	 */
	public static void solve() {
		long sumDiag = 1;
		int inc = 2;
		int val = 1;
		for (int i = 0; i < 500; i++) {
			val += inc;
			sumDiag += val;
			val += inc;
			sumDiag += val;
			val += inc;
			sumDiag += val;
			val += inc;
			sumDiag += val;
			inc += 2;
		}
		System.out.println(sumDiag);
	}
}
