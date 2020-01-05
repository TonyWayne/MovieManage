package com.movie.service;

import com.movie.dao.MovieDao;
import com.movie.dao.UserDao;
import com.movie.pojo.MovieTable;
import com.movie.pojo.UserTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private MovieDao movieDao;

    public void addMovie(MovieTable movie){

    }
}
