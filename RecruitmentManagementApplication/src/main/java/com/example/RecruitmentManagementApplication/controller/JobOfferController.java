package com.example.RecruitmentManagementApplication.controller;

import com.example.RecruitmentManagementApplication.entities.JobOffer;
import com.example.RecruitmentManagementApplication.service.JobOfferService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
