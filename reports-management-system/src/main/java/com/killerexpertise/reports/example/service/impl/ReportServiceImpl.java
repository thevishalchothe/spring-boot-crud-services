package com.killerexpertise.reports.example.service.impl;


import com.killerexpertise.reports.example.dto.ReportRequestDTO;
import com.killerexpertise.reports.example.dto.ReportResponseDTO;
import com.killerexpertise.reports.example.model.Report;
import com.killerexpertise.reports.example.model.ReportType;
import com.killerexpertise.reports.example.repository.ReportRepository;
import com.killerexpertise.reports.example.service.ReportServiceI;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportServiceI {

    private final ReportRepository reportRepository;

    @Override
    public ReportResponseDTO createReport(ReportRequestDTO reportRequest, String generatedBy) {
        Report report = Report.builder()
                .reportName(reportRequest.getReportName())
                .reportType(reportRequest.getReportType())
                .description(reportRequest.getDescription())
                .generatedAt(LocalDateTime.now())
                .generatedBy(generatedBy)
                .reportUrl("/reports/" + reportRequest.getReportName() + "_" + LocalDateTime.now() + ".pdf")
                .isScheduled(reportRequest.isScheduled())
                .build();

        Report savedReport = reportRepository.save(report);
        return mapToResponseDTO(savedReport);
    }

    @Override
    public ReportResponseDTO getReportById(Long id) {
        Report report = reportRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Report not found with id: " + id));
        return mapToResponseDTO(report);
    }

    @Override
    public List<ReportResponseDTO> getAllReports() {
        return reportRepository.findAll().stream()
                .map(this::mapToResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ReportResponseDTO updateReport(Long id, ReportRequestDTO reportRequest) {
        Report existingReport = reportRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Report not found with id: " + id));

        existingReport.setReportName(reportRequest.getReportName());
        existingReport.setReportType(reportRequest.getReportType());
        existingReport.setDescription(reportRequest.getDescription());
        existingReport.setScheduled(reportRequest.isScheduled());

        Report updatedReport = reportRepository.save(existingReport);
        return mapToResponseDTO(updatedReport);
    }

    @Override
    public void deleteReport(Long id) {
        reportRepository.deleteById(id);
    }

    @Override
    public List<ReportResponseDTO> getReportsByType(ReportType reportType) {
        return reportRepository.findByReportType(reportType).stream()
                .map(this::mapToResponseDTO)
                .collect(Collectors.toList());
    }

    private ReportResponseDTO mapToResponseDTO(Report report) {
        return ReportResponseDTO.builder()
                .id(report.getId())
                .reportName(report.getReportName())
                .reportType(report.getReportType())
                .description(report.getDescription())
                .generatedAt(report.getGeneratedAt())
                .generatedBy(report.getGeneratedBy())
                .reportUrl(report.getReportUrl())
                .isScheduled(report.isScheduled())
                .build();
    }
}