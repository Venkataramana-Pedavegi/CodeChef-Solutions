                                                                        console.log("Ice cream making in progress...");

                                                                        getIngredients()
                                                                          .then((ingredients) => {
                                                                              console.log("1. Step complete:", ingredients);
                                                                                  return mixIngredients(ingredients);
                                                                                    })
                                                                                      .then((mixedIngredients) => {
                                                                                          console.log("2. Step complete:", mixedIngredients);
                                                                                              return freezeMixture(mixedIngredients);
                                                                                                })
                                                                                                  .then((frozenIceCream) => {
                                                                                                      console.log("3. Step complete:", frozenIceCream);
                                                                                                          return addToppings(frozenIceCream);
                                                                                                            })
                                                                                                              .then((finalProduct) => {
                                                                                                                  console.log("4. Final product:", finalProduct);
                                                                                                                    })
                                                                                                                      .catch((error) => {
                                                                                                                          console.error("Error in ice cream making process:", error);
                                                                                                                            });
