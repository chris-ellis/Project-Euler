package pe;

public class Problem0006 {
	// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	
	public static void solve() {
		int n = 100;
		int sumSquares, squareSums;
		sumSquares = ((2*n+1)*(n+1)*n)/6;
		squareSums = ((n*n + n)/2)*((n*n + n)/2);
		System.out.println(sumSquares - squareSums);
		
	}
	
	

}
