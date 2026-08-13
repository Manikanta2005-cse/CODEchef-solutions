db.flights.insertMany([
  { _id: 1, airline: "Air India",   source: "Delhi",   destination: "Mumbai",   duration: 120 },
  { _id: 2, airline: "IndiGo",      source: "Delhi",   destination: "Bangalore", duration: 150 },
  { _id: 3, airline: "SpiceJet",    source: "Delhi",   destination: "Mumbai",   duration: 110 },
  { _id: 4, airline: "Vistara",     source: "Delhi",   destination: "Mumbai",   duration: 130 },
  { _id: 5, airline: "GoAir",       source: "Pune",    destination: "Delhi",    duration: 140 }
]);

// Step 1: Create a composite index on (source: 1, destination: 1)
db.flights.createIndex({ source: 1,destination: 1});

// Step 2: Query flights from Delhi to Mumbai, sorted by duration ascending
const result = db.flights.find(




db.queryResults.insertMany(result);

  {
).sort({ duration: 1}).toArray();
    source: "Delhi",destination: "Mumbai"
  }
printjson(result);