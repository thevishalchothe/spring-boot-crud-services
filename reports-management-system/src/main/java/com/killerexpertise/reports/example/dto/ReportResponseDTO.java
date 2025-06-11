package com.killerexpertise.reports.example.dto;

import com.killerexpertise.reports.example.model.ReportType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReportResponseDTO {
    private Long id;
    private String reportName;
    private ReportType reportType;
    private String description;
    private LocalDateTime generatedAt;
    private String generatedBy;
    private String reportUrl;
    private boolean isScheduled;
}