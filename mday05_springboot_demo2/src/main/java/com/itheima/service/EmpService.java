package com.itheima.service;

import com.itheima.pojo.Emp;

import java.util.List;


public interface EmpService {
/*
查询所有员工的方法，返回的是一个元素为员工的list集合

*/
    public List<Emp> findAll();
}
