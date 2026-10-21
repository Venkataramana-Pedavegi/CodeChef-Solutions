  { name: "Headphones", price: 5000, rating: 4.2 },
    { name: "Phone", price: 50000, rating: 4.7 },
      { name: "Smartwatch", price: 15000, rating: 4.6 },
        { name: "Laptop", price: 75000, rating: 4.5 },
          { name: "Tablet", price: 30000, rating: 4.3 }
          ]);

          // Aggregation pipeline: sort by price desc, then rating desc
          db.products.aggregate([
            { $sort: { price: -1, rating: -1 } },
              { $out: "sortedProducts" }
              ]);