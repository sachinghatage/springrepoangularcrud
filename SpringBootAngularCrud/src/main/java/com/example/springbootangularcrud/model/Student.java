package com.example.springbootangularcrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Integer stdId;
    private String stdName;
    private Double stdFee;
    private String stdCourse;
    private Double stdFeeDisc;
    private Double stdFeeGst;
}
