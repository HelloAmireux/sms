package com.amireux.sms.mapper;

import com.amireux.sms.pojo.ClassRoom;
import com.amireux.sms.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassRoomMapper {
    //返回教室列表
    List<ClassRoom> list();

    //更新教室信息
    void update(ClassRoom classRoom);

    //添加教室信息
    void add(ClassRoom classRoom);
//
//    //删除教室
//    void deleteById(Integer id);
}
