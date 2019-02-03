package org.nm.dsalgo.graph;

import java.util.Iterator;

public interface Search {
	
	public boolean hasPathTo(int vertex);
	
	public Iterator<Integer> path(int vertext);

}
