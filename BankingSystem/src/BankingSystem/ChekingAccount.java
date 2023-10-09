package BankingSystem;

public class ChekingAccount extends BankAccount {

	double overdraftlimit;

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Your deposit amount is: " + balance);

	}

	@Override
	public void withdraw(double amount) {

		if (balance > amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance");
		}
	}

	@Override
	public void displayAccountInfo() {
		// TODO Auto-generated method stub

	}

}
