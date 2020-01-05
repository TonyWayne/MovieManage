package com.movie.controller;

import com.movie.dao.MovieDao;
import com.movie.dao.UserDao;
import com.movie.pojo.MovieTable;
import com.movie.pojo.UserTable;
import com.movie.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class UserController {
    @Autowired
    private UserService service;
    @Autowired
    private UserDao dao;
    @Autowired
    private MovieDao movieDao;
    @Test
    public void insert(){
        for(int i=1;i<=10;i++){
            //role admin 电影院管理 用户
            UserTable user=new UserTable(0, "marry"+i, "123", "1@1.com", "123456", "用户", -1);
            service.insert(user);
            System.out.println(user.getUser_id());
        }
    }
    @Test
    public void searchByName(){
        UserTable userTable=dao.findByName("tom");
        System.out.println(userTable);
    }
    @Test
    public void test(){
        List<UserTable> list=dao.findAllUser();
        for (UserTable userTable : list) {
            System.out.println(userTable);
        }
    }

    @Test
    public void minsert(){
        for(int i=0;i<=10;i++){
            MovieTable movieTable=new MovieTable();
            movieTable.setMovie_actor("周润发");
            movieTable.setMovie_name_cn("监狱风云"+i);
            movieTable.setMovie_country("中国");
            movieTable.setMovie_detail("监狱里的故事");
            movieTable.setMovie_director("林岭东");
            movieTable.setMovie_name_en("jyfy");
            movieTable.setMovie_state("热播");
            movieTable.setMovie_type("动作");
            movieTable.setMovie_boxOffice(100);
            movieTable.setMovie_score(8.8f);
            movieTable.setMovie_duration("132分钟");
            movieTable.setMovie_picture("pppppppppp");
            movieTable.setMovie_time_create(new Date(new java.util.Date().getTime()));
            movieTable.setMovie_time_released(new Date(new java.util.Date().getTime()));
            movieTable.setMovie_time_stop(new Date(new java.util.Date().getTime()));
            movieDao.insert(movieTable);
            System.out.println(movieTable);
        }
    }

    @Test
    public void mf() {
        List<MovieTable> list = movieDao.findAllMovieHot();
        for (MovieTable movieTable : list) {
            System.out.println(movieTable);
        }

    }
    @Test
    public void fun(){
        System.out.println(new Date(new java.util.Date().getTime()));
        System.out.println(new java.util.Date());

    }

}
