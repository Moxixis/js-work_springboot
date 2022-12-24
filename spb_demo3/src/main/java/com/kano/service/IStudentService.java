package com.kano.service;

import com.kano.domain.Student;

public interface IStudentService {
    boolean updateStudent(int id, String stu_no, String stu_name, String stu_sex, int stu_age, String stu_dept);
    Student loginStudent(String stu_no);
}
