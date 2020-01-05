package com.movie.controller;

import com.alibaba.fastjson.JSONObject;
import com.movie.pojo.CinemaTable;
import com.movie.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/cinema")
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;
    @RequestMapping("/findAll")
    @ResponseBody
    public JSONObject findAll(){
        JSONObject object=new JSONObject();
        List<CinemaTable> list=cinemaService.findAll();
        object.put("msg","");
        object.put("code",0);
        object.put("count",list.size());
        object.put("data", list);
        return object;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public String insert(CinemaTable table){
        table=cinemaService.insert(table);
        return "pass";
    }
    @RequestMapping("/update")
    @ResponseBody
    public JSONObject update(CinemaTable table){
        JSONObject object=new JSONObject();
        cinemaService.update(table);
        object.put("msg","pass");
        return object;
    }

    @RequestMapping("/findByName")
    @ResponseBody
    public JSONObject findByName(String cinema_name){
        JSONObject object=new JSONObject();
        List<CinemaTable> list=cinemaService.findByName(cinema_name);
        object.put("msg","");
        object.put("code",0);
        object.put("count",list.size());
        object.put("data", list);
        return object;
    }


}
