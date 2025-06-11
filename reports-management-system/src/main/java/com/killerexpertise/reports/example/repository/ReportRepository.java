package com.killerexpertise.reports.example.repository;

import com.killerexpertise.reports.example.model.Report;
import com.killerexpertise.reports.example.model.ReportType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Long> {
    List<Report> findByReportType(ReportType reportType);

    List<Report> findByGeneratedBy(String generatedBy);
}