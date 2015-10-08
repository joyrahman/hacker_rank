package gameOfThrone;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		for (int i = 0; i < input.length(); i++) {
			String key = Character.toString(input.charAt(i));
			// if key exist, update it
			if (dict.containsKey(key)) {
				dict.put(key, dict.get(key) + 1);
			}
			// else add it
			else {
				dict.put(key, 1);

			}

		}

		// verify palindrome if odd is only once
		int count = 0;
		for (Integer value : dict.values()) {
			if (value % 2 == 1) {
				count++;
			}
		}
		if (count > 1) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

	}
}