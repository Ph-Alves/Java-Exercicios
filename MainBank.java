package application;

import java.util.Scanner;
import java.util.Locale;
import Entities.Bank;

public class MainBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Bank account;
		
		System.out.print("Enter account Number: ");
		int number = sc.nextInt();
			
		System.out.print("Enter account Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
			
		System.out.print("Is there a inicial deposit (y/n)?");
		char response = sc.next().charAt(0);
			
		if (response == 'y') {
			System.out.print("Enter inicial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Bank(number, holder, initialDeposit);
		} else {
			account = new Bank(number, holder);
		}
			
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account.toString());
			
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.Deposit(amount);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
			
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.Withdraw(amount);
			
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
			
		sc.close();
	}

}
