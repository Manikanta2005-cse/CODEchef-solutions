        address: i + " Tech Lane",
        type: type,
        amenities: shuffled.slice(0, amenityCount)
    });
}

db.listings.insertMany(properties);


    properties.push({
    const shuffled = [...features].sort(() => 0.5 - Math.random());

    const amenityCount = Math.floor(Math.random() * 3) + 1;

    const type = types[Math.floor(Math.random() * types.length)];

for (let i = 1; i <= 3000; i++) {

const features = ["Pool", "Gym", "Parking", "Wifi", "Garden", "Solar", "Security"];
const types = ["Apartment", "House", "Villa"];
const properties = [];

db.listings.drop();
