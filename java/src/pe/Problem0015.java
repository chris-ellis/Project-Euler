package pe;

public class Problem0015 {
	/*
	 * Starting in the top left corner of a 2×2 grid, there are 6 routes (without backtracking) to the bottom right corner.
	 * How many routes are there through a 20×20 grid?
	 */
	public static void solve() {
		long[][] numPaths = new long[21][21];
		for (int i = 0; i < numPaths.length; i++) {
			numPaths[0][i] = 1;
		}
		for (int i = 1; i < numPaths.length; i++) {
			int j = i;
			numPaths[i][i] = 2*numPaths[i-1][i];
			for (j = i+1; j < numPaths.length; j++) {
					numPaths[i][j] = numPaths[i-1][j] + numPaths[i][j-1];
			}
		}
		System.out.println(numPaths[20][20]);
	}
}
