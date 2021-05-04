package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();

		Account acc = new Account(number, holder, initialBalance, withdrawLimit);


		System.out.print("Enter amount for withdraw: ");
		Double withdrawAmount = sc.nextDouble();
		try {
			acc.withdraw(withdrawAmount);

		} catch (AccountException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		sc.close();

	}

}
