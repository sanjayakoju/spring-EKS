package org.springeks.model;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springeks.service.StudentService;

@Data
public class Customer {
    private int id;
    private String name;
    private String email;
    private String contactNo;

    @Fetch(FetchMode.JOIN)
    private Student student;
}
