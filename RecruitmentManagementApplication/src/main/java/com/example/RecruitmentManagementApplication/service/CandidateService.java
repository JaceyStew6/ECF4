package com.example.RecruitmentManagementApplication.service;

import com.example.RecruitmentManagementApplication.dao.CandidateRepository;
import com.example.RecruitmentManagementApplication.entities.Candidate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CandidateService implements IService<Candidate> {
    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @Override
    public List<Candidate> getAll() {
        return candidateRepository.findAll();
    }

    @Override
    public Candidate getById(int id) {
        return candidateRepository.findById(id).orElse(null);
    }

    @Override
    public Candidate add(Candidate element) {
        //TODO mettre garde fou pour empêcher la création du même profil plusieurs fois
        element.setApplicationDate(LocalDateTime.now());
        element.setStatus("New");
        return candidateRepository.save(element);
    }

    @Override
    public void delete(int id) {
        candidateRepository.deleteById(id);
    }

    @Override
    public Candidate update(Candidate element) {
        return candidateRepository.save(element);
    }

    public Candidate updateCandidateStatus(int id, String newStatus){
        Candidate candidate = candidateRepository.findById(id).orElse(null);
        if (candidate != null){
            candidate.setStatus(newStatus);
            return candidateRepository.save(candidate);
        }
        return null;
    }

    public List<Candidate> getCandidatesByJobOfferId(int jobOfferId) {
        return candidateRepository.findByJobOffer_Id(jobOfferId);
    }
}
