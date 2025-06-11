package com.killerexpertise.reports.example.service;


import com.killerexpertise.reports.example.dto.ReportRequestDTO;
import com.killerexpertise.reports.example.dto.ReportResponseDTO;
import com.killerexpertise.reports.example.model.ReportType;

import java.util.List;

public interface ReportServiceI {

    ReportResponseDTO createReport(ReportRequestDTO reportRequest, String generatedBy);

    ReportResponseDTO getReportById(Long id);

    List<ReportResponseDTO> getAllReports();

    ReportResponseDTO updateReport(Long id, ReportRequestDTO reportRequest);

    void deleteReport(Long id);

    List<ReportResponseDTO> getReportsByType(ReportType reportType);
}