package com.example.RecruitmentManagementApplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
public class JobInterview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type; //TODO change for ENUM
    private LocalDate appointmentDate;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
