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