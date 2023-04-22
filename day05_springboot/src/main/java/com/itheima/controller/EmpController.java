package com.itheima.controller;

import com.itheima.common.Result;
import com.itheima.pojo.Emp;
import com.itheima.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/emp")
public class EmpController {
    @RequestMapping("/findAll")
    public Result findAll() {

        String file= ClassLoader.getSystemClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> list = XmlParserUtils.parse(file, Emp.class);

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

        return new Result(1,"查询成功",list);

    }
}
