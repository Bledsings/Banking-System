package BankingSystem;


public class SavingAccount extends BankAccount {
	

	@Override
	public void deposit(double amount) {
		if(getBalance() >= 0) {
			setBalance(getBalance() + amount);
			System.out.println("New Balance: " + getBalance());
		}
		else
		{
			System.out.println("Your account have a dept of " + getBalance());
			setBalance(getBalance() + amount);
			System.out.println("New Balance: " + getBalance());
		}
		
	}

	@Override
	public void withdraw(double amount) {
		if(getBalance() > amount) {
			setBalance(getBalance() - amount);
			System.out.println("New Balance: " + getBalance());
		}
		else
		{
			System.out.println("Isufficient Balance");
		}
	}

	@Override
	public void displayAccountInfo() {
		System.out.println("Account Name: " + getBankHolder() +
				"\n Account Number: " + getBankAccount() +
				"\n Balance: " + getBalance());
		
	}

}

