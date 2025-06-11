package com.killerexpertise.reports.example.dto;

import com.killerexpertise.reports.example.model.ReportType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReportRequestDTO {
    private String reportName;
    private ReportType reportType;
    private String description;
    private boolean isScheduled;
}