package pe;

public class Problem0033 {
	/*
The fraction (49)/(98) is a curious fraction, as an inexperienced mathematician in attempting to simplify it may incorrectly believe that (49)/(98) = (4)/(8), which is correct, is obtained by cancelling the 9s.

We shall consider fractions like, (30)/(50) = (3)/(5), to be trivial examples.

There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing two digits in the numerator and denominator.

If the product of these four fractions is given in its lowest common terms, find the value of the denominator.

	 */
	public static void solve() {
		int prodNum = 1;
		int prodDenom = 1;
		for (int num = 10; num < 100; num++) {
			for (int denom = num+1; denom < 100; denom++) {
				char[] n = Integer.toString(num).toCharArray();
				char[] d = Integer.toString(denom).toCharArray();
				if (n[0] != '0' && n[0] == d[0]) {
					int a = n[1]-'0';
					int b = d[1]-'0';
					if (Math.abs(((float)num/denom) - ((float)a/b)) < 0.001) {
						prodNum *= a; prodDenom *= b;
						//System.out.print(num + "/" + denom + ": ");
						//System.out.println(n[1] + "/" + d[1] + " ");
					}
				}
				else if (n[0] != '0' && n[0] == d[1]) {
					int a = n[1]-'0';
					int b = d[0]-'0';
					if (Math.abs(((float)num/denom) - ((float)a/b)) < 0.001) {
						prodNum *= a; prodDenom *= b;
						//System.out.print(num + "/" + denom + ": ");
						//System.out.println(n[1] + "/" + d[0] + " ");
					}
				}
				else if (n[1] != '0' && n[1] == d[0]) {
					int a = n[0]-'0';
					int b = d[1]-'0';
					if (Math.abs(((float)num/denom) - ((float)a/b)) < 0.001) {
						prodNum *= a; prodDenom *= b;
						//System.out.print(num + "/" + denom + ": ");
						//System.out.println(n[0] + "/" + d[1] + " ");
					}
				}
				else if (n[1] != '0' && n[1] == d[1]) {
					int a = n[0]-'0';
					int b = d[0]-'0';
					if (Math.abs(((float)num/denom) - ((float)a/b)) < 0.001) {
						prodNum *= a; prodDenom *= b;
						//System.out.print(num + "/" + denom + ": ");
						//System.out.println(n[0] + "/" + d[0] + " ");
					}
				}
			}
		}
		for (int i = 2; i <= 11; i++) {
			while (prodNum % i == 0 && prodDenom % i == 0) {
				prodNum /= i;
				prodDenom /= i;
			}
		}
		System.out.println(prodNum +"/" + prodDenom);
	}

}
