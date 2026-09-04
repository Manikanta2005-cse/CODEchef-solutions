# CamelCase

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

There is a sequence of words in [CamelCase](https://en.wikipedia.org/wiki/CamelCase) as a string of letters, $s$, having the following properties:

* It is a concatenation of one or more *words* consisting of English letters.
* All letters in the first word are *lowercase*. 
* For each of the subsequent words, the first letter is *uppercase* and rest of the letters are *lowercase*.

Given $s$, determine the number of words in $s$.

**Example**  
$s = \textit{oneTwoThree}$  

There are $3$ words in the string: 'one', 'Two', 'Three'.  

**Function Description**

Complete the *camelcase* function in the editor below.  

camelcase has the following parameter(s):

- *string s*: the string to analyze   

**Returns**  

- *int:* the number of words in $s$  

**Input Format**

A single line containing string $s$.

**Constraints**

* $ 1 \le \text{length of s} \le 10^5 $

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T15:10:45.789Z  

```java
import java.io.*;

class Result {

    public static int camelcase(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/camelcase/problem)