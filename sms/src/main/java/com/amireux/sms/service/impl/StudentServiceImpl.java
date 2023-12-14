package com.amireux.sms.service.impl;

import com.amireux.sms.mapper.StudentMapper;
import com.amireux.sms.pojo.Student;
import com.amireux.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> list() {
        return studentMapper.list();
    }

    //更新学生
    @Override
    public void upadte(Student student) {
       studentMapper.update(student);
    }

    //添加学生
    @Override
    public void add(Student student) {
        studentMapper.add(student);
    }

    //删除学生
    @Override
    public void deleteById(Integer id) {
        studentMapper.deleteById(id);
    }
}
