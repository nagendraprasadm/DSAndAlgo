package org.nm.dsalgo.graph.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.nm.dsalgo.ll.LinkedList;

import org.nm.dsalgo.graph.ConnectedComponents;
import org.nm.dsalgo.graph.Graph;

public class ConnectedComponentsImpl implements ConnectedComponents {

	private Graph _graph;
	private Map<Integer, Integer> _vertextComponents = new HashMap<Integer, Integer>();
	private int _noOfComponents;
	private Map<Integer, Boolean> _visited = new HashMap<Integer, Boolean>();

	public ConnectedComponentsImpl(Graph graph) {
		if (graph != null) {
			this._graph = graph;
			List<Integer> vertices = this._graph.getVertices();
			if (vertices != null && vertices.size() > 0) {
				for (int vertex : vertices) {
					if (!_visited.containsKey(vertex)) {
						dfs(vertex, ++_noOfComponents);
					}
				}
			}
		}
	}

	private void dfs(int sourceVertex, int componentId) {
		LinkedList<Integer> adjList = this._graph
				.getAdjacencyListByValue(sourceVertex);
		_visited.put(sourceVertex, true);
		_vertextComponents.put(sourceVertex, componentId);
		Iterator<Integer> iter = adjList.getIterator();
		while (iter.hasNext()) {
			Integer next = iter.next();
			if (!_visited.containsKey(next)) {
				dfs(next, componentId);
			}
		}
	}

	@Override
	public int getNoOfComponents() {
		return _noOfComponents;
	}

	@Override
	public boolean areConnected(int vertex1, int vertex2) {
		return _vertextComponents.get(vertex1) == _vertextComponents
				.get(vertex2);
	}

	@Override
	public int getComponentId(int vertex) {
		return _vertextComponents.get(vertex);
	}

}
