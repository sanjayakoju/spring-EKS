package org.springeks.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springeks.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {


    private StudentService studentService;

    @Transactional(propagation = Propagation.REQUIRED)
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("My");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Student student = new Student();
        em.persist(student);
        et.commit();
    }

    @Autowired
    public CustomerService(StudentService studentService) {
        this.studentService = studentService;
    }
}
