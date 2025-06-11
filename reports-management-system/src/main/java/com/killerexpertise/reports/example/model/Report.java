package com.killerexpertise.reports.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "reports")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String reportName;

    @Enumerated(EnumType.STRING)
    private ReportType reportType; // LOAN_PERFORMANCE, DEFAULT_ANALYTICS, BUSINESS_GROWTH

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDateTime generatedAt;

    @Column(nullable = false)
    private String generatedBy; // Admin username

    @Column(nullable = false)
    private String reportUrl; // Path to stored report (PDF/CSV)

    private boolean isScheduled; // For recurring reports
}