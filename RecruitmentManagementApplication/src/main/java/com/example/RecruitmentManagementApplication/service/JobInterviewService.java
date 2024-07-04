package com.example.RecruitmentManagementApplication.service;

import com.example.RecruitmentManagementApplication.dao.JobInterviewRepository;
import com.example.RecruitmentManagementApplication.entities.JobInterview;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobInterviewService implements IService<JobInterview> {
    private final JobInterviewRepository jobInterviewRepository;

    public JobInterviewService(JobInterviewRepository jobInterviewRepository) {
        this.jobInterviewRepository = jobInterviewRepository;
    }

    @Override
    public List<JobInterview> getAll() {
        return jobInterviewRepository.findAll();
    }

    @Override
    public JobInterview getById(int id) {
        return jobInterviewRepository.findById(id).orElse(null);
    }

    @Override
    public JobInterview add(JobInterview element) {
        return jobInterviewRepository.save(element);
    }

    @Override
    public void delete(int id) {
        jobInterviewRepository.deleteById(id);
    }

    @Override
    public JobInterview update(JobInterview element) {
        return jobInterviewRepository.save(element);
    }

    public List<JobInterview> getJobInterviewsByCandidateId(int candidateId){
        return jobInterviewRepository.findJobInterviewByCandidate_Id(candidateId);
    }
}
