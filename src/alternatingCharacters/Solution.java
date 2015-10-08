package alternatingCharacters;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			String input = scanner.next();
			int count = 0;
			input += "*";
			for (int j = 0; j < input.length() - 1; j++) {
				if (input.charAt(j) == input.charAt(j + 1)) {
					count++;
				}

			}
			System.out.println(count);

		}

	}
}