package com.movie.pojo;

public class UserTable {
    private int user_id;//id
    private String user_name;//姓名
    private String user_pwd;//密码
    private String user_email;//邮箱
    private String user_phone;//手机号
    private String user_role;//角色
    private int user_cinema_id;//如果是影院管理员，此对应他负责的影院

    public UserTable() {
    }

    public UserTable(int user_id, String user_name, String user_pwd, String user_email, String user_phone, String user_role, int user_cinema_id) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_pwd = user_pwd;
        this.user_email = user_email;
        this.user_phone = user_phone;
        this.user_role = user_role;
        this.user_cinema_id = user_cinema_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public int getUser_cinema_id() {
        return user_cinema_id;
    }

    public void setUser_cinema_id(int user_cinema_id) {
        this.user_cinema_id = user_cinema_id;
    }

    @Override
    public String toString() {
        return "UserTable{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_role='" + user_role + '\'' +
                ", user_cinema_id=" + user_cinema_id +
                '}';
    }
}
