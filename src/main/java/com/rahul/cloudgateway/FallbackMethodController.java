package com.rahul.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallbackMethod(){
        return "User Service taking too long.\n please try later!";
    }
    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallbackMethod(){
        return "Department Service taking too long.\n please try later!";
    }
}
