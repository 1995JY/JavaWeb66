package com.itheima.Mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
//
@Mapper
public interface UserMapper {
//
    @Select("select * from User ")
    List<User> findAll();
}
