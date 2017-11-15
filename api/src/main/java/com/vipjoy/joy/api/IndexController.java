package com.vipjoy.joy.api;


import com.vipjoy.joy.api.resp.Response;
import com.vipjoy.joy.client.mail.EmailClient;
import com.vipjoy.joy.vo.req.LoginParam;
import com.vipjoy.joy.vo.req.RegisterParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/v1")
public class IndexController extends BaseController {


    @Resource
    private EmailClient emailClient;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Response login(LoginParam loginParam) {

        emailClient.send("136498193@qq.com", "而狗子");

        //todo 登录相关逻辑

        return Response.success();
    }


    @RequestMapping(value = "register", method = RequestMethod.POST)
    public Response register(RegisterParam registerParam) {


        //todo 注册相关逻辑

        return Response.success();
    }


}
