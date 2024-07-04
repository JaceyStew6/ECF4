package com.example.RecruitmentManagementApplication.dao;

import com.example.RecruitmentManagementApplication.entities.JobInterview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobInterviewRepository extends JpaRepository<JobInterview, Integer> {
}
