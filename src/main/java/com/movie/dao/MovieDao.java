package com.movie.dao;

import com.movie.pojo.MovieTable;

import java.util.List;

public interface MovieDao {
    void insert(MovieTable movieTable);
    MovieTable findByName(String movie_name);
    MovieTable findById(int movie_id);
    List<MovieTable> findAllMovieHot();
    List<MovieTable> findAllMovieStop();
    List<MovieTable> findAllMovieComming();

}
