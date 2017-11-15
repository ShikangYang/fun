package com.vipjoy.joy.api;

import com.vipjoy.joy.api.resp.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api/v1/user")
public class UserController extends BaseController {


    @RequestMapping(value = "get")
    public Response userGet(long id) {
        return Response.success(userService.get(id));
    }


}
