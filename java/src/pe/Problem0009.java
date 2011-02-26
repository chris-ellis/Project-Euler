package pe;

public class Problem0009 {
	//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	//Find the product abc.
	public static void solve() {
		int a = 1;
		int b = 2; 
		int c = 3;
		for (a = 1; a <= 332; a++) {
			for (b = a+1; a+b <= 665; b++) {
				c = 1000 - a - b;
				//System.out.println(a + " " + b  + " " + c);
				if (a*a + b*b == c*c) {
					System.out.println(a*b*c);
					return;
				}
			}
		}
	}
}
