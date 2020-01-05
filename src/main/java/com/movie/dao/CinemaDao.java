package com.movie.dao;

import com.movie.pojo.CinemaTable;

import java.util.List;

public interface CinemaDao {
    void insert(CinemaTable cinemaTable);
    List<CinemaTable> findByName(String cinema_name);
    CinemaTable findById(int cinema_id);
    List<CinemaTable> findAllCinema();
    void update(CinemaTable cinemaTable);
}
