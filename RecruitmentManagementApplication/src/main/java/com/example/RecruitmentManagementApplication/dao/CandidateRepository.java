package com.example.RecruitmentManagementApplication.dao;

import com.example.RecruitmentManagementApplication.entities.Candidate;
import com.example.RecruitmentManagementApplication.entities.JobOffer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
    List<Candidate> findByJobOffer_Id(int jobOfferId);
}
