package com.movie.dao;

import com.movie.pojo.CinemaTable;
import com.movie.pojo.ScheduleTable;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ScheduleDao {
    void insert(ScheduleTable scheduleTable);
    CinemaTable findById(int schedule_id);
    List<ScheduleTable> findAllByCinema(@Param("cinema_id") int cinema_id, @Param("nowdate") Date nowdate);
    List<ScheduleTable> findAllByHall(@Param("hall_id")int hall_id,@Param("nowdate")Date nowdate);
}
