package com.emr.opd.controller;

import com.emr.opd.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prescription")
public class PrescriptionController {

    @Autowired
    PrescriptionService prescriptionService;
    @PostMapping("add")
    public ResponseEntity<String> savePrescription(){
        return null;
    }
}
