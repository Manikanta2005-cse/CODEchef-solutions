# POLMDB43

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Project Supervisor Hunt

You have a `departments` collection in the `hospital_db`. Each department has a `staff` array containing multiple employee objects. You need to find a department that has a specific type of worker available right now.

 **Step 1: Apply the `$elemMatch` Boundary** 
When searching arrays of objects, standard dot notation (e.g., `staff.role`) is "loose"—it returns a match if any person is a Doctor and any person is on-call. To ensure we find a single person who meets both criteria, we must use `$elemMatch`.

 **Step 2: Define the Coexisting Criteria** 
Inside the `$elemMatch` block, we define the traits that must exist within the same object:

- role: "Doctor"
- onCall: true

 **Step 3: Analyze the "Full Document" Result** 
It is important to remember that `db.collection.find()` returns entire documents.

- The Scan: MongoDB looks at "Pediatrics." It sees "Dr. Kapoor" is a Doctor AND is on-call.
- The Match: Because one person matched, the entire "Pediatrics" document is sent to your terminal.
- The Inclusion: This is why you still see "Nurse Joy" in your output. She is part of the department's team, even though she wasn't the one who "opened the door" for the search result.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T05:12:32.282Z  

```cpp
    deptName: "Pediatrics",
    staff: [
        { name: "Dr. Kapoor", role: "Doctor", onCall: true }, 
        { name: "Nurse Joy", role: "Nurse", onCall: true }
    ]
});

const searchResult = db.departments.find({
    staff: { 
        $elemMatch: { 
            role: "Doctor", 
            onCall: true 
        } 
    }
}).toArray();

print("--- Search Result ---");
printjson(searchResult);

```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB43)