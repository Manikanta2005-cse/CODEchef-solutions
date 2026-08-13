# POLMDB46B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Restaurant Order Analytics System

Work with the  **orders**  collection to query nested arrays using:

- $elemMatch
- Nested field queries
- $regex inside arrays

 **Step 1: Nested Query – Basic Array Field** 

- Find orders where any item has price = 300
- Query directly using nested field: items.price

 **Step 2: ElemMatch – Multiple Conditions** 

- Find orders where a single item: name is "Burger" AND quantity ≥ 2
- Use $elemMatch

 **Step 3: Search – Pattern Matching in Array** 

- Find orders where any item name contains "Piz"
- Use $regex on items.name

 **Step 4: Combined Condition** 

- Find orders where: Any item has price > 100 AND customer name is "Rahul"

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T05:26:24.727Z  

```cpp

// Find orders where item name contains "Piz"
db.orders.find({
  "items.name": { $regex: "Piz" }
}).forEach(doc => printjson(doc));
print("Step 3: Regex Search Result");




print("Step 4: Combined Query Result");

// Find orders where item price > 100 AND customer is "Rahul"
db.orders.find({
  "items.price": { $gt: 100 },
  customer: "Rahul"
}).forEach(doc => printjson(doc));


```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB46B)