package com.emr.opd.repository;

import com.emr.opd.model.StaffDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends CrudRepository<StaffDto, Long> {
}
