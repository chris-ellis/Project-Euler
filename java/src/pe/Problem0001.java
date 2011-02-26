package pe;

public class Problem0001 {
	// Find the sum of all the multiples of 3 or 5 below 1000.

	public static int solve() {
		int n = 1000;
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				//System.out.println("i: " + i);
				sum += i;
			}
		}
		return sum;
	}
	
}
