package com.example.RecruitmentManagementApplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String lastname;
    private String firstname;
    private String phoneNumber;
    private String email;
    private LocalDateTime applicationDate;
    private String status; //New - Denied - Validated - In progress - Hired //TODO change for ENUM

    //TODO add the possibility to add a file like a resume

    @ManyToOne
    @JoinColumn(name = "jobOffer_id")
    private JobOffer jobOffer;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<JobInterview> jobInterviews;
}
