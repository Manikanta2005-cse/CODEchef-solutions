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