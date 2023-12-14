package com.amireux.sms.service.impl;

import com.amireux.sms.mapper.ClassRoomMapper;
import com.amireux.sms.mapper.StudentMapper;
import com.amireux.sms.pojo.ClassRoom;
import com.amireux.sms.pojo.Student;
import com.amireux.sms.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassRoomServiceImpl implements ClassRoomService {

    @Autowired
    private ClassRoomMapper classRoomMapper;


    @Override
    public List<ClassRoom> list() {
      return classRoomMapper.list();
    }



    @Override
    public void upadte(ClassRoom classRoom) {
        classRoomMapper.update(classRoom);
    }

    @Override
    public void add(ClassRoom classRoom) {
    classRoomMapper.add(classRoom);
    }
}
