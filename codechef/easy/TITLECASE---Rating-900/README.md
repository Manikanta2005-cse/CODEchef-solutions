# TITLECASE - Rating 900

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Convert String to Title Case

Given a string `S` consisting of only lowercase and uppercase English letters and spaces, your task is to convert it into title case. In title case, the first letter of each word is capitalized while the rest are in lowercase, except for words that are entirely in uppercase (considered as acronyms), which should remain unchanged.

 **Note:** 

- Words are defined as contiguous sequences of English letters separated by spaces.
- Acronyms are words that are entirely in uppercase and should remain unchanged.
- Assume the input does not contain leading, trailing, or multiple spaces between words.
### Input Format
- The first line contains a single integer T, the number of test cases.
- Each of the next T lines contains a string S.
### Output Format

For each test case, print a single line containing the string `S` converted into title case.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq |S| \leq 1000$, where $|S|$ is the length of the string.
### Sample 1:
Input
Output

```
5
hello world
this is a CODECHEF problem
WELCOME to the JUNGLE
the quick BROWN fOx
programming in PYTHON
```

```
Hello World
This Is A CODECHEF Problem
WELCOME To The JUNGLE
The Quick BROWN Fox
Programming In PYTHON
```

### Explanation:
- In the first test case, each word is capitalized as they are not acronyms.
- In the second test case, "CODECHEF" is an acronym and remains in uppercase.
- In the third test case, "WELCOME" and "JUNGLE" are considered acronyms.
- In the fourth test case, "BROWN" is an acronym, while the rest of the words follow the title case rule.
- In the fifth test case, "PYTHON" is an acronym, and the rest of the string is converted to title case.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T16:33:24.509Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] words = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                if (isAcronym(word)) {
                    sb.append(word);
                } else {
                    sb.append(Character.toUpperCase(word.charAt(0)));
                    if (word.length() > 1) {
                        sb.append(word.substring(1).toLowerCase());
                    }
                }
                if (i < words.length - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }

    private static boolean isAcronym(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TITLECASE)