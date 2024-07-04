package com.example.RecruitmentManagementApplication.controller;


import com.example.RecruitmentManagementApplication.entities.Candidate;
import com.example.RecruitmentManagementApplication.entities.JobInterview;
import com.example.RecruitmentManagementApplication.service.CandidateService;
import com.example.RecruitmentManagementApplication.service.JobInterviewService;
import com.example.RecruitmentManagementApplication.service.JobOfferService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobInterviewController {
    private final JobInterviewService jobInterviewService;
    private final CandidateService candidateService;

    public JobInterviewController(JobInterviewService jobInterviewService, CandidateService candidateService, JobOfferService jobOfferService) {
        this.jobInterviewService = jobInterviewService;
        this.candidateService = candidateService;
    }

    @GetMapping("/jobInterviewForm/{candidateId}")
    public String jobInterviewForm(Model model, @PathVariable int candidateId){
        model.addAttribute("jobinterview", new JobInterview());
        model.addAttribute("candidateId", candidateId);
        return "jobinterview-form";
    }

    @PostMapping("/addJobInterview/{candidateId}")
    public String addJobInterview(@PathVariable int candidateId, @ModelAttribute("jobinterview") JobInterview jobInterview){
        jobInterview.setCandidate(candidateService.getById(candidateId));
        jobInterviewService.add(jobInterview);
        return "redirect:/";
    }

    @GetMapping("/appointmentsList/{candidateId}")
    public String appointmentsList(Model model, @PathVariable int candidateId){
        model.addAttribute("jobinterviews", jobInterviewService.getJobInterviewsByCandidateId(candidateId));
        model.addAttribute("candidateId", candidateId);
        return "appointment-list";
    }

}
