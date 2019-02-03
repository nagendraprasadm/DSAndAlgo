package org.nm.dsalgo.graph;

public class Edge<T> {

	private T fromVertex;
	private T toVertex;

	public T getFromVertex() {
		return fromVertex;
	}

	public void setFromVertex(T fromVertex) {
		this.fromVertex = fromVertex;
	}

	public T getToVertex() {
		return toVertex;
	}

	public void setToVertex(T toVertex) {
		this.toVertex = toVertex;
	}
}
