package com.cr.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class City implements Serializable {

    private Integer cityId;
    private String cityName;

}
