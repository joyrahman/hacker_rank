package onePlus;

public class Solution {
	public int[] plusOne(int[] digits) {
		int result[] = digits;
		int N = digits.length;
		int borrow = 1;
		for (int i = N - 1; i >= 0; i--) {
			// System.out.println("<< d:" + digits[i] + " b:" + borrow);
			int result1 = digits[i] + borrow;

			if (result1 >= 10) {
				digits[i] = result1 - 10;
				borrow = 1;
			} else {
				digits[i] = result1;
				borrow = 0;
			}
			// System.out.println(">> d:" + digits[i] + " b:" + borrow);

		}
		if (borrow == 1) {
			result = new int[digits.length + 1];
			result[0] = 1;
			for (int i = 1; i < digits.length + 1; i++) {
				result[i] = digits[i - 1];
			}
		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int digits[] = new int[] { 9 };
		int result[] = s.plusOne(digits);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
