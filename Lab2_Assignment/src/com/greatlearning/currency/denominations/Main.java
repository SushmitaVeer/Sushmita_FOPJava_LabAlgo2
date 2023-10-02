package com.greatlearning.currency.denominations;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of denominations: ");
		int n = scanner.nextInt();

		int[] denominations = new int[n];
		System.out.println("Enter the denominations:");

		for (int i = 0; i < n; i++) {
			denominations[i] = scanner.nextInt();
		}

		System.out.print("Enter the amount to pay: ");
		int amount = scanner.nextInt();

		MergeSort.mergeSort(denominations, 0, denominations.length - 1);
		CurrencyPayments.minNotesPayment(denominations, amount);

		scanner.close();

	}

}
