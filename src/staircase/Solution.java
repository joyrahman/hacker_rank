package staircase;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> grid = new ArrayList<String>();

		int N = scanner.nextInt();
		for (int i = 0; i < N; i++) {
			// ArrayList<String> temp = new ArrayList<>();
			String temp = "";
			// temp.add("***");
			// temp.add(" +");
			// grid.add(temp);
			for (int j = 0; j < N - i - 1; j++) {
				// add space to the string
				temp += " ";
			}
			for (int j = N - i - 1; j < N; j++) {
				// add * to the string
				temp += "#";
			}
			grid.add(temp);
			System.out.println(temp);

		}

		// System.out.println(grid);
	}

}
