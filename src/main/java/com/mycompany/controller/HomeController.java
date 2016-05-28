package com.mycompany.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hector on 17/05/16.
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Das Boot, Test with Spring Boot Application";
    }
}
