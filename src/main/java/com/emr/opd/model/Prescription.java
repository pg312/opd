package com.emr.opd.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "prescription")
public class Prescription {

    @Id
    private Long id;
    private String prescriptionText;
}
