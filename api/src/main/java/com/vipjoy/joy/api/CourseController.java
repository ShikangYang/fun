package com.vipjoy.joy.api;

import com.vipjoy.joy.api.resp.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/v1/course")
public class CourseController extends BaseController {


    @RequestMapping(value = "get")
    public Response courseGet(long id) {
        return Response.success(courseService.get(id));
    }

}
