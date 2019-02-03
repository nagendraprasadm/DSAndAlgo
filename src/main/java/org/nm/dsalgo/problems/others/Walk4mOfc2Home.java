package org.nm.dsalgo.problems.others;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Walk4mOfc2Home {

	private int _noOfTests = 0;
	private CityLayOut[] _layouts;

	public CityLayOut[] getLayouts() {
		return _layouts;
	}

	public void setLayouts(CityLayOut[] layouts) {
		_layouts = layouts;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Walk4mOfc2Home _instance = new Walk4mOfc2Home();
		try {
			int landmarks = 0;
			int noOfLandmarks = 0;
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(
									"D:\\Nagendra\\Reading\\Till Dec 2015\\HandsOn\\RnD\\InputFiles\\DsAlgo\\problems\\longwalk.txt")));
			String line;
			line = br.readLine();
			int layouts = Integer.parseInt(line);
			_instance.setLayouts(new Walk4mOfc2Home.CityLayOut[layouts]);
			boolean layoutStart = true;
			Walk4mOfc2Home.CityLayOut layout = null;
			line = br.readLine();
			int layoutCount = 0;
			while (line != null && !line.isEmpty()) {
				if (layoutStart) {
					String[] layoutAttr = line.split(" ");
					noOfLandmarks = Integer.parseInt(layoutAttr[0]);
					int timeUnits = Integer.parseInt(layoutAttr[1]);
					int office = Integer.parseInt(layoutAttr[2]);
					int home = Integer.parseInt(layoutAttr[3]);
					layout = _instance.new CityLayOut(noOfLandmarks, office,
							home, timeUnits);
					landmarks = 0;
					layoutStart = false;
				} else {
					if (noOfLandmarks > landmarks) {
						String[] roads = line.split(" ");
						int[] connectivity = new int[roads.length];
						for (int i = 0; i < roads.length; i++) {
							connectivity[i] = Integer.parseInt(roads[i]);
						}
						layout.getAdjMatrix()[landmarks] = connectivity;
						landmarks++;
					} else if (layouts > layoutCount) {
						_instance.getLayouts()[layoutCount] = layout;
						layoutCount++;
						layoutStart = true;
					}
				}
				line = br.readLine();
			}
			_instance.getLayouts()[layoutCount] = layout;
		} catch (IOException e) {
			System.out.println("Reading Inut failed with Exception ->"
					+ e.getLocalizedMessage());
			e.printStackTrace();
		}
		System.out.println("Processing of Input Complete.");
	}

	public int getNoOfTests() {
		return _noOfTests;
	}

	public void setNoOfTests(int _noOfTests) {
		this._noOfTests = _noOfTests;
	}

	public class CityLayOut {

		public CityLayOut(int noOfLandmarks, int office, int home, int timeUnits) {
			this._noOfLandmarks = noOfLandmarks;
			this._office = office;
			this._home = home;
			this._timeUnites = timeUnits;
			if (_noOfLandmarks > 0) {
				_adjMatrix = new int[_noOfLandmarks][_noOfLandmarks];
			}

		}

		private int _noOfLandmarks = 0;

		public int getNoOfLandmarks() {
			return _noOfLandmarks;
		}

		public void setNoOfLandmarks(int noOfLandmarks) {
			_noOfLandmarks = noOfLandmarks;
		}

		public int getOffice() {
			return _office;
		}

		public void setOffice(int office) {
			_office = office;
		}

		public int getHome() {
			return _home;
		}

		public void setHome(int home) {
			_home = home;
		}

		public int[][] getAdjMatrix() {
			return _adjMatrix;
		}

		public void setAdjMatrix(int[][] adjMatrix) {
			_adjMatrix = adjMatrix;
		}

		public int getTimeUnits() {
			return _timeUnites;
		}

		public void setTimeUnits(int timeUnits) {
			_timeUnites = timeUnits;
		}

		private int _office = 0;
		private int _home = 0;
		private int _timeUnites = 0;
		private int[][] _adjMatrix;

	}

}
