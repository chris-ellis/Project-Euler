package pe;

public class Problem0017 {
	/*
	 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
	 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
	 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
	 */
	static int and = 3;
	static int one = 3;
	static int two = 3;
	static int six = 3;
	static int ten = 3;
	
	static int zero = 4;
	static int four = 4;
	static int five = 4;
	static int nine = 4;
	
	static int three = 5;
	static int seven = 5;
	static int eight = 5;
	static int forty = 5;
	static int fifty = 5;
	static int sixty = 5;
	
	static int eleven = 6;
	static int twelve = 6;
	static int twenty = 6;
	static int thirty = 6;
	static int eighty = 6;
	static int ninety = 6;
	
	static int fifteen = 7;
	static int sixteen = 7;
	static int seventy = 7;
	static int hundred = 7;
	
	static int thirteen = 8;
	static int fourteen = 8;
	static int eighteen = 8;
	static int nineteen = 8;
	static int thousand = 8;
	
	static int seventeen = 9;
	
	public static void solve() {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			String lc = letterCount(i); 
			sum += lc.length();
			System.out.println(i+": "+lc+ ": "+lc.length());
		}
		System.out.println(sum);
	}
	static String digit(int n) {
		switch (n) {
		case 0: return "zero";
		case 1: return "one";
		case 2: return "two";
		case 3: return "three";
		case 4: return "four";
		case 5: return "five";
		case 6: return "six";
		case 7: return "seven";
		case 8: return "eight";
		case 9: return "nine";
		}
		return "";
	}
	
	static String tensAndOnes(int tens, int ones) {
		if (tens == 0)
			return digit(ones);
		else {
			if (tens == 1) {
				switch (ones) {
				case 0: return "ten";
				case 1: return "eleven";
				case 2: return "twelve";
				case 3: return "thirteen";
				case 4: return "fourteen";
				case 5: return "fifteen";
				case 6: return "sixteen";
				case 7: return "seventeen";
				case 8: return "eighteen";
				case 9: return "nineteen";
				}
			}
			else {
				String count = "";
				switch (tens) {
				case 2: count = "twenty"; break;
				case 3: count = "thirty"; break;
				case 4: count = "forty"; break;
				case 5: count = "fifty"; break;
				case 6: count = "sixty"; break;
				case 7: count = "seventy"; break;
				case 8: count = "eighty"; break;
				case 9: count = "ninety"; break;
				}
				if (ones != 0)
					count += digit(ones);
				return count;
			}
		}
		return "";
	}
	
	static String letterCount(int n) {
		int[] array = new int[4];
		array[3] = n/1000;
		array[2] = (n-(array[3]*1000)) / 100;
		array[1] = (n-(array[3]*1000)-(array[2]*100)) / 10;
		array[0] = n-(array[3]*1000)-(array[2]*100)-(array[1]*10);
		
		String count = "";
		if (array[3] > 0) {
			count += digit(array[3]) + "thousand";
		}
		if (array[2] > 0) {
			count += digit(array[2]) + "hundred";
		}
		if (array[1] > 0 || array[0] > 0) {
			if (count.length() > 0)
				count += "and";
			count += tensAndOnes(array[1], array[0]);
		}
			
		return count;
	}
}
