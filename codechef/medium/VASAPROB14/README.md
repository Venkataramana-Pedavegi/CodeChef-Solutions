# VASAPROB14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### sort - Practice Problem

You are given a  **`products`**  collection in MongoDB with the following documents:

```
db.products.insertMany([
  { name: "Headphones", price: 5000, rating: 4.2 },
  { name: "Phone", price: 50000, rating: 4.7 },
  { name: "Smartwatch", price: 15000, rating: 4.6 },
  { name: "Laptop", price: 75000, rating: 4.5 },
  { name: "Tablet", price: 30000, rating: 4.3 }
]);

```

 **Problem Statement** 

Write an  **aggregation pipeline**  to:

- Sort the products by price in descending order (highest price first).
- If two products have the same price, then sort them by rating in descending order.

 **Expected Output** 

```
[
  { name: "Laptop", price: 75000, rating: 4.5 },
  { name: "Phone", price: 50000, rating: 4.7 },
  { name: "Tablet", price: 30000, rating: 4.3 },
  { name: "Smartwatch", price: 15000, rating: 4.6 },
  { name: "Headphones", price: 5000, rating: 4.2 }
]

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T03:39:06.339Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/VASAPROB14)