package com.amireux.sms.service;

import com.amireux.sms.pojo.Student;

import java.util.List;

public interface StudentService {

    //列表查询信息
    List<Student> list();

    //更新信息
    void upadte(Student student);

    //添加学生
    void add(Student student);

    //删除学生
    void deleteById(Integer id);
}
