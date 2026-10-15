# OJJAR229

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Live crypto update

Your task is to build a  **Crypto Price Dashboard**  in React that  **fetches and displays prices of cryptocurrencies**  every 5 seconds. The dashboard should update automatically without requiring a page refresh.

You are provided with a mock API function `fetchCryptoPrices()` that returns an array of objects like this:

```
[
  { name: "Bitcoin", price: 58321 },
  { name: "Ethereum", price: 3122 },
  { name: "Solana", price: 128 }
]

```

- You need to implement the logic to poll this API every 5 seconds using useEffect and setInterval.
- Don't forget to checkout data.js.

 **Requirements** 

- Use useEffect to run polling logic.
- Use setInterval to call the API every 5 seconds.
- Display the latest list of coins and prices in a table or list format.
- Clear the interval on component unmount to avoid memory leaks.
- UI should update without any manual interaction.

 **Example Output** 

 **Helpful Resources** 

- React useEffect Documentation
- MDN setInterval
- React useState Documentation
- Cleaning up in useEffect

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T15:02:36.855Z  

```cpp
import { useState, useEffect } from 'react'
import { fetchCryptoPrices } from './data'

function App() {
  const [prices, setPrices] = useState([])

    useEffect(() => {
        const updatePrices = async () => {
              const data = await fetchCryptoPrices()
                    setPrices(data)
                        }

                            // Initial load
                                updatePrices()

                                    // Poll every 5 seconds
                                        const intervalId = setInterval(updatePrices, 5000)

                                            // Cleanup interval on unmount
                                                return () => clearInterval(intervalId)
                                                  }, [])

                                                    return (
                                                        <div style={{ fontFamily: 'sans-serif', padding: '20px' }}>
                                                              <h1>📈 Crypto Dashboard</h1>
                                                                    <p>Updates every 5 seconds...</p>
                                                                          <table style={{ borderCollapse: 'collapse', marginTop: '20px' }}>
                                                                                  <thead>
                                                                                            <tr>
                                                                                                        <th style={{ padding: '8px', border: '1px solid gray' }}>Name</th>
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR229)