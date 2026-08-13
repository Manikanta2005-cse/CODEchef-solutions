# POLPROB160J

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### skip and limit - Practice Problem

You are given a collection of  **articles**. Each article has a `title`, `author`, and `views`.

Write an  **aggregation pipeline**  to implement pagination:

- Skip the first 2 documents.
- Limit the result to 3 documents.

Finally, store the paginated results into a new collection called  **paginatedArticles**.

 **Expected Output** 

You should get the following documents:

```
[
  { "_id": ObjectId("..."), "title": "Indexes Explained", "author": "Charlie", "views": 300 },
  { "_id": ObjectId("..."), "title": "Schema Design", "author": "Daisy", "views": 280 },
  { "_id": ObjectId("..."), "title": "Transactions in MongoDB", "author": "Eve", "views": 600 }
]

```

And these will also be stored in the  **paginatedArticles**  collection.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T05:38:01.133Z  

```cpp
// Aggregation pipeline 
var pagedb = db.articles.aggregate([

  {$skip: 2},// Skip first 2 documents
  {$limit:3} // Limit to next 3 documents



]);
   
]).toArray();

// Print result
printjson(pagedb);

// Store result in separate collection
db.paginatedArticles.insertMany(pagedb);

  { title: "Sharding Deep Dive", author: "Frank", views: 150 }
  { title: "Transactions in MongoDB", author: "Eve", views: 600 },
  { title: "Schema Design", author: "Daisy", views: 280 },
  { title: "Indexes Explained", author: "Charlie", views: 300 },
  { title: "Mastering Aggregation", author: "Bob", views: 450 },
```

---

[View on CodeChef](https://www.codechef.com/problems/POLPROB160J)