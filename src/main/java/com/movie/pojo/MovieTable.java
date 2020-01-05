package com.movie.pojo;

import java.sql.Date;

public class MovieTable {
    private int movie_id;//唯一标识
    private String movie_actor;//演员  姓名：角色，姓名：角色
    private String movie_name_cn;//电影中文名
    private String movie_country;//发行国家
    private String movie_detail;//详情
    private String movie_director;//导演
    private String movie_name_en;//电影外文名
    private String movie_state;//电影状态：热播，未上映，下架
    private String movie_type;//类型：爱情 喜剧 动画 剧情 恐怖 惊悚 科幻 动作 悬疑 犯罪 冒险 战争 奇幻 运动 家庭
    private float movie_boxOffice;//票房
    private float movie_score;//评分
    private String movie_duration;//时长
    private String movie_picture;//海报路径
    private Date movie_time_create;//信息录入时间
    private Date movie_time_released;//上映时间
    private Date movie_time_stop;//下架时间


    @Override
    public String toString() {
        return "MovieTable{" +
                "movie_id=" + movie_id +
                ", movie_actor='" + movie_actor + '\'' +
                ", movie_name_cn='" + movie_name_cn + '\'' +
                ", movie_country='" + movie_country + '\'' +
                ", movie_detail='" + movie_detail + '\'' +
                ", movie_director='" + movie_director + '\'' +
                ", movie_name_en='" + movie_name_en + '\'' +
                ", movie_state='" + movie_state + '\'' +
                ", movie_type='" + movie_type + '\'' +
                ", movie_boxOffice=" + movie_boxOffice +
                ", movie_score=" + movie_score +
                ", movie_duration='" + movie_duration + '\'' +
                ", movie_picture='" + movie_picture + '\'' +
                ", movie_time_create=" + movie_time_create +
                ", movie_time_released=" + movie_time_released +
                ", movie_time_stop=" + movie_time_stop +
                '}';
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_actor() {
        return movie_actor;
    }

    public void setMovie_actor(String movie_actor) {
        this.movie_actor = movie_actor;
    }

    public String getMovie_name_cn() {
        return movie_name_cn;
    }

    public void setMovie_name_cn(String movie_name_cn) {
        this.movie_name_cn = movie_name_cn;
    }

    public String getMovie_country() {
        return movie_country;
    }

    public void setMovie_country(String movie_country) {
        this.movie_country = movie_country;
    }

    public String getMovie_detail() {
        return movie_detail;
    }

    public void setMovie_detail(String movie_detail) {
        this.movie_detail = movie_detail;
    }

    public String getMovie_director() {
        return movie_director;
    }

    public void setMovie_director(String movie_director) {
        this.movie_director = movie_director;
    }

    public String getMovie_name_en() {
        return movie_name_en;
    }

    public void setMovie_name_en(String movie_name_en) {
        this.movie_name_en = movie_name_en;
    }

    public String getMovie_state() {
        return movie_state;
    }

    public void setMovie_state(String movie_state) {
        this.movie_state = movie_state;
    }

    public String getMovie_type() {
        return movie_type;
    }

    public void setMovie_type(String movie_type) {
        this.movie_type = movie_type;
    }

    public float getMovie_boxOffice() {
        return movie_boxOffice;
    }

    public void setMovie_boxOffice(float movie_boxOffice) {
        this.movie_boxOffice = movie_boxOffice;
    }

    public float getMovie_score() {
        return movie_score;
    }

    public void setMovie_score(float movie_score) {
        this.movie_score = movie_score;
    }

    public String getMovie_duration() {
        return movie_duration;
    }

    public void setMovie_duration(String movie_duration) {
        this.movie_duration = movie_duration;
    }

    public String getMovie_picture() {
        return movie_picture;
    }

    public void setMovie_picture(String movie_picture) {
        this.movie_picture = movie_picture;
    }

    public Date getMovie_time_create() {
        return movie_time_create;
    }

    public void setMovie_time_create(Date movie_time_create) {
        this.movie_time_create = movie_time_create;
    }

    public Date getMovie_time_released() {
        return movie_time_released;
    }

    public void setMovie_time_released(Date movie_time_released) {
        this.movie_time_released = movie_time_released;
    }

    public Date getMovie_time_stop() {
        return movie_time_stop;
    }

    public void setMovie_time_stop(Date movie_time_stop) {
        this.movie_time_stop = movie_time_stop;
    }
}
