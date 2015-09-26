package missingNumbers;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner inputScanner = new Scanner(System.in);
		HashMap<Integer, Integer> list_A = new HashMap<Integer, Integer> ();
		HashMap<Integer, Integer> list_B = new HashMap<Integer, Integer> ();
		
		// populate the hashtable A 

		int n_A = inputScanner.nextInt();
		for (int i =0; i< n_A; i++)
		{
			int number = inputScanner.nextInt();
			if (list_A.get(number)!=null)
			{
				list_A.put(number, list_A.get(number)+1);
			}
			else
				list_A.put(number,1);
		}
		
		// populate the hashtable B 
		int n_B = inputScanner.nextInt();
		for (int i =0; i< n_B; i++)
		{
			int number = inputScanner.nextInt();
			if (list_B.get(number)!=null)
			{
				list_B.put(number, list_B.get(number)+1);
			}
			else
				list_B.put(number,1);
		}
		
		ArrayList<Integer> notFoundList = new ArrayList<Integer>();
		// do the comparison 
		for (int x : list_A.keySet()) {
			if (list_B.containsKey(x) == false) {
				// add to the array list
				notFoundList.add(x);
			}
			// else verify the count
			else {
				if (!list_A.get(x).equals(list_B.get(x))) {
					// System.out.println("key " + x + "count:A " +
					// list_A.get(x) + "count:B " + list_B.get(x));
					notFoundList.add(x);

				}

			}
		}
		
		// do the same in other direction
		for (int x : list_B.keySet()) {
			if (list_A.containsKey(x) == false) 
			{
				// add to the array list
				notFoundList.add(x);
			}

			}

		// now print out the whole array
		// sort the list
		Collections.sort(notFoundList);
		for (int x : notFoundList)
			System.out.print(x + " ");
		

	}
}