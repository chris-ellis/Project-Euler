package pe;

import java.math.BigInteger;
public class Problem0031 {
	/*
In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:

    1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).

It is possible to make £2 in the following way:

    1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p

How many different ways can £2 be made using any number of coins?

	 */
	public static void solve() {
		int[] val = new int[] {1,2,5,10,20,50,100,200};
		int[][] p = new int[201][val.length];
		for (int coin = 0; coin < val.length; coin++) {
			for (int amt = 0; amt <= 200; amt++) {
				if (amt == 0 || coin == 0)
					p[amt][coin] = 1;
				else {
					p[amt][coin] = p[amt][coin-1] + ((amt - val[coin]>=0)?(p[amt - val[coin]][coin]):(0));
				}
			}
		}
		
		System.out.println(p[200][val.length-1]);
	}
}
