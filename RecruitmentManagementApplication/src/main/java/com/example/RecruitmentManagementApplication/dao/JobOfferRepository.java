package com.example.RecruitmentManagementApplication.dao;

import com.example.RecruitmentManagementApplication.entities.JobOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobOfferRepository extends JpaRepository<JobOffer, Integer> {
}
