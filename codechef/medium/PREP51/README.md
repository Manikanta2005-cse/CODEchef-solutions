# PREP51

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Hashing - Minimum Window Substring

You are given a string $S$ of length $N$ and a string $T$ of length $M$ consisting of lowercase english characters.

Find the  **shortest**  substring of $S$ which contains all characters present in $T$ (in any order including duplicates). If there are multiple such substring, return the first occurring  **shortest**  substring.

If there is no substring in $S$ that contains all characters of $T$, print $-1$ instead.

Note that a substring is obtained by deleting some (possible zero) characters from the beginning and some (possibly zero) characters from the end of the string.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line of each test case contains two space-separated integers $N$ and $M$ — the lengths of strings $S$ and $T$ respectively. The second line of each test case contains a string with $N$ lowercase english alphabets — the string $S$. The third line of each test case contains a string with $M$ lowercase english alphabets — the string $T$.
### Output Format

For each test case, output on a new line, the  **shortest**  substring of $S$ which contains all characters present in $T$ (in any order including duplicates). If there is no substring in $S$ that contains all characters of $T$, print $-1$ instead.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N, M \leq 10^5$
- The sum of $N$ over all test cases won't exceed $2\cdot 10^5$.
- The sum of $M$ over all test cases won't exceed $2\cdot 10^5$.
### Sample 1:
Input
Output

```
3
8 4
baccaccb
acbc
3 2
bac
ac
1 1
c
a

```

```
bacc
ac
-1
```

### Explanation:

 **Test case $1$:**  The substring $S[1:4] = bacc$ and $S[5:8] = accb$ both will be the smallest substring in $S$ contains all characters of the string $T$ but $S[1:4] = bacc$ occurs first.

 **Test case $2$:**  The substring $S[2:3] = ac$ will be shortest substring that contains all characters in $T$.

 **Test case $3$:**  No substring present in $S$ that contains all characters in $T$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:14:49.628Z  

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (tc-- > 0) {
            String[] nm = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            String s = br.readLine().trim();
            String t = br.readLine().trim();
            
            String res = minWindowSubstring(s, t);
            sb.append(res).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static String minWindowSubstring(String s, String t) {
        int[] need = new int[128];
        int[] window = new int[128];
        
        for (char c : t.toCharArray()) {
            need[c]++;
        }
        
        int required = t.length();
        int left = 0, minLen = Integer.MAX_VALUE, startIdx = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char rChar = s.charAt(right);
            
            if (need[rChar] > 0) {
                window[rChar]++;
                if (window[rChar] <= need[rChar]) {
                    required--;
                }
            }
            
            while (required == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIdx = left;
                }
                
                char lChar = s.charAt(left);
                if (need[lChar] > 0) {
                    window[lChar]--;
                    if (window[lChar] < need[lChar]) {
                        required++;
                    }
                }
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "-1" : s.substring(startIdx, startIdx + minLen);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PREP51)