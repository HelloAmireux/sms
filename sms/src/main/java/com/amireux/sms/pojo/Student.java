package com.amireux.sms.pojo;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private Integer classId;
    private String studentName;
    private String photoURL;
}
