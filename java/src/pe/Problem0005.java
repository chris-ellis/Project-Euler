package pe;

public class Problem0005 {
	//What is the smallest number that is evenly divisible by all of the numbers from 1 to 20?
	
	public static int solve() {
		int val = 0;
		boolean found = false;
		while (!found) {
			val += 2;
			found = true;
			for (int i = 2; i <= 20 && found == true; i++) {
				if (val % i != 0)
					found = false;
			}
		}
		return val;
	}
}
