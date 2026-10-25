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