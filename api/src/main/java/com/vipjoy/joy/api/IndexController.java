package com.vipjoy.joy.api;


import com.vipjoy.joy.api.resp.Response;
import com.vipjoy.joy.vo.req.LoginParam;
import com.vipjoy.joy.vo.req.RegisterParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api/v1")
public class IndexController extends BaseController {


    @RequestMapping(value = "login", method = RequestMethod.POST)
    public Response login(LoginParam loginParam) {


        return Response.success();
    }


    @RequestMapping(value = "register", method = RequestMethod.POST)
    public Response register(RegisterParam registerParam) {


        return Response.success();
    }


}
