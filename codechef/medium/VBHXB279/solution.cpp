import type { Request, Response } from "express";
import express from "express";

const app = express();
const port = 8080;

app.use(express.json());

// In-memory storage with type annotation
const favoriteColors: { [key: string]: string } = {};

// POST /color
app.post("/color", (req: Request, res: Response) => {
  const { name, color } = req.body;

  if (!name || !color) {
    return res.status(400).send("Both name and color are required");
  }

  favoriteColors[name] = color;
  res.send(`Favorite color for ${name} saved as ${color}`);
});
