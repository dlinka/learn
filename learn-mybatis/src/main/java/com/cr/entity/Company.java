package com.cr.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Company implements Serializable {

    private Integer companyId;
    private String companyName;
    private List<User> users;

}
