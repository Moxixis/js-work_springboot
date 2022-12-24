package com.kano.dao;

import com.kano.domain.Sc;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface IScDao {
    void addSc(@Param("sId")Integer sId, @Param("cId")Integer cId);
    List<Sc> showSc(String stu_no);
}
