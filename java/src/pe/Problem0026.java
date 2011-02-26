package pe;
import java.math.BigInteger;
import java.util.ArrayList;

public class Problem0026 {
	/*
	 * Find the value of d < 1000 for which (1)/(d) contains the longest recurring cycle in its decimal fraction part.
	 */
	
	public static void solve() {
		int maxLength = 0;
		int bestDiv = 2;
		int k;
		BigInteger fact;
		BigInteger two = new BigInteger("2");
		BigInteger five = new BigInteger("5");
		BigInteger ten = new BigInteger("10");
		BigInteger thousand = new BigInteger("1000");
		for (BigInteger q = new BigInteger("2"); q.compareTo(thousand) < 0; q = q.add(BigInteger.ONE)) {
			if (q.mod(two).intValue() == 0 || q.mod(five).intValue() == 0)
				continue;
			k = 1;
			fact = ten;
			while ((fact.subtract(BigInteger.ONE)).mod(q).intValue() != 0) {
				fact = fact.multiply(ten);
				k++;
			}
			if (k > maxLength) {
				maxLength = k;
				bestDiv = q.intValue();
			}
		}
		System.out.println("q: " + bestDiv + "  len: " + maxLength);
	}
}
