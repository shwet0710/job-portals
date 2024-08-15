package com.example.com.wu.jobproject.controller;

import com.example.com.wu.jobproject.model.JobPost;
import com.example.com.wu.jobproject.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @RequestMapping({"/","/home"})
    public String home() {
        return "home";
    }

    @RequestMapping("/addjob")
    public String addjob() {
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost, Model m) {
        m.addAttribute("jobPost", jobPost);
        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewjobs(Model model) {
        List<JobPost> jobPosts = service.getAllJobs();
        model.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";
    }

}
