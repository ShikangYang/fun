package com.vipjoy.joy.service.impl;

import com.vipjoy.joy.dao.domain.Teacher;
import com.vipjoy.joy.service.BaseService;
import com.vipjoy.joy.service.TeacherService;
import org.springframework.stereotype.Service;


@Service
public class TeacherServiceImpl extends BaseService implements TeacherService {


    @Override
    public Teacher get(long id) {
        logger.info("get = {}", id);

        Teacher t = new Teacher();
        t.setId(id);
        return teacherMapper.selectOne(t);
    }
}
