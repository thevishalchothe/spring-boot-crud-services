package com.killerexpertise.reports.example.controller;

import com.killerexpertise.reports.example.service.ReportServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    @Autowired
    ReportServiceI reportServiceI;

}
