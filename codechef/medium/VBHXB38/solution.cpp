                // Schedule a microtask to run after nextTick but before timers
                  Promise.resolve().then(() => {
                      console.log("3. Payment confirmed (Promise)");
                        });

                          // Schedule a task to run after microtasks but before timers
                            setImmediate(() => {
                                console.log("5. Notify customer (Immediate)");
                                  });

                                    // Schedule a timer to run after 0ms
                                      setTimeout(() => {
                                          console.log("4. Coffee ready after 0ms (Timeout)");
                                            }, 0);

                                              console.log("6. Customer waits");
                                              }

                                              module.exports = { coffeeShopQueue };

                                              if (require.main === module) {

function coffeeShopQueue() {
    console.log("1. Customer enters the shop");

      // Schedule a task to run immediately after the current operation finishes
        process.nextTick(() => {
            console.log("2. Barista takes the order (nextTick)");
              });