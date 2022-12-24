package com.kano.controller;

import com.kano.domain.Student;
import com.kano.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private IStudentService service;

    @GetMapping("/updateStudent")
    private String updateStudent(int id, String stu_no, String stu_name, String stu_sex, int stu_age, String stu_dept) {
        boolean updateState = service.updateStudent(id, stu_no, stu_name, stu_sex, stu_age, stu_dept);
        String result;
        if (updateState) {
            result = "id：" + id + " 学号：" + stu_no + " 姓名：" + stu_name + " 性别：" + stu_sex + " 年龄：" + stu_age + " 院系：" + stu_dept + "";
        } else {
            result = "更新失败！";
        }
        return result;
    }

    @GetMapping("/loginStudent")
    private Student loginStudent(String stu_no) {
        Student student = new Student();
        student = service.loginStudent(stu_no);
        return student;
    }
}
