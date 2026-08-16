# EFMGDV13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print student names from a list of student objects

Okay, let's deepen your understanding of  **iterating**  through  **collections**  by taking a school example.

- There's a class called Student with name and grade instances.
- There's an ArrayList of Student objects in which students are added and then the list is traversed using a for-each loop.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:38:19.417Z  

```java
import java.util.ArrayList;

class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}

class School {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Creating Student objects
        Student student1 = new Student("Alice", 10);
        Student student2 = new Student("Bob", 11);
        Student student3 = new Student("Charlie", 9);

        // Adding the students to the ArrayList
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // Iterating through the ArrayList and printing each student's name
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV13)