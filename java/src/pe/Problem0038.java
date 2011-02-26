package pe;

public class Problem0038 {
	/*
Take the number 192 and multiply it by each of 1, 2, and 3:

    192 × 1 = 192
    192 × 2 = 384
    192 × 3 = 576

By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)

The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).

What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n > 1?

	 */
	public static void solve() {
		int max = 0;
		for (int val = 1; val < 10000; val++) {
			for (int n = 2; n <= 10; n++) {
				String str = genProdString(val, n);
				if (isPandigital(str)) {
					if (Integer.parseInt(str) > max)
						max = Integer.parseInt(str);
				}
			}
		}
		System.out.println(max);
	}
	
	public static String genProdString(int val, int n) {
		String str = "";
		for (int i = 1; i <= n; i++) {
			str += (val*i);
		}
		return str;
	}
	
	public static boolean isPandigital(String str) {
		if (str.length() != 9)
			return false;
			
		boolean[] hasDigit = new boolean[10];
			
		for (int i = 0; i < str.length(); i++) {
			int digit = str.charAt(i)-'0';
			if (hasDigit[digit])
				return false;
			else
				hasDigit[digit] = true;
		}
		for (int i = 1; i < hasDigit.length; i++) {
			if (!hasDigit[i])
				return false;
		}
		return true;
	}

}
