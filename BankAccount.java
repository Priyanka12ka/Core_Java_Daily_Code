/*Q 4) Encapsulation – Create a Secure Bank Account System
Problem Description:
Design a BankAccount class that encapsulates account data. It should not allow direct access to the balance. Instead, use methods to deposit, withdraw, and check balance. Validate inputs (no negative deposits or withdrawals beyond the available balance).

Objective:
Use private fields.
Create public getters and setters with validation logic.
Sample Actions:
Create an account.
Deposit 1000
Withdraw 300
Get current balance.
 */


import java.util.*;

public class BankAccount {

    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
       
        } else {
            System.out.println("balance is invalid");
        }
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
          
        } else {
            System.out.println("no sufficient balance available in account");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();
        do {
            System.out.println("Enter your choice");
            System.out.println("1.Deposite Ammount");
            System.out.println("2. Withdraw ammount");
              System.out.println("3. Check Balance");
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter ammount that you want to deposite");
                    int n = sc.nextInt();
                    b.deposit(n);
                     System.out.println("deposite success ");
                      System.out.println("------------------");
                    break;
                case 2:
                    System.out.println("Enter ammount that you want to withdrow");
                    n = sc.nextInt();
                    b.withdraw(n);
                     System.out.println("withdrow success ");
                      System.out.println("------------------");
                    break;
                    case 3:
                    System.out.println("Balance is  :  "+b.getBalance());
                     System.out.println("=================================");

                default:
                    break;
            }
        } while (true);

    }

}
