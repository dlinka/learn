package com.cr.entity;

import lombok.Data;

import java.util.List;

@Data
public class Company {

    private int companyId;
    private String companyName;
    private List<User> users;

}
