package com.emr.opd.service;


import com.emr.opd.model.StaffDto;
import com.emr.opd.repository.StaffRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    @Autowired
    StaffRepository staffRepository;
    @RabbitListener(queues = {"${spring.rabbitmq.queue.name}"})
    public StaffDto save(StaffDto staff){
        return staffRepository.save(staff);
    }
}

