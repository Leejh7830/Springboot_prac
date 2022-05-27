package com.mh.org.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SmartController {

    @GetMapping("smart")
    public String smart() {
        return "SmartEditor2Skin";
    }
}
