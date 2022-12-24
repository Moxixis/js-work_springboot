package com.kano.service.impl;

import com.kano.dao.ICourseDao;
import com.kano.dao.IScDao;
import com.kano.dao.IStudentDao;
import com.kano.domain.Course;
import com.kano.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScServiceImpl implements com.kano.service.IScService {
    @Autowired
    private IScDao iScDao;

    @Autowired
    private IStudentDao iStudentDao;

    @Autowired
    private ICourseDao iCourseDao;

    @Override
    public boolean addSc(String stu_no, String course_no) {
        boolean addState = false;
        List<Student> studentList= iStudentDao.selectId(stu_no);
        List<Course> courseList = iCourseDao.selectId(course_no);
        if (studentList.size() > 0 && courseList.size() > 0) {
            iScDao.addSc(studentList.get(0).getId(), courseList.get(0).getId());
            addState = true;
        }
        return addState;
    }

    @Override
    public boolean showSc(String stu_no) {
        boolean showState = false;
        List<Student> studentList= iStudentDao.selectId(stu_no);
        if (studentList.size() > 0) {
            showState = true;
        }
        return showState;
    }
}
