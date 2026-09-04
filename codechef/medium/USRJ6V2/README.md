# USRJ6V2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program which does the following:

- Create a Convertor that converts miles into kilometers.(1 Mile = 1.60 KM).
- Declare an integer variable mile.
- Accept user input and store it in mile.
- Declare a double variable km.
- Compute and output distance in kilometers console.
### Sample 1:
Input
Output

```
2
```

```
3.2
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T15:37:00.388Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// Update the blank in the code given below
		Scanner read = new Scanner(System.in);
		int mile = read.nextInt();
		double km = 1.60 * mile;
		System.out.println(km);
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/USRJ6V2)