package com.amireux.sms.mapper;

import com.amireux.sms.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StudentMapper {

    //返回学生列表
     List<Student> list();

     //更新学生信息
    void update(Student student);

    //添加学生信息
    void add(Student student);
}
