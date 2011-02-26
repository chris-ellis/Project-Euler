package pe;

public class Problem0002 {
	// Find the sum of all the even-valued terms in the sequence which do not exceed four million.
	
	public static int  solve() {
		int sum, max;
		sum = 0;
		max = 4000000;
		int newVal;
		int currVal = 2;
		int prevVal = 1;
		
		while (currVal < max) {
			if (currVal % 2 == 0)
				sum += currVal;
			
			newVal = currVal + prevVal;
			prevVal = currVal;
			currVal = newVal;
		}
		return sum;
	}

}
