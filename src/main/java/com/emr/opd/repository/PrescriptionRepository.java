package com.emr.opd.repository;


import com.emr.opd.model.Prescription;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends ElasticsearchRepository<Prescription, Long> {
}
