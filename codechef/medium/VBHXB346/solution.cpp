import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { AuthProvider } from './context/AuthContext';
import Navbar from './components/Navbar';
import PrivateRoute from './components/PrivateRoute';

import Home from './pages/Home';
import Login from './pages/Login';
import Register from './pages/Register';
import CreateBlog from './pages/CreateBlog';
import MyBlogs from './pages/MyBlogs';
import EditBlog from './pages/EditBlog';
import SingleBlogView from './pages/SingleBlogView';
 
 import './App.css'; // Global styling

 function App() {
     return (
             <Router>
                         <AuthProvider>
                                         <Navbar />
                                                         <Routes>
                                                                             <Route path="/" element={<Home />} />
                                                                                                 <Route path="/login" element={<Login />} />
                                                                                                                     <Route path="/register" element={<Register />} />
                                                                                                                                         {/* Protected Routes */}
                                                                                                                                                             <Route element={<PrivateRoute />}>
                                                                                                                                                                                     <Route path="/create" element={<CreateBlog />} />
                                                                                                                                                                                                             <Route path="/my-blogs" element={<MyBlogs />} />
                                                                                                                                                                                                                                     <Route path="/edit/:id" element={<EditBlog />} />
                                                                                                                                                                                                                                                         </Route>