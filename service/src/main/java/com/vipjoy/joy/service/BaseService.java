package com.vipjoy.joy.service;


import com.vipjoy.joy.dao.mapper.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

public class BaseService {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    protected CourseMapper courseMapper;

    @Resource
    protected OnlineClassMapper onlineClassMapper;

    @Resource
    protected StudentMapper studentMapper;

    @Resource
    protected TeacherMapper teacherMapper;

    @Resource
    protected UserMapper userMapper;


}
