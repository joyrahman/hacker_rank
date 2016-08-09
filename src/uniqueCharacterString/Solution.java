package uniqueCharacterString;

import java.util.HashMap;

public class Solution {

	public boolean isCharacterString(String s) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			// if key exist, return false
			if (hmap.containsKey(String.valueOf(key)) == true) {
				return false;
			} // else insert into map
			else {

				hmap.put(String.valueOf(key), 1);
			}

		}
		// else return true
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdefg";
		String s2 = "aabbcd";
		String s3 = "";
		Solution S = new Solution();
		System.out.println(S.isCharacterString(s1));
		System.out.println(S.isCharacterString(s2));
		System.out.println(S.isCharacterString(s3));

	}

}
