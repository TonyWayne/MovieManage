package com.movie.service;

import com.movie.dao.CinemaDao;
import com.movie.pojo.CinemaTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaService {
    @Autowired
    private CinemaDao cinemaDao;

    public List<CinemaTable> findAll(){
        return cinemaDao.findAllCinema();
    }

    public CinemaTable insert(CinemaTable table){
        cinemaDao.insert(table);
        return table;
    }
    public void update(CinemaTable table){
        cinemaDao.update(table);
    }
    public List<CinemaTable> findByName(String cinema_name){
       List<CinemaTable> list = cinemaDao.findByName(cinema_name);
       return list;
    }


}
