package com.cr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company implements Serializable {

    private Integer companyId;
    private String companyName;
    private List<User> users;

    public Company(int companyId) {
        this.companyId = companyId;
    }

}
