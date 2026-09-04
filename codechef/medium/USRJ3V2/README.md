# USRJ3V2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Hello user

Listen

Write a program which does the following:

- Declare a string variable x.
- Accept a text user input - the name of the user - and store it in the variable x.
- Output and print to the console "Hello" before the user defined name. Remember to add a space between "Hello" and x.
### Sample 1:
Input
Output

```
Chef
```

```
Hello Chef
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T15:21:28.032Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// Update the blank in the code below
		Scanner read = new Scanner(System.in);
		String x = read.nextLine();
		System.out.println("Hello " + x);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/USRJ3V2)