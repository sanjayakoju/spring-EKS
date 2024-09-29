package org.springeks.controller;

import jakarta.annotation.Resource;
import org.springeks.model.Student;
import org.springeks.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Qualifier(value = "studentRepository")
    @Resource
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody Student student) {
        return new ResponseEntity<>(studentRepository.save(student), HttpStatus.CREATED);
    }


    @Cacheable(cacheNames = "test")
    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
    }
}
