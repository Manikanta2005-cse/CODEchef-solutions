# KDELI - Rating 1263

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Maximum Deliciousness

A new patisserie has opened up to rave reviews. You, in your quest for deliciousness, are going to visit it.

The patisserie has $N$ pastries. With your trained eye, you judge that the $i$-th of them has  *deliciousness*  $A_i$.
Of course, you want to eat pastries whose total deliciousness is as high as possible. Unfortunately, you can't just buy everything out.

There are $K$ customers in the store, including you. They form a queue to order pastries, of which you're the $L$-th person.
Each customer, including you, will do the following:

- Among the remaining pastries, buy the one with the highest deliciousness
- Then, move to the back of the queue

This will repeat till all the pastries are sold out.
What's the total deliciousness of the pastries you buy?

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains three space-separated integers $N$, $K$, and $L$ — the number of pastries, the number of people, and your initial position in the queue. The second line contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ — the deliciousness of the pastries.
### Output Format

For each test case, output on a new line the answer: the total deliciousness of the pastries you buy.

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq L \leq K \leq N \leq 2\cdot 10^5$
- $1 \leq A_i \leq 10^9$
- The sum of $N$ across all tests won't exceed $2\cdot 10^5$.
### Sample 1:
Input
Output

```
4
4 2 1
3 8 6 14
4 2 2
3 8 6 14
5 3 3
8 5 9 11 49
4 1 1
9 30 1 18

```

```
20
11
9
58
```

### Explanation:

 **Test case $1$:**  There are $4$ pastries, and $2$ people in the queue. You're first among them. The process is as follows:

- First, you buy the most delicious pastry, which is $14$. You move to the back of the queue.
- Next, the other person buys the most delicious remaining pastry, which is $8$. They move to the back of the queue, so you're in front again.
- You buy the most delicious remaining pastry, $6$, and move to the back.
- The other person buys the only remaining pastry, and the process ends.

The total deliciousness of the pastries you bought is $14 + 6 = 20$.

 **Test case $2$:**  This is the same as test case $1$, but you start second instead. This means you get the other two pastries this time, for a total of $3 + 8 = 11$.

 **Test case $3$:**  You're third in line. The first two people will buy the pastries with deliciousness $49$ and $11$ respectively, so your best choice is to buy the one with $9$.
The other two people then buy the remaining pastries.

 **Test case $4$:**  You're the only person in line, so you can buy everything.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:52:44.406Z  

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int pos = scanner.nextInt();
            if (pos > n) {
                System.out.println("0");
                continue;
            }
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = scanner.nextInt();
            Arrays.sort(a);
            long sum = 0;
            while (pos <= n) {
                sum += a[n - pos];
                pos += k;
            }
            System.out.println(sum);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/KDELI)