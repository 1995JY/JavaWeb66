package com.itheima.service.Impl;

import com.itheima.dao.EmpDao;
import com.itheima.pojo.Emp;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpDao empDao;

    @Override
    public List<Emp> findAll() {

        List<Emp> list = empDao.findAll();
        for (Emp emp : list) {
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            }else{
                emp.setGender("女");
            }

            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            }else if("2".equals(job)){
                emp.setJob("班主任");
            }else{
                emp.setJob("就业指导");
            }
        }
        return list;
    }
}
