package chocolateFeast;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		/*
		 * 1≤T≤1000 2≤N≤105 1≤C≤N 2≤M≤N
		 */
		Scanner scanIn = null;
		try {
			scanIn = new Scanner(System.in);
			int T = Integer.parseInt(scanIn.nextLine());
			int N, C, M;

			for (int i = 0; i < T; i++) {

				// read each line
				// do the calculation
				// return the result
				N = scanIn.nextInt();
				C = scanIn.nextInt();
				M = scanIn.nextInt();

				int no_of_chocolate = Math.floorDiv(N, C);
				int total_chocolate = no_of_chocolate;
				while (no_of_chocolate >= M) {
					int no_of_free = Math.floorDiv(no_of_chocolate, M);
					int no_of_remaining = no_of_chocolate - no_of_free * M;
					no_of_chocolate = no_of_free + no_of_remaining;
					total_chocolate += no_of_free;

					// add to the count
					// check the residue
				}
				System.out.println(total_chocolate);

			}

		}

		finally {
			if (scanIn != null)
				scanIn.close();

		}

	}
}

