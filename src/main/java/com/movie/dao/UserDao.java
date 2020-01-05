package com.movie.dao;

import com.movie.pojo.UserTable;

import java.util.List;

public interface UserDao {
    void insert(UserTable userTable);
    UserTable findByName(String user_name);
    UserTable findById(int user_id);
    List<UserTable> findAllUser();
}
