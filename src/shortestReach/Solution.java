package shortestReach;

import java.io.*;
import java.util.*;

//import cutTheTree.Vertex;

class Vertex {
	int index;
	int val;
	int dist;
	Integer parent;
	boolean visited;
	ArrayList<Integer> adj = new ArrayList<Integer>();
	int node_sum = 0;

	// constructor
	public Vertex(int index) {

		this.index = index;
		this.dist = -1;
		this.parent = 0;
		this.visited = false;

	}

	public void addChild(int child_index) {
		this.adj.add(child_index);
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

}

public class Solution {

	static List<Vertex> vertices = new ArrayList<Vertex>();


	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner inputScanner = new Scanner(System.in);
		int T = inputScanner.nextInt();
		// create first dummy node
		vertices.clear();
		// run the loop for T input set
		for (int i = 0; i < T; i++) {
			int N = inputScanner.nextInt();
			// start with empty
			vertices.add(0, new Vertex(0));

			// create N nodes

			for (int k = 1; k <= N; k++) {
				vertices.add(k, new Vertex(k));

			}

			int M = inputScanner.nextInt();
			// read the M edges information
			for (int j = 0; j < M; j++) {
				int src = inputScanner.nextInt();
				int dst = inputScanner.nextInt();
				vertices.get(src).addChild(dst);
				vertices.get(dst).addChild(src);
				// vertices.get(dst).setParent(src);

			}
			Integer start = inputScanner.nextInt();
			bfs(start);
			int endlimit = N;
			if (start.intValue() == N) {
				endlimit = N - 1;
			}

			// print out the result
			for (int m = 1; m < endlimit; m++) {
				if (m != start.intValue())
					// System.out.print("ind:" + m + ">");
					System.out.print(vertices.get(m).dist + " ");


			}
			// if (end != start.intValue())
			System.out.println(vertices.get(endlimit).dist);
			// else {
			// Sytem.out.println("");
			// }

		}

	}

	public static void bfs(Integer start) {

		Queue<Integer> fifo = new LinkedList<Integer>();
		fifo.add(start);
		vertices.get(start).dist = 0;
		vertices.get(start).visited = true;

		while (!fifo.isEmpty()) {
			Vertex node = vertices.get(fifo.remove());
			// node.visited = true;
			// System.out.println("\n__________________________");
			// System.out.print("Node" + node.index + " Frontier: ");

			// node.dist = vertices.get(node.parent) + 6;
			for (Integer a : node.adj) {
				// System.out.print("," + a);

				if (!vertices.get(a).visited) {
					vertices.get(a).dist = node.dist + 6;
					vertices.get(a).visited = true;
					// System.out.println("setting cost for" + a + ">" +
					// (node.dist + 6));
					fifo.add(a);
				}
			}

		}


	}

}