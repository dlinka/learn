package com.cr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private Integer userId;
    private String name;
    private String nickName;
    private Company company;
    private City city;

    public User(Integer userId){
        this.userId = userId;
    }

    public User(Integer userId, String name, String nickName){
        this.userId = userId;
        this.name = name;
        this.nickName = nickName;
    }



}
