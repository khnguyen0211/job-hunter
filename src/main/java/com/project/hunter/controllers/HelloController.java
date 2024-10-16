package com.project.hunter.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class HelloController {
    @GetMapping("")
    public String getMethodName() {
        return "Copyright © 2024 KhNguyen0211. All rights reserved.";
    }
    
}
