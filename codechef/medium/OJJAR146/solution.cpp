import { Suspense, lazy, useState } from 'react'
import { Link, Route, Routes, useLocation } from 'react-router-dom'

// Lazy imports (code-splitting)
const Home = lazy(() => import('./pages/Home.jsx'))
const About = lazy(() => import('./pages/About.jsx'))
const Dashboard = lazy(() => import('./pages/Dashboard.jsx'))
const ProductDetails = lazy(() => import('./pages/ProductDetails.jsx'))

function LoadingSpinner() {
    return (
        <div className="center">
            <div className="spinner" />
            <p>Loading...</p>
        </div>
    )
}