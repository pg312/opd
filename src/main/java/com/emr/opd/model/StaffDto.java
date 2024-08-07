package com.emr.opd.model;

import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import lombok.Data;

import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@Entity
public class StaffDto implements Serializable {

    @Column
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String roles;
}
