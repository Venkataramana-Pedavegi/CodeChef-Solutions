const result = db.products.aggregate([
    {
        $match: {
              price: { $gt: 100 },
                    inStock: true
                        }
                          },
                            {
                                $out: "filteredProducts"
                                  }
                                  ]);



]);
  { name: "Pen",        category: "Stationery",  price: 5,    inStock: true }
  { name: "Headphones", category: "Electronics", price: 100,  inStock: true },