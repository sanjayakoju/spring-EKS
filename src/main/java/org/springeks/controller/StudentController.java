package org.springeks.controller;

import org.springeks.model.Student;
import org.springeks.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Student student) {
        return new ResponseEntity<>(studentRepository.save(student), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
    }
}
