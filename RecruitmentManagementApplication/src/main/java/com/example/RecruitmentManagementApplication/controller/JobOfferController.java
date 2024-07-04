package com.example.RecruitmentManagementApplication.controller;

import com.example.RecruitmentManagementApplication.entities.JobOffer;
import com.example.RecruitmentManagementApplication.service.JobOfferService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobOfferController {
    private final JobOfferService jobOfferService;

    public JobOfferController(JobOfferService jobOfferService) {
        this.jobOfferService = jobOfferService;
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("joboffers", jobOfferService.getAll());
        return "home";
    }

    @GetMapping("/jobOfferForm")
    public String jobOfferForm(Model model){
        model.addAttribute("joboffer", new JobOffer());
        return "joboffer-form";
    }

    @PostMapping("/addJobOffer")
    public String addJobOffer(@ModelAttribute("joboffer") JobOffer jobOffer){
        jobOfferService.add(jobOffer);
        return "redirect:/";
    }

    //TODO add updateOfferStatus and Delete

}

/*

@GetMapping("/post/edit/{id}")
public String editPost(@PathVariable Long id, Model model) {
    if (authService.isLogged()) {
        model.addAttribute("post", postService.getById(id));
        return "post-form";
    } else {
        return "redirect:/login";
    }
}

@GetMapping("/post/delete/{id}")
public String deletePost(@PathVariable Long id) {
    if (authService.isLogged()) {
        postService.delete(id);
        return "redirect:/";
    } else {
        return "redirect:/login";
    }
}*/
