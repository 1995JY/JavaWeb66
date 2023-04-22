package com.itheima.controller;

import com.itheima.common.Result;
import com.itheima.pojo.Emp;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    EmpService empService;
    @RequestMapping("/findAll")
    public Result findAll(){
        List<Emp> all = empService.findAll();
        return new Result(1,"查询成功",all);
    }
}
