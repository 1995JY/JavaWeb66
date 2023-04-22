package com.itheima.controller;

import com.itheima.pojo.Address;
import com.itheima.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("/getParam4")
    public String getParam4(Integer age, String name,String province, String city) {
        Address address=new Address(province,city);
        User user=new User(name,age,address);
        System.out.println(user);
        return "Success~";
    }
    @RequestMapping("/getParam5")
    public String getParam5(User user) {
        System.out.println(user);
        return "Success~";
    }
//    接受数组参数
    @RequestMapping("/getParam6")
    public String getParam6(String[] hobbies) {
        System.out.println(Arrays.toString(hobbies));
        return "Success~";
    }

     /*
     接受集合参数
        注意事项：必须要加一个注解
       */

    @RequestMapping("/getParam7")
    public String getParam7(@RequestParam List<String> hobbies) {
        System.out.println(hobbies);
        return "Success~";
    }

    @RequestMapping("/getParam8")
    public String getParam8(Date birthday) {
        System.out.println(birthday);
        return "Success~";
    }
    @RequestMapping("/getParam9")
    public String getParam9(@DateTimeFormat(pattern = "yyyy-MM-dd") Date birthday) {
        System.out.println(birthday);
        return "Success~";
    }
/*
*
* 接收Jason，
*/
    @RequestMapping("/getParam12")
    public String getParam12(@RequestBody User user) {
        System.out.println(user);
        String[] str=user.getAddress().getCommunity();
        System.out.println(Arrays.toString(str));
        return "Success~";
    }

    @RequestMapping("/getParam13/{id}/{name}")
    public String getParam13(@PathVariable Integer id, @PathVariable() String name) {
        System.out.println(id+"---"+name);
        return "Success~";
    }



}

