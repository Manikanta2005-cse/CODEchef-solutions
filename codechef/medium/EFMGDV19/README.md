# EFMGDV19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Filter Students by Grade
- Okay, let's solidify your understanding of filtering data in ArrayList with a worked example. Imagine you're building a school management application. You have a list of Student objects, and you want to filter students based on their grade level.
- Task to perform: Write code that filters the students list to find all students within a specified grade range (minimum grade and maximum grade). Where minGrade is 9 and maxGrade is 10.

 **Output format:** 

```
Alice
David
Eve

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:44:22.426Z  

```java
import java.util.ArrayList;

class Student {
    private String name;
    private int grade;

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

class StudentFilter {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 10));
        students.add(new Student("Bob", 8));
        students.add(new Student("Charlie", 11));
        students.add(new Student("David", 9));
        students.add(new Student("Eve", 10));

        int minGrade = 9;
        int maxGrade = 10;

        ArrayList<Student> filteredStudents = new ArrayList<>();
        // Add your code here to filter students based on the grade range(in range mindGrade to maxGrade, minGrade and maxGrade both are inclusive)
        // add all the filtered students to the filteredStudents ArrayList.
        for(Student student : students){
            if(student.getGrade()>=minGrade && student.getGrade()<=maxGrade){
                filteredStudents.add(student);
            }
        }
        
        
        
        for(Student student : filteredStudents){
            System.out.println(student.getName());
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV19)