# ARRLST10B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T16:55:37.602Z  

```java
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Step 1: Declare and initialize an ArrayList for main expenses (Rent, Groceries, Utilities, Travel, Others)
        // Hint: Use Double as the data type
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(2000.50);  // Rent
        expenses.add(1500.75);  // Groceries
        expenses.add(800.25);  // Utilities
        expenses.add(1200.00);  // Travel
        expenses.add(500.00);  // Others

        // Step 2: Print Rent and Grocery expenses
        System.out.println("Rent Expense: " + expenses.get(0));
        System.out.println("Grocery Expense: " + expenses.get(1));

        // Step 3: Declare and initialize an ArrayList for new expenses (Internet, Gym, Subscriptions)
        ArrayList<Double> newExpenses = new ArrayList<>();

        // Step 4: Add values to the new expenses list
        newExpenses.add(100.00);  // Internet Bill
        newExpenses.add(150.00);  // Gym Membership
        newExpenses.add(75.50);  // Subscriptions

        // Step 5: Print Internet and Gym Membership expenses
        System.out.println("Internet Bill: " + newExpenses.get(0));
        System.out.println("Gym Membership: " + newExpenses.get(1));
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ARRLST10B)