package com.emr.opd.service;

import com.emr.opd.model.Prescription;
import com.emr.opd.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionService {

    @Autowired
    PrescriptionRepository prescriptionRepository;


    public Prescription savePrescription(Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }
}
