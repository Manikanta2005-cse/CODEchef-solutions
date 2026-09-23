# NAME2 - Rating 1285

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Your Name is Mine

In an attempt to control the rise in population,  **Archer**  was asked to come up with a plan. This time he is targeting marriages. Archer, being as intelligent as he is, came up with the following plan:

A man with name  **M**  is allowed to marry a woman with name  **W**, only if  **M**  is a subsequence of  **W**  or  **W**  is a subsequence of  **M**.

 **A**  is said to be a subsequence of  **B**, if  **A**  can be obtained by deleting some elements of  **B**  without changing the order of the remaining elements.

Your task is to determine whether a couple is allowed to marry or not, according to Archer's rule.

### Input

The first line contains an integer  **T**, the number of test cases.  **T**  test cases follow. Each test case contains two space separated strings  **M**  and  **W**.

### Output

For each test case print `"YES"` if they are allowed to marry, else print `"NO"`. (quotes are meant for clarity, please don't print them)

### Constraints
- 1 ≤ T ≤ 100
- 1 ≤ |M|, |W| ≤ 25000 (|A| denotes the length of the string A.)
- All names consist of lowercase English letters only.
### Sample 1:
Input
Output

```
3
john johanna
ira ira
kayla jayla
```

```
YES
YES
NO
```

### Explanation:

 **Case 1:**  Consider  **S = "johanna"**. So,  **S[0] = 'j', S[1] = 'o', S[2] = 'h'**  and so on. If we remove the indices [3, 4, 6] or [3, 5, 6] from S, it becomes  **"john"**. Hence  **"john"**  is a subsequence of  **S**, so the answer is "YES".

 **Case 2:**  Any string is a subsequence of it self, as it is formed after removing  **"0"**  characters. Hence the answer is  **"YES"**.

 **Case 3:**   **"jayla"**  can not be attained from  **"kayla"**  as removing any character from  **"kayla"**  would make the string length smaller than  **"jayla"**, also there is no  **'j'**  in  **"kayla"**. Similar reasoning can be applied to see why  **"kayla"**  can't be attained from  **"jayla"**. Hence the answer is "NO".

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T15:52:22.324Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            String m = sc.next();
            String w = sc.next();
            if (isSubsequence(m, w) || isSubsequence(w, m)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    private static boolean isSubsequence(String s1, String s2) {
        int i = 0, j = 0;
        int n1 = s1.length();
        int n2 = s2.length();
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n1;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NAME2)