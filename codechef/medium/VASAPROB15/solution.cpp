db.articles.insertMany([
  { title: "Intro to MongoDB", author: "Alice", views: 120 },
    { title: "Mastering Aggregation", author: "Bob", views: 450 },
      { title: "Indexes Explained", author: "Charlie", views: 300 },
        { title: "Schema Design", author: "Daisy", views: 280 },
          { title: "Transactions in MongoDB", author: "Eve", views: 600 },
            { title: "Sharding Deep Dive", author: "Frank", views: 150 }
            ]);

            // Paginate: skip first 2 documents, take next 3, and save to paginatedArticles
            const paginated = db.articles.find().skip(2).limit(3).toArray();
            db.paginatedArticles.insertMany(paginated);