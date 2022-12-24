package com.kano.dao;

import com.kano.domain.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ICourseDao {
    List<Course> selectId(String course_no);
}
