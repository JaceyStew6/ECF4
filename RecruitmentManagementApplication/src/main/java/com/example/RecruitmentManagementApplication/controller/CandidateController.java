package com.example.RecruitmentManagementApplication.controller;

import com.example.RecruitmentManagementApplication.entities.Candidate;
import com.example.RecruitmentManagementApplication.service.CandidateService;
import com.example.RecruitmentManagementApplication.service.JobOfferService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CandidateController {
    private final CandidateService candidateService;
    private final JobOfferService jobOfferService;

    public CandidateController(CandidateService candidateService, JobOfferService jobOfferService) {
        this.candidateService = candidateService;
        this.jobOfferService = jobOfferService;
    }

    @GetMapping("/candidatesPortal")
    public String home(Model model){
        model.addAttribute("joboffers", jobOfferService.getAll());
        return "candidates-portal";
    }

    //Enable the candidate to create a profile
    @GetMapping("/candidateForm/{jobOfferId}")
    public String candidateForm(Model model, @PathVariable int jobOfferId){
        model.addAttribute("candidate", new Candidate());
        model.addAttribute("jobOfferId", jobOfferId);
        return "candidate-form";
    }

    @PostMapping("/addApplication/{jobOfferId}")
    public String addApplication(@PathVariable int jobOfferId, @ModelAttribute("candidate") Candidate candidate){
        candidate.setJobOffer(jobOfferService.getById(jobOfferId));
        candidateService.add(candidate);
        return "redirect:/candidatesPortal";
    }

    @GetMapping("/candidateList/{jobOfferId}")
    public String candidateList(Model model, @PathVariable int jobOfferId){
        model.addAttribute("candidates", candidateService.getCandidatesByJobOfferId(jobOfferId));
        model.addAttribute("jobOfferId", jobOfferId);
        return "candidate-list";
    }
}

