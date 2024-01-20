package Task;
import java.util.Scanner;
public class Account {
    private double balance;
    public Account() {
        this.balance = 0.0;
    }
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than zero.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: ₹" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    public void displayBalance() {
        System.out.println("Current balance: ₹" + balance);
    }
}
