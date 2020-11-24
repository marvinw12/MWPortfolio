package com.mbw.portfolio.controller;

import java.util.ArrayList;
import java.util.List;

import com.mbw.portfolio.model.Project;
import com.mbw.portfolio.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {
    
    @Autowired
    ProjectService projectService;

    public void addNewProject() {
        List<Project> allProjects = projectService.findAll();

        if(allProjects.isEmpty()){
            List<Project> newProjects = new ArrayList<Project>();

            newProjects.add(new Project("eCommerce Site", "eCommerce site built using HTML, CSS/Bootstrap, Java, Springboot", "img/eCommerce.png", "", ""));
            newProjects.add(new Project("Weather App", "Weather app made using weather API, Java, Springboot", "img/weather.png", "", ""));
            newProjects.add(new Project("Blog Website", "Personal blog site built using HTML, CSS/Bootstrap, Java, Springboot", "img/blog.png", "", ""));
        
        for (Project project : newProjects) {
            projectService.save(project);
        }
    } else {

        System.out.println("You don't need more items!");
    }
}


    @GetMapping("/")
    public String index(){

        addNewProject();
		return "index";
        
    }

    @ModelAttribute("projects")
    public List<Project> projects(){
        return projectService.findAll();
    }

    @GetMapping("/about")
    public String getAboutMe(){

        return "about";
       
    }

    @GetMapping("/contact")
    public String getContact(){

        return "contact";
       
    }
}
