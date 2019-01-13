package com.learn.arrays;

public class BuynSellStocksBySingleTxn {

	public static int maximumProfit(int[] stockPrices) {
		int maxProfit = 0;
		int minimumPrice = stockPrices[0];
		/*
		 * for any given day, maximum profit obtainable is - maximum of(maximum profit
		 * obtained till previous day, stock price on that day - minimum stock price so
		 * far)
		 */
		for (int i = 1; i < stockPrices.length; i++) {
			maxProfit = Math.max(maxProfit, stockPrices[i] - minimumPrice);
			minimumPrice = Math.min(stockPrices[i], minimumPrice);
		}

		return maxProfit;
	}

	public static void main(String args[]) {
		int[] stockPrices = { 100, 80, 120, 130, 70, 60, 100, 125 };

		System.out.println("maximum profit that could be obtained is: " + maximumProfit(stockPrices));
	}

}
