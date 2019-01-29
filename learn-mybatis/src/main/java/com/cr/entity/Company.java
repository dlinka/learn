package com.cr.entity;

import lombok.Data;

import java.util.List;

@Data
public class Company {

    private Integer companyId;
    private String companyName;
    private List<User> users;

}
