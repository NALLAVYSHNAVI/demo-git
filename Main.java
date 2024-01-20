package Task;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.displayBalance(); 
        Account account2 = new Account(3000.0);
        account2.displayBalance();
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.displayBalance();
        account2.deposit(200.0);
        account2.withdraw(1200.0);
        account2.displayBalance();
    }
}
