package com.trip.service;

import com.trip.dao.UserDao;
import com.trip.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Resource
    UserDao userDao;

    public User login(Map<String,Object> param){
        return userDao.login(param);
    }

    public List<Integer> addList(List<User> users){
        List<Integer> userIds=new ArrayList();
        for (User user:users){
            userDao.insertSelective(user);
            int id=user.getUserId();
            userIds.add(id);
        }
        return userIds;
    }

    public List<User> queryAll(){
        return userDao.selectAll();
    }
}
