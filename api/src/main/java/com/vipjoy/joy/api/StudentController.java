package com.vipjoy.joy.api;

import com.vipjoy.joy.api.resp.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/student")
public class StudentController extends BaseController {


    @RequestMapping(value = "get")
    public Response studentGet(long id) {
        return Response.success(studentService.get(id));
    }

}
