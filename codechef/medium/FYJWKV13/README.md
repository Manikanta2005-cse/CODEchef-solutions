# FYJWKV13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Bank Account Withdrawal

To deepen your understanding of  **throwing exceptions from methods**  check this worked example. This example demonstrates how a custom exception `InsufficientFundsException` can be thrown from a  **method**  `withdraw` when the withdrawal amount exceeds the available balance.

- In try block a call is given to withdraw method on amount greater than balance.
- Because of the invalid call to withdraw method, catch block creates an instance of InsufficientFundsException class and calls getMessage method.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:38:22.496Z  

```java
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Current balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);

        try {
            account.withdraw(150.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FYJWKV13)