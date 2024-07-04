package com.example.RecruitmentManagementApplication.service;

import com.example.RecruitmentManagementApplication.dao.JobOfferRepository;
import com.example.RecruitmentManagementApplication.entities.JobOffer;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class JobOfferService implements IService<JobOffer>{
    private final JobOfferRepository jobOfferRepository;

    public JobOfferService(JobOfferRepository jobOfferRepository) {
        this.jobOfferRepository = jobOfferRepository;
    }

    @Override
    public List<JobOffer> getAll() {
        return jobOfferRepository.findAll();
    }

    @Override
    public JobOffer getById(int id) {
        return jobOfferRepository.findById(id).orElse(null);
    }

    @Override
    public JobOffer add(JobOffer element) {
        element.setCreatedAt(LocalDateTime.now());
        element.setStatus("In progress");
        return jobOfferRepository.save(element);
    }

    @Override
    public void delete(int id) {
        jobOfferRepository.deleteById(id);
    }

    @Override
    public JobOffer update(JobOffer element) {
        return jobOfferRepository.save(element);
    }

    public JobOffer updateJobOfferStatus(int id, String newStatus) {
        JobOffer jobOffer = jobOfferRepository.findById(id).orElse(null);
        if (jobOffer != null) {
            jobOffer.setStatus(newStatus);
            return jobOfferRepository.save(jobOffer);
        }
        return null;
    }
}
