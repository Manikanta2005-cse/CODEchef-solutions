# CYMZCY08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Bank Account Interest Calculation
- In this example, you'll explore how abstraction can be used to define a generic blueprint for different types of bank accounts.
- We define an abstract class BankAccount that includes common properties and behaviors of all bank accounts, such as depositing and withdrawing funds. However, the method to calculate interest is left abstract because different types of accounts handle interest differently.
- Two concrete subclasses - SavingsAccount and CheckingAccount - inherit from the BankAccount class: SavingsAccount includes an interest rate and calculates interest based on it. CheckingAccount overrides the interest calculation method but returns zero, as it does not provide interest.

 **When executed, the code will show:** 

```
Deposited $200.0. New balance: $1200.0
Withdrew $300.0. New balance: $1200.0
Interest from Savings Account: $48.0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:28:37.335Z  

```java
abstract class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient Funds");
        }
    }
    // Abstract method to calculate Interest
    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    private double interestRate; // e.g., 4%

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate / 100;
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        // No interest for checking accounts
        return 0.0;
    }
}

class Codechef {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 1000.0, 4.0);
        CheckingAccount checking = new CheckingAccount("CA456", 1500.0);

        savings.deposit(200);      // +200 to savings
        checking.withdraw(300);    // -300 from checking

        System.out.println("Interest from Savings Account: $" + savings.calculateInterest());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CYMZCY08)