package org.springeks;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEksApplication {

    @PostConstruct
    public void init() {
        System.out.println("executing post construct !!!");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringEksApplication.class, args);
    }

}
