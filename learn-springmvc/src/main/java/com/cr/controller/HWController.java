package com.cr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HWController {

    @RequestMapping("/hw")
    public String hw(Model model, String username){
        System.out.println("hw");
        System.out.println(username);
        model.addAttribute("username", username);
        return "hw";
    }

}
