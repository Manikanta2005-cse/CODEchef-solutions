# POLMDB46

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Honor Roll Search

In your `school_db`, you have a collection called `classrooms`. Each classroom has a `students` array. Each student is an object containing their name and an array of their grades.

- The Goal: Find a classroom that has a student named "Arjun" who has specifically earned an "A" grade.

 **Step 1: Target the Primary Array** 
First, identify which array contains the objects you want to filter. In this document, that is the `students` array. Your query must start with this field name.

 **Step 2: Initialize the Boundary (`$elemMatch`)** 
Since you have two conditions (the student's name and the student's grade) that must belong to the same person, you must use `$elemMatch`. This prevents MongoDB from "mixing and matching" data from different students in the same classroom.

 **Step 3: Define the "Unified" Identity** 
Inside your `$elemMatch` block, add the first requirement.

- Condition: name: "Arjun" This tells MongoDB to only look at objects where the name matches exactly.

 **Step 4: Reach into the Nested Array** 
Now, add the second requirement inside the same `$elemMatch` block.

- Condition: grades: "A" Even though grades is an array inside the student object, MongoDB treats it as a "contains" check. It will look inside Arjun's specific grades list for the letter "A".

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T05:20:45.338Z  

```cpp
    ]
});

const honorRoll = db.classrooms.find({
    students: { 
        $elemMatch: { 
            name: "Arjun", 
            grades: "A" 
        } 
    }
}).toArray();


print("--- Honor Roll Search Results ---");
if (honorRoll.length === 0) {
    print("No match found (Correct! Arjun does not have an 'A' in this room).");
} else {
        }
            grades: ["A", "A"]   // Sita HAS an 'A', but she isn't Arjun
            name: "Sita", 
        { 
        },
            grades: ["B", "C"]   // Arjun does NOT have an 'A'
            name: "Arjun", 
```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB46)