package com.rakib.springbootjersey.controller;

import com.rakib.springbootjersey.dao.EmployeeRepository;
import com.rakib.springbootjersey.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import java.util.List;

@Path("/employee")
public class EmployeeResource {


    @Autowired
    private  EmployeeRepository employeeRepository;

    @POST
    @Path("/saveEmployee")
    @Consumes("application/json")
    @Produces("application/json")
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @GET
    @Path("/getEmployeeList")
    @Consumes("application/json")
    @Produces("application/json")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @GET
    @Path("/getEmployeeByName/{name}")
    @Consumes("application/json")
    @Produces("application/json")
    public Employee getEmployeeByName(@PathParam("name") String name) {
        return employeeRepository.findByName(name);
    }
}
