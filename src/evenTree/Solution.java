package evenTree;

import java.io.*;
import java.util.*;


class Vertex {
	int index;
	int nodeSum;
	boolean visited = false;
	ArrayList<Integer> adj = new ArrayList<Integer>();

	public Vertex(int index) {
		this.index = index;

	}

	public void addEdge(Integer neighbor) {
		this.adj.add(neighbor);
	}

}

class Edge {
	Integer src;
	Integer dst;

	public Edge(Integer src, Integer dst) {
		this.src = src;
		this.dst = dst;
	}
}

public class Solution {

	static ArrayList<Vertex> vertices = new ArrayList<Vertex>();
	static ArrayList<Edge> edges = new ArrayList<Edge>();

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int M = reader.nextInt();

		// init nodes
		vertices.add(new Vertex(0));
		for (int j = 1; j <= N; j++) {
			vertices.add(new Vertex(j));
			
		}

		// connect the edges
		for (int i = 0; i < M; i++) {
			int src = reader.nextInt();
			int dst = reader.nextInt();
			vertices.get(src).addEdge(dst);
			vertices.get(dst).addEdge(src);
			edges.add(new Edge(src, dst));

		}
		
		// for (int k = 1; k <= N; k++)
		// {
		// System.out.println("vertex:" + vertices.get(k).index + "adj:");
		// for(Integer item: vertices.get(k).adj)
		// System.out.print(item+",");
		//
		//
		// }
		// run dfs to compute the node count on each subtree
		Integer start = 1;
		dfs(start);
		// System.out.println(result);


		int edgeToRemove1 = 0;
		for (Vertex v : vertices) {
			// Integer src = edge.src;
			// Integer dst = edge.dst;
			if ((v.nodeSum % 2 == 0) && v.index != 1 && v.visited == true)
				edgeToRemove1++;

		}
		System.out.println(edgeToRemove1);

	}

	static Integer dfs(Integer start) {

		// if (vertices.get(start).adj.size()==0)
		// {
		// return 1;
		// }
		vertices.get(start).visited = true;
		for (Integer child : vertices.get(start).adj) {
			if (vertices.get(child).visited == false) {
				// System.out.print(vertices.get(start).index + ">>adj" +
				// child);
				vertices.get(start).nodeSum += dfs(child);
				// System.out.println(vertices.get(start).nodeSum);

			}
		}

		vertices.get(start).nodeSum = vertices.get(start).nodeSum + 1;
		return vertices.get(start).nodeSum;

	}
}