package com.mbw.portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
    
    @GetMapping("/")
    public String index(){

		return "index";
        
    }

    @GetMapping("/about")
    public String getAboutMe(){

        return "about";
       
    }

    @GetMapping("/projects")
    public String getProjects(){

        return "projects";
       
    }

    @GetMapping("/contact")
    public String getContact(){

        return "contact";
       
    }
}
