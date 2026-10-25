
const express = require('express');
const mongoose = require('mongoose');

const app = express();
const port = 3000;

// MongoDB Atlas connection
const mongoURI =
 'mongodb+srv://CampusPlacement:sylesh@cluster0.zufsvms.mongodb.net/?appName=Cluster0'
  mongoose.connect(mongoURI)
    .then(() => {
        console.log('✅ Connected to MongoDB Atlas');
          })
            .catch((err) => {
                console.error('❌ MongoDB connection error:', err.message);
                  });

                  // Basic route
                  app.get('/', (req, res) => {
                    res.send('Hello from MyTasks App connected to MongoDB Atlas!');
                    });

                    // Start server
                    app.listen(port, () => {
                      console.log(`🚀 Server is running at http://localhost:${port}`);
                      });