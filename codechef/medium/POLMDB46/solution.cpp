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