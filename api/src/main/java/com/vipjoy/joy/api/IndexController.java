package com.vipjoy.joy.api;


import com.vipjoy.joy.api.resp.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController extends BaseController {


    @RequestMapping(value = "/onlineClass/get")
    public Response onlineClassGet(long id) {
        return Response.success(onlineClassService.get(id));
    }

    @RequestMapping(value = "/student/get")
    public Response studentGet(long id) {
        return Response.success(studentService.get(id));
    }

    @RequestMapping(value = "/teacher/get")
    public Response teacherGet(long id) {
        return Response.success(teacherService.get(id));
    }


    @RequestMapping(value = "/user/get")
    public Response userGet(long id) {
        return Response.success(userService.get(id));
    }


    @RequestMapping(value = "/course/get")
    public Response courseGet(long id) {
        return Response.success(courseService.get(id));
    }
}
