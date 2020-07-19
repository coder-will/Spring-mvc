package com.will.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.will.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping(value = "/j1",produces ="application/json;charset=utf-8" )
    @ResponseBody //它就不会走视图解析器 不找页面 直接返回一个字符串
    public String json1() throws JsonProcessingException {

        //jackson objecmapper
        ObjectMapper mapper = new ObjectMapper();

        User user = new User("张三",13,"男");
        String s = mapper.writeValueAsString(user);
        return s;
    }
}
