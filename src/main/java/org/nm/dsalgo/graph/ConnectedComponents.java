package org.nm.dsalgo.graph;

public interface ConnectedComponents {
	
	public int getNoOfComponents();
	public boolean areConnected(int vertex1, int vertex2);
	public int getComponentId(int vertex);
	
}
