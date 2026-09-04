# LJAAS50

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Let us revisit our favourite rectangle and its area problem.

Write a program which does the following:

- Declare 2 integer variables length and width.
- In this problem - accept 2 user defined inputs from the console and initialise these values length and width.
- Create another integer variable area - compute the area of the rectangle and store it as area.
- Output area to the console.
### Sample 1:
Input
Output

```
10
23
```

```
Area of the rectangle is: 230
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T15:28:29.591Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	   // Update the blank in code below
		Scanner read = new Scanner(System.in);
        int length = read.nextInt();
        int width = read.nextInt();

        int area = length * width;

        System.out.println("Area of the rectangle is: " + area);
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS50)