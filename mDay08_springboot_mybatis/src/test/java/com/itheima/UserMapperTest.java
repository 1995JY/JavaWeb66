package com.itheima;

import com.itheima.Mapper.UserMapper;
import com.itheima.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextTest(){
        List<User> all = userMapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

}
