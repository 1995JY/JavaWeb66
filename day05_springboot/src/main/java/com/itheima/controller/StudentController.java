package com.itheima.controller;

import com.itheima.pojo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/Student") // 一级路径
public class StudentController {


//    @RestController里面包含了@ResponseBody，记忆理解成继承关系，@ResponseBody给@RestController赋能。
//    响应一个Jason对象给浏览器，首先是获得一个对象，然后将对象通过 @ResponseBody 转换为Jason对象，响应给浏览器

    @RequestMapping("/findById")  // 二级路径
    public Student findById(){
        return new Student("张三",23);
    }
//   响应一个学生集合
    @RequestMapping("/findAll")
    public List<Student> findAll(){
        List<Student> list= new ArrayList<>();
        list.add(new Student("张三",23));
        list.add(new Student("李四",24));
        return list;
    }
}
