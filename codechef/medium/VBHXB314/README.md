# VBHXB314

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice Problem

 **Product API with Versioning :** 

You are building a Product Store API where different versions of the API return different sets of products. The goal is to demonstrate API versioning using three common strategies:

- URL Versioning – Clients request a specific version directly in the URL.

Example: `/api/v1/products` or `/api/v2/products`

- Query Parameter Versioning – Clients specify the version as a query parameter.

Example: `/api/products?version=1` or `/api/products?version=2`

- Header Versioning – Clients specify the version in the request headers.

Example: `/api/products-header` with header `API-Version: 1` or `API-Version: 2`

🎯  **Task** :

Implement an Express.js server that:

- Returns fruits in version 1 and gadgets in version 2 for URL versioning.
- Returns dummy product data depending on the query parameter version.
- Returns header-specific products when version is passed in the request header.

Note : Run backend first : server.js

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T04:56:22.442Z  

```cpp
import express from "express";

const app = express();

// URL Versioning
// If the user visits ____ , return v1 products: ["Apple", "Banana"]
app.get("____", (req, res) => {
  res.json({ version: "v1", products: ["Apple", "Banana"] });
});

// If the user visits ____ , return v2 products: ["Laptop", "Phone"]
app.get("____", (req, res) => {
  res.json({ version: "v2", products: ["Laptop", "Phone"] });
});

// Query Parameter Versioning
// If the user visits /api/products?version=____ , return a product from that version
app.get("____", (req, res) => {
  const version = req.query.____ || "1";
  res.json({ version: `v${version}`, products: [`Product from Query v${version}`] });
});

// Header Versioning
// If the user sends a request to ____ with header API-Version: ____ , return the correct product
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB314)