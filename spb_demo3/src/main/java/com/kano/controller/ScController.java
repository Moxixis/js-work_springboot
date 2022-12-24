package com.kano.controller;

import com.kano.dao.IScDao;
import com.kano.domain.Sc;
import com.kano.service.IScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScController {
    @Autowired
    private IScService service;

    @Autowired
    private IScDao iScDao;

    @GetMapping("/addSc")
    public String addSc(String stu_no, String course_no) {
        boolean addState = service.addSc(stu_no, course_no);
        String result;
        if (addState) {
            result = "true";
        } else {
            result = "false";
        }
        return result;
    }

    @PostMapping("/showSc")
    public List<Sc> showSc(String stu_no) {
        List<Sc> scList = null;
        boolean showState = service.showSc(stu_no);
        if (showState) {
            scList = iScDao.showSc(stu_no);
        }
        return scList;
    }
}
