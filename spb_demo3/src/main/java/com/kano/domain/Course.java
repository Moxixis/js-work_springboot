package com.kano.domain;

import lombok.Data;

@Data
public class Course {
    private int id;
    private String course_no;
    private String course_name;
    private String course_prior_id;
    private String course_credit;
}
