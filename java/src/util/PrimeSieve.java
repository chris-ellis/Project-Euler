package util;

public class PrimeSieve {
	private boolean[] array;
	public PrimeSieve(int max) {
		init(max);
	}
	
	private void init(int max) {
		array = new boolean[max+1];
		array[2] = true;
		for (int i = 3; i <= max; i+=2)
			array[i] = true;
		int newMax = (int)Math.sqrt(max);
		for (int i = 3; i <= newMax; i+=2) {
			if (array[i]) {
				for (int j = 2*i; j <= max; j+=i) {
					array[j] = false;
				}
			}
		}
	}
	
	public boolean isPrime(int val) {
		if (array == null || array.length < val)
			init(val);
		return array[val];
	}
}
