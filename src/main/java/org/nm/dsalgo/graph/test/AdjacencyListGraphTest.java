package org.nm.dsalgo.graph.test;

import java.util.Iterator;

import org.nm.dsalgo.graph.AdjacencyListGraph;
import org.nm.dsalgo.graph.BreadthFirstSearch;
import org.nm.dsalgo.graph.ConnectedComponents;
import org.nm.dsalgo.graph.DepthFirstSearch;
import org.nm.dsalgo.graph.Search;
import org.nm.dsalgo.graph.impl.ConnectedComponentsImpl;

public class AdjacencyListGraphTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		AdjacencyListGraph graph = new AdjacencyListGraph(
				"D:\\Nagendra\\Reading\\HandsOn\\RnD\\InputFiles\\DsAlgo\\Graph\\SimpleGraph.txt");
		System.out.println("No Of Vertices -> " + graph.getVertexCount());
		System.out.println("No Of Edges -> " + graph.getEdgeCount());

		Search search = new BreadthFirstSearch(graph, 3);
		printPath(search, 1);
		printPath(search, 2);
		printPath(search, 3);
		printPath(search, 4);
		printPath(search, 5);
		printPath(search, 6);		
		graph = new AdjacencyListGraph(
				"D:\\Nagendra\\Reading\\HandsOn\\RnD\\InputFiles\\DsAlgo\\Graph\\TwoComponentGraph.txt");
		ConnectedComponents cc = new ConnectedComponentsImpl(graph);
		System.out.println("No of Connected Components ->" + cc.getNoOfComponents());
	}
	
	public static void printPath(Search search, int destVertex ){
		System.out.println("^^^^ START ^^^^");		
		if(search.hasPathTo(destVertex)){
			System.out.println(destVertex);
		}else{
			System.out.println("NO PATH EXISTS FOR VERTEXT - >"  +destVertex);
		}
		System.out.println();
		System.out.println("^^^^ END ^^^^");
		System.out.println();		
	}
}
