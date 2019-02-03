package org.nm.dsalgo.graph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.nm.dsalgo.ll.LinkedList;

public class AdjacencyListGraph implements Graph {

	private int _vertexCount = 0;
	private int _edgeCount = 0;
	private LinkedList<Integer>[] _adjList;
	private List<Integer> _vertices = null;

	public AdjacencyListGraph(String fileLocation) throws Exception {
		if (fileLocation != null) {
			BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(new File(fileLocation)));
				String line = br.readLine();
				_vertexCount = Integer.parseInt(line);
				_adjList = (LinkedList<Integer>[]) Array.newInstance(
						LinkedList.class, _vertexCount);
				_vertices = new ArrayList<Integer>();
				line = br.readLine();
				while (line != null) {
					String[] vertices = line.split(" ");
					int fromVertex = Integer.parseInt(vertices[0]);
					int toVertex = Integer.parseInt(vertices[1]);
					addEdge(fromVertex, toVertex);
					line = br.readLine();
				}
			} catch (FileNotFoundException e) {
				throw new Exception(e.getLocalizedMessage(), e);
			} catch (IOException e) {
				throw new Exception(e.getLocalizedMessage(), e);
			}

		}
	}

	@Override
	public int getEdgeCount() {
		return _edgeCount;
	}

	@Override
	public int getVertexCount() {
		return _vertexCount;
	}

	@Override
	public void addEdge(int vertex1, int vertex2) {
		addVertext(vertex1, vertex2);
		addVertext(vertex2, vertex1);
		_edgeCount++;
	}

	private void addVertext(int fromVertex, int toVertex) {
		LinkedList<Integer> vertexHead = null;
		int i = 0;
		for (i = 0; i < _vertexCount; i++) {
			if (_adjList[i] != null && _adjList[i].getData() == fromVertex) {
				vertexHead = _adjList[i];
				break;
			}
		}
		if (vertexHead == null) {
			i = 0;
			for (i = 0; i < _vertexCount; i++) {
				if (_adjList[i] == null) {
					break;
				}
			}
			_adjList[i] = new LinkedList<Integer>(fromVertex);
			vertexHead = _adjList[i];
		}
		vertexHead.add(toVertex);
		if (!_vertices.contains(fromVertex)) {
			_vertices.add(fromVertex);
		}
	}

	@Override
	public Iterator<Integer> adjacent(int vertex) {
		LinkedList<Integer> vertexHead = null;
		for (int i = 0; i < _vertexCount; i++) {
			if (_adjList[i] != null && _adjList[i].getData() == vertex) {
				vertexHead = _adjList[i];
				break;
			}
		}
		if (vertexHead != null) {
			return vertexHead.getIterator();
		} else {
			return null;
		}
	}

	public LinkedList<Integer> getAdjacencyListByValue(int value) {
		LinkedList<Integer> vertexHead = null;
		for (int i = 0; i < _vertexCount; i++) {
			if (_adjList[i] != null && _adjList[i].getData() == value) {
				vertexHead = _adjList[i];
				break;
			}
		}
		return vertexHead;
	}

	public LinkedList<Integer> getAdjacencyListByIndex(int index) {
		return _adjList[index];
	}

	@Override
	public List<Integer> getVertices() {
		List<Integer> finalList = new ArrayList<Integer>();
		for(int i : _vertices){
			finalList.add(i);
		}
		return finalList;
	}

}
