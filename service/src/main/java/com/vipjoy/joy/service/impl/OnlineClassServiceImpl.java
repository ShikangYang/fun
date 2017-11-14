package com.vipjoy.joy.service.impl;

import com.vipjoy.joy.dao.domain.OnlineClass;
import com.vipjoy.joy.service.BaseService;
import com.vipjoy.joy.service.OnlineClassService;
import org.springframework.stereotype.Service;


@Service
public class OnlineClassServiceImpl extends BaseService implements OnlineClassService {


    @Override
    public OnlineClass get(long id) {
        logger.info("get = {}", id);

        OnlineClass o = new OnlineClass();
        o.setId(id);
        return onlineClassMapper.selectOne(o);
    }
}
