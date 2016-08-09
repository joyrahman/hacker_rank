package stringNumber;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Solution S = new Solution();
		String test = "aaabbcddaa";
		System.out.println(S.shortString(test));

	} // end of main

	public String shortString(String str1) {
		int length = str1.length();
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = new char[length];
		int count = 1;
		int initPosition = 0;
		for (int i = 0; i < length; i++) {
			if (i + 1 == length) {
				break;
			}
			if (charArray1[i] == charArray1[i + 1] && (i + 1) != length) {
				count++;
			} else {
				charArray2[initPosition] = charArray1[i];
				charArray2[initPosition + 1] = (char) count;
				initPosition += 2;

			} // end of else

		} // end of for
			// convert to string and return
		String result = Arrays.toString(charArray2);

		return result;
	} // end of shortString

} // end of class
