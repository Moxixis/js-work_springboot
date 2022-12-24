package com.kano.domain;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String stu_no;
    private String stu_name;
    private String stu_sex;
    private int stu_age;
    private String stu_dept;
}
