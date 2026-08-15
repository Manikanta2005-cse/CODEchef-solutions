# FYJWKV03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### BankAccount: Withdraw with insufficient funds check

Let's solidify your understanding of `try-catch-finally` block with  **objects**  through a practical example. You're given a `BankAccount`  **class**.

- A BankAccount class is created with a balance field and methods for withdrawal and balance check.
- The constructor ensures the initial balance is not negative, or it throws an IllegalArgumentException.
- In the main method, object creation and withdrawals are wrapped in a try-catch block to handle invalid operations.
- The finally block runs at the end to confirm program completion, regardless of any exception.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:31:30.101Z  

```java
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(100.0);
            account.withdraw(50.0);
            System.out.println("New balance: " + account.getBalance());
            account.withdraw(200.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Program completed.");
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FYJWKV03)