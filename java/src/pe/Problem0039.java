package pe;

public class Problem0039 {
	/*
If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.

{20,48,52}, {24,45,51}, {30,40,50}

For which value of p ≤ 1000, is the number of solutions maximised?

	 */
	public static void solve() {
		int max = 0;
		int whichP = 1;
		for (int p = 1; p <= 1000; p++) {
			int count = 0;
			for (int a = 1; a < p; a++) {
				for (int b = a+1; a+b < p; b++) {
					if ((a*a + b*b) == (p-a-b)*(p-a-b))
						count++;
				}
			}
			if (count > max) {
				max = count;
				whichP = p;
			}
		}
		System.out.println(whichP);
	}
}
