import  { useState } from 'react'
import { Link, Route, Routes, useLocation } from 'react-router-dom'

// ✅ Normal imports (all loaded upfront, no lazy loading)
import Home from './pages/Home.jsx'
import About from './pages/About.jsx'
import Dashboard from './pages/Dashboard.jsx'
import ProductDetails from './pages/ProductDetails.jsx'

export default function App() {
    const location = useLocation()
    const [slowNetwork, setSlowNetwork] = useState(false)

    return (
        <div className="app">
            <header>
                <h1>React Example (No Lazy Loading)</h1>