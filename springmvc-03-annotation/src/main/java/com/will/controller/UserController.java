package com.will.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/t1")
    public String test1(String  name, Model model){


        System.out.println(name);
        model.addAttribute("msg",name);

        return "hello";
    }
}
