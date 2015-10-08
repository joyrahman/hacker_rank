package restaurant;

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

			int length = scanner.nextInt();
			int breadth = scanner.nextInt();
			System.out.println(findMaxSquare(length, breadth));

		}
	}

	static int findMaxSquare(int length, int breadth) {
		int result = 0;
		int N = Math.min(length, breadth);

		for (int i = 1; i <= N; i++) {
			if (length % i == 0 && breadth % i == 0) {
				result = (length * breadth) / (i * i);
			}

		}

		return result;
	}
}