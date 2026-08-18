# MAJORELE2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Superstar Dishes

Chef recently organised a  **Grand Feast**  where he served $n$  **different dishes**  to his friends.
Each friend picked their favourite dish, and now Chef has a list of all the dishes chosen.

Chef is curious:

- Which dishes were so popular that they were chosen by more than $⌊n/3⌋$ friends? Print the dishes in increasing order of popularity of dish among the friends.

Can you help Chef find these  **superstar dishes** ?

## Function Declaration
### Function Name

$findSuperstarDishes$ – This function finds all dishes that appear more than ⌊n/3⌋ times.

### Parameters
- $a$ : An array representing the dishes chosen by friends.
- $n$ : The number of dishes.
### Return Value
- This function returns the array in ascending order.
## Constraints
- $1 \leq n \leq 5 \times 10^4$
- $−10^9 \leq a[i] \leq 10^9$
- The output may contain at most two dishes (by pigeonhole principle)
### Input Format
- The first line of each test case contains a single integer $n$ — the number of dishes.
- The next line contains $n$ space-separated integers $a[i]$ — the dishes chosen by friends.
### Output Format
- For each test case, print on a new line all dishes that were chosen by more than ⌊n/3⌋ friends, in increasing order.
- If no such dish exists, print nothing for that test case.
### Sample 1:
Input
Output

```
6
2 2 1 1 1 2

```

```
1 2
```

### Explanation:

Here,  **n = 6**, so `[n/3]` = 2.

- Dish 1 appears 3 times -> more than 2
- Dish 2 appears 3 times -> more than 2 So, both 1 and 2 are superstar dishes.
### Sample 2:
Input
Output

```
7
5 5 5 1 2 3 4

```

```
5

```

### Explanation:

Here,  **n = 7**, so `[n/3]` = 2.

- Dish 5 appears 3 times -> more than 2.
- Other dishes (1,2,3,4) appear only once -> not more than 2. So, the answer is 5.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T16:27:52.193Z  

```java
public static List<Long> findSuperstarDishes(List<Long> a, int n) {
    long el1 = Long.MIN_VALUE, el2 = Long.MIN_VALUE;
    int cnt1 = 0, cnt2 = 0;

    // Phase 1: Voting
    for (int i = 0; i < n; i++) {
        long val = a.get(i);

        if (val == el1) cnt1++;
        else if (val == el2) cnt2++;
        else if (cnt1 == 0) {
            el1 = val;
            cnt1 = 1;
        }
        else if (cnt2 == 0) {
            el2 = val;
            cnt2 = 1;
        }
        else {
            cnt1--;
            cnt2--;
        }
    }

    // Phase 2: Validation
    cnt1 = 0;
    cnt2 = 0;

    for (int i = 0; i < n; i++) {
        long val = a.get(i);
        if (val == el1) cnt1++;
        else if (val == el2) cnt2++;
    }

    List<Long> ans = new ArrayList<>();
    if (cnt1 > n / 3) ans.add(el1);
    if (cnt2 > n / 3) ans.add(el2);

    Collections.sort(ans);
    return ans;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MAJORELE2)