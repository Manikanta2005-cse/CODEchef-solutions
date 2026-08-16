# MONKCI15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check if favorite fruits are in the basket

You are given the task to create a Java program that checks if certain favorite fruits are available in a fruit basket.

 **Tasks:** 

- Take an integer input n representing the number of fruits in the basket.
- Take n fruit names from the user and store them in an ArrayList called basket.
- Take another integer m representing the number of favorite fruits to be checked.
- Take m fruit names and for each one, check if it exists in the basket using the contains() method.
- For each check, print true if the fruit is in the basket, and false otherwise.
### Sample 1:
Input
Output

```
5
Apple
Banana
Orange
Mango
Grapes
3
Banana
Pineapple
Mango

```

```
true
false
true

```

### Sample 2:
Input
Output

```
4
Strawberry
Kiwi
Lemon
Peach
2
Kiwi
Apple

```

```
true
false

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:10:29.738Z  

```java
import java.util.ArrayList;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of fruits in the basket
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Step 2: Store basket fruits in ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            fruits.add(sc.nextLine());
        }

        // Step 3: Take number of favorite fruits to check
        int m = sc.nextInt();
        sc.nextLine(); // consume newline

        // Step 4: Check each favorite fruit
        for (int i = 0; i < m; i++) {
            String favFruit = sc.nextLine();
            System.out.println(fruits.contains(favFruit));
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI15)