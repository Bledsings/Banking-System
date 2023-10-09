package BankingSystem;

public abstract class BankAccount {
	
	String bankAccount= "A124";
	String bankHolder= "Blessings Wandji";
	
	
	
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getBankHolder() {
		return bankHolder;
	}
	public void setBankHolder(String bankHolder) {
		this.bankHolder = bankHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	double balance= 100000.00;
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void displayAccountInfo();
		
	


}
