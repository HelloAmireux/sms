package com.amireux.sms.controller;

import com.amireux.sms.pojo.ClassRoom;
import com.amireux.sms.pojo.Result;
import com.amireux.sms.pojo.Student;
import com.amireux.sms.service.ClassRoomService;
import com.amireux.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classroom")
@Validated
public class ClassRoomController {
    @Autowired
    private ClassRoomService classRoomService;

    @GetMapping("/classInfo")//查询所有的教室
    public Result<List<ClassRoom>> list(){
        List<ClassRoom> s=classRoomService.list();
        return Result.success(s);
    }

    @PutMapping("/update")//更新教室信息
    public Result update(@RequestBody ClassRoom classRoom){
        classRoomService.upadte(classRoom);
        return Result.success();
    }


    //增加教室
    @PostMapping("/add")
    public Result add(@RequestBody ClassRoom classRoom){
        classRoomService.add(classRoom);
        return Result.success();
    }

//    //删除教室
//    @DeleteMapping("/delete")
//    public Result delete(Integer id){
//        classRoomService.deleteById(id);
//        return Result.success();
//    }
}
