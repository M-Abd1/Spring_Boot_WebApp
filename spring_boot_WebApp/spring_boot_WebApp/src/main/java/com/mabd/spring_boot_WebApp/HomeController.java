package com.mabd.spring_boot_WebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Rest -Api's Handler
public class HomeController {

    @RequestMapping ("/")
    public String greet() {
        return "Welcome to HomePage!";

    }

    @RequestMapping ("/about")
    public String about() {
        return "This is About Page";

    }
}

