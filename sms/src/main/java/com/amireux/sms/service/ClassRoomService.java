package com.amireux.sms.service;

import com.amireux.sms.pojo.ClassRoom;
import com.amireux.sms.pojo.Student;

import java.util.List;

public interface ClassRoomService {

    //展示教室信息
    List<ClassRoom> list();

    //更新教室信息
    void upadte(ClassRoom classRoom);

    //添加教室信息
    void add(ClassRoom classRoom);
}
