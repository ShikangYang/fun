package com.vipjoy.joy.api;

import com.vipjoy.joy.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;


public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    protected final static String APPID = "wx2435694924d51a0c";
    protected final static String APPSSECRET = "9d5744f3900233cfb315908d4bcd29a7";
    protected final static String PATERNERKEY = "1234567";


    @Resource
    protected OnlineClassService onlineClassService;
    @Resource
    protected TeacherService teacherService;
    @Resource
    protected StudentService studentService;
    @Resource
    protected UserService userService;
    @Resource
    protected CourseService courseService;
}
