package com.amireux.sms.controller;

import com.amireux.sms.pojo.Result;
import com.amireux.sms.pojo.Student;
import com.amireux.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@Validated
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/userInfo")//查询所有的学生
    public Result<List<Student>> list(){
       List<Student> s=studentService.list();
       return Result.success(s);
    }

    @PutMapping("/update")//更新学生信息
    public Result update(@RequestBody Student student){
        studentService.upadte(student);
        return Result.success();
    }


    //增加
    @PostMapping("/add")
    public Result add(@RequestBody Student student){
        studentService.add(student);
        return Result.success();
    }


}
