package com.test.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    private int id;
    private String name;
    private String pwd;
    private Date createDate;
}
