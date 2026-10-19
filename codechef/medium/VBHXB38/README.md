# VBHXB38

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Functions in Timer

 **Coffee Shop Queue** 

You're simulating a coffee shop.
Some tasks are immediate (like placing an order), some are scheduled (like preparing coffee), and some are system-level tasks (like notifying when ready). Fill in the blanks to see the order of operations.

 **Expected Output :** 

```
1. Customer enters the shop
6. Customer waits
2. Barista takes the order (nextTick)
3. Payment confirmed (Promise)
5. Notify customer (Immediate)
4. Coffee ready after 0ms (Timeout)

```

 **What You Learn from this example:** 

- Synchronous code runs first in the order it appears.
- process.nextTick() callbacks run immediately after the current synchronous code finishes, before any other queued tasks.
- Promise callbacks (microtasks) run right after nextTick callbacks.
- setImmediate() callbacks run in the “check” phase, after I/O events and microtasks.
- setTimeout(..., 0) runs in the “timers” phase of the next event loop cycle.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T07:56:31.503Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB38)