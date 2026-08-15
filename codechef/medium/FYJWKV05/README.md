# FYJWKV05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Bank Account Withdrawal
- Let's solidify your understanding of try-catch blocks with objects using a bank account scenario. You are provided with a partially completed Java program that simulates a simple bank account system.
- The BankAccount class is already implemented with deposit and withdrawal operations that validate inputs using exceptions.
- Your task is to complete the missing parts in the main method, specifically the exception handling blocks (try, catch, and finally), so that the program can gracefully handle errors like withdrawing more than the available balance.

 **Task to perform:**   **In the main method:** 

- Start with the try block to wrap the withdrawal operations then complete the catch block to catch the IllegalArgumentException if thrown.
- Inside the catch block, print the exception message using e.getMessage().
- Complete the finally block that prints Transaction processing complete., which should execute whether or not an exception occurs.
- Ensure that the program prints the remaining balance if no exception occurs and shows a proper error message if a withdrawal is invalid.

 **Output format:** 

```
Remaining balance: 70.0
Error: Insufficient balance.
Transaction processing complete.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:33:38.603Z  

```java
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);

        // Fill in the exception handling blocks
        try {
            account.withdraw(30.0);
            System.out.println("Remaining balance: " + account.getBalance());

            account.withdraw(150.0);  // This may throw an exception
            System.out.println("Remaining balance: " + account.getBalance()); // May not be reached
        } catch(IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction processing complete.");
        }
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/FYJWKV05)