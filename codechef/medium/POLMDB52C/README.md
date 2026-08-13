# POLMDB52C

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Restaurant Order Analytics System

Improve query performance on the  **orders**  collection by creating and using:

- Single field indexes
- Compound (composite) indexes
- Multikey indexes(for arrays)

 **Step 1: Single Field Index** 

- Create an index on the customer field
- Use it to efficiently query orders for a specific customer
- Then run a query: Find orders where customer = "Rahul"

 **Step 2: Composite Index** 

- Create a compound index on: status (ascending) totalAmount (descending)
- Then run a query: Find orders where: status = "Delivered" totalAmount > 400

 **Step 3: Multikey Index (Array Field)** 

- Create an index on the items array field
- Then run a query: Find orders that contain "Burger" in items

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T05:56:55.837Z  

```cpp


print("Step 3: Multikey Index");

// TODO: Create index on array field
db.orders.createIndex({
  // write your code here
});

// TODO: Query array field
db.orders.find({
  // write your code here
}).forEach(doc => printjson(doc));
  items: 1

  items: "Burger"

```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB52C)