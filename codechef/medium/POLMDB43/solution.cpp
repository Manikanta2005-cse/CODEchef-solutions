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
