package com.vipjoy.joy.api;

import com.vipjoy.joy.api.resp.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/onlineClass")
public class OnlineClassController extends BaseController {


    @RequestMapping(value = "get")
    public Response onlineClassGet(long id) {
        return Response.success(onlineClassService.get(id));
    }
}
