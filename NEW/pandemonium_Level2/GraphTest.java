package pandemonium_Level2;

import java.util.*;

class Graph {
	int V; // vertex
	LinkedList<Integer>[] adjList;

	Graph(int V) {
		this.V = V;
		adjList = new LinkedList[V];

		for (int i = 0; i < V; i++)
			adjList[i] = new LinkedList<>();

	}

}

public class GraphTest {

	Graph g;

	public void addEdge(Graph graph, int src, int des) {
		graph.adjList[src].add(des);
		graph.adjList[des].add(src);// undirected graph
	}
	
	public void print(Graph graph) {
		
	}

	public static void main(String[] args) {
		GraphTest graph = new GraphTest();
		graph.g = new Graph(5);
		graph.addEdge(graph.g, 0, 1);
	}

}
