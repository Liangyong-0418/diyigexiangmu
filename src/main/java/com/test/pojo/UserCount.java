package com.test.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class UserCount {

    private int id;
    private Date createDate;
    private int counts;
}
