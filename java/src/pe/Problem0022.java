package pe;

import java.io.*;
import java.util.Arrays;

public class Problem0022 {
	/*
	 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
	 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
	 * What is the total of all the name scores in the file?
	 */
	public static void solve() {
		try {
			BufferedReader in = new BufferedReader(new FileReader("names.txt"));
			String line = in.readLine();
			String[] names = line.split(",");
			for (int i = 0; i < names.length; i++)
				names[i] = names[i].substring(1, names[i].length()-1);
			
			Arrays.sort(names);
			long score = 0;
			for (int i = 0; i < names.length; i++) {
				score += nameScore(names[i])*(i+1);
			}
			System.out.println(score);
		}
		catch (FileNotFoundException e) {
			System.err.println("File not found: " + e);
		}
		catch (IOException e) {
			System.err.println("Read error: " + e);
		}
	}
	
	static int nameScore(String name) {
		int score = 0;
		for (int i = 0; i < name.length(); i++) {
			score += name.charAt(i)-'A'+1;
		}
		return score;
	}
}
