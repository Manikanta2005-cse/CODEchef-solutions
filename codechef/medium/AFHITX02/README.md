# AFHITX02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the total cost of items and the number of items. Calculate the price per item.
If the number of items is zero or negative, keep asking until a valid (positive) number is entered.
Print the price per item.

Fix the bug in the given code to achieve this

### Sample 1:
Input
Output

```
100.0
4
```

```
Price per item: 25.0
```

### Sample 2:
Input
Output

```
500.0
0
-1
2
```

```
Number of items must be positive. Please enter again.
Number of items must be positive. Please enter again.
Price per item: 250.0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T17:07:11.637Z  

```java
import java.util.Scanner;

class PricePerItem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCost = scanner.nextDouble();

        int numberOfItems;
        do {
            numberOfItems = scanner.nextInt();
            if (numberOfItems <= 0) {
                System.out.println("Number of items must be positive. Please enter again.");
            }
        } while (numberOfItems <= 0);

        // Calculate the price per item
        double pricePerItem = totalCost / numberOfItems;

        System.out.println("Price per item: " + pricePerItem);

        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/AFHITX02)