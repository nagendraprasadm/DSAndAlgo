package org.nm.dsalgo.problems.array;

public class StockMaxProfit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 0, 2 };
		System.out.println("Max Profit is ->" + StockMaxProfit.maxProfit(arr));
	}

	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length <= 1)
			return 0;

		int b0 = -prices[0], b1 = b0, b2 = b0;
		int s0 = 0, s1 = s0, s2 = s0;
		for (int i = 1; i < prices.length; i++) {
			b0 = Math.max(b1, s2 - prices[i]);
			s0 = Math.max(b1 + prices[i], s1);
			b2 = b1;
			b1 = b0;
			s2 = s1;
			s1 = s0;
		}
		return s0;
	}

	public static int maxProfit1(int[] prices) {
		int maxProfit = 0;
		if (prices != null && prices.length > 0) {
			int sum = 0;
			boolean buy = false;
			boolean cooled = false;
			for (int i = 0; i < prices.length; i++) {
				if (!buy && i > 0 && !cooled) {
					cooled = true;
					continue;
				} else {
					cooled = false;
				}
				buy = !buy;
				sum = buy ? sum - prices[i] : sum + prices[i];
				maxProfit = sum > maxProfit ? sum : maxProfit;
			}
		}

		return maxProfit;
	}

}
