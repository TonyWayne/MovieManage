package com.movie.dao;

import com.movie.pojo.HallTable;

import java.util.List;

public interface HallDao {
    void insert(HallTable hallTable);
    List<HallTable> findAll();
    void update(HallTable hallTable);

}
