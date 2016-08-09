/*
2
3
1 2 3
4
4 5 7 5 
* */

package sansaXor;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int T = reader.nextInt();
		for (int i = 0; i < T; i++) {
			int N = reader.nextInt();
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			for (int j = 0; j < N; j++) {
				// HashMap<Integer, Integer> count = new HashMap<Integer,
				// Integer>();
				// int item = reader.nextInt();
				numbers.add(reader.nextInt());

				// count.put(item, 0);
			}
			int result = generateArrayMap(numbers);
			System.out.println(result);

		}
		reader.close();
	}

	public static int generateArrayMap(ArrayList<Integer> numbers) {
		if (numbers.size() % 2 == 0) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < numbers.size(); i += 2) {
			sum ^= numbers.get(i);
		}

		return sum;

	}


}
