package com.itheima.day04_stringboot_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("findall方法执行了");
        return "乔峰阿朱";
    }
    @RequestMapping("/findById")
    public String findById(Integer age,String name){
        System.out.println(name+"-----"+age);
        return "Success~";
    }
}
