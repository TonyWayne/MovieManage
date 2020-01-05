package com.movie.service;

import com.movie.dao.UserDao;
import com.movie.pojo.UserTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public void insert(UserTable user){
        System.out.println("servicce");
       userDao.insert(user);
    }
}
