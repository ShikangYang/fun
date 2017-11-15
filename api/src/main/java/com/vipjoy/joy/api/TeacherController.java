package com.vipjoy.joy.api;

import com.vipjoy.joy.api.resp.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/teacher")
public class TeacherController extends BaseController {


    @RequestMapping(value = "get")
    public Response teacherGet(long id) {
        return Response.success(teacherService.get(id));
    }


}
