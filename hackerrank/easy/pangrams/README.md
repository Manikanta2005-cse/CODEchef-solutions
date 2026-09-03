# Pangrams

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A *pangram* is a string that contains every letter of the alphabet.  Given a sentence determine whether it is a pangram in the English alphabet.  Ignore case.  Return either `pangram` or `not pangram` as appropriate.

**Example**  
$s = \text{'The quick brown fox jumps over the lazy dog'}$  

The string contains all letters in the English alphabet, so return `pangram`.

**Function Description**

Complete the function *pangrams* in the editor below.  It should return the string `pangram` if the input string is a pangram.  Otherwise, it should return `not pangram`.  

pangrams has the following parameter(s):

- *string s:* a string to test  

**Returns**  

- *string:* either `pangram` or `not pangram`  

**Input Format**

 A single line with string $s$. 



**Constraints**

$0 \lt \text{ length of } s  \le 10^3$  
Each character of $s$, $s[i] \in \{a-z, A-Z, \textit{space}\}$
 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T15:46:13.511Z  

```java
import java.io.*;
import java.util.*;

class Result {

    public static String pangrams(String s) {
        Set<Character> letters = new HashSet<>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }
        return letters.size() == 26 ? "pangram" : "not pangram";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/pangrams/problem)