package com.cr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HW {

    @RequestMapping("/hw")
    public String hw(){
        System.out.println("hw");
        return "hw";
    }

}
