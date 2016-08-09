package flippingBits;

import java.util.Scanner;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		// int mask = 0xffffffffffffffffffffffffffffffff
		long max_val = (long) (Math.pow(2, 32) - 1);
		for (int i = 0; i < N; i++) {
			long input = scanner.nextLong();
			System.out.println(max_val - input);

		}

	}

}
