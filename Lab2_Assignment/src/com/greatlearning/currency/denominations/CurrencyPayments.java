package com.greatlearning.currency.denominations;

public class CurrencyPayments {

	public static void minNotesPayment(int[] denominations, int amount) {

		System.out.println("Your payment approach in order to give the minimum number of notes will be:");
		for (int denomination : denominations) {
			int notesCount = amount / denomination;
			if (notesCount > 0) {
				System.out.println(denomination + ":" + notesCount);
				amount %= denomination;
			}
		}
	}
}
