package org.example.controller;

import org.example.grace.result.GraceJSONResult;
import org.example.grace.result.ResponseStatusEnum;
import org.example.pojo.Stu;
import org.example.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("u")
public class HelloController {
    @Autowired
    private StuService stuService;
    @GetMapping("stu")
    public Object stu(){

        Stu stu=new Stu();
        stu.setId("1001");
        stu.setAge(18);
        stu.setName("wwww");

        stuService.save(stu);
        return "OK";
    }
}
