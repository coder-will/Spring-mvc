package com.will.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController2 {
    @RequestMapping("/t2")
    public String test1(Model model){
        model.addAttribute("msg","6666666666666666");


        return "test";
    }

    @RequestMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b,Model model){
        int  res = a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";

    }
}
