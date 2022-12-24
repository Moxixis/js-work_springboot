package com.kano.service.impl;

import com.kano.dao.IStudentDao;
import com.kano.domain.Student;
import com.kano.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentDao iStudentDao;

    @Override
    public boolean updateStudent(int id, String stu_no, String stu_name, String stu_sex, int stu_age, String stu_dept) {
        boolean updateState = true;
        List<Student> studentList = iStudentDao.selectById(id);
        for (Student s : studentList) {
            if (Objects.equals(s.getStu_no(), stu_no)) {
                updateState = false;
                break;
            }
        }
        if (updateState) {
            iStudentDao.updateStudent(id, stu_no, stu_name, stu_sex, stu_age, stu_dept);
        }
        return updateState;
    }

    @Override
    public Student loginStudent(String stu_no) {
        Student student = new Student();
        List<Student> studentList = iStudentDao.selectId(stu_no);
        for (Student s : studentList) {
            if (s == null) {
                return student;
            }
            student = s;
        }
        return student;
    }
}
