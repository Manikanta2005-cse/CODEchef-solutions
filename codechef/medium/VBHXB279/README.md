# VBHXB279

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Typescript- Practice

Now let’s build a small Express API to store and retrieve users’ favorite colors. This practice problem is designed to help you  **convert a JavaScript Express app to TypeScript**  and use type annotations for safety.

 **Instructions** 

- Convert the code to TypeScript: We have used.ts extension. Use import type { Request, Response } from "express"; for type annotations.
- Add proper type annotations for: Route handlers: (req: Request, res: Response) => {... } In-memory storage object: { [key: string]: string }
- Expected behaviors: POST /color stores a user’s favorite color. GET /color/:name retrieves the stored color. Proper error handling for missing input.

 **Expected Output**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T16:46:29.983Z  

```cpp
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

// GET /color/:name
app.get("/color/:name", (req: Request, res: Response) => {
  const { name } = req.params;
  const color = favoriteColors[name];
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB279)