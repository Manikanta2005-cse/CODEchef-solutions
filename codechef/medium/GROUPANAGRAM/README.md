# GROUPANAGRAM

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Group Anagrams

Listen

Introducing Listen to Problem✨

Don't want to read? Now you can listen to the problem!

You are given $N$ strings. Your task is to group the strings that are anagrams of each other. Complete the given function.

 **Note** : An anagram is a string formed by rearranging the letters of a another string, using all the original letters exactly once.
For example,  **"listen"**  and  **"silent"**  are anagrams of each other because they contain the same letters.

### Input Format
- The first line of input contains an integer $N$ — the number of strings.
- The next $N$ lines contain strings.
### Output Format
- Complete the function which return the vector of string vectors. each string vector are group of anagram strings.
- You can return the groups of anagrams in any order.
### Constraints
- $1 \leq N \leq 100000$
- All strings are of lowercase latin letters.
- Size of each string is at most 10.
### Sample 1:
Input
Output

```
5
abc
dba
acb
bda
cba
```

```
abc acb cba 
dba bda
```

### Explanation:

There could be multiple grouping, for eg, 1 valid grouping is: {abc, acb, cba}, {dba, bda}

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:11:50.572Z  

```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //write your code  here 
        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);
            if (!groups.containsKey(sortedS)) {
                groups.put(sortedS, new ArrayList<>());
            }
            groups.get(sortedS).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GROUPANAGRAM)