package com.greatlearning.payment.paymoney;

public class Transaction {

	public int findTransaction(int[] transactions, int dailyTarget) {

		int sum = 0;
		int transactionCount = 0;

		for (int transaction : transactions) {
			sum += transaction;
			transactionCount++;

			if (sum >= dailyTarget) {
				return transactionCount;
			}
		}

		return -1;
	}

}
