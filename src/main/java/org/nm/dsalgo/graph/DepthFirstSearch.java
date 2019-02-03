package org.nm.dsalgo.graph;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.nm.dsalgo.stack.Stack;
import org.nm.dsalgo.stack.StackImpl;

import org.nm.dsalgo.ll.LinkedList;

public class DepthFirstSearch implements Search {

	private Map<Integer, Integer> _edgeTo = new HashMap<Integer, Integer>();
	private Map<Integer, Boolean> _visited = new HashMap<Integer, Boolean>();
	private Graph _graph;
	private int _sourceVertex;

	public DepthFirstSearch(Graph graph, int sourceVertex) {
		if (graph != null) {
			this._graph = graph;
			this._sourceVertex = sourceVertex;
			LinkedList<Integer> list = graph
					.getAdjacencyListByValue(sourceVertex);
			dfs(list, sourceVertex);
		}
	}

	private void dfs(LinkedList<Integer> list, int sourceVertex) {
		_visited.put(sourceVertex, true);
		Iterator<Integer> iter = list.getIterator();
		if (iter != null) {
			while (iter.hasNext()) {
				int vertex = iter.next();
				if (!_visited.containsKey(vertex)) {
					_edgeTo.put(vertex, sourceVertex);
					dfs(this._graph.getAdjacencyListByValue(vertex), vertex);
				}
			}
		}
	}

	@Override
	public boolean hasPathTo(int vertex) {
		return _visited.containsKey(vertex);
	}

	@Override
	public Iterator<Integer> path(int vertex) {
		try {
			Stack<Integer> stack = new StackImpl<Integer>(
					this._graph.getVertexCount());
			int toVertex = vertex;
			while (toVertex != _sourceVertex) {
				stack.push(toVertex);
				toVertex = _edgeTo.get(toVertex);
			}
			stack.push(_sourceVertex);			
			return stack.getIterator();

		} catch (Exception e) {
			System.out.println("Error e while navigating the path ->"
					+ e.getLocalizedMessage());
			return null;
		}
	}

}
