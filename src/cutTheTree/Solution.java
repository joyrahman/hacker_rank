/*
 * 
Output Format 
A single line containing the minimum value of Tree_diff.

Constraints 
3≤N≤105 
1≤ number written on each vertex ≤1001

Sample Input

6
100 200 100 500 100 600
1 2
2 3
2 5
4 5
5 6
Sample Output

400
 * 
 * 
 */

package cutTheTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Vertex {
	int index;
	int val;
	boolean visited;
	ArrayList<Integer> adj = new ArrayList<Integer>();
	int node_sum = 0;

	// constructor
	public Vertex(int index) {

		this.index = index;


	}

	public void addChild(Integer child_index) {
		this.adj.add(child_index);
	}

}

public class Solution {

	static List<Vertex> vertices = new ArrayList<Vertex>();

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int Node = reader.nextInt();
		vertices.add(new Vertex(0));
		int total = 0;

		// sum up all the values and insert into per node
		for (int i = 0; i < Node; i++) {
			int tempVal = reader.nextInt();
			Vertex temp = new Vertex(i + 1);
			temp.val = tempVal;
			total += tempVal;
			vertices.add(i + 1, temp);
		}

		// create the edges
		for (int i = 0; i < Node - 1; i++) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			vertices.get(a).addChild(b);
			vertices.get(b).addChild(a);

		}

		// call the dfs from the root
		dfs(1);
		// determine the lowest edge cut
		int min_cost = Integer.MAX_VALUE;
		for (int i = 0; i < Node; i++) {
			Vertex temp = vertices.get(i + 1);
			// System.out.println("Node" + (i + 1) + ":" + temp.node_sum + "
			// val" + temp.val);
			int result = Math.abs(total - 2 * temp.node_sum);
			if (result < min_cost) {
				min_cost = result;

			}

		}

		// print out the minimum result

		System.out.println(min_cost);

		// System.out.println("Total" + total);

	}

	public static int dfs(int index) {

		Vertex root = vertices.get(index);
		root.visited = true;
		root.node_sum = root.val;
		for (int x: root.adj)
		{	Vertex child = vertices.get(x);
			if (child.visited == false)
				root.node_sum += dfs(x);
		}
		
		return root.node_sum;

	}

}
