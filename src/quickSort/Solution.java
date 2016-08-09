package quickSort;

import java.io.*;
import java.util.*;

//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		/*
		 * Sample Input 7 1 3 9 8 2 7 5 Sample Output 1 3 2 5 9 7 8 1 2 3 5 9 7
		 * 8 1 2 3 5 7 8 9
		 * 
		 */
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			numbers.add(reader.nextInt());
		}
		quickSort(numbers, 0, numbers.size() - 1);

	}

	static void  quickSort(ArrayList<Integer> numbers, int start, int end){
		if (start < end) {
			int q = partition(numbers, start, end);

			quickSort(numbers, start, q - 1);
			quickSort(numbers, q + 1, end);
		}
				
		
	}

	static int partition(ArrayList<Integer> number, int p, int r) {
		int pivot = number.get(r);
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if (number.get(j) <= pivot) {
				i++;
				// swap the numbers
				int a = number.get(j);
				int b = number.get(i);
				number.set(j, b);
				number.set(i, a);

			}
		}
		// exchange A[i+1] with A[r]
		int temp = number.get(i + 1);
		number.set(r, temp);
		number.set(i + 1, pivot);

		// return pivot
		String output = "";
		for (int x : number) {
			output += x + " ";
		}
		System.out.println(output);
		
		return i + 1;
	}
}