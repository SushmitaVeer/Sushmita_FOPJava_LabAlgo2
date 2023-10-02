package com.greatlearning.payment.paymoney;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Transaction transaction = new Transaction();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array :");
		int size = sc.nextInt();

		int[] transactionArr = new int[size];

		System.out.println("Enter the values of array :");
		for (int i = 0; i < size; i++) {
			transactionArr[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved :");
		int targets = sc.nextInt();

		for (int i = 0; i < targets; i++) {
			System.out.println("\nEnter the value of target");
			int targetValue = sc.nextInt();

			int result = transaction.findTransaction(transactionArr, targetValue);

			if (result != -1) {
				System.out.println("Target achieved after " + result + " transactions");
			} else {
				System.out.println("Given target is not achieved");
			}
		}

		sc.close();

	}

}
