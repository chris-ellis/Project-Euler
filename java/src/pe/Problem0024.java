package pe;

public class Problem0024 {
	/*
	 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
	 */
	
	public static void solve() {
		int[] fac = new int[] {1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
		String num = "";
		String left = "0123456789";
		int perm = 999999;
		for (int i = fac.length-1; i >= 0; i--) {
			int which = 0;
			while (fac[i] <= perm) {
				perm -= fac[i];
				which++;
			}
			num += left.charAt(which);
			left = left.substring(0, which) + left.substring(which+1, left.length());
			int foo = 0;
		}
		num += left;
		System.out.println(num);
	}
}
