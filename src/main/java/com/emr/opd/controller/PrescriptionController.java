package com.emr.opd.controller;

import com.emr.opd.model.Prescription;
import com.emr.opd.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("prescription")
public class PrescriptionController {

    @Autowired
    PrescriptionService prescriptionService;
    @PostMapping("add")
    public ResponseEntity<Prescription> savePrescription(@RequestBody Prescription prescription){
        Prescription savedPresc = prescriptionService.savePrescription(prescription);
        return new ResponseEntity<>(savedPresc,HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<String> getPrescription(){
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
