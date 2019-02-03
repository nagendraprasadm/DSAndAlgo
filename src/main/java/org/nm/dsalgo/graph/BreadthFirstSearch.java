package org.nm.dsalgo.graph;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.nm.dsalgo.ll.LinkedList;

import org.nm.dsalgo.queue.Queue;
import org.nm.dsalgo.queue.QueueImpl;
import org.nm.dsalgo.stack.Stack;
import org.nm.dsalgo.stack.StackImpl;

public class BreadthFirstSearch implements Search {
	private Queue<Integer> _queue;
	private Map<Integer, Integer> _edgeTo = new HashMap<Integer, Integer>();
	private Map<Integer, Boolean> _marked = new HashMap<Integer, Boolean>();
	private Graph _graph;
	private int _sourceVertex;

	public BreadthFirstSearch(Graph graph, int sourceVertex) {
		if (graph != null) {
			this._graph = graph;
			this._sourceVertex = sourceVertex;
			this._queue = new QueueImpl<Integer>(this._graph.getVertexCount());
			bfs(sourceVertex);
		}
	}

	private void bfs(int sourceVertex) {

		try {
			_queue.enQueue(sourceVertex);
			_marked.put(sourceVertex, true);
			while (!_queue.isEmpty()) {
				Integer fromVertex = _queue.deQueue();
				LinkedList<Integer> adjList = this._graph
						.getAdjacencyListByValue(fromVertex);
				Iterator<Integer> iter = adjList.getIterator();
				while (iter.hasNext()) {
					int next = iter.next();
					if (!_marked.containsKey(next)) {
						_marked.put(next, true);
						_edgeTo.put(next, fromVertex);
						_queue.enQueue(next);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("BFS failed with exception :"
					+ e.getLocalizedMessage());
		}
	}

	@Override
	public boolean hasPathTo(int vertex) {
		return _marked.containsKey(vertex);
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
