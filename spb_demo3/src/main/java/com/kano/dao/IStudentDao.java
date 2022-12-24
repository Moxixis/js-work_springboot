package com.kano.dao;

import com.kano.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface IStudentDao {
    List<Student> selectById(int id);
    List<Student> selectId(String stu_no);
    void updateStudent(@Param("id")int id, @Param("stu_no")String stu_no, @Param("stu_name")String stu_name, @Param("stu_sex")String stu_sex, @Param("stu_age")int stu_age, @Param("stu_dept")String stu_dept);
}
