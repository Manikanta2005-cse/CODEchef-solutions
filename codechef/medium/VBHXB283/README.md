# VBHXB283

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Redis- Practice Problem

In this exercise, you will integrate  **Redis**  with an Express.js application to persist and retrieve key–value pairs. This helps you understand how to use Redis as a simple in-memory database.

 **Problem Statement** 

Build an Express server with the following requirements:

- POST /store Accepts a JSON body containing { "key": "someKey", "value": "someValue" }. Stores the key–value pair in Redis. Responds with: Stored key: <key> with value: <value>
- GET /retrieve/:key Looks up the value for the given key in Redis. If the key exists, respond with: Retrieved: <value> If the key does not exist, respond with: Key not found

 **Example Usage**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T16:49:03.338Z  

```cpp
// index.js
const express = require("express");
const bodyParser = require("body-parser");
const redis = require("redis-mock");

const app = express();
const port = 8080;

app.use(bodyParser.json());

// Create Redis client
const redisClient = redis.createClient();

redisClient.on("error", (err) => {
  console.error("Redis Client Error", err);
  });

  // POST /store
  app.post("/store", (req, res) => {
    const { key, value } = req.body;

      if (!key || value === undefined || value === null) {
          return res.status(400).send("Key and value are required");
            }

              redisClient.set(key, value, (err) => {
                  if (err) {
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB283)