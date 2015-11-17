package missingNumber;

public class Solution {
	public int missingNumber(int[] nums) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int item : nums) {
			if (item > max)
				max = item;

			if (item < min)
				min = item;
			sum += item;
		}

		int real_sum = max * (max + 1) / 2;

		// first element missing
		if (min != 0)
			return 0;
		// no element missing, that is last element to be added
		if (real_sum == sum)
			return max + 1;
		// find the missing in between
		return real_sum - sum;


	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] input = { 1, 0 };
		System.out.println(s.missingNumber(input));
	}
}