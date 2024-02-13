package Entities;

public class Bank {
	
	private int number;
	private String holder;
	private double balance;
	
	public Bank(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		Deposit(initialDeposit);
	}
	
	public Bank(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public void Deposit(double amount) {
		balance += amount;
	}
	
	public void Withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
}
