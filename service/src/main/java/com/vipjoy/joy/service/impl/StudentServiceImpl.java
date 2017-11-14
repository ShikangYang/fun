package com.vipjoy.joy.service.impl;

import com.vipjoy.joy.dao.domain.Student;
import com.vipjoy.joy.service.BaseService;
import com.vipjoy.joy.service.StudentService;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl extends BaseService implements StudentService {


    @Override
    public Student get(long id) {
        logger.info("get = {}", id);

        Student s = new Student();
        s.setId(id);
        return studentMapper.selectOne(s);
    }
}
