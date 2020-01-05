package com.movie.controller;

import com.movie.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminContorller {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/index")
    public  String toAdminPage(){
        return "adminPage";
    }

}
