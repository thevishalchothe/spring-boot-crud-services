package com.killerexpertise.reports.example.controller;

import com.killerexpertise.reports.example.dto.ReportRequestDTO;
import com.killerexpertise.reports.example.dto.ReportResponseDTO;
import com.killerexpertise.reports.example.model.ReportType;
import com.killerexpertise.reports.example.service.ReportServiceI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/reports")
@RequiredArgsConstructor
public class ReportController {

    private final ReportServiceI reportServiceI;

    @PostMapping
    public ResponseEntity<ReportResponseDTO> createReport(
            @RequestBody ReportRequestDTO reportRequest,
            Principal principal) {
        ReportResponseDTO response = reportServiceI.createReport(reportRequest, principal.getName());
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReportResponseDTO> getReportById(@PathVariable Long id) {
        return ResponseEntity.ok(reportServiceI.getReportById(id));
    }

    @GetMapping
    public ResponseEntity<List<ReportResponseDTO>> getAllReports() {
        return ResponseEntity.ok(reportServiceI.getAllReports());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReportResponseDTO> updateReport(
            @PathVariable Long id,
            @RequestBody ReportRequestDTO reportRequest) {
        return ResponseEntity.ok(reportServiceI.updateReport(id, reportRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReport(@PathVariable Long id) {
        reportServiceI.deleteReport(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/type/{reportType}")
    public ResponseEntity<List<ReportResponseDTO>> getReportsByType(
            @PathVariable ReportType reportType) {
        return ResponseEntity.ok(reportServiceI.getReportsByType(reportType));
    }
}