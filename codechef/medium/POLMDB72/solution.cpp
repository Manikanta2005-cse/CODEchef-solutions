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
