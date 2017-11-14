package com.vipjoy.joy.service.impl;

import com.vipjoy.joy.dao.domain.User;
import com.vipjoy.joy.service.BaseService;
import com.vipjoy.joy.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends BaseService implements UserService {


    @Override
    public User get(long id) {
        logger.info("get = {}", id);

        User u = new User();
        u.setId(id);
        return userMapper.selectOne(u);
    }
}
