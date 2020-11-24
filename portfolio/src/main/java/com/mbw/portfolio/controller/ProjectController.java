package com.mbw.portfolio.controller;

import com.mbw.portfolio.model.Project;
import com.mbw.portfolio.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping("/projects/{id}")
    public String display(@PathVariable Long id, Model model){
        Project project = projectService.findById(id);
        model.addAttribute(project);
        return "index";
    }

    
    
    
}
