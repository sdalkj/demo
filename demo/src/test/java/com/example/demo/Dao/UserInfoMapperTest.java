package com.example.demo.Dao;

import com.example.demo.Entity.UserInfo;
import com.example.demo.mapper.UserInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoMapperTest {

    @Resource
    UserInfoMapper userInfoMapper;
    @Test
    public void test(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("张三");
        userInfo.setPassword("123456");
        userInfo.setAccount("12");
        userInfo.setUserId(174L);
        userInfoMapper.insert(userInfo);
    }
}