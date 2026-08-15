# DSAAGP59B - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Frequency greater than k

Given a string S and an integer, K. Write a program to print characters with frequency greater than or equal to K in sorted order.

### Input Format
- The first line contains two integers: $N$ and $K$.
- The second line contains the string $S$.
### Output Format

Output the characters with frequency greater than or equal to $K$.

### Constraints
- $2 \leq length(S) \leq 10^5$
- $1 \leq K \leq 10^5$
- S can have both upper and lowercase letters
### Sample 1:
Input
Output

```
10 3
aaabbcdddd
```

```
ad
```

### Sample 2:
Input
Output

```
10 2
aaAbBcdDdD
```

```
Dad
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:10:17.364Z  

```java
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        String s = sc.next();
        
        TreeMap<Character, Integer> mp = new TreeMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if (entry.getValue() >= k) {
                System.out.print(entry.getKey());
            }
        }
        System.out.println();
        
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSAAGP59B)