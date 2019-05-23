package com.jsd.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@ToString
public class Student implements Serializable {
    private Long student_id;
    private String student_name;
    private Integer student_age;
    private Long student_classesId;
    private Date createTime;
    private Date updateTime;
    private boolean del;
}
