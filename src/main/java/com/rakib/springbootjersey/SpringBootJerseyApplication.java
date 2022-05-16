package com.rakib.springbootjersey;

import com.rakib.springbootjersey.dao.EmployeeRepository;
import com.rakib.springbootjersey.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringBootJerseyApplication {

    private final EmployeeRepository repository;

    public SpringBootJerseyApplication(EmployeeRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initDB() {
        repository.saveAll(Stream.of(new Employee(1, "", "CSE"), new Employee(2, "Hasan", "ECE"),
                new Employee(3, "Khan", "BBA")).collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJerseyApplication.class, args);
    }

}
