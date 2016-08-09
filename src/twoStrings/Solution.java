package twoStrings;

import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner reader = new Scanner(System.in);
		int T = reader.nextInt();
		for (int i = 0; i < T; i++) {
			String firstString = reader.next();
			String secondString = reader.next();
			boolean result = findMatch(firstString, secondString);
			if (result == true)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
		reader.close();

	}

	public static boolean findMatch(String s1, String s2) {
		char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (char x : charArray) {
			int index1 = s1.indexOf(x);
			int index2 = s2.indexOf(x);
			if (index1 > -1 && index2 > -1)
				return true;
		}

		return false;
	}

}
