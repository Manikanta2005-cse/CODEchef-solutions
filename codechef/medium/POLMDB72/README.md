# POLMDB72

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Star Rating Optimizer

You are managing a  **"Product" page**. Currently, every time a user views a product, your app has to:

- Go to the reviews collection.
- Find all reviews for that product.
- Calculate the average rating and count the total reviews.

This makes the "Read" very slow. Your task is to denormalize these calculations directly into the `product` document so the "Read" becomes instant.

 **PART A — Add Pre-Calculated Fields** 
While inserting the product document:

- Add a field called avgRating Set its starting value to 0
- Add a field called reviewCount Set its starting value to 0

 **PART B — Manually Update the Denormalized Data** 
A new review arrives with a rating of  **5**.

You must:

- Recalculate the new average rating: (5 + 4 + 3 + 5) ÷ 4 = 4.25
- Update the product document using updateOne Set: avgRating to 4.25 reviewCount to 4

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T16:38:10.585Z  

```cpp
// 1. Setup the Product
db.products.insertOne({
  _id: 1,
  name: "Wireless Earbuds",
  price: 99,

  // --- YOUR TASK PART A ---
  // Add the following fields:
  // avgRating: start at 0
  // reviewCount: start at 0

});

// 2. Setup the Reviews
db.reviews.insertMany([
  { productId: 1, rating: 5, comment: "Amazing!" },
  { productId: 1, rating: 4, comment: "Good quality" },
  { productId: 1, rating: 3, comment: "Average" }
]);

// --- YOUR TASK PART B ---
// A new review with rating = 5 arrives.
// Recalculate the new values and update the product document.

```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB72)