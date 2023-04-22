package com.itheima.dao.Impl;

import com.itheima.dao.EmpDao;
import com.itheima.pojo.Emp;
import com.itheima.utils.XmlParserUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpDaoImpl implements EmpDao {
    @Override
    public List<Emp> findAll() {
        String file= ClassLoader.getSystemClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> list = XmlParserUtils.parse(file, Emp.class);
        return list;
    }
}
