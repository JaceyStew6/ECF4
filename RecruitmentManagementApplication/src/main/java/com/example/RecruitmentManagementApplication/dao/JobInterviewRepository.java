package com.example.RecruitmentManagementApplication.dao;

import com.example.RecruitmentManagementApplication.entities.JobInterview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobInterviewRepository extends JpaRepository<JobInterview, Integer> {
    List<JobInterview> findJobInterviewByCandidate_Id(int candidateId);
}
