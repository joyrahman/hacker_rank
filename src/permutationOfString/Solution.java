package permutationOfString;

import java.util.Arrays;

public class Solution {
	public boolean isPermutation(String s1, String s2) {
		// 1. compare the lengths. if not equal,return false
		// 2. convert each string to character array and sort them
		// 3. convert back to string and compare them
		//

		if (s1.length() != s2.length()) {
			return false;
		}

		char[] firstCharArray = s1.toCharArray();
		char[] secondCharArray = s2.toCharArray();
		Arrays.sort(firstCharArray);
		Arrays.sort(secondCharArray);
		/*
		 * if (firstCharArray.equals(secondCharArray)) { return true; }
		 */
		for (int i = 0; i < firstCharArray.length; i++) {
			if (firstCharArray[i] != secondCharArray[i]) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String s1 = "abc";
		String s2 = "bca";
		String s3 = "cab";

		System.out.println(s.isPermutation(s1, s2));
		System.out.println(s.isPermutation(s1, s3));
		System.out.println(s.isPermutation(s3, s2));

	}

}
