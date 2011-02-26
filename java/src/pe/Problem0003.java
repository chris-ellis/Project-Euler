package pe;

import java.math.BigInteger;

public class Problem0003 {
	// find the largest prime factor of 600851475143;
	
	
	public static int solve() {
		BigInteger val, maxVal, iter;
		val = new BigInteger("600851475143");
		maxVal = new BigInteger("600851475143");
		iter = new BigInteger("2");
		int prime = 2;
		
		
		for (; iter.compareTo(maxVal) < 0; iter = iter.add(BigInteger.ONE)) {
			//System.out.println(iter);
			while (val.mod(iter).compareTo(BigInteger.ZERO) == 0) {
				prime = iter.intValue();
				val = val.divide(iter);
				System.out.println(iter);
			}
		}
		
		return prime;
	}

}
