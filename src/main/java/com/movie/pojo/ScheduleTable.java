package com.movie.pojo;

import java.util.Date;

public class ScheduleTable {
    private int schedule_id;//唯一编号
    private int schedule_hall_id;//对应放映厅的id
    private int schedule_movie_id;//对应电影id
    private int schedule_cinema_id;//对应影院id
    private int schedule_price;//票价
    private int schedule_remain;//人数容量
    private String schedule_state;//状态：等待  开始
    private Date schedule_time;// 开始时间
}
