package org.nm.dsalgo.problems.others;

//import org.nm.dsalgo.general.Util;

import java.util.ArrayList;
import java.util.List;

public class PascalTraingle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (numRows > 0) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			result.add(list);
			for (int i = 1; i < numRows; i++) {
				list = new ArrayList<Integer>();
				list.add(1);
				for (int j = 1; j < i; j++) {
					list.add(j, result.get(i - 1).get(j - 1)
							+ result.get(i - 1).get(j));
				}
				list.add(1);
				result.add(list);
			}
		}
		return result;
	}

	// 0 - k
	public List<Integer> getRow(int rowIndex) {
		List<Integer> newList = new ArrayList<Integer>();
		rowIndex++;
		if (rowIndex > 0) {
			newList.add(1);
			for (int i = 1; i < rowIndex; i++) {
				for (int j = 1; j < i; j++) {
				}
			}
		}
		return newList;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PascalTraingle _inst = new PascalTraingle();
		//List<List<Integer>> triangle = _inst.generate(5);
		//Util.printIterator(triangle.iterator());
		List<Integer> row = _inst.getRow(5);
//		Util.printIterator(row.iterator());

	}

}
