package org.springeks.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private CustomerService customerService;

//    @PostConstruct
//    public void init() {
//        customerService.setStudentService(this);
//    }

    @Autowired
    public StudentService(@Lazy CustomerService customerService) {
        this.customerService = customerService;
    }
}
