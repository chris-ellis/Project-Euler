package pe;
import java.math.BigInteger;
public class Problem0020 {
	/*
	 * Find the sum of the digits in the number 100!
	 */
	public static void solve() {
		BigInteger n = BigInteger.ONE;
		BigInteger ten = new BigInteger("10");
		BigInteger hundred = new BigInteger("100");
		for (BigInteger i = BigInteger.ONE; i.compareTo(hundred) <= 0; i = i.add(BigInteger.ONE))
			n = n.multiply(i);
		long sum = 0;
		
		while (n.compareTo(BigInteger.ZERO) > 0) {
			sum += n.mod(ten).longValue();
			n = n.divide(ten);
		}
		System.out.println(sum);
	}
}
