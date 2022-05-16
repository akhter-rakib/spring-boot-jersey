package com.rakib.springbootjersey.config;

import com.rakib.springbootjersey.controller.EmployeeResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class RestConfig extends ResourceConfig {

    public RestConfig(Set<Class<?>> classes) {
       register(EmployeeResource.class);
    }
}
