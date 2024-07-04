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
public class JobOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String jobTitle;
    private String contractType;
    private LocalDateTime createdAt;
    private String description;
    private String status; //In progress - Provided - Closed - Pause

    @OneToMany(mappedBy = "jobOffer", cascade = CascadeType.ALL)
    private List<Candidate> candidates;
}