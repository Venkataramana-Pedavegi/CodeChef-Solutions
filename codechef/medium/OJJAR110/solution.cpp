import { useState, useEffect } from 'react';
import './App.css';

function MovieSearch() {
  const [searchQuery, setSearchQuery] = useState('');
    const [filteredMovies, setFilteredMovies] = useState([]);

      const movies = [
          'Inception',
              'The Dark Knight',
                  'Interstellar',
                      'The Matrix',
                          'Pulp Fiction',
                              'Forrest Gump',
                                  'The Shawshank Redemption',
                                      'Fight Club',
                                          'Parasite',
                                              'Spirited Away',
                                                  'The Godfather',
                                                      'Goodfellas',
                                                          'The Social Network',
                                                              'Whiplash',
                                                                  'Mad Max: Fury Road',
                                                                      'The Grand Budapest Hotel',
                                                                          'Her',
                                                                              'Eternal Sunshine of the Spotless Mind',
                                                                                  'No Country for Old Men',
                                                                                      'There Will Be Blood'
                                                                                        ];