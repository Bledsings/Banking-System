package BankingSystem;

import java.util.Scanner;

public class Application {
	public static int choice;
	private final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		SavingAccount savingAccount = new SavingAccount();
		System.out.println("Hello " + savingAccount.getBankHolder());
		System.out.println("Your Account Number is: " + savingAccount.getBankAccount());

		menu();

		switch (choice) {
		case 1:
			System.out.println("What do you want to deposit as amount\n");
			double amount = scanner.nextDouble();
			savingAccount.deposit(amount);
			break;

		case 2:
			System.out.println("What do you want to withdraw as amount\n");
			amount = scanner.nextDouble();
			savingAccount.withdraw(amount);
			break;

		case 3:
			savingAccount.displayAccountInfo();
			break;

		default:
			break;
		}

	}

	private static void menu() {
		System.out.println("Please what option do you want to operate?" + 
	                     "\n\t 1.Deposit" + 
				           "\n\t 2.Withdraw"+ 
	                        "\n\t 3.Account info");
		choice = scanner.nextInt();
	}

}
