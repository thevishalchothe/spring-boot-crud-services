package com.killerexpertise.reports.example.service.impl;

import com.killerexpertise.reports.example.repository.ReportRepository;
import com.killerexpertise.reports.example.service.ReportServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl implements ReportServiceI {

    @Autowired
    ReportRepository reportRepository;


}
