package org.nm.dsalgo.graph;

import java.util.Iterator;
import java.util.List;

import org.nm.dsalgo.ll.LinkedList;

public interface Graph {

	public int getEdgeCount();
	
	public int getVertexCount();
	
	public void addEdge(int vertex1, int vertex2);
	
	public Iterator<Integer> adjacent(int vertex);
	
	public LinkedList<Integer> getAdjacencyListByValue(int value);

	public LinkedList<Integer> getAdjacencyListByIndex(int index);
	
	public List<Integer> getVertices();
}
