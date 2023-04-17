package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller
// @ResponseBody

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01(){
        return "你好，springboot";
    }
}
