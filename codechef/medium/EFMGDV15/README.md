# EFMGDV15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print Student Names

To enhance your knowledge on traversing  **collections**  work on this school management system problem. You are given a `Student`  **class**  with `name` and `age`. In `Main` class we are creating Student object based on user input and adding those to `ArrayList`, you will be traversing those.

Task to Perform:

- Create an ArrayList named students that will store Student objects.
- After all inputs are received, traverse the students ArrayList and print the name of each student using the getName method.
### Sample 1:
Input
Output

```
3
Alice 22
Bob 35
Charlie 18
```

```
Student Names:
Alice
Bob
Charlie
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:49:33.223Z  

```java
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String name = sc.next();

            int age = sc.nextInt();

            students.add(new Student(name, age));
        }

        System.out.println("\nStudent Names:");
        for (Student student : students) {
            System.out.println(student.getName());
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV15)