# Difficulty of a Sentence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sentence represented as a string  **s**, calculate its difficulty score.

- The difficulty score is defined as : 5×(number of hard words)+3×(number of easy words)
- A word is considered hard if either It contains 4 consecutive consonants, or the number of consonants in the word is greater than the number of vowels.
- Otherwise, the word is considered easy.

Return the difficulty score of the given sentence.

 **Note:**  Uppercase and lowercase letters should be treated as the same. The vowels are  **a**,  **e**,  **i**,  **o**, and  **u**.

 **Examples:** 

```
Input: s = "Difficulty of sentence"
Output: 13
Explanation: The words "Difficulty" and "sentence" are hard because they contain more consonants than vowels, while "of" is an easy word. Therefore the difficulty score is 5 × 2 + 3 × 1 = 13.
```

```
Input: s = "I am good"
Output: 9
Explanation: The words "I", "am", and "good" are all easy words since none of them contain 4 consecutive consonants and none have more consonants than vowels. Therefore the difficulty score is 5 × 0 + 3 × 3 = 9.
```

 **Constraints** :
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:10:55.529Z  

```java
class Solution {
    int calcDiff(String s) {
        String[] words = s.split(" ");
        int hardCount = 0;
        int easyCount = 0;

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            int vowels = 0;
            int consonants = 0;
            int consecutiveConsonants = 0;
            boolean hasFourConsecutiveConsonants = false;

            for (char ch : word.toCharArray()) {
                char lowerCh = Character.toLowerCase(ch);
                if (lowerCh >= 'a' && lowerCh <= 'z') {
                    if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                        vowels++;
                        consecutiveConsonants = 0;
                    } else {
                        consonants++;
                        consecutiveConsonants++;
                        if (consecutiveConsonants == 4) {
                            hasFourConsecutiveConsonants = true;
                        }
                    }
                }
            }

            if (hasFourConsecutiveConsonants || consonants > vowels) {
                hardCount++;
            } else {
                easyCount++;
            }
        }

        return (5 * hardCount) + (3 * easyCount);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/difficulty-of-sentence5856/1)